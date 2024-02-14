public class OperatorExercise {
    public static void main(String[] args) {
        int a = 10, b = 3;

        System.out.println(a + b);//13
        System.out.println(a * b);//30
        System.out.println(a / b);//3
        System.out.println(a % b);//1

        System.out.println(a + (a++));//20
        System.out.println(a);//11

        System.out.println(a + (++a));//23
        System.out.println(a);//12
    }
}
