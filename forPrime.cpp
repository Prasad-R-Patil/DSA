#include<iostream>
using namespace std;
 
 
int main()
{
    int n =0;

    cout<<"Enter the Value of  n ==> ";
    cin>>n;

    bool isPrime = 1;
    for(int i=2;i<=n;i++)
    {
        if(n%i==0)
        {
           isPrime=0;
        }
       break;
    }
 
 if(isPrime == 0)
 {
    cout<< "is Not prime number"<<endl;
 }
 else
 {
    cout<<"is prime number"<<endl;   
 }
 
 
 return 0;
}