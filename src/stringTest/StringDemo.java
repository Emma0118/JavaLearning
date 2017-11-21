package stringTest;
/**
 * This program demonstrates String type
 * two methods to make String object, String is a none-name object
 *Java make String object itself
 * */
public class StringDemo {
    public static void main(String args[]) {
//        String input = null;

        //第一种实例化  直接赋值  String 变量 = 字符串常量(匿名对象)
        //此时在内存中会开辟一块堆内存，并且由一块栈内存指向次堆内存
        String input = "Hello";

        String stra = "Hello";
        String strb = "Hello";
        String strc = new String("Hello");
        String strd = new String("Hello").intern(); //使用new 关键词实例化   开辟新的栈空间，不会进入对象池，必须手工 入池


        System.out.println(stra == strc); //false 2、使用new 关键词实例化， 会开辟两块堆内存空间 不会采用 共享设计模式 不会自动入池，其中一个成为垃圾空间

        System.out.println(stra.equals(strc)); // true

        System.out.println(stra == strd); //true 手工入池


        System.out.println(stra == strb); //true // 1、直接赋值的方法实例化，java采用 共享设计模式，不会开辟新的栈空间


//        if(input.equals("Hello")) { //未实例化，空指向异常     变为（"Hello"）.equals(input) equals处理了null
//            System.out.println("Hello world!");
//        }
    }
}
