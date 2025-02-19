import java.util.Stack;

public class ProcuraPelaChave {
    public static void procurePelaChave(Caixa caixaPrincipal) {
        Stack<Caixa> pilha = caixaPrincipal.crieUmaPilhaParaBusca();
        while (!pilha.isEmpty()) {
            Caixa caixa = pilha.pop();
            for (Item item : caixa.getItens()) {
                if (item.eUmaCaixa()) {
                    pilha.push((Caixa) item);
                } else if (item.eUmaChave()) {
                    System.out.println("Achei a chave!");
                    return;
                }
            }
        }
    }

    public static void main(String[] args) {
        // Suponha que você tenha uma classe Caixa e uma classe Item implementadas
        Caixa caixaPrincipal = new Caixa();
        procurePelaChave(caixaPrincipal);
    }
}
