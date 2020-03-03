package day01.exer01;

public class Bank {
  private Customer[] customers;
  private int numberOfCustomer;

  public Bank() {
    int num = 10;
    this.customers = new Customer[num];

  }

  public void addCustomer(String f, String l) {
    Customer customer = new Customer(f, l);
    if (numberOfCustomer > customers.length) {
      System.out.println("customer list is full");
      return;
    }
    customers[numberOfCustomer++] = customer;
  }

  public int getNumberOfCustomers() {
    return numberOfCustomer;
  }

  public Customer getCustomer(int index) {
    if (index > 0 || index < numberOfCustomer) {
      return customers[index];
    }
    return null;
  }
}
