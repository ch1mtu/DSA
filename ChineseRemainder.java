import java.util.Scanner;

public class ChineseRemainder {
    public static int Remainder(int size,int[] div,int[] rem)
    {
        int j,x=1;
        while(true)
        {
            for( j=0;j<size;j++)
            {
                if(x%div[j]!=rem[j])
                {
                    break;
                }
                
            }
            if(j==size)
            {
                return x;
            }
            x++;
        }

    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Size");
        int size = sc.nextInt();

        int [] div = new int[size];
        System.out.println("Enter Divisor");
        for(int i=0; i<size; i++)
        { 
             div[i] = sc.nextInt();
        }

        System.out.println("Enter Remainder");
        int rem[]=new int[size];
        for(int i=0; i<size; i++)
        {
            rem[i] = sc.nextInt();
        }

        System.out.println( Remainder(size, div, rem));

    }
}
