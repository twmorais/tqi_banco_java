import java.util.Scanner;

public class Capturar_dados {

    Scanner recebe = new Scanner(System.in);

    public String recebe_cliente() {

        System.out.println("Favor digite o Nome do Cliente");

        String nome = recebe.next();
        return nome;
    }

    public String recebe_banco() {

        System.out.println("------------------------------------- ");
        System.out.println("--------Digite o nome do Banco ------ ");
        System.out.println("------------------------------------- ");

        String banco = recebe.next();
        return banco;
    }

    public Integer recebe_q_contas() {

        System.out.println("-------------------------------------------------------- ");
        System.out.println("----Bem vindo ao sistema Bancário TWM afins de estudo----");
        System.out.println("--------Digite a quantidade de contas a cadastrar ------ ");
        System.out.println("-------------------------------------------------------- ");

        Integer q_conta = recebe.nextInt();
        return q_conta;
    }

    public Integer recebe_tipo_de_conta() {

        System.out.println("------------------------------------- ");
        System.out.println("-----Digite 1 Para Poupança---------- ");
        System.out.println("-----Digite 2 Para Conta corrente --- ");
        System.out.println("------------------------------------- ");

        Integer tipo_conta = recebe.nextInt();
        return tipo_conta;
    }

    public Integer recebe_agencia() {

        System.out.println("------------------------------------- ");
        System.out.println("----Digite o número da sua agência--- ");
        System.out.println("------------------------------------- ");

        Integer tipo_conta = recebe.nextInt();
        return tipo_conta;
    }

    public Integer recebe_numero_conta() {

        System.out.println("------------------------------------- ");
        System.out.println("----Digite o número da sua conta----- ");
        System.out.println("------------------------------------- ");

        Integer n_conta = recebe.nextInt();
        return n_conta;

    }

    public Double recebe_saldo() {

        System.out.println("------------------------------------- ");
        System.out.println("----------Digite o seu saldo--------- ");
        System.out.println("------------------------------------- ");

        Double saldo = recebe.nextDouble();
        return saldo;

    }

    public Integer recebe_t_transacao() {

        System.out.println("------------------------------------- ");
        System.out.println("--------Digite 1 Para Sacar---------- ");
        System.out.println("--------Digite 2 Para Depositar ----- ");
        System.out.println("------------------------------------- ");

        Integer trancacao = recebe.nextInt();
        return trancacao;
    }
}
