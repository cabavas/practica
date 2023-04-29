import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class RequisicaoHttp {
    public static void main(String[] args) throws IOException {
        URL url = new URL("https://pokeapi.co/api/v2/pokemon");
        HttpURLConnection conexao = (HttpURLConnection) url.openConnection();
        conexao.setRequestMethod("GET");

        BufferedReader leitor = new BufferedReader(new InputStreamReader(conexao.getInputStream()));
        String resposta = leitor.readLine();

        System.out.println(resposta);
        leitor.close();
        conexao.disconnect();
    }
}
