import org.junit.Test;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectionApply2 {
    /*
    * 反射的应用2：获取运行时类的完整结构
     */


    /*
    Field方法
    1、public Field[] getFields() //返回此Class对象所表示的类或接口的public的Field。
    2、public Field[] getDeclaredFields() //返回此Class对象所表示的类或接口的全部Field。
     */
    @Test
    public void test1(){

        Class clazz = Person.class;

        //public Field[] getFields()  //返回此Class对象及其父类所表示的类或接口的public的Field。
        Field[] fields = clazz.getFields();
        for (Field fld : fields) {
            System.out.println(fld);
        }
        System.out.println("****************分割线****************");
        //public Field[] getDeclaredFields() //返回此Class对象所表示的类或接口的全部Field。
        Field[] declaredFields = clazz.getDeclaredFields();
        for (Field declaredField : declaredFields) {
            System.out.println(declaredField);
        }
    }

    /*
    Method方法：
    1、public Method[] getDeclaredMethods() //返回此Class对象所表示的类或接口的全部方法
    2、public Method[] getMethods()  //返回此Class对象所表示的类或接口的public的方法
    3、public Class<?> getReturnType() //取得全部的返回值
    4、public Class<?>[] getParameterTypes() //取得全部的参数
    5、public int getModifiers() //取得修饰符
    6、public Class<?>[] getExceptionTypes() //取得异常信息
     */
    @Test
    public void test2(){

        Class clazz = Person.class;

        //public Method[] getMethods()  //返回此Class对象及其父类所表示的类或接口的public的方法
        Method[] methods = clazz.getMethods();
        for (Method m : methods) {
            System.out.println(m);
        }
    }

    @Test
    public void test3(){
        Class clazz = Person.class;
        //public Method[] getDeclaredMethods() //返回此Class对象及其父类所表示的类或接口的全部方法
        Method[] methods1 = clazz.getMethods();
        for (Method m : methods1) {
            System.out.println(m);
        }
    }

    @Test
    public void test4(){
        //public Class<?> getReturnType() //取得全部的返回值
        Class clazz = Person.class;
        Method[] methods1 = clazz.getMethods();
        for (Method m : methods1) {
            System.out.println(m.getReturnType());
        }
    }

    @Test
    public void test5(){
        //public Class<?>[] getParameterTypes() //取得全部的参数
        Class clazz = Person.class;
        Method[] methods1 = clazz.getMethods();
        for (Method m : methods1) {
            System.out.println(m.getParameterTypes());
        }
    }

    @Test
    public void test6(){
        //public int getModifiers() //取得修饰符
        Class clazz = Person.class;
        Method[] methods1 = clazz.getMethods();
        for (Method m : methods1) {
            System.out.println(m.getModifiers());
        }
    }

    @Test
    public void test7(){
        //public Class<?>[] getExceptionTypes() //取得异常信息
        Class clazz = Person.class;
        Method[] methods1 = clazz.getMethods();
        for (Method m : methods1) {
            System.out.println(m.getExceptionTypes());
        }
    }
}
