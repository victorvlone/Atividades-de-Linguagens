#include <bits/stdc++.h>

using namespace std;

int main(){

    int n1, n2, maior, menor, soma = 0;

    cout << "Digite dois numeros:" << endl;
    cin >> n1;
    cin >> n2;
    if(n1 > n2){
        maior = n1;
        menor = n2;
    } else{
        maior = n2;
        menor = n1; 
    }

    for (int i = menor; i < maior; i++){
        if(i % 2 != 0){
            soma += i;
        }
    }

    cout << "SOMA DOS IMPARES = " << soma;
    

    return 0;
}