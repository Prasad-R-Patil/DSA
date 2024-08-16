

/*

          1 2 3 4
            2 3 4 
              3 4 
                4 
 
 */


#include<iostream>
using namespace std;

int main()
{
    int n = 0;
    cin>> n;

    int i =1;
   
    while (i<=n)
    {
        int space = i-1;

        while(space)
        {
            cout<<" ";
            space--;
        }
         int j =1;

        while(j<=n)
        {
            cout<< i+1 ;
            j++;
        }
        cout<<endl;

        i++;

    }


}