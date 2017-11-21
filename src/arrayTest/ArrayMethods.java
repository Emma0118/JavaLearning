package arrayTest;

import java.util.Arrays;

public class ArrayMethods {
    //System.arraycopy实现数组拷贝
    public static void main(String args[]) {
        int dataA[] = new int[] {1,2,3,4,5,6,7,8,9,10, 0,30,40};
        int dataB[] = new int[] {11,22,33,44,55,66,77};
        System.arraycopy(dataA,3,dataB,3,2);
        Arrays.sort(dataA);
        print(dataA);
    }

    public static void print(int temp[]) {
        for(int x = 0; x < temp.length; x++) {
            System.out.print(temp[x] + "、");
        }
        System.out.println();
    }
}
