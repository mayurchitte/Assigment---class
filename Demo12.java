import java.util.Scanner;
class Demo12{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Limit");
        int n = sc.nextInt();
        Fibonacci f= new Fibonacci(n);
        f.series();
    }
}
class Fibonacci
{
    int n1,n2,n3,limit;
   
    Fibonacci(int n)
    {   
        limit = n;
        n1=0;
        n2=1;
    }   
   
    void series()
    {
        System.out.println("The Fibonacci Series up to "+ limit +" are:");
        System.out.print(n1+" "+n2+" ");
        int i;
        for(i=3;i<=limit;i++)
        {
            n3=n1+n2;
            System.out.print(n3+" ");
            n1=n2;
            n2=n3;
        }
    }
}