#include<iostream>
using namespace std;
int main()
{int row,col,tree;
 cin>>row>>col>>tree;
 if(tree==row+col||tree%5==0)
   cout<<"It is a mango tree";
 else
   cout<<"It is not a mango tree";
  //Type your code here.
}