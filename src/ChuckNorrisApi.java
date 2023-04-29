import com.google.gson.Gson;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Type;
import java.net.HttpURLConnection;
import java.net.URL;

public class ChuckNorrisApi {
    public static void main(String[] args) throws IOException {
        URL url = new URL("https://api.chucknorris.io/jokes/random");
        HttpURLConnection conexao = (HttpURLConnection) url.openConnection();
        conexao.setRequestMethod("GET");

        BufferedReader leitor = new BufferedReader(new InputStreamReader(conexao.getInputStream()));
        String resposta = leitor.readLine();
//        System.out.println(resposta);
        ChuckNorris chuckNorris = new ChuckNorris();
        Gson gson = new Gson();
        chuckNorris = gson.fromJson(resposta, ChuckNorris.class);
        System.out.println(chuckNorris.getValue());
    }
}
