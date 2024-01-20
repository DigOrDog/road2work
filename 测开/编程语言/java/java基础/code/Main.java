package 测开.编程语言.java.java基础.code;

/**
 * Main
 */
public class Main {

    public void dataType() {
        /*
         * 整数类型
         */
        byte x = 1;
        short y = 2;
        int z = 4;
        long q = 8;
        System.err.println(x + y + z + q);
        /*
         * 浮点数类型
         */
        float a = (float)4.0; //注意4.0默认类型是double，向下转型需要强制转换，不会隐式转换。
        double b = 8.0;
        System.err.println(a + b);
        /*
         * 布尔类型
         */
        boolean ok = true;
        System.out.println(ok);

        boolean[] test = new boolean[10];
        
    }

    public void basicToReference() {
        Integer x = 10;
        int y = x;
        System.out.println(x);
        System.out.println(y);
        System.out.println(System.identityHashCode(x));
        System.out.println(System.identityHashCode(y));

    }

    public void pooling() {
        System.out.println(System.identityHashCode(new Integer(123)));
        System.out.println(System.identityHashCode(new Integer(123)));
        Integer x = Integer.valueOf(123);
        System.out.println(System.identityHashCode(Integer.valueOf(123) ));
        System.out.println(System.identityHashCode(Integer.valueOf(123) ));
    }

    public static void main(String[] args) {
        System.out.println("Road To Work");
        new Main().dataType();
        new Main().basicToReference();
        new Main().pooling();
    }
}