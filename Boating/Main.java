#include<iostream>
using namespace std;
int main()
{int weight,adult,child,tot;
 cin>>weight>>adult>>child;
 tot=(adult*75)+(child*30);
   if(tot<=weight)
   {
     cout<<"Boat is stable";
   }
   else
     cout<<"Boat will drow";

  //Type your code here.
}