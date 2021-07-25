package 设计模式.工厂模式.简单工厂.披萨店.披萨;
//将披萨类做成抽象
public abstract class Pizza {
    protected String name;

    //准备原材料 不同披萨原材料是不一样的
    public abstract void prepare();

    //烘烤 流程大同小异
    public void bake(){
        System.out.println(name+" baking; ");
    }

    //切割
    public void cut(){
        System.out.println(name+" cutting; ");
    }

    //打包
    public void box(){
        System.out.println(name+" boxing; ");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

















