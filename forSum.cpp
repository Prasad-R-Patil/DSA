#include<iostream>
using namespace std;
 
 
int main()
{

    int n=0;
   

    cout<<"Enter value of n ==>";
    cin>>n;

 int sum = 0;
    for(int i=1;i<=n;i++)
    {
         sum = sum+i;
    }

        cout<<"Total sum is ==>> "<< sum <<endl;
 
 
 return 0;
}

