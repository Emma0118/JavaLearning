package arrayTest;

public class ArrayTest {
    public static void main(String args[]) {
        int data [] = new int [8];
        int twoData[][] = new int [][] {{1,2,3}, {4,5,6}}; //two-dimension array static definition


        //System.out.println(data[0]); //int 的默认值 0

        //是用 for 循环 赋值 和 输出
//        for(int x = 0; x < data.length; x++) {
//            data[x] = x;
//            System.out.println(data[x]);
//        }

        for(int x = 0; x < twoData.length;x++) {
            for(int y = 0; y < twoData[x].length; y++) {
                System.out.println(twoData[x][y]);
            }
        }

        //数组属于引用数据类型，那么数组一定可以发生引用传递
        int data2 [] = data;
        System.out.println(data2[1]);
        data2[1] = 88;
//        System.out.println(data[1]); //data2的修改引起内存地址的内容改变
    }
}
