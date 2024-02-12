package exer01;

import org.junit.Test;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionTest {

    Scanner input = null;
    @Test
    public void test(){
        try{
            input = new Scanner(System.in);
            int number = input.nextInt();
            System.out.println(number);
        }catch(InputMismatchException e){
            System.out.println("输入的内容不合法！");
            e.printStackTrace();
            System.out.println(e.getMessage());
        }finally {
            input.close();
        }


        System.out.println("程序可以继续执行了");
    }
}
