package day01;

public class Customer {
  private String firstName;
  private String lastName;
  private Account account;

  public Customer(String firstName, String lastName) {
    this.firstName = firstName;
    this.lastName = lastName;
  }

  public Account getAccount() {
    return account;
  }

  public void setAccount(Account account) {
    this.account = account;
  }

  public String getFirstName() {
    return firstName;
  }

  public String getLastName() {
    return lastName;
  }
}

class CustomerTest {
  public static void main(String[] args) {
    Customer customer = new Customer("Jane", "Smith");
    customer.setAccount(new Account(1, 2000, 1.23 / 100));
    Account account = customer.getAccount();
    account.deposit(100);
    account.withdraw(960);
    account.withdraw(2000 );

  }
}

class Bank {
  Customer[] customers;
  int numberOfCustomer;

  public Bank() {
  }
  public void addCustomer(String f, String l) {

  }

  public int getNumberOfCustomer() {
    return numberOfCustomer;
  }

  public Customer getCustomer(int index) {
    return null;
  }
}