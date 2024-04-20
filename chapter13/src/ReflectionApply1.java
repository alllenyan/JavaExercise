import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ReflectionApply1 {

    /*
     * 直接调用Class类的newInstance方法创建对象
     */
    @Test
    public void test1() throws InstantiationException, IllegalAccessException {
        //创建Person类的Class的实例
        Class clazz = Person.class;

        //调用Class类的newInstance()方法
        Person p1 = (Person) clazz.newInstance();

        //打印创建的实例
        System.out.println(p1);
    }


    /*
    * 使用构造器创建运行时的对象
     */
    @Test
    public void test2() throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {

        //创建Person类的class的对象
        Class clazz = Person.class;

        //获取带参的构造器
        Constructor<?> constructors = clazz.getDeclaredConstructor(String.class,int.class);

        //由于Person类中存在private属性:name，因此设置对应的权限
        constructors.setAccessible(true);

        //使用构造器类的newInstance方法创建对象
        Object obj = constructors.newInstance("Jack",12);

        //打印创建的对象
        System.out.println(obj);
    }
}
