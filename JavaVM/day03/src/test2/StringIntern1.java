package test2;

/**
 * intern()方法的应用
 *
 * @author Chenyang
 * @create 2021-02-15-18:38
 */
public class StringIntern1 {
    public static void main(String[] args) {
        String s1 = new String("1") + new String("1");//new String("11")
        //执行完上一行代码以后，字符串常量池中不存在"11"
        String s2 = "11";//在字符串常量池中生成对象"11"
        String s3 = s1.intern();
        System.out.println(s1 == s2);//false
        System.out.println(s3 == s2);//true
    }
}
