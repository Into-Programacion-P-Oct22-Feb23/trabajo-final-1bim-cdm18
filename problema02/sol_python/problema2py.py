descuento = float()
total = float() 
precio_u = float()
trajes = int ()
subtotal = float()
trajes = int (input ("Ingrese la cantidad de trajes que va a adquirir:\n "))
precio_u = float (input ("Ingrese el valor unitario de los trajes:\n "))
subtotal = trajes * precio_u
if trajes == 1:          
    descuento = subtotal * 0.20
    total = subtotal - descuento          
    print(f"El subtotal a pagar es de: {subtotal:.2f}\nCon un descuento de: {descuento:.2f}\nSu total es de: {total:.2f}\n")
if trajes == 2:          
    descuento = subtotal * 0.25
    total = subtotal - descuento          
    print(f"El subtotal a pagar es de: {subtotal:.2f}\nCon un descuento de: {descuento:.2f}\nSu total es de: {total:.2f}\n")
if trajes == 3:          
    descuento = subtotal * 0.40
    total = subtotal - descuento          
    print(f"El subtotal a pagar es de: {subtotal:.2f}\nCon un descuento de: {descuento:.2f}\nSu total es de: {total:.2f}\n")
if trajes > 3:          
    descuento = subtotal * 0.50
    total = subtotal - descuento          
    print(f"El subtotal a pagar es de: {subtotal:.2f}\nCon un descuento de: {descuento:.2f}\nSu total es de: {total:.2f}\n")
                                                                                                      