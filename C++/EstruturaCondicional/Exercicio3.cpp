#include <bits/stdc++.h>

using namespace std;

int main(){
    int minutos;

    cout << "Digite a quantidade de minutos: ";
    cin >> minutos;

    double valor;
    if (minutos <= 100){
        valor = 50;
    }else{
        valor = 50 + (minutos - 100) * 2;
    }

    cout << fixed << setprecision(2) << "Valor a pagar: R$" << valor;
}