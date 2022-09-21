import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Analyzer {

    public void analyze(Object o) {
        System.out.println("--> Recuperando a lista de anotações");
        try{
            Annotation an[] = o.getClass().getDeclaredAnnotations();
            for(Annotation a : an) {
                System.out.println(a.toString());
            }

        }catch(Exception ex) {
            System.err.println("Erro ao recuperar as anotações da classe");
        }
        System.out.println("--> Recuperando a lista de métodos");
        try {
            Method metodos[] = o.getClass().getDeclaredMethods();
            for(Method m: metodos) {
                System.out.println(m.getName() + ":" + m.getReturnType());
            }

        }catch(Exception ex) {
            System.err.println("Erro ao recuperar a lista de métodos");
        }
        System.out.println("---> Recuperando a lista de atributos");
        try{
            Field atributos[] = o.getClass().getDeclaredFields();
            for(Field f : atributos) {
                System.out.println(f.getName() + ":" + f.getType() + ":" + f.getModifiers());
                System.out.println("        Anotações");
                for(Annotation a: f.getAnnotations()) {
                    System.out.println("     -> " + a.toString());
                }
            }

        }catch(Exception ex) {
            System.err.println("Erro ao recuperar a lista de atributos");
        }
    }
}
