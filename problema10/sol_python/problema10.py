"""
Problema 10
Use ciclos repetitivos
Realice un algoritmo que lea un número de datos y calcule la media y la varianza de los mismos. El usuario decide cuando no ingresar 
más números.
"""

bandera = True
contador = 0
suma = 0 
media = 0
while bandera == True:
    n = float(input("Ingrese un numero: "))
    suma += n
    contador += 1
    
    opcion = int(input("Si deseas terminar el proceso digita '000': "))
    
    if opcion == 000:
        bandera = False
    
    media = suma / contador
print("La suma es: ", suma)
print("La media es: ", media)   

