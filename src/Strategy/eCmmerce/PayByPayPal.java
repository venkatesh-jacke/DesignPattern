package Strategy.eCmmerce;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class PayByPayPal implements PayStrategy {
    private static final Map<String, String> dataBase = new HashMap<>();
    private final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    String email, password;
    boolean isSignedIn;

    public boolean isSignedIn() {
        return isSignedIn;
    }

    public void setSignedIn(boolean signedIn) {
        isSignedIn = signedIn;
    }

    static {
        dataBase.put("abcd", "user1@gmail.com");
        dataBase.put("efgh", "user2@gmail.com");
    }

    @Override
    public boolean pay(int paymentAmount) {
        if (isSignedIn) {
            System.out.println("Paying " + paymentAmount + " using PayPal");
            return true;
        } else {
            return false;
        }
    }

    @Override
    public void collectPaymentDetails() {
        try {
            while (!isSignedIn) {
                System.out.println("Enter the email: ");
                email = reader.readLine();
                System.out.println("Enter the Password");
                password = reader.readLine();
                if (verify()) {
                    System.out.println("Data verification isb successful");
                } else {
                    System.out.println("Incorrect Data");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public boolean verify() {
        setSignedIn(email.equals(dataBase.get(password)));
        return isSignedIn;
    }
}
