package ademy.devdojo.maratonajava.Javacore.Hheranca.domain;

public class Endereco {
    private String rua;
    private String cep;

    public Endereco(){
        return;
    }
    public Endereco(String rua, String cep) {
        this.rua = rua;
        this.cep = cep;
    }

    //Rua
    public String getRua() {return rua;}
    public void setRua(String rua) {this.rua = rua;}
    //CEP
    public String getCep() {return cep;}
    public void setCep(String cep) {this.cep = cep;}
}
