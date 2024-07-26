public class selectionsort {
    public static void main(String[] args)
    {
        int num[]={6,5,4,3,2,1};
        int size=num.length;
        System.out.println("before sorting");
        for(int i:num)
        {
            System.out.print(i+" ");
        }
        System.out.println();
        int temp=0;
        for(int i=0;i<size-1;i++)
        {
            int max=i;
            for(int j=i+1;j<size;j++)
            {
                if(num[max]>num[j])
                {
                    max=j;
                }
                temp=num[max];
                num[max]=num[i];
                num[i]=temp;
            }
        }
        System.out.println("After sorting");
        for(int i:num)
        {
            System.out.print(i +" ");
        }
    }
}
