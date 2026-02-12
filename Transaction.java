import java.util.Comparator;

public class Transaction implements Comparator<Transaction> {

    private String transactionId;
    private double amount;
        private String date;
    public Transaction(String transactionId, double amount, String date) {
        this.transactionId = transactionId;
        this.amount = amount;
        this.date = date;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public double getAmount() {
        return amount;
    }

    public String getDate() {
        return date;
    }
        @Override
        public int compare(Transaction t1, Transaction t2) {
            return t1.transactionId.compareTo(t2.transactionId);
        }
}