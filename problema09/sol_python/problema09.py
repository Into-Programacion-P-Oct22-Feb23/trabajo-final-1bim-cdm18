"""
Utilizando una estructura repetitiva diseñe un algoritmo para calcular 
e imprimir los k primeros términos de la serie:
S1 = 12-11+24-22+36-33+48-44
"""

cont = 12
aux = 11
salida = " "
cont2 = 1
# Ciclo repetitivo
while cont <= 48:
    salida = salida + str(cont) + '-' + str(aux) 
    if cont2 <4:
        salida = salida + '+'
        cont2 +=1
    cont = cont + 12
    aux = aux + 11
        
   
print("S1 =", salida)