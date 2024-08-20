print('Digite as tres distancias: ')
distancia1 = float(input())
distancia2 = float(input())
distancia3 = float(input())

if distancia1 > distancia2 and distancia1 > distancia3:
    maiorDistancia = distancia1
elif distancia2 > distancia1 and distancia2 > distancia3:
    maiorDistancia = distancia2
else:
    maiorDistancia = distancia3

print(f'MAIOR DISTANCIA = {maiorDistancia:.2f}')