package test1;

/**
 * finalize()方法使用
 *
 * @author Chenyang
 * @create 2021-02-16-16:54
 */
public class CanReviveObj {
    public static CanReviveObj obj;

    //此方法只能被调用一次
    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("调用重写的finalize()方法");
        obj = this;//当前待回收的对象与引用链上的一个对象建立了联系
    }

    public static void main(String[] args) {
        try {
            obj = new CanReviveObj();
            obj = null;

            System.gc();//调用垃圾回收器
            System.out.println("第一次gc");
            //Finalizer线程优先级较低，当前线程暂停两秒等待
            Thread.sleep(2000);
            if (obj==null){
                System.out.println("obj is dead");
            }else{
                System.out.println("obj is still alive");
            }

            System.out.println("第二次gc");
            //第二次gc不会再调用finalize()方法
            obj = null;
            System.gc();//再次调用垃圾回收器
            Thread.sleep(2000);
            if (obj==null){
                System.out.println("obj is dead");
            }else{
                System.out.println("obj is still alive");
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
