preco = float(input('Preço unitário do produto: '))
quantidade = int(input('Quantidade comprada: '))
recebido = float(input('Dinheiro recebido: '))

troco = recebido - preco * quantidade

if troco >= 0:
    print(f'TROCO = R${troco}')
else:
    print(f'DINHEIRO INSUFICIENTE. FALTAM R${troco:.2f}')