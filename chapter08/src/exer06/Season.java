package exer06;

//JDK 5.0之前的枚举类的实现方式
public class Season {
    //1. 私有化构造器
    public Season(String seasonName,String seasonDesc) {
        this.seasonName = seasonName;
        this.seasonDesc = seasonDesc;
    }

    //2. 声明枚举类的成员变量。使用 private final修饰，不仅无法从外部访问并且无法更改其值内容
    private final String seasonName;//季节名称
    private final String seasonDesc;//季节描述

    //3. 声明get方法
    public String getSeasonName() {
        return seasonName;
    }

    public String getSeasonDesc() {
        return seasonDesc;
    }

    //4. 创建枚举类对象实例。使用public static final修饰，可以直接通过类进行外部访问，但是不允许修改其值内容
    public static final Season SPRING = new Season("春天","春天的描述");
    public static final Season SUMMER = new Season("夏天","夏天的描述");
    public static final Season AUTUMN = new Season("秋天","秋天的描述");
    public static final Season WINTER = new Season("冬天","冬天的描述");

    @Override
    public String toString() {
        return "Season{" +
                "seasonName='" + seasonName + '\'' +
                ", seasonDesc='" + seasonDesc + '\'' +
                '}';
    }
}
