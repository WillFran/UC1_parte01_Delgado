import os

ganancia = float (input ('Ingresa el valor de la ganancia: '))

if ganancia>0 and ganancia<=1000:
    donativo=ganancia*0.05

if ganancia>1000 and ganancia<=1500:
    donativo=ganancia*0.7


if ganancia>1500 and ganancia<=2000:
    donativo=ganancia*0.08


if ganancia>2000 and ganancia<=5000:
    donativo=ganancia*0.10

if ganancia>5000:
    donativo=ganancia*0.15
print ('Valor del donativo: ' + repr (donativo))