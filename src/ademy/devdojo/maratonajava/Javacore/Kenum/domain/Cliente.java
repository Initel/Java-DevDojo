package ademy.devdojo.maratonajava.Javacore.Kenum.domain;

public class Cliente {

    private String nome;
    private TipoCliente tipoCliente;
    private TipoPagamento tipoPagamento;

    public Cliente(String nome, TipoCliente tipoCliente, TipoPagamento tipoPagamento) {
        this.nome = nome;
        this.tipoCliente = tipoCliente;
        this.tipoPagamento = tipoPagamento;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", tipoCliente=" + tipoCliente.valor +
                ", tipoPagamento=" + tipoPagamento +
                '}';
    }

    public String getNome() {return nome;}
    public void setNome(String nome) {this.nome = nome;}

    public TipoCliente getTipoCliente() {return tipoCliente;}
    public void setTipoCliente(TipoCliente tipoCliente) {this.tipoCliente = tipoCliente;}

    public TipoPagamento getTipoPagamento() {return tipoPagamento;}
    public void setTipoPagamento(TipoPagamento tipoPagamento) {this.tipoPagamento = tipoPagamento;}
}
