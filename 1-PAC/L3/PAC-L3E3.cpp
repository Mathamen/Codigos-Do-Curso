#include <iostream>
using namespace std;
float calculaMedia(float v[], int qtd)
{
  float soma=0;
  float media=0;
  for (int i=0; i<qtd; i++)
    {
      soma= soma + v[i];

    }
    media= soma / qtd;



  return media;
}



int acima(float v[], int qtd, float media)
{
  int nAcima=0;

  for (int y=0; y<qtd; y++)
    {
      if (v[y]>media)
      {
        nAcima++;
        
      }

      
    }




return nAcima;
}

int main ()
{ int qtd;
  cout << "insira a quantidade do vetor\n";
  cin >> qtd;
  float v[qtd];
    for (int z= 0; z< qtd; z++)
      {
        cin>> v[z];

        
      }
  cout << "beep\007";
  float media= calculaMedia(v, qtd);
  cout << acima(v, qtd, media);



  return 0;
}