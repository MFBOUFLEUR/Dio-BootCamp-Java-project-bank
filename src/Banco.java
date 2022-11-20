import java.util.List;

public abstract class Banco {

    protected static final int numeroBanco = 30;
    protected static String nome = "UPBANK";
    protected List <Conta> contas;

    protected Banco(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public List<Conta> getContas() {
        return contas;
    }
}
