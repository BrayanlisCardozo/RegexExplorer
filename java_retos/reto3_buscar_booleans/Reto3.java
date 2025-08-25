// Reto 3: Buscar valores booleanos en un texto usando regex en Java
// Paso a paso:
// 1. Leer el texto de entrada.
// 2. Definir una expresión regular para encontrar valores booleanos (True/False).
// 3. Buscar todos los booleanos en el texto.
// 4. Imprimir los resultados.

import java.util.regex.*;

public class Reto3 {
    public static void main(String[] args) {
        String texto = "Hay gente False como tambien existe gente True";//Funciona bien
        // Expresión regular para booleanos (True o False, case-insensitive)
        String patron = "\\b(True|False)\\b";
        Pattern pattern = Pattern.compile(patron, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(texto);
        System.out.print("Booleanos encontrados: ");
        while (matcher.find()) {
            System.out.print(matcher.group() + " ");
        }
        System.out.println();
        // Paso a paso:
        // 1. Cambia el texto de prueba.
        // 2. Modifica la expresión regular si es necesario.
        // 3. Ejecuta el programa y observa los resultados.
    }
}
