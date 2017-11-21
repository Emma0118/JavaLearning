package codeModel2;

/**
 * This program demonstrates reference Transmission
 * using a database table to illustrate the relationship between department, employee and manager
 * @version 1.01 2017-11-20
 * @author Emma
 * */

/**
 * First step: make the Java class sample
 * Second step: construct the relationship between each class
 * Third step: set and get data according to data structure
 * */
public class DeptEmp {
    public static void main(String args[]) {

        //begin with Third step
        Dept dept = new Dept(10, "ACCOUNTING", "NewYork");
        Emp ea = new Emp(7369, "SMITH", "CLERK", 800, 0.0);
    }
}

class Dept {
    private int deptno;
    private String dname;
    private String loc;

    private Emp [] emps; // 一个部门有多个 雇员，是用 对象数组表示

    public void setEmps(Emp [] emps) {
        this.emps = emps;
    }

    public Emp [] getEmps() {
        return this.emps;
    }


    //setter getter 无参构造略
    public Dept(int deptno, String dname, String loc) {
        this.deptno = deptno;
        this.dname = dname;
        this.loc = loc;
    }

    public String getInfo() {
        return "部门编号：" + this.deptno + "; 名称: " + this.dname + "; 位置:" + this.loc;
    }

}
class Emp {
    private int empno;
    private String ename;
    private String job;
    private double sal;
    private double comm;

    private Dept dept; //表示对应的部门信息
    private Emp mgr; //表示 对应的 经理

    public void setDept(Dept dept) {
        this.dept = dept;
    }
    public Dept getDept() {
        return this.dept;
    }


    public void setMgr(Emp mgr) {
        this.mgr = mgr;
    }
    public Emp getMgr() {
        return this.mgr;
    }

    //setter getter 无参构造略
    public Emp(int empno,String ename,String job,double sal, double comm) {
        this.empno = empno;
        this.ename = ename;
        this.job = job;
        this.sal = sal;
        this.comm = comm;
    }
    public String getInfo() {
        return "雇员编号：" + this.empno + "姓名：" + this.ename + "职位：" + this.job + "工资：" + this.sal + "佣金：" + this.comm;
    }
}

