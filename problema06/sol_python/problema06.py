'''
Elaborar un programa que calcule e imprima la suma 1 + 1/2 + 1/3 + 1/4 ... + 1/100.
Ejercicio tomado de: López Román, Leobardo. (2013) Metodología programación orientada a objetos. México
'''

contador = 1
cadena  = " "
suma = 0

# Bucle while 
while contador <= 100: 
    if contador ==1:
        cadena = print(1, end=" ")
    cadena = print(f" + 1/{contador}", end= " " )
    suma = suma + contador
    contador += 1

print("\nLa suma es: ", suma)

 





