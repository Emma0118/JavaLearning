package xingHuaLiJAVA;
/**
 * This program demonstrates the use of reference in Class
 * @version 1.1.1 2017-11-5
 * @author Emma
 * */

public class ReferenceTest {
    public static void main(String args[]) {
        Book1 bookA = new Book1();
        Book1 bookB = null;
        Book1 bookC = new Book1();
        bookA.title = "Java开发";
        bookA.price = 89.8;
        bookC.price = 100.1; //垃圾   一块 没有  任何 栈内存  指向的堆内存

        bookB = bookA;  //栈内存，将bookA的名字的内存地址给bookB 指向了同一个地址空间(堆内存空间)，大名  和  小名 的关系，只要其中一个修改了堆内存，另一个保存的堆内存也会相应改变
        bookC = bookA;


        bookB.title = "JSP开发";
        bookC.price = 69.8;
        bookA.getInfo();
        bookB.getInfo();

        //函数重载，根据传入参数的类型和个数判断是用哪个方法
        System.out.println( add(5.7,7, 5));
    }
    public static int add(int x, int y) {
        return x + y;
    }
    public static int add(int x, int y, int z) {
        return x + y + z;
    }
    public static double add(double x, int y, int z) {
        return x + y + z;
    }
}

class Book1{
    String title;
    double price;
    public void getInfo() {
        System.out.println("图书名称: " + title + "; 图书价格: " + price);
    }
}
