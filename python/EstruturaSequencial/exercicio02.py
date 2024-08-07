base = float (input('Base do retangulo: '))
altura = float (input('Altura do retangulo: '))

area = base * altura
perimetro = base * 2 + altura * 2
diagonal = (base ** 2 + altura ** 2) ** 0.5

print(f'AREA = {area}')
print(f'PERIMETRO = {perimetro}')
print(f'DIAGONAL = {diagonal:.4f}')