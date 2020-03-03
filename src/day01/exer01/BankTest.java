package day01.exer01;

public class BankTest {
  public static void main(String[] args) {
    Bank bank = new Bank();
    bank.addCustomer("Jason", "Williams");
    Customer customer = bank.getCustomer(0);
    customer.setAccount(new Account(1000));
    Account account = customer.getAccount();
    account.deposit(-10);
    account.deposit(10000);
    account.withdraw(-10);
    account.withdraw(20000);
    account.withdraw(10000);
  }
}
