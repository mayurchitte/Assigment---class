import java.util.Scanner;
class Demo10{
     public static void main(String[] args) {
        
        FruitJuice juice = new FruitJuice();
        juice.input();
        System.out.println("Original Details:");
        juice.display();
        juice.discount();
        System.out.println("\nDetails after applying discount:");
        juice.display();
    }
}
class FruitJuice {
    int product_code;
    String flavor;
    String pack_type;
    int pack_size;
    int product_price;

    
    public FruitJuice() {
        product_code = 0;
        flavor = "";
        pack_type = "";
        pack_size = 0;
        product_price = 0;
    }

    public void input() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter product code: ");
        product_code = sc.nextInt();

        System.out.print("Enter flavor: ");
        sc.nextLine(); 
        flavor = sc.nextLine();

        System.out.print("Enter pack type: ");
        pack_type = sc.nextLine();

        System.out.print("Enter pack size: ");
        pack_size = sc.nextInt();

        System.out.print("Enter product price: ");
        product_price = sc.nextInt();
    }
    public void discount() {
        product_price -= 10;
    }
    public void display() {
        System.out.println("Product Code: " + product_code);
        System.out.println("Flavor: " + flavor);
        System.out.println("Pack Type: " + pack_type);
        System.out.println("Pack Size: " + pack_size + " ml");
        System.out.println("Product Price: " + product_price);
    }
}