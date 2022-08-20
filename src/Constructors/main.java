package Constructors;

import Constructors.Account;

public class main {
    public static void main(String[] args) {
        Account bobAccount = new Account();

        Account bob2 = new Account("123",456.0,"bob","bob1@email","122");

        System.out.println(bob2.getBalance());

//        bobAccount.setNumber("1234");
//        bobAccount.setBalance(0.0);
//        bobAccount.setCustomerName("bob");
//        bobAccount.setCustomerEmailAddress("bob@gmail.com");
//        bobAccount.setCustomerPhoneNumber("4444");
//        bobAccount.withdrawal(100);
//
//        bobAccount.deposit(150);
//        bobAccount.withdrawal(50);
//
//        bobAccount.withdrawal(150);



    }
}
