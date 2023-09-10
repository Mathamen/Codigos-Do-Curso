#include <iostream>
using namespace std;

float maiorDoVetor(float v[], int qtd)
{
  float maior=v[0];
  for (int i=1; i<qtd; i++)
    {
      if (v[i]>maior){maior= v[i];}
    }
  return maior;
  
}





int main ()
{
  int qtd;
  cout << "insira a quantidade do vetor\n";
  cin >> qtd;
  float v[qtd];
  for (int i= 0; i<qtd; i++)
  {
    cin>> v[i];
  }
  cout << maiorDoVetor(v, qtd);

  return 0;
}