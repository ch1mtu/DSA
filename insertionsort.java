public class insertionsort {
    public static void main(String[] arg)
    {
        int num[]={5,4,3,1,2};
        int size=num.length;
        System.out.println("before sorting");
        for(int i:num)
        {
            System.out.print(i+" ");
        }
        System.out.println();
        
        for(int i=1;i<size;i++)
        { 
            int key=num[i];
            int j=i-1;
            while(j>=0 &&num[j]>key)
            {
                num[j+1]=num[j];
                j--;
            }
            num[j+1]=key;
            
            
        }
        System.out.println("After sorting");
        for(int i:num)
        {
            System.out.print(i +" ");
        }
    }
}
