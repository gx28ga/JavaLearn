import java.util.Scanner;

public class Demo {
    Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        Demo demo = new Demo();
        demo.test();
    }

    public void test(){
        while (this.scanner.hasNextLine()) {
            System.out.println(scanner.nextLine());
            break;
        }
    }

}
