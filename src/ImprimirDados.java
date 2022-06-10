public class ImprimirDados {

    public void imprime_dados(Conta conta) {

        System.out.println("---------------------------------------------------- ");
        System.out.println(String.format("Cliente: %s", conta.cliente.getNome()));
        System.out.println("---------------------------------------------------- ");
        System.out.println(String.format("Banco: %s", conta.banco.getNome_banco()));
        System.out.println("----------------------------------------------------- ");
        System.out.println(String.format("Agencia: %s", conta.getAgencia()));
        System.out.println("----------------------------------------------------- ");
        System.out.println(String.format("N. Conta: %s", conta.getNumero()));
        System.out.println("----------------------------------------------------- ");
        System.out.println(String.format("Saldo: %s", conta.getSaldo()));
        System.out.println("----------------------------------------------------- ");

    }

}
