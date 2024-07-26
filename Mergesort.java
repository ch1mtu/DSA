public class Mergesort {
    public static void mergesort(int[] arr,int l,int r)
    {
        if(l<r)
        {
            int mid=(l+r)/2;
            mergesort(arr,l,mid);
            mergesort(arr,mid+1,r);
            merge(arr,l,mid,r);
        }
    }
    private static void merge(int[] arr,int l,int mid,int r)
    {

        int n1=mid-l+1;
        int n2=r-mid;
        int larr[]=new int[n1];
        int rarr[]=new int[n1];
        for(int x=0;x<n1;x++){
            larr[x]=arr[l+x];
        }
        for(int x=0;x<n2;x++){
            rarr[x]=arr[mid+1+x];
        }
        int i=0;
        int j=0;
        int k=l;
        while(i<n1 && j<n1)
        {
            if(larr[i]<=rarr[j])
            {
                arr[k]=larr[i];
                i++;
            
            }
            else
            {
                arr[k]=rarr[j];
                j++;
            }
            k++;

        }
        while(i<n1)
        {
            arr[k]=larr[i];
            i++;
            k++;
        }
        while(j<n2)
        {
            arr[k]=rarr[j];
            j++;
            k++;
        }
    }
    public static void main(String[] args)
    {
        int arr[]={5,4,6,2,1,7};
        System.out.println("before sorting");
        for(int i:arr)
        {
            System.out.print(i+" ");
        }
        System.out.println();
        mergesort(arr,0,arr.length-1);
        System.out.println("After sorting");
        for(int i:arr)
        {
            System.out.print(i +" ");
        }
    }
}
