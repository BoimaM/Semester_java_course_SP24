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
    public String getAccountInfo(){
         return "Account Number: " + acctNum +"\n" +
                 "Customer Name: " + customer.getFirstname() + " " + customer.getLastname() + "\n" +
                 "Birthday: " + customer.getBirthDay() + "\n" +
                 "Age: " + customer.getAge(customer.getBirthDay())+ "\n" +
                 "Account Balance: " + balance;
    }

    public void setCustomerInfo(String fName, String lName,String bDay){
            customer.setFirstname(fName);
            customer.setLastname(lName);
            customer.setBirthDay(bDay);
    }
}
