#include<iostream>
int main()
{
    int a[5]={7,3,1,2,6};
    int temp=0;
    int i,j;
    for(i=0;i<4;i++)
    {
        for(j=0;j<4-i;j++)
        {
            if(a[j]>a[j+1])
            {
                temp=a[j];
                a[j]=a[j+1];
                a[j+1]=temp;
            }
        }
    }
    for(int k=0;k<5;k++)
    {
        printf("The sorted elements:%d\n",a[k]);
    }
}