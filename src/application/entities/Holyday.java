package application.entities;

import java.util.HashMap;

public class Holyday {
    private HashMap<String, String> holydays = new HashMap<String, String>();

    public Holyday() {
        holydays.put("01/01/2023", "Confraternização mundial");
        holydays.put("21/02/2023", "Carnaval");
        holydays.put("17/04/2023", "Páscoa");
        holydays.put("21/04/2023", "Tiradentes");
        holydays.put("01/05/2023", "Dia do trabalho");
        holydays.put("08/06/2023", "Corpus Christi");
        holydays.put("07/09/2023", "Independência do Brasil");
        holydays.put("12/10/2023", "Nossa Senhora Aparecida");
        holydays.put("02/11/2023", "Finados");
        holydays.put("15/11/2023", "Proclamação da República");
        holydays.put("25/12/2023", "Natal");
    }

    public HashMap<String, String> getHolydays() {
        return holydays;
    }

    public void addHolyday(String date, String holyday) {
        holydays.put(date, holyday);
    }

    public String isHolyday(String date) {
        if(holydays.get(date) != null)   {
            return holydays.get(date);
        }
        return "not a holyday";
    }


}
