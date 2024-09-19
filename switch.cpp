#include<iostream>
using namespace std;
 
 
int main()
{
    int num = 2;

    cout<<endl;

    switch(num)
    {
        case 1: 
            {
                cout<<"first"<<endl;
                break;
            }
        case 2: 
            {
                cout<<"Second"<<endl;
                break;
            }
        default: 
            {
                cout<<"Default"<<endl;
                break;
            }
    }


 
 
 
 return 0;
}