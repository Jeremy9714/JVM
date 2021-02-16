package test1;

/**
 * 证明: Java使用的不是引用计数算法
 *
 * @author Chenyang
 * @create 2021-02-16-15:51
 */
public class RefCountGC {
    private byte[] bytes = new byte[5 * 1024 * 1024];//占空间用的数组(5M)

    Object reference = null;

    public static void main(String[] args) {
        RefCountGC r1 = new RefCountGC();
        RefCountGC r2 = new RefCountGC();
        r1.reference = r2;
        r2.reference = r1;

        r1 = null;
        r2 = null;

        System.gc();
    }
}
