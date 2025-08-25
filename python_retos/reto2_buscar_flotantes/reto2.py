# Reto 2: Buscar números flotantes en un texto usando regex
# Paso a paso:
# 1. Leer el texto de entrada.
# 2. Definir una expresión regular para encontrar números flotantes.
# 3. Buscar todos los flotantes en el texto.
# 4. Imprimir los resultados.

import re

texto = "El precio es 12.50 dólares, pero antes era 10.0. por lo tanto subio 2.50 dolares"

# Expresión regular para flotantes (números con punto decimal)
#patron = r"-?\\b\\d+\\.\\d+\\b"
patron = r"\b-?\d+\.\d+\b"
# Buscar todos los flotantes
flotantes = re.findall(patron, texto)

print("Flotantes encontrados:", flotantes)
# Paso a paso:
# 1. Cambia el texto de prueba.
# 2. Modifica la expresión regular si es necesario.
# 3. Ejecuta el script y observa los resultados.
