package fundamentos;

import java.util.Locale;

public class Notacaoponto {
    public static void main(String[] args) {
        String s = "Bom dia X ";
        s = s.replace("X", "Senhora");
        s = s.toUpperCase();
        s = s.concat("!!!");
        System.out.println(s);

        String x = "Leo".toUpperCase();
        System.out.println(x);

        String y = "Bom  Dia X"
                .replace("X", "gui")
                .toUpperCase()
                .concat("!!!");
        System.out.println(y);
           // Tipos primitivos nao tem  o operador de "."
    }
}
