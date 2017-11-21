package codeModel3;

public class ProvinceCities {
    public static void main(String args[]) {
        Province province = new Province(001, "山东");
//        City [] cities[0] = new City(0011,"济南");
//        City [] cities[1] = new City(0012,"青岛");
//        City [] cities[2] = new City(0013,"泰安");
        City citya = new City(10, "济南");
        City cityb = new City(20, "青岛");
        City cityc = new City(30, "泰安");

//        City [] cities = new City [] {citya, cityb, cityc};
//        for(City e : cities) {
//            e.setProvince(province);
//            System.out.println(e.getProvince().getInfo());
//        }
        province.setCities(new City [] {citya, cityb, cityc});
        for(City c : province.getCities()) {
            System.out.println(c.getInfo());
        }
    }
}
class Province {
    private int pid;
    private String pname;
    private City [] cities;
    //setter getter 无参构造 略
    public Province(int pid, String pname) {
        this.pid = pid;
        this.pname = pname;
    }
    public void setCities(City [] cities ) {
        this.cities = cities;
    }
    public City [] getCities() {
        return this.cities;
    }
    public String getInfo() {
        return "省份编码：" + this.pid + "; 省份名称：" + this.pname;
    }
}


class City {
    private int cid;
    private String cname;
    private Province province;

    //setter getter 无参构造 略
    public City(int cid, String cname) {
        this.cid = cid;
        this.cname = cname;
    }

    public void setProvince(Province province) {
        this.province = province;
    }

    public Province getProvince() {
        return this.province;
    }

    public String getInfo() {
        return "城市编码：" + this.cid + ", 城市名称：" + this.cname;
    }

}
