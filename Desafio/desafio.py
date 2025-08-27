import re

def detectar_enteros(texto):
    return re.findall(r'(?<![\[\d,\.])\b-?\d+\b(?![\],\.])', texto) # enteros positivos o negativos
def detectar_flotantes(texto):
    return re.findall(r'-?\d+\.\d+', texto) #decimales
def detectar_booleanos(texto):
    return re.findall(r'\b(?:True|False)\b', texto) #True o False ( con mayuscula al principio)
def detectar_strings(texto):
    return re.findall(r'"[^"]*"', texto)#texto dentro de comillas
def detectar_listas(texto):
    # Listas de números enteros o flotantes separadas por comas
    return re.findall(r'\[[^\[\]]*\]', texto)


# Función para analizar el texto
def analizar_texto(texto):
    resultados = []

    for num in detectar_enteros(texto):# Detectar coincidencias y clasificar
        resultados.append((num, "entero"))

    for num in detectar_flotantes(texto):
        resultados.append((num, "flotante"))

    for b in detectar_booleanos(texto):
        resultados.append((b, "booleano"))

    for s in detectar_strings(texto):
        resultados.append((s, "string"))

    for l in detectar_listas(texto):
        resultados.append((l, "lista"))

    return resultados

if __name__ == "__main__":
    texto = input("Ingrese el texto a analizar:\n> ")
    print("\nLos resultados encontrados fuerom:")

    resultados = analizar_texto(texto)
    
    if resultados:
        for valor, tipo in resultados:
            print(f"- {valor}: {tipo}")
    else:
        print("No se encontraron coincidencias ")
