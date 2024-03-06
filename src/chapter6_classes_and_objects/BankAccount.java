package chapter6_classes_and_objects;

public class BankAccount {

    //Instance variables:
    private String firstName;
    private String lastname;
    private String birthDay;
    private AccountNumber accountNumber;

    //Constructor:
    public BankAccount(String fName, String lName, String bDay, AccountNumber accountNumber){
        this.firstName = fName;
        this.lastname = lName;
        this.birthDay = bDay;
        this.accountNumber = accountNumber;
    }


    //Getter and Setter:
    public String getAccountInfo(){
         int age = accountNumber.getAge();
         return "Customer Name: " + firstName + " " + lastname + "\n" +
                 "Birthday: " + birthDay + "\n" +
                 "Age: " + age;

    }

    public void setCustomerInfo(String fName, String lName, String bDay){
        this.firstName = fName;
        this.lastname = lName;
        this.birthDay = bDay;
        accountNumber.setBirthDay(bDay);
    }

}
