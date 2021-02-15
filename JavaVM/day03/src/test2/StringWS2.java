package test2;

/**
 * intern()练习2
 *
 * @author Chenyang
 * @create 2021-02-15-18:53
 */
public class StringWS2 {
    public static void main(String[] args) {
        String s1 = new String("ab");//执行完之后会在常量池生成"ab"
        //String s1 = new String("a") + new String("b");//执行完之后不会再常量池中生成"ab"
        s1.intern();
        String s2 = "ab";
        System.out.println(s1 == s2);
    }
}
