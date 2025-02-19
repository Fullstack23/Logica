public class BigOOperacoes {
    public static void imprimirValores(int[] arr) {
        for (int i : arr) {
            System.out.println(i);
        }
    }

    public static void duplicarValores(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] *= 2;
        }
    }

    public static void duplicarPrimeiroValor(int[] arr) {
        if (arr.length > 0) {
            arr[0] *= 2;
        }
    }

    public static void criarTabelaDeMultiplicacao(int[] arr) {
        for (int i : arr) {
            for (int j : arr) {
                System.out.println(i * j);
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, 7, 8, 10};

        System.out.println("Imprimir valores:");
        imprimirValores(arr);

        System.out.println("\nDuplicar valores:");
        duplicarValores(arr);
        imprimirValores(arr);

        System.out.println("\nDuplicar primeiro valor:");
        duplicarPrimeiroValor(arr);
        imprimirValores(arr);

        System.out.println("\nTabela de multiplicação:");
        criarTabelaDeMultiplicacao(arr);
    }
}