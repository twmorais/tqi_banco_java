public class Conta {

    protected int tipo;
    protected int agencia;
    protected int numero;
    protected double saldo;
    Cliente cliente = new Cliente();
    Banco banco = new Banco();

    public Conta(Cliente cliente, Banco banco) {
        this.cliente = cliente;
        this.banco = banco;
    }

    public Integer getTipo() {
        return this.tipo;
    }

    public void setTipo(Integer tipo) {
        this.tipo = tipo;
    }

    public int getAgencia() {
        return this.agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public int getNumero() {
        return this.numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

}
