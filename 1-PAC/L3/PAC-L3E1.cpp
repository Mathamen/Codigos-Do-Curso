#include <iostream>
using namespace std;

float mediaVetor (int v[] , int qtd)
{
float soma = 0;
for (int i=0 ; i< qtd; i++) {soma= v[i]+ soma;}


return (soma/qtd);
}

int main ()
{
int qtd;
cin>> qtd;
int v[qtd];
for (int z=0; z<qtd; z++)
{
cin>> v[z];
}
cout << "blz aqui";
cout << mediaVetor(v, qtd);
return 0;  
}
