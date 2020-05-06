package project2.service;

import project2.bean.Customer;

public class CustomerList {
  private Customer[] customers; // 用来保存客户对象的数组
  int total = 0; // 记录已保存客户对象的数量

  public CustomerList(int totalCustomer) {
    this.customers = new Customer[totalCustomer];
  }

  public boolean addCustomer(Customer customer) {
    if (customer != null && total < customers.length) {
      this.customers[this.total++] = customer;
      return true;
    }
    return false;
  }

  public boolean replaceCustomer(int index, Customer cust) {
    if (index >= 0 && index < total) {
      this.customers[index] = cust;
      return true;
    }
    return false;
  }

  public boolean deleteCustomer(int index) {
    if (index >= 0 && index < total) {
      for (int i = 0; i < this.customers.length-1; i++) {
        customers[i] = customers[i + 1];
        customers[--total] = null;
      }
      return true;
    }
    return false;
  }

  public Customer[] getAllCustomers() {
    Customer[] custs = new Customer[total];
    for (int i = 0; i < custs.length; i++) {
      custs[i] = this.customers[i];
    }
    return custs;
  }

  public Customer getCustomer(int index) {
    if (index >= 0 && index < total) {
      return this.customers[index];
    }
    return null;
  }

  public int getTotal() {
    return this.total;
  }

}
