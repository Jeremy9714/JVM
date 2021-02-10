package test1;

import java.io.FileNotFoundException;

/**
 * 自定义用户类加载器
 *
 * @author Chenyang
 * @create 2021-02-10-21:37
 */
public class CustomClassLoaderTest {
    public static void main(String[] args) {
        CustomClassLoader loader = new CustomClassLoader();
        try {
            Class<?> clazz = Class.forName("One", true, loader);
            Object o = clazz.newInstance();
            System.out.println(o.getClass().getClassLoader());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

class CustomClassLoader extends ClassLoader {
    @Override
    protected Class<?> findClass(String name) throws ClassNotFoundException {
        try {
            byte[] result = getClassFromCustomPath(name);
            if (result == null) {
                throw new FileNotFoundException("找不到源文件");
            } else {
                return defineClass(name, result, 0, result.length);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        throw new ClassNotFoundException(name);
    }

    private byte[] getClassFromCustomPath(String name) {
        //从自定义路径中加载指定类
        return null;
    }
}