import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.TextStyle;
import java.util.Locale;

public class stringManipulation {
    public static void main(String[] args) {
        String nome = "Rebeca";

        LocalDate hoje = LocalDate.now();
        @SuppressWarnings("deprecation")
        Locale brasil = new Locale("pt", "BR");
        String diaSemana = hoje.getDayOfWeek().getDisplayName(TextStyle.FULL, brasil);
        LocalDateTime agora = LocalDateTime.now();
        String saudacao = DefineTimeOfDay(agora.getHour());

        System.out.printf("Olá, %s! Hoje é %s. %s!", nome, diaSemana, saudacao.toUpperCase());

    }

    public static String DefineTimeOfDay(int horario){
        String saudacao = "";
        
        if (horario >= 24 && horario < 12){
            saudacao = "bom dia";
        } else if (horario >= 12 && horario < 18){
            saudacao = "boa tarde";
        } else if (horario >= 18 && horario < 24){
            saudacao = "boa noite";
        } else {
            saudacao = "Olá!";
        }

        return saudacao;
    }
}
