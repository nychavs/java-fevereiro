package somativa;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println(Mensagens.BemVindo.getMsg());
        Scanner input = new Scanner(System.in);
        int opc = 1;
        while (opc != 0) {
            System.out.println("1 - Efetuar Login\n2 - Efetuar Cadastro\n0 - Sair");
            opc = input.nextInt();
            while (opc != 1 && opc != 2 && opc !=0) {
                System.out.println("Não existe essa opção.");
                System.out.println("1 - Efetuar Login\n2 - Efetuar Cadastro");
                opc = input.nextInt();
            }
            if (opc == 1) {
                Login.login();
            } else if (opc == 2) {
                Cadastros.cadastrar();
            }

        }
    }

}
