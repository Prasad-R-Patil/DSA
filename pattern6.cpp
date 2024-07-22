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

        while(j<=i)
        {
            cout<<"* ";
            j++;
        }
        cout<<endl;

        i++;

    }
    cout<<"======================================================"<<endl;



}