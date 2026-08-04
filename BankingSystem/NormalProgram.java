package BankingSystem;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Vector;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.io.PrintWriter;
import java.security.KeyStore.Entry;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;

public class NormalProgram {
    
    public static void main(String[] args){
        Map<Integer, String> map = new LinkedHashMap<>();
        map.putAll(Map.of(1,"Aditya",2,"Naman",3,"Nia"));
        map.entrySet().stream().collect(Collectors.groupingBy(Map.Entry::getKey));

    
    }
} 
