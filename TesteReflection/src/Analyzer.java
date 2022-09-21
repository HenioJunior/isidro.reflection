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
    }
}
