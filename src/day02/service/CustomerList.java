package day02.service;

import day02.bean.Customer;

public class CustomerList {
    private Customer[] customers;
    private int total;

    public CustomerList(int totalCustomer) {
        this.customers = new Customer[totalCustomer];
    }

    public boolean addCustomer(Customer customer) {
        if (total ==  customers.length) {
            return false;
        }
        this.customers[total++] = customer;
        return true;
    }

    public boolean replaceCustomer(int index, Customer customer) {
        if (index < 0 || index > total) {
            return false;
        }

        if (customers[index] == null) {
            return false;
        }

        customers[index] = customer;
        return true;
    }

    public boolean deleteCustomer (int index) {
        if (index < 0 || index > total) {
            return false;
        }

        if (customers[index] == null) {
            return false;
        }

        for (int i = index; i < total - 1; i++) {
            customers[i] = customers[i+1];
        }
        customers[total-1] = null;
        return true;
    }

    public Customer[] getAllCustomers () {
        Customer[] arr = new Customer[total];
        for (int i = 0; i < customers.length; i++) {
            arr[i] = customers[i];
        }

        return arr;
    }

    public int getTotal() {
        return total;
    }

    public Customer getCustomer(int index) {
        if (index < 0 || index > customers.length) {
            return null;
        }

        return customers[index];
    }
}