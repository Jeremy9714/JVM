package test2;

/**
 * 堆空间结构: 年轻代和老年代
 * -Xms600m -Xmx600m
 *
 * -XX:NewRatio=2: 设置新生代与老年代在堆结构的比例，默认值为2(1:2)
 * -XX:SurvivorRatio=8: 设置Eden区和另外两个Survivior区所占比例，默认值为8(8:1:1)
 * -XX:-UseAdaptiveSizePolicy: 关闭自适应的内存分配策略
 * -Xmn: 设置新生代的空间大小
 *
 * @author Chenyang
 * @create 2021-02-13-15:28
 */
public class EdenSurvivorTest {
    public static void main(String[] args) {
        System.out.println("线程启动");
        try {
            Thread.sleep(10000000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
