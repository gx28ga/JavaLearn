package day4;

public class Account {
    private int id;
    private String pwd = "000000";
    private double balance;
    private static double interestRate;
    private static double minMoney = 1.0;
    private static int init = 1001;

    public Account(String pwd, double balance) {
        this();
        this.pwd = pwd;
        this.balance = balance;
    }

    public Account() {
        id = init ++;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public static void setInterestRate(double interestRate) {
        Account.interestRate = interestRate;
    }

    public static void setMinMoney(double minMoney) {
        Account.minMoney = minMoney;
    }

    public int getId() {
        return id;
    }

    public String getPwd() {
        return pwd;
    }

    public double getBalance() {
        return balance;
    }

    public static double getInterestRate() {
        return interestRate;
    }

    public static double getMinMoney() {
        return minMoney;
    }
}
