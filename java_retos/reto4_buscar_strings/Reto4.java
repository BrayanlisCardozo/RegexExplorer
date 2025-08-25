// Reto 4: Buscar cadenas de texto (strings) entre comillas usando regex en Java
// Paso a paso:
// 1. Leer el texto de entrada.
// 2. Definir una expresión regular para encontrar strings entre comillas.
// 3. Buscar todos los strings en el texto.
// 4. Imprimir los resultados.

import java.util.regex.*;

public class Reto4 {
    public static void main(String[] args) {
        String texto = "El mensaje es \"Hola a todos los presentes\" y la clave es \"6634\"."; //esta bien 
        // Expresión regular para strings entre comillas dobles
        String patron = "\"(.*?)\"";
        Pattern pattern = Pattern.compile(patron);
        Matcher matcher = pattern.matcher(texto);
        System.out.print("Strings encontrados: ");
        while (matcher.find()) {
            System.out.print(matcher.group(1) + " ");
        }
        System.out.println();
        // Paso a paso:
        // 1. Cambia el texto de prueba.
        // 2. Modifica la expresión regular si es necesario.
        // 3. Ejecuta el programa y observa los resultados.
    }
}
