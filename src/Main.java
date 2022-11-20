public class Main {
    public static void main(String[] args) {

        Cliente gustavo = new Cliente("GUSTAVO SILVA", "281921907");
        Cliente carla = new Cliente("CARLA SILVA", "21212098796");

        ContaCorrente cc = new ContaCorrente(gustavo);
        ContaPoupanca cp = new ContaPoupanca(carla);

        cc.depositar(7000);
        cc.extrato();

        cc.transferir(cp,2000);
        cc.extrato();

        cc.extrato();
        cp.extrato();
    }
}