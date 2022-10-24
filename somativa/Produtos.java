package somativa;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;



public class Produtos {
    public static void produtos() throws IOException {

        Gravar logtxt = new Gravar();
        int opcao = 1;
        ArrayList<String> listaprodutos = new ArrayList<>();
        ArrayList<String> logLista = new ArrayList<>();
        ArrayList<String> retorno =  new ArrayList<>();
        ArrayList<String> lista_produsto2 =  new ArrayList<>();
        var lerprods = logtxt.lerTxt("produtos");

            while (opcao != 0){
                System.out.println(Mensagens.Cadastro_produto.getMsg());
                Scanner input = new Scanner(System.in);
                System.out.println("1 - Cadastrar produto\n2 - Alterar Quantidade\n3 - Remover produto\n4 - Listar os produtos\n0 - Voltar ao menu");
                opcao = input.nextInt();
                input.nextLine();
                String info_menu = ("Escolheu a opcao " + opcao);
                logLista.add(info_menu);
                switch (opcao) {
                    case 1:
                        listaprodutos.clear();
                        System.out.println("Digite o nome do produto: ");
                        String nome_produto = input.nextLine();
                        System.out.println("Quantidade: ");
                        int qtd_produto = input.nextInt();
                        input.nextLine();

                        listaprodutos.add(nome_produto);
                        listaprodutos.add(qtd_produto + " " );
                        logtxt.gravarTxt("produtos", listaprodutos);

                        String info_prod = ("Inseriu o produto " + nome_produto);
                        logLista.add(info_prod);
                        String info_qtd = ("Quantidade: " + qtd_produto);
                        logLista.add(info_qtd);
                        System.out.println("cadastrado. Verifiqu txt ou opcao 4");
                        break;
                    case 2:
                        int count = 0;
                        for (int i = 0; i < lerprods.size(); i++) {
                            lista_produsto2.add(lerprods.get(i));
                            if ((i %2 == 0) && (i - 1 < lerprods.size())){
                                count = count + 1;
                                System.out.println("-----------");
                                System.out.println(count + ":");

                            }
                            System.out.println(lerprods.get(i));
                        }

                        System.out.println("Qual o produto que deseja alterar a quantidade? ");
                        int indice_qtd = input.nextInt();
                        input.nextLine();
                        System.out.println("Qual a nova quantidade? ");
                        String nova_qtd = input.nextLine();
                        lista_produsto2.remove((indice_qtd * 2)-1);
                        lista_produsto2.add((indice_qtd * 2)-1,nova_qtd);
                        logtxt.gravarTxt2("produtos", lista_produsto2);
                        System.out.println("Alterado. Verifique txt ou opcao 4");
                        info_menu = ("Alterou a quantia do produto do indice " + indice_qtd + "para " + nova_qtd);
                        logLista.add(info_menu);
                        break;
                    case 3:
                        count = 0;
                        for (int i = 0; i < lerprods.size(); i++) {
                            lista_produsto2.add(lerprods.get(i));
                            if (i %2 == 0){
                                count = count + 1;
                                System.out.println("-----------");
                                System.out.println(count + ":");

                            }
                            System.out.println(lerprods.get(i));
                        }
                        System.out.println("Qual o indice do produto que deseja remover? ");
                        int indice = input.nextInt();
                        info_menu = ("Removeu o produto do indice" + indice);
                        logLista.add(info_menu);
                        lerprods.remove(indice);
                        lerprods.remove(indice-1);
                        logtxt.gravarTxt2("produtos", lerprods);
                        lerprods = logtxt.lerTxt("produtos");
                        System.out.println("Removido com sucesso. verifique txt ou opcao 4");
                        break;
                    case 4:
                        lerprods = logtxt.lerTxt("produtos");
                        for (int i = 0; i < lerprods.size(); i++) {
                            if (i %2 == 0){
                                System.out.println("-----------");
                            }
                            System.out.println(lerprods.get(i));
                        }
                        break;

                }
                logtxt.gravarTxt("logSomativa", logLista);
        }
    }
}
