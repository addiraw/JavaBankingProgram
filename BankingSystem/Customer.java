package BankingSystem;


public class Customer{
    public String name;
    public String fatherName;
    public long accountNumber=0;
    @Override
    public String toString(){
        return "name :"+name+" father name: "+fatherName;
    }
}