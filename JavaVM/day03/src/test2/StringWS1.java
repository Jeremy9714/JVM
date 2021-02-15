package test2;

/**
 * intern()练习1
 *
 * @author Chenyang
 * @create 2021-02-15-18:50
 */
public class StringWS1 {
    public static void main(String[] args) {
        //String x = "11";//直接在字符串常量池中放入对象"11"
        String s1 = new String("1") + new String("1");//执行完之后不会在常量池中生成"11"
        String s2 = s1.intern();
        System.out.println(s1 == "11");//jdk6: false   jdk7:true
        System.out.println(s2 == "11");//jdk6: true   jdk7:true
    }
}
