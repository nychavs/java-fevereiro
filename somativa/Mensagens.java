package somativa;

public enum Mensagens {
    BemVindo("Olá usuário, seja bem vindo ao sistema de controle de estoque"),
    Cadastro("Vamos efetuar seu cadastro"),
    Saiu("Volte sempre"),
    Cadastro_produto("---------Cadastro de Produtos---------");
    private String msg;

    Mensagens(String msg) {
        this.msg = msg;

    }
    public String getMsg(){
        return msg;
    }
}
