package test1;

/**
 * 虚拟机栈
 * @author Chenyang
 * @create 2021-02-12-12:11
 *
 * 设置栈的大小: -Xss1024k
 */
public class StackErrorTest {
    private static int i = 1;
    public static void main(String[] args) {
        System.out.println(i);
        i++;
        main(args);
    }
}
