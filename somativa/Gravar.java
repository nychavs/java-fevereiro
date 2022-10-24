package somativa;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Gravar {

    private String nome;
    private List<String> lista;

    public void gravarTxt(String nome, List<String> lista) throws IOException {
        Path caminho = Paths.get(nome + ".txt");
        if (Files.exists(caminho)) {
            Files.write(caminho, lista, StandardCharsets.UTF_8, StandardOpenOption.APPEND);
        } else {
            Files.write(caminho, lista, StandardCharsets.UTF_8);
        }
    }

    public ArrayList<String> lerTxt(String nomeArquivo) throws IOException {
        Path caminho = Paths.get(nomeArquivo + ".txt");
        ArrayList<String> dados = new ArrayList<>(Files.readAllLines(caminho));
        return dados;
    }

    public void gravarTxt2(String nome, List<String> lista) throws IOException {
        Path caminho = Paths.get(nome + ".txt");
        Files.write(caminho, lista, StandardCharsets.UTF_8);
        }
    }