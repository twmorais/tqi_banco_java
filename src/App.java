
public class App {
    public static void main(String[] args) throws Exception {

        Capturar_dados captura = new Capturar_dados();
        Operacoes operacoes = new Operacoes();
        ImprimirDados imprimir = new ImprimirDados();
        Integer t_conta;

        Cliente cliente = new Cliente();
        cliente.setNome(captura.recebe_cliente());
        Banco banco = new Banco();
        banco.setNome_banco(captura.recebe_banco());
        Conta conta = new Conta(cliente, banco);
        t_conta = captura.recebe_tipo_de_conta();
        conta = operacoes.recebe_dados(t_conta, cliente, banco);
        imprimir.imprime_dados(conta);

    }

}
