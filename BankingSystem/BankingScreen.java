// package BankingSystem;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class BankingScreen {
   
    public static void main(String args[]){
    double amount = 0;
    Withdraw withdraw=null;
    Deposit deposit=null;
    CreateCustomer createCustomer=null;
            String display = "Welcome to SBI banking";
            String newDisplay = display.concat(" Please Enter the card");
            String newDisplay1 = display.concat(".").concat(newDisplay);
            String newDisplay2 = newDisplay1.replace("Welcome"," Welcome");
            String newDisplay3 = newDisplay2.concat(".");
            String newDisplay4 = newDisplay3.replace(" Welcome","Welcome");
            String newsDisplay5 = newDisplay4.replace("Welcome to SBI banking.","Welcome to SBI banking. ");
            System.out.println(newsDisplay5);
            System.out.println("\n");
            Scanner scanner = new Scanner(System.in);
            int input=0;
            while(true){
                System.out.println("Please select from the below");
                System.out.println("1. For withdraw");
                System.out.println("2. For deposit");
                System.out.println("3. For Customer Creation");
                System.out.println("4. For customer details display");
                try{
                    
                input = scanner.nextInt();
                String s = String.valueOf(input);
                String regex = "\\d";
                    Pattern pattern = Pattern.compile(regex);
                    Matcher matcher = pattern.matcher(s);
                    while (matcher.find()) {
                        System.out.print(matcher.group());
                    }

                }catch(InputMismatchException e){
                    // e.printStackTrace();
                    System.out.println(" \n Please enter the input from 1 to 4");
                    scanner.nextLine();
                    // continue;

                }
           

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
