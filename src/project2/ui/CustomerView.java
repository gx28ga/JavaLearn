package project2.ui;

import project2.service.CustomerList;
import project2.util.CMUtility;
import project2.bean.Customer;
public class CustomerView {
  CustomerList customerList = new CustomerList(10);

  public void enterMainMenu() {
    boolean isFlag = true;

    do {
      System.out
              .println("\n-----------------客户信息管理软件-----------------\n");
      System.out.println("                   1 添 加 客 户");
      System.out.println("                   2 修 改 客 户");
      System.out.println("                   3 删 除 客 户");
      System.out.println("                   4 客 户 列 表");
      System.out.println("                   5 退       出\n");
      System.out.print("                   请选择(1-5)：");

      char menu = CMUtility.readMenuSelection();
      int i = Integer.parseInt(String.valueOf(menu));
      System.out.println(menu);
      switch (i) {
        case 1:
          this.addNewCustomer();
          break;
        case 2:
          this.modifyCustomer();
        case 3:
          this.deleteCustomer();
          break;
        case 4:
          this.listAllCustomers();
          break;
        case 5:
          isFlag = false;
          break;
      }
    } while (isFlag);
  }

  public void addNewCustomer() {
    System.out.println("---------------------添加客户---------------------");
    System.out.print("姓名：");
    String name = CMUtility.readString(20);
    System.out.print("性别：");
    char gender = CMUtility.readChar();
    System.out.print("年龄：");
    int age = CMUtility.readInt();
    System.out.print("电话：");
    String phone = CMUtility.readString(11);
    System.out.print("邮箱：");
    String email = CMUtility.readString(30);
    Customer customer = new Customer(name, gender, age, phone, email);
    boolean flag = customerList.addCustomer(customer);
    if (flag) {
      System.out
              .println("---------------------添加完成---------------------");

    } else {
      System.out.println("人数已达上限，添加失败！");
    }

  }

  private void modifyCustomer() {
    System.out.println("---------------------添加客户---------------------");
    Customer customer;
    int index;
    for(;;) {
      index = CMUtility.readInt();
      if (index == -1) {
        return;
      }

      customer = customerList.getCustomer(index);
      if (customer == null) {
        System.out.println("无法找到指定客户！");
      } else{
        break;
      }
    }
    System.out.print("姓名(" + customer.getName() + "):");
    String name = CMUtility.readString(20, customer.getName());
    System.out.print("性别(" + customer.getGender()+ "):");
    char gender = CMUtility.readChar(customer.getGender());
    System.out.print("年龄(" + customer.getAge() + "):");
    int age = CMUtility.readInt(customer.getAge());
    System.out.print("电话(" + customer.getPhone() + "):");
    String phone = CMUtility.readString(11,customer.getPhone());
    System.out.print("邮箱(" + customer.getEmail() + "):");
    String email = CMUtility.readString(30, customer.getEmail());
    customer.setName(name);
    customer.setGender(gender);
    customer.setAge(age);
    customer.setPhone(phone);
    customer.setEmail(email);
    customerList.replaceCustomer(index - 1, customer);

  }

  private void deleteCustomer() {
    System.out.println("---------------------删除客户---------------------");
    Customer customer;
    int index;
    for (;;) {
      System.out.print("请选择待删除客户编号(-1退出)：");
      index= CMUtility.readInt();
      if (index == -1) {
        return;
      }
      customer = customerList.getCustomer(index - 1);
      if (customer == null) {
        System.out.println("无法找到指定客户！");
      } else {
        break;
      }
    }

    System.out.print("确认是否删除(Y/N)：");

    char selection = CMUtility.readConfirmSelection();
    if (selection == 'Y') {
      customerList.deleteCustomer(index - 1);
    }

  }

  private void listAllCustomers() {
    System.out
            .println("---------------------------客户列表---------------------------");
    Customer[] customers = this.customerList.getAllCustomers();
    if (customers.length == 0) {
      System.out.println("没有任何客户记录！");
    } else {
      System.out.println("编号\t姓名\t性别\t年龄\t电话\t\t邮箱");
      for (int i = 0; i < customers.length; i++) {
        System.out.println((i + 1) + "\t" + customers[i].info());
      }
    }
  }

  public static void main(String[] args) {
    new CustomerView().enterMainMenu();
  }
}
