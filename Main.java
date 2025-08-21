import java.util.*;

class InvalidTransactionException extends Exception {
    public InvalidTransactionException(String message) {
        super(message);
    }
}

public class Main {
    public static void main(String[] args) {
        List<String> lines = Arrays.asList("100", "200", "abc", "300", "400", "xyz", "500");

        List<Integer> transactions = new ArrayList<>();

//        try {
            for (String line : lines) {
                try {
                    int amount = Integer.parseInt(line);
                    transactions.add(amount);
                } catch (Exception e) {
//                    throw new InvalidTransactionException("Invalid transaction data: " + line);
                }
            }

            int sum = 0;
            for (int t : transactions) {
                sum += t;
            }

            int max = transactions.get(0);
            for (int t : transactions) {
                if (t > max) {
                    max = t;
                }
            }

            System.out.println("Sum of Transactions: " + sum);
            System.out.println("Max Transaction: " + max);

//        } catch (InvalidTransactionException e) {
//            System.out.println(e);
//        }
    }
}
