public class Regressiva {
    public static void regressiva(int i) {
        System.out.println(i);
        if (i > 0) {
            regressiva(i - 1);
        }
    }

    public static void main(String[] args) {
        regressiva(10); // Exemplo de chamada
    }
}
