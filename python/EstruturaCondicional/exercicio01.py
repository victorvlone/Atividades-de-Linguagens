nota1 = float(input('Digite a primeira nota: '))
nota2 = float(input('Digite a segunda nota: '))

media = nota1 + nota2

print(f'NOTA FINAL = {media:.1f}')
if media < 60.00:
    print('REPROVADO')