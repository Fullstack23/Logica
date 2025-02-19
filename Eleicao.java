import java.util.HashMap;
import java.util.Map;

public class Eleicao {
    private static Map<String, Boolean> votaram = new HashMap<>();

    public static void verificaEleitor(String nome) {
        if (votaram.get(nome) != null) {
            System.out.println("Mande embora!");
        } else {
            votaram.put(nome, true);
            System.out.println("Deixe votar!");
        }
    }

    public static void main(String[] args) {
        verificaEleitor("João");
        verificaEleitor("Maria");
        verificaEleitor("João");
    }
}
