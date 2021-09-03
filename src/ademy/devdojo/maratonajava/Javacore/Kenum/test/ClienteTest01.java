package ademy.devdojo.maratonajava.Javacore.Kenum.test;
import ademy.devdojo.maratonajava.Javacore.Kenum.domain.Cliente;
import ademy.devdojo.maratonajava.Javacore.Kenum.domain.TipoCliente;
import ademy.devdojo.maratonajava.Javacore.Kenum.domain.TipoPagamento;


public class ClienteTest01 {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Usoop", TipoCliente.PESSOA_FISICA, TipoPagamento.DEBITO);
        Cliente cliente2 = new Cliente("Akira", TipoCliente.PESSOA_JURIDICA, TipoPagamento.CREDITO);

        System.out.println(cliente1);
        System.out.println(cliente2);
        System.out.println(TipoPagamento.DEBITO.calcDesconto(100));
        System.out.println(TipoPagamento.CREDITO.calcDesconto(100));
        TipoCliente tipoCliente = TipoCliente.valueOf("PESSOA_FISICA");
        System.out.println(tipoCliente.getNomeRelatorio());
        TipoCliente tipoCliente1 = TipoCliente.PESSOA_FISICA.tipoClienteNomeRelat("Pessoa Física123");
        System.out.println(tipoCliente1);
    }
}