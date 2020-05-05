import java.util.Scanner;

public class Demo {
    Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println(Integer.parseInt("111"));
    }

    public void test(){
        while (this.scanner.hasNextLine()) {
            System.out.println(scanner.nextLine());
            break;
        }
    }

}

class Father {

}

class Son extends Father {

}

class Order {
    protected int orderId;
    protected String orderName;

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return  true;
        }

        if (obj instanceof Order) {

            if (((Order) obj).orderId != this.orderId) {
                return false;
            }
            if (!((Order) obj).orderName.equals(this.orderName)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public Order(int orderId, String orderName) {
        this.orderId = orderId;
        this.orderName = orderName;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public String getOrderName() {
        return orderName;
    }

    public void setOrderName(String orderName) {
        this.orderName = orderName;
    }
}