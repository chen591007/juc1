package 设计模式.原则.单一职责;

public class SingleResponsibility1 {

    public static void main(String[] args) {
        Vehicle vehicle=new Vehicle();
        vehicle.run("火车");
        vehicle.run("汽车");
        vehicle.run("摩托车");
        vehicle.run("飞机");
    }

}


//交通工具类
//方式1的run方法中违反了单一职责
//解决方案很简单，根据交通工具的运行方式不同，分解成不同的类即可
class Vehicle{
    public void run(String vehicle){
        System.out.println(vehicle+"在公路上跑");
    }
}











