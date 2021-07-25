package 设计模式.建造者模式.improve;

public class Client {
    public static void main(String[] args) {
        //盖普通房子
        CommonHouse commonHouse=new CommonHouse();
        //准备创建房子指挥者
        HouseDirector houseDirector=new HouseDirector(commonHouse);
        //完成盖房子，返回产品
        House house= houseDirector.constructHouse();
        


    }
}



































