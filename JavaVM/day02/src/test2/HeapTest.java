package test2;

/**
 * 堆空间
 *
 * @author Chenyang
 * @create 2021-02-13-11:10
 */
public class HeapTest {
    public static void main(String[] args) {
        /*
          -Xms: 用来设置堆空间(年轻代+老年代)的起始内存大小
            -X: JVM的运行参数
            ms: Memory Start
          -Xmx: 用来设置堆空间(年轻代+老年代)的最大内存大小
        */
        System.out.println("进程开始");
        /*
          查看设置的参数:
          方式一: jps / jstat -gc 进程id
          方式二: -XX:+PrintGCDetails
         */
        long initialMemory = Runtime.getRuntime().totalMemory() / 1024 / 1024;
        long maxMemory = Runtime.getRuntime().maxMemory() / 1024 / 1024;
        System.out.println("-Xms: " + initialMemory + "M");
        System.out.println("-Xmx: " + maxMemory + "M");

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("进程结束");
    }
}
