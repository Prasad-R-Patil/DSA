

/*

 

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
