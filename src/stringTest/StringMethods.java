package stringTest;

/**
 * This program demonstrates the most often used methods of String
 * char byte
 * */

public class StringMethods {
    public static void main(String args[]) {
        String input = "123a";
        char c = input.charAt(0); //char and String
        char [] data = input.toCharArray();

        System.out.println(c); //H
        System.out.println(data);

        for(int i = 0; i < data.length; i ++) {
            System.out.print(data[i] + "、");
            data[i] -= 32;
        }
        System.out.println(new String(data, 1,2));
        System.out.println(isNumStr(input));
    }

    //给定一个字符串，要求判断其是否由数字组成
    public static boolean isNumStr(String str) {
        char [] data = str.toCharArray();
        for(int x = 0; x < data.length; x ++) {
            if(data[x] > '9' || data[x] < '0') {
                return false;
            }
        }
        return true;
    }
}


