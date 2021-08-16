package ademy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais05 {
    public static void main(String[] args) {

        byte dia = 7;
        String diaUtil;
        String escolhaSaida = "";
        String[] diaSemana = {"Domingo, ", "Segunda, ", "Terça, ", "Quarta, ", "Quinta, ", "Sexta, ", "Sábado, "};

        if (dia >= 2 && dia <= 6){
            diaUtil = "Dia Util";
        }else{
            diaUtil = "Fim de semana";
        }
        switch (dia) {
            case 1: escolhaSaida = diaSemana[0];break;
            case 2: escolhaSaida = diaSemana[1];break;
            case 3: escolhaSaida = diaSemana[2];break;
            case 4: escolhaSaida = diaSemana[3];break;
            case 5: escolhaSaida = diaSemana[4];break;
            case 6: escolhaSaida = diaSemana[5];break;
            case 7: escolhaSaida = diaSemana[6];break;
        }
        System.out.println("Hoje é: " + escolhaSaida + diaUtil);

    }
}

        /*char sexo = 'F';
        switch (sexo){
            case 'M': System.out.println("Masculino");break;
            case 'F': System.out.println("Feminino");break;
            case 'm': System.out.println("Masculino");break;
            case 'f': System.out.println("Feminino");break;
            default:  System.out.println("Invalido");break;
        }*/