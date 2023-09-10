#include <iostream>
using namespace std;

int quantas_mulheres(int n)
{
  
  int mat, sexo, sal;
  int nmul = 0;  
  for (int i= 0; i< n; i++)
  {
    cout << "qual a matrícula, sexo e salário do funcionário?"<< endl;
    cin >> mat >> sexo >>sal; 
    if (sexo== 1){nmul++;}


  
  }


return nmul;  
}

int main() 
{
  int qtdF;
  cout << "quantos func?"<< endl;
  cin >> qtdF;
  cout << quantas_mulheres(qtdF);


  
  return 0;  
}