package BankingSystem;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.HashMap;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
public class Deposit {
    private Scanner scanner = new Scanner(System.in);
    private double amount;
    public Deposit(double deposit){
        this.amount=amount;
    }
    String dateTimeFormat = "dd-MMM-yyyy hh:mm:ss";
    DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern(dateTimeFormat);
    private int counter=0;
    private Map<Integer, String> history = new HashMap<>();

    protected int deposit(int current){
        System.out.println("I'm inside withdraw section");
        System.out.println(current);
        history.put(counter,String.valueOf(current)+ " Time Stamp: "+String.valueOf(LocalDateTime.now().format(dateTimeFormatter)));
        counter++;
        System.out.println("History: ");

        /*
        Changed the print method
        */
        // System.out.print(history);
        history.entrySet().stream().forEach(entrySet->{
            System.out.print("Serial Number: " +entrySet.getKey());
            System.out.println(" Amount: "+entrySet.getValue());
        });
        amount = amount + current;
        return (int)amount;
    }
    public int intiDeposit(){
        System.out.println("Plese enter the amount that you want to deposit");
        double amountDespit = scanner.nextDouble();
        int depositAmt = (int)amountDespit;
        return deposit(depositAmt);
    }
}
