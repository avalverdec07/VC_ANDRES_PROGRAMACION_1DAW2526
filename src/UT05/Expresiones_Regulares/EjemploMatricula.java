package UT05.Expresiones_Regulares;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EjemploMatricula {
    public static void main(String[] args) {
        String texto = "Mi coche tiene matrícula 1534-BBB";
        
        // 1. Definimos el Patrón: 4 dígitos, guion opcional, 3 letras mayúsculas
        // \\d{4}   -> 4 dígitos exactos
        // -?       -> guion opcional
        // [A-Z]{3} -> 3 letras mayúsculas
        String regex = "\\d{4}-?[A-Z]{3}";
        
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);
        
        // 2. Comprobamos si hay coincidencia en alguna parte del texto
        if (matcher.find()) {
            System.out.println("He encontrado una matrícula: " + texto);
        } else {
            System.out.println("No veo ningún coche aquí.");
        }
    }
}
