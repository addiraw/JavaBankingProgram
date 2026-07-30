package BankingSystem;
import java.util.List;
import java.util.Scanner;

public class BankingScreen {
   
    public static void main(String args[]){
    double amount = 0;
    Withdraw withdraw=null;
    Deposit deposit=null;
    CreateCustomer createCustomer=null;
            String dispay = "Welcome to SBI banking";
            System.out.println(dispay);
            Scanner scanner = new Scanner(System.in);
            int input;
            while(true){
                System.out.println("Please select from the below");
                System.out.println("1. For withdraw");
                System.out.println("2. For deposit");
                System.out.println("3. For Customer Creation");
                System.out.println("4. For customer details display");
                input = scanner.nextInt();

                switch(input){
                    case 1: System.out.println("You have choosen 1. option to withdraw");
                     if(withdraw==null){
                        withdraw=new Withdraw(amount);
                    }
                    amount = withdraw.initWithDraw();
                    // System.out.println(withdraw);
                    break;
                    case 2: System.out.println("You have choosen 2. deposit option");
                    if(deposit==null){
                        deposit = new Deposit(amount);
                    }
                    // System.out.print(deposit);
                    amount = deposit.intiDeposit();
                    case 3: {
                        System.out.println("You have chosen to create customer");
                    if(createCustomer==null){
                        createCustomer = new CreateCustomer();
                    }
                        Customer created = createCustomer.create();


                    break;
                    }
                    case 4: System.out.println("You are chossing the 4th option to see the details");
                    // SeeCustomerDetails seeCustomerDetails = new SeeCustomerDetails();
                    // seeCustomerDetails.findCustomer();
                    List<Customer> cusList = createCustomer.customerList;
                    CreateCustomer createCustomer2 = getCreateCustomer(createCustomer);
                    System.out.println(cusList);
                    break;
                    default: System.out.println("You have not chosen right option ");

                }
                System.out.println("\n");
                System.out.println("Your new amount is : " + amount);
            }

    }

    private static CreateCustomer getCreateCustomer(CreateCustomer createCustomer) {
        return createCustomer;
    }
}
