import java.util.Scanner;

public class Operacoes {

    Scanner recebe = new Scanner(System.in);

    public Double sacar(Double saldo_saque) {

        System.out.println("----------------------------------------- ");
        System.out.println("--------Digite o valor do saque---------- ");
        System.out.println("----------------------------------------- ");
        Double saque = recebe.nextDouble();
        saldo_saque = saldo_saque - saque;
        return saldo_saque;

    }

    public Double depositar(Double saldo_deposito) {

        System.out.println("-------------------------------------------- ");
        System.out.println("--------Digite o valor do depósito---------- ");
        System.out.println("-------------------------------------------- ");
        Double deposito = recebe.nextDouble();
        saldo_deposito = saldo_deposito + deposito;
        return saldo_deposito;

    }

    public Double recebe_tipo(Integer recebe_t_t, Double saldo) {

        if (recebe_t_t == 1) {
            Double s = sacar(saldo);
            return s;
        }
        if (recebe_t_t == 2) {
            Double d = depositar(saldo);
            return d;
        } else {
            return null;
        }
    }

    public Conta recebe_dados(Integer t_conta, Cliente cliente, Banco banco) {

        Capturar_dados captura = new Capturar_dados();

        if (t_conta == 1) {
            ContaCorrente conta = new ContaCorrente(cliente, banco);
            conta.setAgencia(captura.recebe_agencia());
            conta.setNumero(captura.recebe_numero_conta());
            Double s = captura.recebe_saldo();
            Integer tipo_t = captura.recebe_t_transacao();
            conta.setSaldo(recebe_tipo(tipo_t, s));
            conta.imprimirExtrato();
            return conta;
        }
        if (t_conta == 2) {
            ContaPoupanca conta = new ContaPoupanca(cliente, banco);
            conta.setAgencia(captura.recebe_agencia());
            conta.setNumero(captura.recebe_numero_conta());
            Double s = captura.recebe_saldo();
            Integer tipo_t = captura.recebe_t_transacao();
            conta.setSaldo(recebe_tipo(tipo_t, s));
            conta.imprimirExtrato();
            return conta;
        }
        return null;
    }

}
