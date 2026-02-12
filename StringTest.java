import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class StringTest {

    public static void main(String[] args) {
       Transaction t1 = new Transaction("T001", 900.0, "2024-06-01"); // e1
       Transaction t2 = new Transaction("T002", 500.0, "2024-06-02"); // e2
       Transaction t3 = new Transaction("T003", 200.0, "2024-06-03");
       List<Transaction> transactions = new ArrayList<>(20);
       transactions.add(t1);
       transactions.add(t2);
       transactions.add(t3);
    
       System.out.println(transactions);
        // double totalAmount = 0.0;
     List<Transaction> newTransactions = transactions.stream().sorted(
        Comparator.comparing(Transaction::getTransactionId).reversed()).toList();
      
      for (Transaction t : newTransactions) {
        System.out.println(t.getTransactionId() + " " + t.getAmount() + " " + t.getDate());
      }
    }

}


