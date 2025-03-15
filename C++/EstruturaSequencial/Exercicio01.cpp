#include <bits/stdc++.h>

using namespace std;

int main(){
    double largura, comprimento, valor;

    cout << "Digite a largura do terreno: ";
    cin >> largura;
    cout << "Digite o comprimento do terreno: ";
    cin >> comprimento;
    cout << "Digite o valor do metro quadrado: ";
    cin >> valor;

    double area = largura * comprimento;
    cout << fixed << setprecision(2);
    cout << "Area do terreno: " << area;

    double preco = area * valor;
    cout << "\nPreco do terreno: " << preco;

    return 0;

}