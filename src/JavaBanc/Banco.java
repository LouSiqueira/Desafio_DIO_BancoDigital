package JavaBanc;

public abstract class Banco implements Operacoes {

    protected String nome;

    public Banco(){
        this.nome = "Java Banc";
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
