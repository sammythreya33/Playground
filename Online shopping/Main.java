#include<iostream>
using namespace std;
int main()
{int famt,fdis,fship,samt,sdis,sship,aamt,adis,aship,flip,snap,amaz;
 cin>>famt>>fdis>>fship>>samt>>sdis>>sship>>aamt>>adis>>aship;
 flip=famt-(famt*fdis/100)+fship;
 snap=samt-(samt*sdis/100)+sship;
 amaz=aamt-(aamt*adis/100)+aship;
 cout<<"In Flipkart Rs."<<flip<<endl;
cout<<"In Snapdeal Rs."<<snap<<endl;
cout<<"In Amazon Rs."<<amaz<<endl;
 
 if(flip<=snap&&flip<=amaz)
   cout<<"He will prefer Flipkart";
else if(snap<flip&&snap<amaz)
   cout<<"He will prefer Snapdeal";
else if(amaz<flip&&amaz<snap)
   cout<<"He will prefer Amazon";
 
 
  //Type your code here.
}