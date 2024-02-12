package exer03;

public class DivisionDemo {

    public static void main(String[] args) {
        DivisionDemo division = new DivisionDemo();

        try{
            System.out.println(division.divide(20, 10));
//            System.out.println(division.divide(20, 0));
            System.out.println(division.divide(20,-5));
        }catch (BelowZeroException e){
            e.printStackTrace();
        }catch (ArithmeticException e){
            e.printStackTrace();
        }catch (NumberFormatException e){
            e.printStackTrace();
        }

    }
    public int divide(int number1,int number2){
        if (Integer.valueOf(number1) instanceof Integer && Integer.valueOf(number2) instanceof Integer){
            if (number2 == 0){
                throw new ArithmeticException("除数不能为0");
            }else if (number1 < 0 || number2 < 0){
                throw new BelowZeroException("输入的数字不能小于0");
            }else {
                return number1 / number2;
            }
        }else {
            throw new NumberFormatException("两个数字类型不一致");
        }

    }
}
