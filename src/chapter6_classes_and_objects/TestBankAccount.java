package chapter6_classes_and_objects;

public class TestBankAccount {

    public static void main(String[] args) {


        //Creation of Objects:
        BankAccount myAccount = new BankAccount(1, 8000.00,"Joe","Chung","04/10/1968");

        //Test methods:
        System.out.println(BankAccount.getAccountInfo(myAccount));
        myAccount.setCustomerInfo("Mas","Boima","08/18/2000");
        System.out.println();
        System.out.println(BankAccount.getAccountInfo(myAccount));

    }
}
