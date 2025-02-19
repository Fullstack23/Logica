public class BuscaMenor {
    public static int buscaMenor(int[] arr) {
        int menor = arr[0];
        int menorIndice = 0;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < menor) {
                menor = arr[i];
                menorIndice = i;
            }
        }
        return menorIndice;
    }

    public static void main(String[] args) {
        int[] arr = {5, 3, 6, 2, 10};
        System.out.println(buscaMenor(arr)); // => 3
    }
}
