#include <iostream>
#include <iomanip>
#include <cmath>

using namespace std;

int main() {
    double base, altura;

    cout << "Base do retangulo: ";
    cin >> base;
    cout << "Altura do retangulo: ";
    cin >> altura;

    double area = base * altura;
    double perimetro = 2 * (base + altura);
    double diagonal = sqrt(pow(base, 2) + pow(altura, 2));

    cout << fixed << setprecision(4);
    cout << "AREA = " << area << endl;
    cout << "PERIMETRO = " << perimetro << endl;
    cout << "DIAGONAL = " << diagonal << endl;

    return 0;
}
