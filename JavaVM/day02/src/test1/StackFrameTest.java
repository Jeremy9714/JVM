package test1;

/**
 * 栈帧结构: 局部变量表
 * @author Chenyang
 * @create 2021-02-12-12:36
 */
public class StackFrameTest {
    public static void main(String[] args) {
        StackFrameTest stackFrameTest = new StackFrameTest();
        stackFrameTest.method1();
    }

    public void method1(){
        System.out.println("method1()开始执行");
        method2();
        System.out.println("method1()执行结束");
    }

    public int method2() {
        System.out.println("method2()开始执行");
        int i = 10;
        int j = (int) method3();
        System.out.println("method2()即将结束");
        return i + j;
    }

    public double method3() {
        System.out.println("method3()开始执行");
        double j = 20.0;
        System.out.println("method3()即将结束");
        return j;
    }

    public void localVar1(){
        int a = 0;
        System.out.println(a);
        int b = 0;
    }

    public void localVal2(){
        int a = 10;
        {
            int b = 0;
            System.out.println(a);
        }
        //变量c使用之前被销毁的变量b占据的slot的位置
        int c= 0;
    }
}
