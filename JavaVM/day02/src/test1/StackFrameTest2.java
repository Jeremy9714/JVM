package test1;

/**
 * 解析调用虚方法与非虚方法
 *
 * @author Chenyang
 * @create 2021-02-12-17:56
 */
public class StackFrameTest2 {
    public static void main(String[] args) {
        Son son = new Son();
        son.show();

    }
}

class Father {
    public Father() {
        System.out.println("father的构造器");
    }

    public static void showStatic(String str) {
        System.out.println("father" + str);
    }

    public final void showFinal() {
        System.out.println("father show final");
    }

    public void showCommon() {
        System.out.println("father show common");
    }
}

class Son extends Father {
    public Son() {
        super();
    }

    public Son(int age) {
        this();
    }

    public static void showStatic(String str) {
        System.out.println("son" + str);
    }

    private void showPrivate(String str) {
        System.out.println("son private" + str);
    }

    public void show() {
        //非虚方法如下
        //invokestatic
        showStatic("testStr");
        //invokestatic
        super.showStatic("good");
        //invokespecial
        showPrivate("hello");
        //invokespecial
        super.showCommon();
        //invokevirtual
        showFinal();//此方法声明有final, 不能被子类重写, 此方法也为虚方法
        //invokespecial
        super.showFinal();

        //虚方法如下
        //invokevirtual
        showCommon();
        //invokevirtual
        info();

        MethodInterface in = null;
        //invokeinterface
        in.methodA();
    }

    public void display(Father f) {
        f.showCommon();
    }

    public void info() {
    }
}

interface MethodInterface {
    void methodA();
}