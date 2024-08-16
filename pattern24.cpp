

/*

1 2 3 4 5 6 7 8 9 9 8 7 6 5 4 3 2 1
1 2 3 4 5 6 7 8 * * 8 7 6 5 4 3 2 1
1 2 3 4 5 6 7 * * * * 7 6 5 4 3 2 1
1 2 3 4 5 6 * * * * * * 6 5 4 3 2 1
1 2 3 4 5 * * * * * * * * 5 4 3 2 1
1 2 3 4 * * * * * * * * * * 4 3 2 1
1 2 3 * * * * * * * * * * * * 3 2 1
1 2 * * * * * * * * * * * * * * 2 1
1 * * * * * * * * * * * * * * * * 1
 

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
       
       // print 1st trangle

       int j = 1;
       while(j<=n-i+1)
        {
            cout<<j<<" ";
            j++;
        }
       

       // print 2nd trangle
        
         int k=2;
       while (k<=i)
       {
            cout<<"*" <<" ";
            k++;
       }
       

       // print 3rd trangle

         int l = i-1;

        while(l)
        {
            cout<<"*"<<" ";
            l--;
        }


        // print 4th trangle

       
         int m = n+1-i;
        

        while(m>=1)
        {
            cout<< m <<" ";
            m--;
        }
        
        
        



    cout<<endl;
    i++;




      
    }



}
