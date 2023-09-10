#include <iostream>

using namespace std;
int calcularIMC(int a, int b)
{

   cout << (b)/ (a * a);

return 0;
}
int main ()
{
    int a, b;
    cout << "por favor insira a altura, em metros, e o peso, em kg, respectivamente." << endl;

    cin >> a >> b;
    cout << calcularIMC(a,b);
    return 0;
}
