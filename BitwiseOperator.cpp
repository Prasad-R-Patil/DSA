#include<iostream>

using namespace std;

int main()
{
   int a = 4;
   int b = 6;

   cout<<"=======================================================" <<endl;

   cout<<"a & b => "<< (a&b) << endl;
   cout<<"a | b => "<< (a|b) << endl;
   cout<<"~a   => "<< ~a << endl;
   cout<<"~b   => "<< ~b << endl;
   cout<<"a ^ b => "<< (a^b) <<endl;


   cout<<"=======================================================" <<endl;


   cout<<"17>>1 => "<< (17>>1) <<endl;
   cout<<"17>>2 => "<< (17>>2) <<endl;
   cout<<"19<<1 => "<< (19<<1) <<endl;
   cout<<"21<<2 => "<< (21<<2) <<endl;


   cout<<"=======================================================" <<endl;

   int i = 7;
   
   cout<<(++i)<<endl;
   cout<<(i++)<<endl;
  
   cout<<(i--)<<endl;
   cout<<(--i)<<endl;
  

   cout<<"=======================================================" <<endl;




   return 0;


}