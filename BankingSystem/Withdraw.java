package BankingSystem;
import java.util.*;
import java.time.*;
import java.time.format.DateTimeFormatter;;
public class Withdraw {
    private double amount;
    private Scanner scanner = new Scanner(System.in);
    private Map<Integer, String> history = new HashMap<>();
    int counter = 1;
    public Withdraw(double amount){
        this.amount=amount;

    }

    protected int withdraw(int toWithDrawInt){
        System.out.println("I'm in the withdraw section");
        System.out.println(amount);
        history.put(counter,String.valueOf(amount)+LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd:MMM:yyyy hh:mm:ss")));
        counter++;
        history.entrySet().stream().forEach(entrySet->{
            System.out.print("Serial Number: " + entrySet.getKey());
            System.out.println(" DateTime Stamp: "+entrySet.getValue());
        });
        amount = amount-toWithDrawInt;
        return (int) amount;
    }
    public int initWithDraw(){
                 System.out.println("Tell me how much amount you need to withdraw");
                    long toWithDraw = scanner.nextLong();
                    int toWithDrawInt = (int) toWithDraw;
                    return withdraw(toWithDrawInt);
    }
}
