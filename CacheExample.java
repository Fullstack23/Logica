import java.util.HashMap;
import java.util.Map;

public class CacheExample {
    private static Map<String, String> cache = new HashMap<>();

    public static void main(String[] args) {
        // Exemplo de uso
        String url = "http://exemplo.com";
        String dados = pegaPagina(url);
        System.out.println(dados);
    }

    public static String pegaPagina(String url) {
        if (cache.containsKey(url)) {
            return cache.get(url);  // ❶
        } else {
            String dados = pegaDadosDoServidor(url);
            cache.put(url, dados);  // ❷
            return dados;
        }
    }

    public static String pegaDadosDoServidor(String url) {
        // Simulação de pegar dados do servidor
        return "Dados do servidor para " + url;
    }
}
