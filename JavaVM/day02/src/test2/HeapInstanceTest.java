package test2;

import java.util.ArrayList;
import java.util.Random;

/**
 * 对象分配的过程
 *
 * @author Chenyang
 * @create 2021-02-13-16:28
 */
public class HeapInstanceTest {
    byte[] buffer = new byte[new Random().nextInt(1024 * 200)];

    //-Xms600m -Xmx600m
    public static void main(String[] args) {
        ArrayList<HeapInstanceTest> list = new ArrayList<>();
        while (true){
            list.add(new HeapInstanceTest());
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
