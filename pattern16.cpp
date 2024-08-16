#include<iostream>
using namespace std;

int main()
{
    int n = 0;
    
    cin>> n;
    cout<<"======================================================"<<endl;

    int i =1;
   
    while (i<=n)
    {
         int j =1;
         char Start = 'A'+n - i;   // use char
         //int Start = 1 + n -i; //use number 

        while(j<=i)
        {
            
            cout<< Start <<" ";
            Start++;
            j++;
        }
        cout<<endl;

        i++;

    }
    cout<<"======================================================"<<endl;



}