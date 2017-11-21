package arrayTest;

public class ArraySort { //默认升序

    //主方法作为程序的起点，是客户端，只负责调用，因此，必须尽可能简单
    public static void main(String args[]) {
        //冒泡排序
        int data [] = new int [] {2,9,4,3,6,5,8,0,1,7,9,4};
        sort(data);
        print(data);
        transpose(data);
        print(data);
    }

    public static void print(int temp[]) {
        for(int x = 0; x < temp.length; x++) {
            System.out.print(temp[x] + "、");
        }
        System.out.println();
    }
    public static void sort(int arr[]) {
        for(int x = 0; x < arr.length; x ++) {
            for(int y = 0; y < arr.length - 1; y ++) {
                if(arr[y] > arr[y + 1]) {
                    int t = arr[y];
                    arr[y] = arr[y + 1];
                    arr[y + 1] = t;
                }
            }
        }
    }

    public static void transpose(int arr[]) {
        for(int x = 0; x < arr.length / 2; x ++) {
            int t = arr[x];
            arr[x] = arr[arr.length -1 - x];
            arr[arr.length - 1 - x] = t;
        }
    }

}
