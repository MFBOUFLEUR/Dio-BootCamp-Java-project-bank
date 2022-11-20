public class ContaPoupanca extends Conta {

    public ContaPoupanca(Cliente cliente) {
        super(cliente);

    }

    public void extrato() {

        System.out.println("-------------------------------------");
        System.out.println("  BANCO " +  Banco.nome+ " - Numero do Banco " + Banco.numeroBanco );
        System.out.println("       " +     mostrarDateHora() + "\n");
        System.out.println("    *** EXTRATO BANCARIO  ***" + "\n");
        System.out.println("TIPO DE CONTA: CONTA POUPANCA");
        super.InformarExtratoGeral();
    }
}
