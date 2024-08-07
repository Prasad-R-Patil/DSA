#include<iostream>
using namespace std;

int main()
{
    int n = 0;
    char ch ='A';
    cin>> n;
    cout<<"======================================================"<<endl;

    int i =1;
   
    while (i<=n)
    {
         int j =1;

        while(j<=n)
        {
            cout<<ch<<" ";
            ch++;
            j++;
        }
        cout<<endl;

        i++;

    }
    cout<<"======================================================"<<endl;



}