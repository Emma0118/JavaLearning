package stringTest;
/**
 * equalsIgnoreCase
 * compareTo  按照字符编码 比较 二进制数
 * */
public class StringCompare {
    public static void main(String arg[]) {
        String stra = "hello";
        String strb = "HEllo";
        String strc = "Hello world!";
        String strD = "Hello world nihao mldn";
        String ipv4 = "192.168.1.2";
        String resultC = strc.replace('l','_'); //只能是Char类型
        String resultD = strc.replaceAll("l", "_"); //只能写String类型
        String resultE = strc.replaceFirst("l","_"); //只能写String类型

        String [] resultF = strD.split(" ", 3); //返回字符串数组    limit 表示拆成 几部分 即数组长度最多为 limit
        String [] resultG = ipv4.split("\\."); //对于 正则中已有的符号，要转义，在字符串中转义需要使用 //


        int c = '9'; //以二进制编码的方式显示
        System.out.println(strb.compareTo(stra)); //返回  二进制 的相减
        System.out.println(c); //返回  二进制  57
        System.out.println(stra.contains("ll")); //true
        System.out.println(stra.indexOf("ll")); //2
        System.out.println(stra.endsWith("lo")); //true
        System.out.println(stra.startsWith("lo", 3)); // true 区分大小写 第二个参数表示从 索引 为 3 的位置开始查找

        //字符串替换 replace replaceAll replaceFirst
        System.out.println(resultC); //依然返回 替换后的字符串
        System.out.println(resultD);
        System.out.println(resultE);

        //字符串截取
        //substring
        System.out.println(stra.substring(2,4)); //不包含 最后一个索引的 字符 不能为负数

        //字符串 拆分
        //返回字符串数组 也是 对象数组
        for(int x = 0; x < resultF.length; x ++) {
            System.out.println(resultF[x]);
        }
        for(int x = 0; x < resultG.length; x ++) {
            System.out.println(resultG[x]);
        }

        System.out.println("    Hello world    ".trim()); //去掉字符串前后的空格
        System.out.println("    Hello world    ".trim().length()); //去掉字符串前后的空格 String 有一个length()方法


        //测试initCap方法
        String Hello = initCap("hello");
        System.out.println(Hello);
    }

    public static String initCap(String str) { //实现字符串的首字母大写，其余小写
        return str.substring(0,1).toUpperCase() + str.substring(1).toLowerCase();
    }
}
