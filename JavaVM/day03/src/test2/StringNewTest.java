package test2;

/**
 * StringTable
 *
 * @author Chenyang
 * @create 2021-02-15-18:02
 */
public class StringNewTest {
    public static void main(String[] args) {

        String s1 = new String("1");
        s1.intern();//调用此方法之前，字符串常量池中已经存在1
        String s2 = "1";
        System.out.println(s1 == s2);//jdk6: false    jdk7/8: false

        String s3 = new String("a") + new String("b");//s3变量记录的地址是new String("ab")
        //此时字符串常量池中不存在"ab"

        //在字符串常量池中生成"ab" -->
        // jdk6: 创建了一个新的对象"ab"，也就有新的地址
        // jdk7/8: 此时常量池中并没有创建新对象"ab"，而是创建一个指向堆空间中 new String("ab")的地址
        s3.intern();

        String s4 = "ab";//该变量使用的是上一行代码执行时在常量池生成的"ab"的地址(实际指向对空间中的new String("ab")的地址)
        System.out.println(s3 == s4);//jdk6: false    jdk7/8: true
    }
}
