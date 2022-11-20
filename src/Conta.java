import java.text.SimpleDateFormat;
import java.util.Date;

public abstract class Conta {

    private static int SEQUENCIAL = 1;
    private static final int agenciaUnica = 266;

    private int agencia;
    private int numero;
    private Cliente cliente;
    private double saldo;

    public Conta(Cliente cliente) {

        this.agencia = agenciaUnica;
        this.cliente = cliente;
        this.numero = SEQUENCIAL++;
        this.cliente = cliente;
    }

    protected void depositar(double valor) {
        this.saldo += valor;
    }

    protected boolean sacar(double valor) {
        if (this.saldo >= valor) {
            this.saldo -= valor;
            return true;
        } else {
            return false;
        }
    }
    protected boolean transferir(Conta contaDestino, double valor) {
        if (this.saldo >= valor) {
            this.sacar(valor);
            contaDestino.saldo += valor;
            return true;
        }
        return false;
    }

    protected String mostrarDateHora(){
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yy - H:mm:ss");
        String formatterDate = formatter.format(new Date());
        return formatterDate;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public int getNumero() {
        return numero;
    }

    protected void InformarExtratoGeral() {

        System.out.println("CLIENTE: " + cliente.getNome());
        System.out.println("CPF: " + cliente.getCpf());
        System.out.println(String.format("Agencia: %d", this.agencia));
        System.out.println(String.format("Conta nº: %d", this.numero));
        System.out.println(String.format("Saldo: R$ %.2f", this.saldo));
        System.out.println("-------------------------------------");


    }
}
