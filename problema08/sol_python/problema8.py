pie = float (0) #nada
pulgada = float (0) #nada
yarda = float (0) #nada
cont = 1
salida = ""
metro = int (input ("Ingrese la cantidad de metros a convertir:\n")) #se pregunta y guarda

while cont <= metro: #condicional para que metro funcione como limite
    pie = cont * 3.28
    pulgada = cont * 39.37
    yarda = cont * 1.094
    salida = (f"{salida}{cont:.2f}\t{pie:.2f}\t{pulgada:.2f}\t{yarda:.2f}\n") 
    cont = cont +1 

print ("Metro\tPie\tPulgada\tYarda")
print (salida)
