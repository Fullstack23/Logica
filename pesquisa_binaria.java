public class pesquisa_binaria {
    public static int pesquisaBinaria(int[] lista, int item) {
        int baixo = 0;
        int alto = lista.length - 1;

        while (baixo <= alto) {
            int meio = (baixo + alto) / 2;
            int chute = lista[meio];

            if (chute == item) {
                return meio;
            }
            if (chute > item) {
                alto = meio - 1;
            } else {
                baixo = meio + 1;
            }
        }
        return -1; // Retorna -1 se o item não for encontrado
    }

    public static void main(String[] args) {
        int[] minhaLista = {1, 3, 5, 7, 9};
        System.out.println(pesquisaBinaria(minhaLista, 3)); // => 1
        System.out.println(pesquisaBinaria(minhaLista, -1)); // => -1
    }
}
