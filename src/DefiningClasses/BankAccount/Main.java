package DefiningClasses.BankAccount;

import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        Map<Integer, BankAccount> accounts = new HashMap<>();

        DecimalFormat df = new DecimalFormat("############.##");

        while (!input.equals("End")){

            String[] inputTokens = input.split("\\s+");

            switch (inputTokens[0]){
                case "Create":
                    BankAccount account = new BankAccount();
                    accounts.put(account.getAccountId(), account);

                    System.out.printf("Account ID%d created%n", account.getAccountId());
                    break;
                case "Deposit":
                    int id = Integer.parseInt(inputTokens[1]);
                    double depositAmount = Double.parseDouble(inputTokens[2]);

                    if (accounts.containsKey(id)){
                        accounts.get(id).deposit(depositAmount);

                        System.out.printf("Deposited %s to ID%d%n", df.format(depositAmount), id);
                    } else {
                        System.out.println("Account does not exist");
                    }

                    break;
                case "SetInterest":
                    double interest = Double.parseDouble(inputTokens[1]);
                    BankAccount.setInterestRate(interest);
                    break;
                case "GetInterest":
                    id = Integer.parseInt(inputTokens[1]);
                    int period = Integer.parseInt(inputTokens[2]);

                    if (accounts.containsKey(id)){
                        System.out.printf("%.2f%n", accounts.get(id).getInterest(period));
                    }else{
                        System.out.println("Account does not exist");
                    }
            }

            input = scanner.nextLine();
        }
    }
}
