#include<iostream>
using namespace std;
int main()
{int birthyear,currentyear,age;
 cin>>birthyear>>currentyear;
 if(currentyear>birthyear)
   age=currentyear-birthyear;
 if(currentyear<birthyear)
   age=currentyear-birthyear+100;
cout<<age;
  //Type your code here.
}