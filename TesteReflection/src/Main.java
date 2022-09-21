public class Main {

    public static void main(String[] args) {
        Produto produto = new Produto();
        Analyzer analyzer = new Analyzer();

        analyzer.analyze(produto);
        System.out.println(analyzer);

    }
}