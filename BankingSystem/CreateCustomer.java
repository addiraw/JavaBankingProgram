package BankingSystem;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CreateCustomer {
    Scanner scanner = new Scanner(System.in);
    private String name;
    private String fatherName;
    private long accountNumber;
    public static List<Customer> customerList = new ArrayList<>();
    
    public Customer create() {
        System.out.println("Please enter you name");
        String name = scanner.nextLine();
        this.name=name;

        System.out.println("Please enter the fatherName");
        String fatherName = scanner.nextLine();
        this.fatherName=fatherName;

        Customer customer = new Customer();
        customer.name = this.name;
        customer.fatherName= this.fatherName;

        customerList.add(customer);

        customerList.forEach(System.out::println);
        return customer;

    }
   
    
}
