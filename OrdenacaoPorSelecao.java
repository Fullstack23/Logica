import java.util.ArrayList;
import java.util.List;

public class OrdenacaoPorSelecao {
    public static int buscaMenor(List<Integer> arr) {
        int menor = arr.get(0);
        int menorIndice = 0;

        for (int i = 1; i < arr.size(); i++) {
            if (arr.get(i) < menor) {
                menor = arr.get(i);
                menorIndice = i;
            }
        }
        return menorIndice;
    }

    public static List<Integer> ordenacaoPorSelecao(List<Integer> arr) {
        List<Integer> novoArr = new ArrayList<>();

        while (!arr.isEmpty()) {
            int menor = buscaMenor(arr);
            novoArr.add(arr.remove(menor));
        }
        return novoArr;
    }

    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();
        arr.add(5);
        arr.add(3);
        arr.add(6);
        arr.add(2);
        arr.add(10);

        List<Integer> novoArr = ordenacaoPorSelecao(arr);
        System.out.println(novoArr); // => [2, 3, 5, 6, 10]
    }
}
