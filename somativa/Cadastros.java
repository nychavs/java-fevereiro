package somativa;

import aula8_manipular.EscreveTxt;

import java.io.IOException;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;


import static somativa.Mensagens.Cadastro;

public class Cadastros {

    static ArrayList<String> loginLista = new ArrayList<>();
    static ArrayList<String> logLista = new ArrayList<>();

    public static void cadastrar() throws IOException {

        Gravar logtxt = new Gravar();
        Gravar logintxt = new Gravar();

        System.out.println(Cadastro.getMsg());
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o nome de usuário: ");
        String nomeUsuario = input.nextLine();
        String logUsuario = ("Usuario: " + nomeUsuario);
        System.out.println("E agora vamos cadastrar sua senha: ");
        String senhaUsuario = input.nextLine();
        System.out.println("Digite novamente para confirmar a senha: ");
        String senhaConfirma = input.nextLine();

        while (!Objects.equals(senhaUsuario, senhaConfirma)) {
            System.out.println("Senha incorreta!");
            System.out.println("Digite novamente para confirmar a senha: ");
            senhaConfirma = input.nextLine();
        }

        loginLista.add(nomeUsuario);
        loginLista.add(senhaConfirma);

        logLista.add(logUsuario);
        String dataLogin = ("Logou em: " + LocalDateTime.now());
        logLista.add(dataLogin);

        logtxt.gravarTxt("logSomativa", logLista);
        logintxt.gravarTxt("loginSomativa", loginLista);
    }

    public ArrayList<String> getLista(){
        return loginLista;
    }
    public ArrayList<String> getLog(){
        return logLista;
    }
}
