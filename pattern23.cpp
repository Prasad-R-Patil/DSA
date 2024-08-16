

/*

        1
      1 2 1
    1 2 3 2 1
  1 2 3 4 3 2 1
1 2 3 4 5 4 3 2 1
 

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
       
       // print Spece(1st trangle)

       int spece = n-i;

       while (spece)
       {
           cout<< "  ";
           spece--;
       }
       

       // print 2nd trangle

       int j=1;
       while (j<=i)
       {
            cout<<j <<" ";
            j++;
       }
       

       // print 3rd trangle

        int start = i-1;

        while(start)
        {
            cout<<start<<" ";
            start--;
        }





    cout<<endl;
    i++;




    }


}
