package test3;

import java.util.ArrayList;
import java.util.List;

/**
 * Minor GC、Major GC和Full GC垃圾回收
 *
 * @author Chenyang
 * @create 2021-02-13-17:34
 */
public class GCTest {
    public static void main(String[] args) {
        int i = 0;
        try {
            List<String> list = new ArrayList<>();
            String str = "atguigu.com";
            while (true) {
                list.add(str);
                str = str + str;
                i++;
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("循环次数为" + i + "次");
        }
    }
}
