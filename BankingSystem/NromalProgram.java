package BankingSystem;
import java.util.List;
import java.util.Queue;
import java.util.Stack;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Comparator;

public class NromalProgram {
    
    public static void main(String[] args){
        Stack<String> ss = new Stack<>();
        ss.push("a");
        ss.push("g");
        ss.push("b");
        ss.stream().sorted(Comparator.reverseOrder()).forEach(consumer->System.out.println(consumer));


    }
} 
