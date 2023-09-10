#include <iostream>
using namespace std;

int maiorQueUltimo(float v[], int qtd)
{

  int maiores=0;
  float ultimo= v[qtd-1];
  cout << "O último é "<<ultimo <<endl;
  for (int i=0; i< (qtd-1); i++)
  {
    if (v[i]> ultimo)
    {maiores++;}
  
  
          
  }



  return maiores;
}




int main ()
{
  int qtd;
  cout << "insira a quantidade de números do vetor\n";
  cin >> qtd;
  float v[qtd];
  for(int i=0; i< qtd; i++)
    {
      cin>> v[i];
      
    }

  cout<< "o total de números maiores que o último é " << maiorQueUltimo(v, qtd);
  return 0;
}