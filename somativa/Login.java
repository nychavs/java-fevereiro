package somativa;

import java.io.IOException;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;


public class Login {
    public static void login() throws IOException {
        Gravar lerusers = new Gravar();
        Gravar gravarlogin = new Gravar();

        var ler = lerusers.lerTxt("loginSomativa");
        ArrayList<String> loginLista = new ArrayList<>();

        System.out.println(ler);

        Scanner input = new Scanner(System.in);
        System.out.println("Usuario: ");
        String user = input.nextLine();

        String informacoesLogin = (user + " logou");
        String dataLogin = ("Logou em: " + LocalDateTime.now());
        loginLista.add(informacoesLogin);
        loginLista.add(dataLogin);

        gravarlogin.gravarTxt("logSomativa", loginLista);

        for (int i = 0; i < ler.size(); i++) {
            if (Objects.equals(user, ler.get(i))) {
                System.out.println("Senha: ");
                String senha = input.nextLine();
                if (Objects.equals(senha, ler.get(i + 1))) {
                    System.out.println("login efetuado com sucesso!");
                    Produtos.produtos();
                    break;
                } else {
                    System.out.println("senha incorreta");
                }
            }
            }

        }
    }




