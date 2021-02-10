package test1;

import sun.misc.Launcher;

import java.net.URL;

/**
 * @author Chenyang
 * @create 2021-02-10-21:08
 */
public class ClassLoaderTest {
    public static void main(String[] args) {
        System.out.println("********启动类加载器********");
        //获取BootstrapClassLoader能够加载的api路径
        URL[] urLs = Launcher.getBootstrapClassPath().getURLs();
        for (URL urL : urLs) {
            System.out.println(urL.toExternalForm());
        }
    }
}
