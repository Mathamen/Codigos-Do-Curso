#include<iostream>
#define N 10573

using namespace std;

struct cliente
{
    int conta;
    float saldo;
};

int preenche(cliente  clientes[])
{
    int conta, qtd;
    qtd = 0;

    cin >> conta;
    while(conta!=0)
    {
        clientes[qtd].conta=conta;
        cin >> clientes[qtd].saldo;

        cin >> conta;
        qtd++;
    }
    return qtd;
}

float saldoMedioBanco(cliente v[], int qt)
{
    float soma = 0;
    float media =0;
    for(int i=0; i<qt; i++)
    {
        soma += v[i].saldo;
    }
    media = soma/qt;
    return media;
}

void exibe(cliente clientes[], int qt, float saldoMedio)
{
    for (int i=0; i<qt; i++)
    {
        cout << "Conta: " << clientes[i].conta << endl;
        cout << "Saldo: " << clientes[i].saldo << endl;
        if(clientes[i].saldo>saldoMedio)
        {
            cout << "Saldo acima da média do banco." << endl;
        }
        else if(clientes[i].saldo<saldoMedio)
        {
            cout << "Saldo abaixo da média do banco." << endl;
        }
        else
        {
            cout << "Saldo igual a média do banco." << endl;
        }
    }
}

int main()
{
    cliente clientes[N];
    int qtd = preenche(clientes);
    float media = saldoMedioBanco(clientes, qtd);
    exibe(clientes, qtd, media);
    return 0;
}