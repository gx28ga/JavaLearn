package day01.exer01;

public class Account {
  private double balance;

  public Account(double init_balance) {
    balance = init_balance;
  }

  public double getBalance() {
    return balance;
  }
  public double deposit(double amt) {
    if (amt > 0) {
      balance += amt;
      System.out.println("deposit success, current balance is " + balance);
      return balance;
    }
    System.out.println("amt must be above 0");
    return balance;
  }

  public double withdraw(double amt) {
    if (amt < 0) {
      System.out.println("amt must be above 0");
      return balance;
    }
    if (amt < balance) {
      balance -= amt;
      System.out.println("withdraw success, current balance is " + balance);
      return balance;
    }
    System.out.println("balance is not enough");
    return balance;
  }
}

