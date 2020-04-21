#include<iostream>
#include<math.h>
using namespace std;
int main()
{int tot,run,score,bowl,b;
 float a;
 cin>>tot>>run>>score>>bowl;
 cout<<tot/6<<endl;
 cout<<bowl/6<<"."<<bowl%6<<endl;
 b=bowl/6;
 a=bowl%6*.1;
 a=a+b;
 cout<<roundf(score/a*10)/10<<endl;
 cout<<roundf(run*6.0/tot*10)/10<<endl;
 if(roundf(score/a*10)/10>run*6.0/tot)
   cout<<"Eligible to Win";
 else
   cout<<"Not Eligible to Win";
}
