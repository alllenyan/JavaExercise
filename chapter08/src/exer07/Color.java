package exer07;

public enum Color {

    RED(255, 0, 0, "红"),
    ORANGE(255, 128, 0, "橙"),
    YELLOW(255, 255, 0, "黄"),
    GREEN(0, 255, 0, "绿"),
    CYAN(0, 255, 255, "青"),
    BLUE(0, 0, 255, "蓝"),
    PURPLE(128, 0, 255, "紫");

    private final int red;
    private final int green;
    private final int blue;
    private final String description;

    private Color(int red, int green, int blue, String description) {
        this.red = red;
        this.green = green;
        this.blue = blue;
        this.description = description;
    }

    @Override
    public String toString() {
        return this.name() + "(" + red +
                "," + green +
                "," + blue +
                ")->" + description;
    }
}
