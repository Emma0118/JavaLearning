package stringTest;
/**
 * 在以后讲解IO操作的时候会牵扯到这种字节数组的操作，在讲解后续乱码的处理，转码时
 * */
public class StringBytes {
    public static void main(String arg[]) {
        String str = "马洁";
        byte [] data = str.getBytes(); //将字符串转化为 字节 一个字符 == 两个字节
//        for(int x = 0; x < data.length; x ++) {
//            data[x] -= 32; //将小写字母 转化 为 大写字母
//        }

        System.out.println(new String(data));
        System.out.println(new String(data,0,1));
    }
}
