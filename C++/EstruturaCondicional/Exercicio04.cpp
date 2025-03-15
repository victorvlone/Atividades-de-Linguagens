#include <bits/stdc++.h>

using namespace std;

int main(){
    double preco, recebido;
    int quantidade;

    cout << "Preço unitário do produto: ";
    cin >> preco;
    cout << "Quantidade comprada: ";
    cin >> quantidade;
    cout << "Dinheiro recebido: ";
    cin >> recebido;

    double troco = recebido - preco * quantidade;

    cout << fixed << setprecision(2);
    if (troco >= 0){
        cout << "TROCO = " << troco;
    }else{
        cout << "DINHEIRO INSUFICIENTE. FALTAM " << troco << "REAIS";
    }

    return 0;
}