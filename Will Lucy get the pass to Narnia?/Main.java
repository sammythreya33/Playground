#include<iostream>
using namespace std;
int main(){
  int num1,num2,x;
  cout<<"Enter first number : Enter second number : Menu"<<endl;
cout<<"1.Addition"<<endl;
 
cout<<"2.Subtraction"<<endl;
cout<<"3.Multiplication"<<endl;
cout<<"4.Division"<<endl;
cout<<"5.Remainder"<<endl;

  cin>>num1>>num2>>x;
  
  switch(x){
    case 1:cout<<num1+num2;
      break;
    case 2:cout<<num1-num2;
      break;
    case 3:cout<<num1*num2;
      break;
    case 4:cout<<num1/num2;
      break;
    case 5:cout<<num1%num2;
      break;
    default:
      cout<<"Invalid operation";
  }
}
  