#include<iostream>
using namespace std;
 
 
int main()
{
 
 int n=0;
 int a = 0;
 int b = 1;
 cout<<"Enter the Value of  n ==> ";
 cin>>n;

    cout<<a<<" => ";
    cout<<b<<" => ";

 for(int i=1;i<=n;i++)
 {
    int nextNumber = a+b;
    cout<<nextNumber<<" => ";
    a=b;
    b=nextNumber;
 }

 
 
 return 0;
}