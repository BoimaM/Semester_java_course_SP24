package chapter6_classes_and_objects;

public class BankAccount {

    //Instance variable(s):
    private int acctNum;
    private double balance;
    private AccountHolder customer;

    //Constructor(s):
    public BankAccount(int acct, double bal, String firstname, String lastname, String birthday){
        acctNum = acct;
        balance = bal;
        customer = new AccountHolder(firstname,lastname,birthday);
    }

    //Getter(s) and Setter(s):
    public static String getAccountInfo(BankAccount account){
         int age = AccountHolder.getAge(account.customer.getBirthDay());
         return "Account number: " + account.acctNum +"\n" +
                 "Customer Nam: " + account.customer.getFirstname() + " " + account.customer.getLastname() + "\n" +
                 "Birthday: " + account.customer.getBirthDay() + "\n" +
                 "Age: " + age + "\n" +
                 "Account balance: " + account.balance;
    }

    public void setCustomerInfo(String fName, String lName,String bDay){
            customer.setFirstname(fName);
            customer.setLastname(lName);
            customer.setBirthDay(bDay);
    }
}
