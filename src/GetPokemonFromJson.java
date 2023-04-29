import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import com.google.gson.Gson;

public class GetPokemonFromJson {
    public static void main(String[] args) throws IOException {
        URL url = new URL("https://pokeapi.co/api/v2/pokemon/?offset=0&limit=20");
        HttpURLConnection conexao = (HttpURLConnection) url.openConnection();
        conexao.setRequestMethod("GET");
        BufferedReader leitor = new BufferedReader(new InputStreamReader(conexao.getInputStream()));

        Gson gson = new Gson();
        PokemonList pokemonList = gson.fromJson(leitor, PokemonList.class);
        List<Pokemon> pokemons = pokemonList.getResults();

        int i = 1;
        for (Pokemon pokemon: pokemons) {
            System.out.println("Número: " + i);
            i++;
            System.out.println("Nome: " + pokemon.getName());
            System.out.println("Url: " + pokemon.getUrl());

        }
    }
}

