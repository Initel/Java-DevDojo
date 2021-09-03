package ademy.devdojo.maratonajava.Javacore.Kenum.domain;

public enum TipoPagamento{
    DEBITO{
        @Override
        public double calcDesconto(double valor) {
            return valor * 0.1;
        }
    }, CREDITO{
        @Override
        public double calcDesconto(double valor) {
            return valor * 0.05;
        }
    };

    public abstract double calcDesconto(double valor);
}
