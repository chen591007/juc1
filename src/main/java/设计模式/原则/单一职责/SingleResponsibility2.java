package 设计模式.原则.单一职责;

public class SingleResponsibility2 {
    public static void main(String[] args) {
        RoadVehicle roadVehicle=new RoadVehicle();
        roadVehicle.run("汽车");
        AirVehicle airVehicle=new AirVehicle();
        airVehicle.run("飞机");
        WaterVehicle waterVehicle=new WaterVehicle();
        waterVehicle.run("轮船");
    }
}

//方案2的分析
//1.遵守了单一职责原则
//2.但是这样做的花销很大，改动很大，即要将类分解同时修改客户端
//3.改进，直接修改Vehicle类，改动的代码会比较少，方案3
class RoadVehicle{
    public void run(String vehicle){
        System.out.println(vehicle+"在公路上运行");
    }
}

class AirVehicle{
    public void run(String vehicle){
        System.out.println(vehicle+"在空中运行");
    }
}

class WaterVehicle{
    public void run(String vehicle){
        System.out.println(vehicle+"在水中运行");
    }
}










