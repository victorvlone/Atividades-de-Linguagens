codigo = int(input('Codigo do produto comprado: '))
quantidade = int(input('Quantidade comprada: '))

if codigo == 1:
    preco = 5
elif codigo == 2:
    preco = 3.50
elif codigo == 3:
    preco = 4.80
elif codigo == 4:
    preco = 8.90
elif codigo == 5:
    preco = 7.32
else:
    print('Esse codigo nao existe')

valor = preco * quantidade

print(f'Valor a pagar: R${valor:.2f}')