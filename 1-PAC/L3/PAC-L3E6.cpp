#include <iostream>
using namespace std;

void somaVetor (float v[], float w[], int qtd)
{ 
  for (int i= 0; i<qtd; i++)
    {
     v[i]= v[i] + w[i]; 
   
    }  
}


int main ()
{ 
  int qtd;
  cout << "insira o tamanho dos vetores\n";
  cin >> qtd;
  float v[qtd];
  float w[qtd];
  
  cout << "insira os elementos do vetor v:\n";
  for (int i=0; i<qtd; i++) {cin>> v[i];}

  cout << "isnira os elementos do vetor w\n";
  for (int i=0; i<qtd; i++) {cin>> w[i];}
  
  somaVetor(v, w, qtd);
  cout <<"A soma dos elementos dos vetores é, em ordem:"<< endl;
  for (int i=0; i<qtd; i++) {cout << v[i]<< endl;}


  return 0;
}