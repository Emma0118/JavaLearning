package encapsulate;

public class EncapsulateTest {
    public static void main(String args[]) {
        //Book book = new Book(); //调用了一个和类名称相同的构造方法 ，
        //调用自定义的构造方法

        //在实例化的同时，将所需要的类属性传递到对象的构造方法中
        //同样适用 方法重载，即 构造方法的重载
        Book book = new Book("Java开发", 89.3);


        //book.title = "Java 开发"; //Error:(6, 13) java: title可以在encapsulate.Book中访问private
        //book.price = -89.9; //能够直接修改另一个类中的数据，但是不和业务逻辑
//        book.setTitle("Java开发");
//        book.setPrice(-89.9);



        book.getInfo();
        //匿名对象 没有其他对象对其进行引用，所以只能是用一次。
        new Book("Jsonp开发", 55.0).getInfo();
    }
}

class Book {
    private String title;
    private double price;//封装性，意味着设置属性对外不可见，只能对本类访问 可以是用private


    //可以定义构造方法，代替多次setter , 默认的构造方法将不再自动生成

    //构造函数重载时，按照参数的个数排序
    public Book() {

    }
    public Book(String t) {

    }

    public Book(String t, double p) {
        title = t;
        setPrice(p); //直接调用本类中的setter方法
    }



    public void setTitle(String t) {
        title = t;

    }
    public void setPrice(double p) {
        //增加验证
        if(p > 0.0) {
            price  = p;
        }
    }
    public String getTitle() {
        return  title;
    }
    public double getPrice() {
        return  price;
    }
    public void getInfo() {
        System.out.println("图书名称: " + title + "; 图书价格: " + price);
    }
}
