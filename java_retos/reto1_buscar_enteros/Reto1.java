// Reto 1: Buscar enteros en un texto usando regex en Java
// Paso a paso:
// 1. Leer el texto de entrada.
// 2. Definir una expresión regular para encontrar números enteros.
// 3. Buscar todos los enteros en el texto.
// 4. Imprimir los resultados.

import java.util.regex.*;

public class Reto1 {
    public static void main(String[] args) {
        String texto = "En 2023, había 15 estudiantes ,3 profesores y 10 ayudantes de aseo";
        // Expresión regular para enteros (positivos y negativos)
        String patron ="\\b-?\\d+\\b"; // funciono ya que cambiamos el -? de posicion
        Pattern pattern = Pattern.compile(patron);
        Matcher matcher = pattern.matcher(texto);
        System.out.print("Enteros encontrados: ");
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
