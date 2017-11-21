package referenceTransmission;


/**
 * This program demonstrates the reference transmission in Java
 * The core definition of reference transmission: one  Heap memory space can be referred by more than one stack memory spaces
 * One Heap memory can be change by more than more Stack memory
 * @version 1.1.1 2017-11-17
 * @author Emma
 * */

public class ReferenceTransmission {
    public static void main(String args[]) {
        //第一个 引用传递 范例
        Message msg = new Message(30); //创建 msg 栈内存 并 指向 num = 30 堆内存
        fun(msg);
        msg.getNum();

        //第二个 引用传递 范例
        String msg1 = "Hello";
        fun2(msg1);
        System.out.println(msg1); //Hello

        //第三个 引用传递 范例
        Message2 msg2 = new Message2("Hello!");
        fun3(msg2);
        System.out.println(msg2.getInfo());



        //测试 car member的引用关系
            //第一步：设置数据
        Member m = new Member(1, "陈冠希");
        Member chd = new Member(2,"张三");
        Car c = new Car("宝马 z4");
        Car cc  = new Car("法拉利 F9");
        m.setCar(c);
        c.setMember(m);
        chd.setCar(cc);
        cc.setMember(chd);
        m.setChild(chd);
            //第二步：取出关系
            //通过 人 找出 车的信息
        System.out.println(m.getCar().getInfo());
        System.out.println(c.getMember().getInfo());


        System.out.println(m.getChild().getInfo());
        System.out.println(m.getChild().getCar().getInfo());




    }
    public static void fun(Message temp) {
        temp.setNum(100);
    }
    public static void fun2(String temp2) { //String类对象的内容一旦声明则不可改变，对象内容的改变依靠的是引用地址的改变
//        System.out.println(temp2);
        temp2 = "World";

    }
    public static void fun3(Message2 temp) {
        temp.setInfo("World");
    }
}

class Message {
    private int num = 10;
    public Message(int num) {
        this.num = num;
    }


    public void setNum(int num) {
        this.num = num;
    }
    public void getNum() {
        System.out.println(this.num);
    }
}


class Message2 {
    private String info = "inhao";
    public Message2(String info) {
        this.info = info;
    }
    public void setInfo(String info) {
        this.info = info;

    }
    public String getInfo() {
        return this.info;
    }
}

class Member {
    private int mid; // 会员 id
    private String name; // 会员名字

    // 会员的孩子
    private Member child;

    //采用引用关系 引用 会员的是会否有车的情况
    //car 有实例化对象表示有车
    //car 为 null表示没有车

    private Car car; //表示属于人的 车

    public Member(int mid, String name) {
        this.mid = mid;
        this.name = name;
    }
    public String getInfo() {
        return "人员编号：" + this.mid + "; 姓名：" + this.name;
    }

    public void setCar(Car car) {
        this.car = car;
    }
    public Car getCar() {
        return this.car;
    }

    public void setChild(Member child) {
        this.child = child;
    }

    public Member getChild() {
        return this.child;
    }
}

class Car {
    private Member member; //车 属于 一个人
    private String pname;
    public Car(String pname) {
        this.pname = pname;
    }
    public String getInfo() {
        return "车的名字：" + this.pname;
    }
    public void setMember(Member member) {
        this.member = member;
    }

    public Member getMember() {
        return this.member;
    }
}
