#include<iostream>
using namespace std;
int main()
{
  int age,show;
 cin>>age>>show;
 switch(show){

   case 10.15:  
     if(age>=13)
     cout<<"$8.00";
   else
     cout<<"$4.00";
     break;
   case 13.30:
      if(age>=13)
     cout<<"$5.00";
   else
     cout<<"$2.00";
     break;
   case 18.00: if(age>=13)
     cout<<"$8.00";
   else
     cout<<"$4.00";
     break;
   case 22.00: if(age>=13)
     cout<<"$8.00";
   else
     cout<<"$4.00";
     break;
 
 }
 
}
  //Type your code here.
