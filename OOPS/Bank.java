package OOPS;

public class Bank {
    public static void main(String[] args) {
        BankAccount myAcc = new BankAccount();
        myAcc.username = "pratik rane";
        myAcc.setPassword("pratik123");
    }
}

class BankAccount {
    public String username;
    private String password;

    public void setPassword(String pwd) {
        password = pwd;
    }
}