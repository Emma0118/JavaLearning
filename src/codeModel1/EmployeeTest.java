package codeModel1;

/**
 * This program demonstrates class in Java
 * @version 1.1.0
 * @author Emma 2017-11-7
 * */

public class EmployeeTest {
    public static void main(String args[]) {
        Emp e = new Emp(73, "Emma", "Engineer", 15000.0, 2000.0);
        e.setEname("Smith");
        System.out.println(e.getInfo());
    }
}






class Emp { //定义一个有意义的类

    //所有属性必须为 private
    private int empno;
    private String ename;
    private String job;
    private double sal;
    private double comm;

    //必须有一个无参的构造函数
    public Emp() {

    }
    //自定义一个有参的构造函数
    //不允许出现任何输出语句，提供一个取得对象完整信息的方法
    public Emp(int num, String en, String j, double s, double c) { //变量不能和 类中的变量重名
        empno = num;
        ename = en;
        job = j;
        sal = s;
        comm = c;
    }


    //setter和getter不一定使用到，但是一定要写！

    //使用 setter
    public void setEmpno(int e) {
        empno = e;
    }
    public void setEname(String e) {
        ename = e;
    }
    public void setJob(String e) {
        job = e;
    }
    public void setSal(double e) {
        sal = e;
    }
    public void setComm(double e) {
        comm = e;
    }

    //使用 getter
    public int getEmpno() {
        return empno;
    }
    public String getEname() {
        return ename;
    }
    public String getJob() {
        return job;
    }
    public double getSal() {
        return sal;
    }
    public double getComm() {
        return comm;
    }
    public String getInfo() {
        return "雇员编号: " + empno + "\n" + "雇员姓名: " + ename + "\n" + "雇员职位: " + job + "\n" + "基本工资: " + sal + "\n" + "佣  金: " + comm;
    }

}
