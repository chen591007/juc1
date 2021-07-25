package 设计模式.工厂模式.简单工厂.披萨店.披萨;

public class GreekPizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("给希腊披萨制作准备原材料");
    }
}
