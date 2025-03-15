#include <bits/stdc++.h>

using namespace std;

int main(){
    int n1, n2;

    while(n1 != n2){
        cout << "Digite dois numeros: \n";
        cin >> n1;
        cin >> n2;
    
        if(n1 > n2){
            cout << "DECRESCENTE!" << endl;
        } else {
            cout << "CRESCENTE!" << endl;
        }
    }



    return 0;
}