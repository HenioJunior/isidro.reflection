import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Analyzer {

    public void analyze(Object o) {
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
            }

        }catch(Exception ex) {
            System.err.println("Erro ao recuperar a lista de atributos");
        }
    }
}
