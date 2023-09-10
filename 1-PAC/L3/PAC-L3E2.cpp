#include <iostream>
using namespace std;

void pareseimpares(int v[], int qtd, int *nPares, int *nImpares)
{
  *nPares=0;
  *nImpares=0;

  for(int i=0; i<qtd; i++)
  {
    if (v[i]%2==0)
    { cout<< v[i] <<" par\n";
      (*nPares)++;
    }
    else
    { cout << v[i] <<" impar\n";
      (*nImpares)++;
    }


  }
  cout<< *nPares<< endl << *nImpares << endl;
}





int main() 
{
  int nPares;
  int nImpares;
  
  int qtd;
  cout<< "insira o tamanho do vetor\n";
  cin>> qtd;

  int v[qtd];
  for (int j=0; j<qtd; j++)
    {
      cin>> v[j];

      
    }
  
  pareseimpares(v , qtd, &nPares, &nImpares);
  cout << nPares<< endl;
  cout << nImpares<< endl;
  return 0;
}