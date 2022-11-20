public class ContaCorrente extends Conta {

    public ContaCorrente(Cliente cliente) {
        super(cliente);

    }

    public void extrato() {
        System.out.println("-------------------------------------");
        System.out.println("  BANCO " +  Banco.nome+ " - Numero do Banco " + Banco.numeroBanco + "\n");
        System.out.println("       " +     mostrarDateHora() + "\n");
        System.out.println("    *** EXTRATO BANCARIO  ***" + "\n");
        System.out.println("TIPO DE CONTA: CONTA CORRENTE");
        super.InformarExtratoGeral();

    }
}
