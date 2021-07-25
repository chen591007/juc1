package 设计模式.建造者模式.improve;

public class CommonHouse extends HouseBuilder {
    @Override
    public void buildBasic() {
        System.out.println("给普通房子打地基5m");
    }

    @Override
    public void buildBWalls() {
        System.out.println("给普通房子砌墙10m");
    }

    @Override
    public void roofed() {
        System.out.println("盖普通房子屋顶");
    }
}
