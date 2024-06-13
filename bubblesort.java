public class bubblesort
{
    public static void main(String args[])
    {


        int[] a={7,3,9,1,0};
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
        System.out.println(Integer.toString(a[k]));
    }
    }
}