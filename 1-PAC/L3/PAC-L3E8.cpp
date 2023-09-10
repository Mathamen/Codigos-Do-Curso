#include <iostream>
using namespace std;

void inicializa(int v[], int qtd)
{
  cout<< "insira as notas dos alunos\n";
  for (int i=0; i<qtd; i++)
    {cin>> v[i];}
  
}

void exibe(int v[], int qtd)
{
  int w[11];
  int nota;
  for (int i=0; i< 11; i++){w[i]=0;}
  
  for (int i=0; i<qtd; i++)
    { nota= v[i];
      w[nota]= w[nota]+1;
      
    }
  for (int i=0; i<11;i++)
    {
      cout << "nota " <<i << " :";
      for (int j=0; j<w[i]; j++)
        {
          cout<< "*";
        }
      cout << "  " << endl;
    }
}

int main ()
{
  int qtd;
  cout << "quantos alunos tem a sala de aula?\n";
  cin >> qtd;
  int v[qtd];
  inicializa(v, qtd);
  exibe (v, qtd);



  return 0;
}