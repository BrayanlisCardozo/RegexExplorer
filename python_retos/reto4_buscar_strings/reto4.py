# Reto 4: Buscar cadenas de texto (strings) entre comillas usando regex
# Paso a paso:
# 1. Leer el texto de entrada.
# 2. Definir una expresión regular para encontrar strings entre comillas.
# 3. Buscar todos los strings en el texto.
# 4. Imprimir los resultados.

import re

texto = 'El mensaje es "Hola a Todos" y la clave es "1234" y aparte "33".' # Funciona perfecto

# Expresión regular para strings entre comillas dobles
patron = r'"(.*?)"'

# Buscar todos los strings
strings = re.findall(patron, texto)

print("Strings encontrados:", strings)
# Paso a paso:
# 1. Cambia el texto de prueba.
# 2. Modifica la expresión regular si es necesario.
# 3. Ejecuta el script y observa los resultados.
