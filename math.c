#include<stdio.h>


int addtion(int no1 ,int no2)
{
    int sum = 0 ;

    sum=no1+no2;
    printf("Addtion is %d",sum);
}

int sub(int no1, int no2)
{
    int sum = 0 ;

    sum=no1-no2;
    printf("\n===================================\n");
    printf("sub is %d",sum);
     printf("\n===================================\n");
}

int mult(int no1, int no2)
{
    int sum = 0 ;

    sum=no1*no2;
    printf("\n===================================\n");
    printf("mult is %d",sum);
    printf("\n===================================\n");
}

int division(int no1 ,int no2)
{
    int sum = 0 ;

    sum=no1/no2;
    printf("\n===================================\n");
    printf("Division is %d",sum);
    printf("\n===================================\n");
}
int modulos(int no1, int no2)
{
    int sum = 0 ;

    sum=no1%no2;
     printf("\n===================================\n");
    printf("reminder is %d",sum);
     printf("\n===================================\n");
}



int main()
{
        int value1=0;
        int value2=0;

        printf("Enter value1");
        scanf("%d554",&value1);
        printf("Enter value2");
        scanf("%d",&value2);

        addtion(value1,value2);
        sub(value1,value2);
        mult(value1,value2);
        division(value1,value2);
        modulos(value1,value2);
}