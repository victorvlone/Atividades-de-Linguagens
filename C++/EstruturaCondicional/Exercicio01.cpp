#include <bits/stdc++.h>

using namespace std;

int main(){
    double nota1, nota2;

    cout << "Digite a primeira nota: ";
    cin >> nota1;
    cout << "Digite a segunda nota: ";
    cin >> nota2;

    
    double notaFinal = nota1 + nota2;
    cout << fixed << setprecision(1) << "\nNOTA FINAL = " << notaFinal << endl;

    if(notaFinal < 70){
        cout << "REPROVADO";
    }

}