#include<iostream>
using namespace std;

int main()
{
    int n = 0;
    int cnt =1;
    cin>> n;
    cout<<"======================================================"<<endl;

    int i =1;
   
    while (i<=n)
    {
         int j =1;

        while(j<=i)
        {
            cout<<i-j+1<<" ";
            cnt++;
            j++;
        }
        cout<<endl;

        i++;

    }
    cout<<"======================================================"<<endl;



}