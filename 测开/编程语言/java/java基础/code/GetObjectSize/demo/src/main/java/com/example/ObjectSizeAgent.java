package com.example;

import java.lang.instrument.Instrumentation;

// 通过在Java虚拟机启动时，使用-javaagent参数加载代理JAR文件，可以在premain方法中获取Instrumentation实例。
public class ObjectSizeAgent {
    //Java内部字节码处理调试用的是Instrumentation
    //所以在使用代理装到我们jvm的时候可以截获这个Instrumentation
    private static Instrumentation inst;

    /**
     * 必须要有premain函数
     * 参数固定
     * 第二个参数就是Instrumentation，这个是虚拟机调用的，会自动帮我们初始化Instrumentation
     * 在这里通过给自己定义的成员变量赋值，赋完值就能拿到Instrumentation
     * @param agentArgs
     * @param _inst
     */
    public static void premain (String agentArgs, Instrumentation _inst) {
        inst = _inst;
    }

    /**
     * 在premain里拿到Instrumentation后，可以调用getObjectSize获取对象大小
     * @param o
     * @return
     */
    public static long sizeOf (Object o) {
        return inst.getObjectSize(o);
    }
}
