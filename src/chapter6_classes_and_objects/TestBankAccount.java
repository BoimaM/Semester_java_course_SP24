package chapter6_classes_and_objects;

public class TestBankAccount {

    public static void main(String[] args) {


        //Creation of Objects:

        AccountNumber accountNumber = new AccountNumber("Mas", "Boima", "08-18-2000");
        BankAccount bankAccount = new BankAccount("Mas", "Boima", "08-18-2000", accountNumber);

        //Test methods:
        System.out.println("Account information Displayed:");
        System.out.println(bankAccount.getAccountInfo());
        System.out.println();

        System.out.println("Information Change:");
       bankAccount.setCustomerInfo("Rick","Paul","09-21-1977");
        System.out.println(bankAccount.getAccountInfo());

    }
}
