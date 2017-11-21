package arrayTest;

public class BasicPass {
    public static void main(String args[]){
        int a = 4;
        change(a); //基本数据类型引用 是按值调用
        System.out.println(a);
    }
    public static void change(int data) {
        data *= 2;
    }
}
