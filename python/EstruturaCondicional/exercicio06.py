medida = float(input('Digite a medida da glicose: '))

if medida <= 100:
    print('Classificação: Normal')
elif medida > 100 and medida <= 140:
    print('Classificação: Elevado')
else:
    print('Classificação: Diabetes')