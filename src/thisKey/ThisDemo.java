package thisKey;

public class ThisDemo {
    public static void main(String arg[]) {
        Book book1 = new Book("Java开发",88.00);
        System.out.println( book1.getInfo());
    }
}

class Book{
    private String title;
    private double price;
    public Book(){ //必须有一个无参的构造函数

        //至少保留一个构造方法 不调用其他 构造方法
        System.out.println("this is a construct method");

    }
    public Book(String title){ //必须有一个无参的构造函数
//        System.out.println("this is a construct method");
        this();
        this.title = title;
    }
    public Book(String title, double price) { //根据需要，自定义一个构造方法 但是 由于变量引用的就近原则，参数名不能与属性名重名
//        System.out.println("this is a construct method");

//        this();//调用无参 构造函数
        this(title);

        //是用this可以准确指向 Book的title属性 ， 一定要加上this
//        this.title = title;
        this.price = price;
    }
    //增加 setter getter方法
    public void setTitle(String t) {
        title = t;
    } // this.title = t
    public void setPrice(double p) {
        price = p;
    } // this.price = p

    public String getTitle() {
        return title;
    }
    public double getPrice() {
        return price;
    }

    //定义一个本类方法
    public void printInfo() {
        System.out.println("*************");
    }

    public String getInfo() {
//        this(); 普通函数不能调用 构造
        this.printInfo(); //调用本类普通方法，为了代码的严谨性，一定加this
        return "书名: " + this.title + "; 价格: " + this.price;
    }
}
