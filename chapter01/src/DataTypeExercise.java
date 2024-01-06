public class DataTypeExercise {
    public static void main(String[] args) {
        /*
        案例 1：定义圆周率并赋值为 3.14，现有 3 个圆的半径分别为 1.2、2.5、6，求
        它们的面积。
        */
        double PI = 3.14;
        double radious1 = 1.2;
        double radious2 = 2.56;
        double radious3 = 6;

        System.out.println(PI * radious1 * radious1);
        System.out.println(PI * radious2 * radious2);
        System.out.println(PI * radious3 * radious3);

        /*
        * 案例 2：小明要到美国旅游，可是那里的温度是以华氏度为单位记录的。 它需
        要一个程序将华氏温度（80 度）转换为摄氏度，并以华氏度和摄氏度为单位分
        别显示该温度。
        * */
        double hua = 80;
        double she = (80 - 32) / 1.8;
        System.out.println(she);
    }
}
