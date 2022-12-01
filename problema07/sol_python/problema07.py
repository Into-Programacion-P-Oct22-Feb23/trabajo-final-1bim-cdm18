"""
Elaborar un programa que permita leer un número par y calcule e imprima la suma de los números pares del 2 
hasta el número leído. Si el número leído es menor a 2 debe imprimir un mensaje de error.
"""
suma_par = 2 #entero
suma_total = 0 #entero

numero = int(input("Ingrese un numero: "))
if numero>=2:
    if numero%2==0:
        print("El numero ingresado es Par")
        while suma_par <= numero:
            suma_total = suma_total + suma_par
            print(suma_par)
            suma_par = suma_par + 2
        print("La suma total es: ", suma_total)
else: 
    print("Error, ingrese un valor mas alto");       