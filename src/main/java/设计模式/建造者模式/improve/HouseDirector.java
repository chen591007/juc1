package 设计模式.建造者模式.improve;
//指挥者，这里动态地指定制作流程，返回产品
public class HouseDirector {
    HouseBuilder houseBuilder=null;
    //构造器传入

    public HouseDirector(HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }

    //通过setter方法
    public void setHouseBuilder(HouseBuilder houseBuilder){
        this.houseBuilder=houseBuilder;
    }

    //如何处理建房子的流程，交给指挥者
    public House constructHouse(){
        houseBuilder.buildBasic();
        houseBuilder.buildBWalls();
        houseBuilder.roofed();
        return houseBuilder.buildHouse();
    }

}






































