package 设计模式.工厂模式.简单工厂.披萨店.披萨;

public class CheesePizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("给奶酪披萨制作准备原材料");
    }
}
