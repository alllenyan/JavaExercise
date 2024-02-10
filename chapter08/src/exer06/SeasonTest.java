package exer06;

public class SeasonTest {
    public static void main(String[] args) {
        System.out.println(Season.SPRING.toString());
        System.out.println(Season.SUMMER.toString());
        System.out.println(Season.AUTUMN.toString());
        System.out.println(Season.WINTER.toString());

        System.out.println(Season.AUTUMN.getSeasonDesc());
        System.out.println(Season.AUTUMN.getSeasonName());
    }
}
