horas_principal = int(input("Ingrese el número de horas de estacionamiento: "))

precio_final = 0


if horas_principal <= 4:

    precio_final = 6

else:

    precio_final = 6 + (horas_principal - 4) * 2


print("El precio total a pagar es de: s/.", precio_final)
