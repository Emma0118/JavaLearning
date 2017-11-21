package xingHuaLiJAVA;

public class ClassIntro {
    public static void main (String args[]) {
        Book bk = new Book();
        bk.title = "Java开发";
        bk.price = 89.9;
        bk.getInfo();
    }
}

class Book {
    String title;
    double price;
    public void getInfo() {
        System.out.println("图书名称： " + title + "；" + "图书价格： " + price);
    }
}
