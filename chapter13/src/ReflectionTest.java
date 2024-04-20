import org.junit.Test;

public class ReflectionTest {
    @Test
    public void test1(){
        Class clazz = Person.class;
        Class clazz1 = ReflectionTest.class;
        Class clazz2 = ReflectionApply1.class;
        System.out.println(clazz);
        System.out.println(clazz1);
        System.out.println(clazz2);
    }

    /*
    *  获取类的实例的四种方式
     */
    @Test
    public void test2() throws ClassNotFoundException {

        //1. 通过运行时的静态属性：class
        Class clazz = Person.class;
        System.out.println(clazz);

        //2. 通过 getClass()方法获取
        Person p1 = new Person();
        System.out.println(p1.getClass());

        //3. 调用Class的静态方法 forName(String className)
        String className = "Person";
        System.out.println(Class.forName(className));

        //4. 使用类加载器获取
        Class clazz2 = ClassLoader.getSystemClassLoader().loadClass(className);
        System.out.println(clazz2);
    }
}
