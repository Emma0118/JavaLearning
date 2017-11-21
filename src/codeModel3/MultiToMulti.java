package codeModel3;

public class MultiToMulti {
    public static void main(String args[]) {

    }
}

class Admin {
    private String aid;
    private String password;
    public Admin(String aid, String password) {
        this.aid = aid;
        this.password = password;
    }
    public String getInfo() {
        return "管理员编号：" + this.aid + ", 密码：" + this.password;
    }
}
class Role {
    private int rid;
    private String title;
    public Role(int rid, String title) {
        this.rid = rid;
        this.title = title;
    }

    public String getInfo() {
        return "角色编号：" + this.rid + ", 角色名称：" + this.title;
    }
}
class Group {
    private int gid;
    private String title;
    public Group(int gid, String title) {
        this.gid = gid;
        this.title = title;
    }
    public String getInfo() {
        return "权限组编号：" + this.gid + ", 权限组名称：" + this.title;
    }

}
class Action {
    private int aid;
    private String title;
    private String url;
    public Action(int aid, String title, String url) {
        this.aid = aid;
        this.title = title;
        this.url = url;
    }
    public String getInfo() {
        return "权限编号：" + this.aid + ", 权限名称：" + this.title + ", 权限路径：" + this.url;
    }
}
