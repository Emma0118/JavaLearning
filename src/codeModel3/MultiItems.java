package codeModel3;

public class MultiItems {
    public static void main(String args[]) {
        //设置数据关系
        Item item = new Item(1,"厨房用具","-");
        SubItem suba = new SubItem(1001, "厨具","-");
        SubItem subb = new SubItem(1002, "刀具","-");
        SubItem subc = new SubItem(1003, "餐具","-");


        Product proa = new Product(90001,"蒸锅",500);
        Product prob = new Product(90002,"炒锅",3000);
        Product proc = new Product(90003,"菜刀",1000);
        Product prod = new Product(90004,"水果刀",80);
        Product proe = new Product(90005,"青花瓷",10000);
        Product prof = new Product(90006,"水晶筷子",8000);

        suba.setItem(item);
        subb.setItem(item);
        subc.setItem(item);
        item.setSubItems(new SubItem [] {suba,subb,subc});

        proa.setSubItem(suba);
        proa.setItem(item);
        prob.setSubItem(suba);
        prob.setItem(item);
        proc.setSubItem(subb);
        proc.setItem(item);
        prod.setSubItem(subb);
        prod.setItem(item);
        proe.setSubItem(subc);
        proe.setItem(item);
        prof.setSubItem(subc);
        prof.setItem(item);
        suba.setProducts(new Product[] {proa,prob});
        subb.setProducts(new Product[] {proc,prod});
        subc.setProducts(new Product[] {proe,prof});
        item.setProducts(new Product[] {proa, prob,proc,prod,proe,prof});

        // 通过 一个 类型 找到 对应的 全部子类型
        System.out.println(item.getInfo());
        for(SubItem s : item.getSubItems()) {
            System.out.println("\t|-" + s.getInfo());
        }
        System.out.println("---------------------------------");

        //通过一个类型找到它所对应的全部商品，以及每个商品对应的子类型
        for(Product p : item.getProducts()) {
            System.out.println(p.getInfo());
            System.out.println("\t|-" + p.getSubItem().getInfo());
        }
        System.out.println("---------------------------------");

        //通过一个子类型 找到其 所有的产品
//        System.out.println(subb.getInfo());
//        for(Product p : subb.getProducts()) {
//            System.out.println("\t|-" + p.getInfo());
//        }
        getPros(subb);
    }
    public static void getPros(SubItem subItem) {
        if(subItem.getInfo() != "" && subItem.getProducts().length != 0) {
            System.out.println(subItem.getInfo());
            for(Product p : subItem.getProducts()) {
                System.out.println("\t|-" + p.getInfo());
            }
        }
     }
}

class Item {
    private int iid;
    private String name;
    private String note;
    private SubItem [] subItems;
    private Product [] products;

    public Item(int iid, String name, String note) {
        this.iid = iid;
        this.name = name;
        this.note = note;
    }
    public void setSubItems(SubItem [] subItems) {
        this.subItems = subItems;
    }
    public void setProducts(Product [] products) {
        this.products = products;
    }

    public SubItem [] getSubItems() {
        return this.subItems;
    }
    public Product [] getProducts() {
        return this.products;
    }
    public String getInfo() {
        return "栏目编号：" + this.iid + ", 名称：" + this.name + ", 基本描述：" + this.note;
    }

}
class SubItem {
    private int sid;
    private String name;
    private String note;
    private Item item;
    private Product [] products;

    public SubItem(int sid, String name, String note) {
        this.sid = sid;
        this.name = name;
        this.note = note;
    }
    public void setItem(Item item) {
        this.item = item;
    }
    public void setProducts(Product [] products) {
        this.products = products;
    }
    public Item getItem() {
        return this.item;
    }
    public Product [] getProducts() {
        return this.products;
    }
    public String getInfo() {
        return "子栏目编号：" + this.sid + ", 名称：" + this.name + ", 基本描述：" + this.note;
    }
}
class Product {
    private int pid;
    private String name;
    private double price;
    private Item item;
    private SubItem subItem;

    public Product(int pid, String name, double price) {
        this.pid = pid;
        this.name = name;
        this.price = price;
    }
    public void setItem(Item item) {
        this.item = item;
    }
    public void setSubItem(SubItem subItem) {
        this.subItem = subItem;
    }
    public Item getItem() {
        return this.item;
    }
    public SubItem getSubItem() {
        return this.subItem;
    }
    public String getInfo() {
        return "产品编号：" + this.pid + ", 名称：" + this.name + ", 价格：" + this.price;
    }
}
