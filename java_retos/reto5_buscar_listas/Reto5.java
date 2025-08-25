// Reto 5: Buscar listas de números en un texto usando regex en Java
// Paso a paso:
// 1. Leer el texto de entrada.
// 2. Definir una expresión regular para encontrar listas de números (ej: [1, 2, 3]).
// 3. Buscar todas las listas en el texto.
// 4. Imprimir los resultados.

import java.util.regex.*;

public class Reto5 {
    public static void main(String[] args) {
        String texto = "Las listas son [1, 23, 3] y [4, 57, 6] y tambien [4,10,22]"; //Funciona bien solo se cambio la lista de numeros
        // Expresión regular para listas de números
        String patron = "\\[\\s*\\d+(?:\\s*,\\s*\\d+)*\\s*\\]";
        Pattern pattern = Pattern.compile(patron);
        Matcher matcher = pattern.matcher(texto);
        System.out.print("Listas encontradas: ");
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
