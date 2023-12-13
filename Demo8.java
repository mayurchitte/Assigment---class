import java.util.Scanner;
public class Demo8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("name1: ") ;
        String name1 = sc.next();
        System.out.println("name 2: ") ;
        String name2 = sc.next();
        System.out.println("age 1: ") ;
        int age1 = sc.nextInt();
        System.out.println("age 2: ") ;
        int age2 = sc.nextInt();
        SwapObject so = new SwapObject(name1, name2);
        SwapObject so1 = new SwapObject(age1, age2);
        so.SwapName(so);
        so1.SwapAge(so1);
        
    }
}
class SwapObject{
    private String name1;
    private int age1;
    private String name2;
    private int age2;

     public SwapObject(String s1, String s2){
        name1 = s1;
        name2 = s2;
     }

     public SwapObject(int a1, int a2){
        age1 = a1;
        age1 = a2;
     }

    public void SwapName(SwapObject y){
        String temp;
        temp = name1;
        name1 = name2;
        name2 = temp;
        System.out.println("Name1: " + name1 + "Name2: "+ name2);
    } 
   public void SwapAge(SwapObject y)
   {
    int temp1;
    temp1 = age1;
    age1 = age2;
    age2 = temp1;
    System.out.println("Age1 :" + age1+ "Age2 :"+age2);
   }

}








  
