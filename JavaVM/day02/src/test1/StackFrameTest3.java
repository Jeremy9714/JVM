package test1;

/**
 * 动态调用指令
 *
 * @author Chenyang
 * @create 2021-02-12-18:28
 */
@FunctionalInterface
interface Func {
    public boolean func(String str);
}

public class StackFrameTest3 {

    public void lam(Func func) {
        return;
    }

    public static void main(String[] args) {
        StackFrameTest3 sft = new StackFrameTest3();
        Func func = str -> {
            return true;
        };
        sft.lam(func);
        sft.lam(s -> {
            return true;
        });
    }
}