package day6;

import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Date;

public class ExceptionTest {
    @Test
    public void test1() {
//        int[] arr = new int[10];
//        String string = "abc";
//        System.out.println(string.charAt(4));
        Object obj = new Date();
        String str = (String)obj;
        System.out.println(str);

    }
    @Test
    public void test7 () throws FileNotFoundException, IOException {
        File file = new File("hello.txt");
        FileInputStream fis = new FileInputStream(file);
        int data = fis.read();
        while(data != -1) {
            System.out.print((char)data);
            data= fis.read();
        }
        fis.close();
    }
}
