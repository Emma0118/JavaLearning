package arrayTest;

/**
 * This program demonstrates the pass of array
 * @version 1.1.2 2017-11-8
 * @author Emma
 * */
public class ArrayAndFn {
    public static void main(String args[]) {
        int data [] = new int [] {1,2,3};// 静态初始化
        change(data);//相当于int temp [] = data; 本质是对堆内容空间的引用
        for(int x = 0; x < data.length; x++) {
            System.out.println(data[x]);
        }
    }

    //此方法定义在主类中，并且有主方法直接调用，所以加上 public static
    public static void change(int temp[]) {
        for (int x = 0; x < temp.length; x++) {
            temp[x] *= 2;
        }
    }
}
