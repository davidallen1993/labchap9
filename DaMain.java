import java.util.Scanner;
public class DaMain {

   
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        boolean mailing;
        int customernum;
        String name;
        String address;
        int phone;
        
        System.out.print("Please enter your name: ");
        name = keyboard.nextLine();
        System.out.print("Please enter your address: ");
        address = keyboard.nextLine();
        System.out.print("Please enter your phone number: ");
        phone = keyboard.nextInt();
        System.out.print("Please enter your selected customer number: ");
        customernum = keyboard.nextInt();
        System.out.print("Would you like to be on the mailing list? (1=yes 2=no): ");
        int temp = keyboard.nextInt();
        mailing = temp == 1;
        
        PreferredCustomer example = new PreferredCustomer(mailing,customernum,name,address,phone);
        //use get address function in person class
        System.out.println("Customer Address: " + example.getAddress());
        //use get customer number function in customer class
        System.out.println("Customer Number: " + example.getCustomernum());
        
        example.spendMoney(1000 * example.makeDiscount());
        System.out.println("$1000 has been spent. Discount should be at 6% or 0.94, lets see");
        System.out.println("Your discount rate is currently: " + example.makeDiscount());
        
    }
    
}
