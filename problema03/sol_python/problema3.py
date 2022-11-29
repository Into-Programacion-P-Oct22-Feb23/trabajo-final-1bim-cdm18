tipo = int()
nombre = str() 
horas_t = int () 
cuota_hora = float ()
horasextra = int ()
cuota_horasextra = float () 
sueldo = float ()
nombre = str (input ("Ingrese su nombre: :\n"))
tipo = int (input ("Que tipo de empleado es usted (1, 2, 3, 4): \n "))
horas_t = int (input ("Ingrese el numero de horas trabajadas: \n "))
cuota_hora = float (input ("Cuanto es su cuota por hora: \n ")) 
if horas_t > 40:
    if tipo == 1:    
        cuota_hora = cuota_hora * 1.5
        horasextra = horas_t - 40
        cuota_horasextra = cuota_hora * horasextra
        sueldo = horas_t * cuota_hora + cuota_horasextra
        print (f"El nombre del empleado es: {nombre}\nCon {horas_t} horas trabajadas\nSu cuota/hora es de: {cuota_hora:.2f}\nSu sueldo a pagar es de: {sueldo:.2f} ")
    if tipo == 2:
        cuota_hora = cuota_hora * 2
        horasextra = horas_t - 40
        cuota_horasextra = cuota_hora * horasextra
        sueldo = horas_t * cuota_hora + cuota_horasextra
        print (f"El nombre del empleado es: {nombre}\nCon {horas_t} horas trabajadas\nSu cuota/hora es de: {cuota_hora:.2f}\nSu sueldo a pagar es de: {sueldo:.2f}")
    if tipo == 3:
        cuota_hora = cuota_hora * 2.5
        horasextra = horas_t - 40
        cuota_horasextra = cuota_hora * horasextra
        sueldo = horas_t * cuota_hora + cuota_horasextra
        print (f"El nombre del empleado es: {nombre}\nCon {horas_t} horas trabajadas\nSu cuota/hora es de: {cuota_hora:.2f}\nSu sueldo a pagar es de: {sueldo:.2f}")
    if tipo == 4:
        cuota_hora = cuota_hora * 3
        horasextra = horas_t - 40
        cuota_horasextra = cuota_hora * horasextra
        sueldo = horas_t * cuota_hora + cuota_horasextra
        print (f"El nombre del empleado es: {nombre}\nCon {horas_t} horas trabajadas\nSu cuota/hora es de: {cuota_hora:.2f}\nSu sueldo a pagar es de: {sueldo:.2f}")
else:
    sueldo = horas_t * cuota_hora
    print (f"El nombre del empleado es: {nombre}\nCon {horas_t} horas trabajadas\nSu cuota/hora es de: {cuota_hora:.2f}\nSu sueldo a pagar es de: {sueldo:.2f}")
