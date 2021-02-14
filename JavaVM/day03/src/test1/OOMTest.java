package test1;

import jdk.internal.org.objectweb.asm.ClassWriter;
import jdk.internal.org.objectweb.asm.Opcodes;

/**
 * 永久代/元空间内存溢出测试
 * JDK7:
 * -XX:PermSize=10m -XX:MaxPermSize=10m
 *
 * JDK8:
 * -XX:MetaspaceSize=10m -XX:MaxMetaspaceSize=10m
 *
 * @author Chenyang
 * @create 2021-02-14-11:08
 */
public class OOMTest extends ClassLoader {
    public static void main(String[] args) {
        //记录生成的类的数量
        int j = 0;
        try {
            OOMTest test = new OOMTest();
            for (int i = 0; i < 10000; ++i) {
                //创建ClassWriter对象，用于生成类的二进制字节码
                ClassWriter classWriter = new ClassWriter(0);
                //指明生成的类的版本号、修饰符、类名、包名、父类、接口
                classWriter.visit(Opcodes.V1_8, Opcodes.ACC_PUBLIC, "class" + i, null, "java/lang/Object", null);
                //classWriter.visit(Opcodes.V1_6, Opcodes.ACC_PUBLIC, "class" + i, null, "java/lang/Object", null);
                //返回生成的类的字节码数组
                byte[] code = classWriter.toByteArray();
                //生成的类的加载
                test.defineClass("class" + i, code, 0, code.length);
                j++;
            }
        } finally {
            System.out.println(j);
        }
    }
}
