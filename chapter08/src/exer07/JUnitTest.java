package exer07;

import org.junit.Test;

import java.util.Scanner;

public class JUnitTest {
    @Test
    public void ColorTest(){
        System.out.println(Color.CYAN.toString());
    }

    @Test
    public void ColorTes2(){
        Scanner input = new Scanner(System.in);
        System.out.println("请输入数据");
        int num = input.nextInt();
        System.out.println(Color.ORANGE.toString());
        System.out.println(num);
    }
    
}
