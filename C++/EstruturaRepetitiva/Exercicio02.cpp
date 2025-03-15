#include <bits/stdc++.h>

using namespace std;

int main(){

    int n, soma = 0, cont = 0;

    cout << "Digite as idades:" << endl;

    while( n >= 0){
        cin >> n;
        soma += n;
        cont++;
    }

    double media = (double) soma / cont;

    cout << fixed << setprecision(2);
    cout << "MEDIA = " << media;

    return 0;
}