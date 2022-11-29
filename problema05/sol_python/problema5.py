x = int()
y = int ()
x = int (input ("Ingrese la cordenada x: \n"))
y = int (input ("Ingrese la cordenada y: \n"))
if x > 0 and y > 0:
    print ("Sus cordenadas estan en el primer cuadrante")
if x > 0 and y < 0:
    print ("Sus cordenadas estan en el cuarto cuadrante")
if x < 0 and y < 0:
    print ("Sus cordenadas estan en el tercer cuadrante ")
if x < 0 and y > 0:
    print ("Sus cordenadas estan en el segundo cuadrante")
if x == 0 and y == 0:
    print ("Sus cordenadas estan en el centro")

if x == 0 and y > 0:
    print("Sus cordenadas estan en el eje +Y ")             
if x == 0 and y < 0:
    print("Sus cordenadas estan en el eje -Y ")            
if x < 0 and y == 0:
    print("Sus cordenadas estan en el eje -X ")           
if x > 0 and y == 0:
    print("Sus cordenadas estan en el eje +X ")