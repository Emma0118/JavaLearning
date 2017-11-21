package arrayTest;
/**
 * This program demonstrates the object character in Array
 * @version 1.1.3 2017-11-8
 * @author Emma
 * */
public class ArrayObj {
    public static void main(String args[]) {

        //是用类和构造函数生成数组对象
        Book books[]  = new Book[3]; //开辟一个三个长度的对象数组
        //静态赋值
        //Book books[] = new Book[] {
        // new Book("Java开发", 90);
        // }
        for(int i = 0; i < books.length; i ++) {
            books[i] = new Book("Java", 89.0); //单个赋值，是动态方法
            System.out.println(books[i].getInfo());
        }
    }
}

class Book {
    private String title;
    private double price;
    public Book(String t, double p) {
        title = t;
        price = p;
    }
    //setter getter 无参构造函数  略

    public String getInfo() {
        return "书名: " + title + "; 价格: " + price;
    }
}
