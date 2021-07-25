package 设计模式.工厂模式.简单工厂.披萨店.订购;
//相当于一个客户端完成订购，发出披萨啊订购任务
public class PizzaStore {
    public static void main(String[] args) {
        //new OrderPizza();
        //使用简单工厂模式
        new OrderPizza(new SimpleFactory());
        System.out.println("退出程序");
    }
}
