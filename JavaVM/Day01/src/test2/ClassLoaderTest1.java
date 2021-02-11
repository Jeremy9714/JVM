package test2;

/**
 * ClassLoader常用方法及获取方法
 *
 * @author Chenyang
 * @create 2021-02-11-14:26
 */
public class ClassLoaderTest1 {
    public static void main(String[] args) {
        try {
            //方法一:
            ClassLoader classLoader = Class.forName("java.lang.String").getClassLoader();
            System.out.println(classLoader);

            //方法二:
            ClassLoader contextClassLoader = Thread.currentThread().getContextClassLoader();
            System.out.println(contextClassLoader);

            //方式三:
            ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();
            System.out.println(systemClassLoader);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
