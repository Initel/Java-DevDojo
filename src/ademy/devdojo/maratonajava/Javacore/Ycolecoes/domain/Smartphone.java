package ademy.devdojo.maratonajava.Javacore.Ycolecoes.domain;

public class Smartphone {
    private String serialNumber;
    private String Marca;

    public Smartphone(String serialNumber, String marca) {
        this.serialNumber = serialNumber;
        Marca = marca;
    }

    // Reflexivo: x.equals(x) tem que ser true para tudo que for diferente de null
    // Simetrico: para x e y diferentes de null, se x.equals(y) == true logo, y.equals(x) == true
    // Transitividadde: para x, y, z diferentes de null, se x.equals(y) == true, logo y.equals(z) == true logo, y.equals(z) true
    // Consistente: x.equals(x) sempre retorna true se x for diferente de null
    // para x diferente de null, x.wquals(null) tem que retornar false

    @Override
    public boolean equals(Object obj) {
        if(obj == null) return false;
        if(this == obj) return true;
        if(this.getClass() != obj.getClass()) return false;
        Smartphone smartphone = (Smartphone) obj;
        return serialNumber != null && serialNumber.equals(smartphone.serialNumber);
    }

    public String getSerialNumber() {return serialNumber;}
    public void setSerialNumber(String serialNumber) {this.serialNumber = serialNumber;}

    public String getMarca() {return Marca;}
    public void setMarca(String marca) {Marca = marca;}

    @Override
    public String toString() {
        return "Smartphone{" +
                "serialNumber='" + serialNumber + '\'' +
                ", Marca='" + Marca + '\'' +
                '}';
    }
}
