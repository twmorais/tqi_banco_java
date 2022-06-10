import java.util.List;

public class Banco {

    private String nome_banco;
    public List<Conta> contas;
    public Integer q_contas;

    public Integer getQ_contas() {
        return this.q_contas;
    }

    public void setQ_contas(Integer q_contas) {
        this.q_contas = q_contas;
    }

    public String getNome_banco() {
        return this.nome_banco;
    }

    public void setNome_banco(String nome_banco) {
        this.nome_banco = nome_banco;
    }

    public List<Conta> getContas() {
        return this.contas;
    }

    public void setContas(List<Conta> contas) {
        this.contas = contas;
    }

}
