#include <iostream>
using namespace std;




struct pessoa
{
  int idade;
  int grau; 
};



void inicializa (pessoa v[], int qtd)
{
  for (int i=0; i<qtd; i++)
    {
      cout<< "insira a idade da pessoa: \n";
      cin>> v[i].idade;

      cout<< "insira o grau da pessoa: \n";
      cin>> v[i].grau;
    
      cout<< "-----------------------\n";  
    }
  
}

float calculaMedia(pessoa v[],int qtd, int grau)
{
  int soma=0;

  for (int i=0; i<qtd; i++)
    {if (v[i].grau== grau){soma=soma + v[i].idade;}}

  return soma/qtd;
}


void exibe(pessoa v[], int qtd)
{
  for (int i=1; i<8; i++)
    {
      cout<< "grau " << i;
      cout<< ", a média de idade do grau é: " << calculaMedia(v, qtd, i) <<endl;
      cout<<"------------------------------------" <<endl;
      
      
    }

  
}







int main()
{
  int qtd=4;
  pessoa v[qtd];
  inicializa (v, qtd);
  exibe(v, qtd);



  return 0;
}