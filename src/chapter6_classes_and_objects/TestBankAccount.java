package chapter6_classes_and_objects;

public class TestBankAccount {

    public static void main(String[] args) {


        //Creation of Objects:

        AccountHolder accountHolder = new AccountHolder("Mas", "Boima", "08-18-2000");
        BankAccount bankAccount = new BankAccount("Mas", "Boima", "08-18-2000", accountHolder);

        //Test methods:
        System.out.println("Account information Displayed:");
        System.out.println(bankAccount.getAccountInfo());
        System.out.println();

        System.out.println("Information Change:");
       bankAccount.setCustomerInfo("Rick","Paul","09-21-1977");
        System.out.println(bankAccount.getAccountInfo());

    }
}
