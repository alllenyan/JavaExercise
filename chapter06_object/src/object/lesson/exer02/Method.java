package object.lesson.exer02;

public class Method {
    public void Method1(){
        for(int i = 0;i < 10;i++){
            for (int j = 0; j < 8 ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public int Method2(){
        for(int i = 0;i < 10;i++){
            for (int j = 0; j < 8 ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        return 10 * 8;
    }

    public int Method3(int length,int height){
        for(int i = 0;i < length;i++){
            for (int j = 0; j < height ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        return length * height;
    }
}
