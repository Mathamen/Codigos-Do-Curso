#include <iostream>

using namespace std;

void funcionarios (int a)
{
    int matricula, salario;
    int salarioMax=0;
    int repeticaosalarioMax = 0;
    for (int i=0; i<a; i++)
    {
        cout << "Informe a matricula e o salario: ";
        cin >> matricula >> salario;
        if (salario==salarioMax)
        {
            repeticaosalarioMax++;
        }
        if (salario>salarioMax)
        {
            salarioMax=salario;
            repeticaosalarioMax=1;
        }
    }
    cout << "O maior salario e: " << salarioMax  << endl;
    cout << "e o numero de funcionarios com esse salario e: " << repeticaosalarioMax;
}

int main ()
{
    int qntd;
    cout << "Informe a quantidade de funcionarios: ";
    cin >> qntd;
    funcionarios(qntd);
    return 0;
}
