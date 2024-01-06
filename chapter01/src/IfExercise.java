public class IfExercise {
    public static void main(String[] args) {
        /*
        * 案例 1：成年人心率的正常范围是每分钟 60-100 次。体检时，如果心率不在此
        范围内，则提示需要做进一步的检查。
        * 随机生成的心率范围设置为[50,120]
        * */
        int heartBeats = (int)(Math.random() * 71 + 50);
        System.out.println("随机生成的心率是:" + heartBeats);
        if(heartBeats <= 100 && heartBeats >= 60){
            System.out.println("身体健康！");
        }else {
            System.out.println("需进一步检查！");
        }

        /*
        * 案例 2：定义一个整数，判定是偶数还是奇数，获取一个[0,100]的数
        * 使用Math.random()生成一个[a,b]区间的数据，对应的公式为：(int)(Math.random() * (b -a + 1) + a)
        * */
        int number = (int)(Math.random() * 101);
        System.out.println("随机生成的整数是:" + number);
        if(number % 2 == 0){
            System.out.println("这个数是一个偶数！");
        }else {
            System.out.println("这个数是一个奇数！");
        }
    }
}
