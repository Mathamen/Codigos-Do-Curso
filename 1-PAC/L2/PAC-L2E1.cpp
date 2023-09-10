#include <iostream>
using namespace std;



void mostra_tabuada(int n)
{
  cout<< "tabuada de "<< n << endl;
  cout << n*1<< endl;
  cout << n*2<< endl;
  cout << n*3<< endl;
  cout << n*4<< endl;
  cout << n*5<< endl;
  cout << n*6<< endl;
  cout << n*7<< endl;
  cout << n*8<< endl;
  cout << n*9<< endl;
  cout << n*10<< endl;
}
int main()
{
int a= 10;
for (int i= a; i>=1; i--){mostra_tabuada(i);}



  return 0;  
}