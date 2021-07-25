package 设计模式.原则.单一职责;

public class SingleResponsibility3 {
    public static void main(String[] args) {
        Vehicle2 vehicle2=new Vehicle2();
        vehicle2.run("汽车");
        vehicle2.runAir("飞机");
        vehicle2.runWater("轮船");
    }
}


//方案3的分析
//1.这种修改方法没有对原来的类做大的修改，只是增加了方法
//2.在一类这个级别上没有遵守单一职责，但在方法层面上仍然是遵守单一职责原则
class Vehicle2{
    public void run(String vehicle){
        System.out.println(vehicle+"在公路上跑");
    }

    public void runAir(String vehicle){
        System.out.println(vehicle+"在空中飞");
    }

    public void runWater(String vehicle){
        System.out.println(vehicle+"在水中跑");
    }
}



























