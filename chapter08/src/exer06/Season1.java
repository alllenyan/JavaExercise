package exer06;

//JDK 5.0及其之后版本，可以使用enum关键字声明枚举类
public enum Season1 implements Character{

    //1. 优先声明枚举对象实例，实例之间使用逗号分割，定义时只需要使用实例名称调用构造器即可
    //enum中默认所有的实例都是公共，静态且不可更改的状态
    SPRING("春天","春天的描述"),
    SUMMER("夏天","夏天的描述"),
    AUTUMN("秋天","秋天的描述"),
    WINTER("冬天","冬天的描述");

    //2. 声明构造器并私有化
    private Season1(String seasonName,String seasonDesc) {
        this.seasonName = seasonName;
        this.seasonDesc = seasonDesc;
    }

    //3. 声明枚举类的成员变量。使用 private final修饰，不仅无法从外部访问并且无法更改其值内容
    private final String seasonName;//季节名称
    private final String seasonDesc;//季节描述

    //4. 声明get方法
    public String getSeasonName() {
        return seasonName;
    }

    public String getSeasonDesc() {
        return seasonDesc;
    }

    @Override
    public String toString() {
        return "Season1{" +
                "seasonName='" + seasonName + '\'' +
                ", seasonDesc='" + seasonDesc + '\'' +
                '}';
    }

    public void seasonCharacter(){
        System.out.println("每个季节都有各自的特点");
    }
}
