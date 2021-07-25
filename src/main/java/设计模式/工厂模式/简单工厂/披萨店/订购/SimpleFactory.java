package 设计模式.工厂模式.简单工厂.披萨店.订购;

import 设计模式.工厂模式.简单工厂.披萨店.披萨.CheesePizza;
import 设计模式.工厂模式.简单工厂.披萨店.披萨.GreekPizza;
import 设计模式.工厂模式.简单工厂.披萨店.披萨.Pizza;

//简单工厂类
public class SimpleFactory {
    //根据orderType返回对应的披萨实例
    public Pizza createPizza(String orderType){
        Pizza pizza = null;
        System.out.println("使用简单工厂模式");
        if (orderType.equals("greek")) {
                pizza = new GreekPizza();
                pizza.setName("希腊披萨");
            } else if ((orderType.equals("cheese"))) {
                pizza = new CheesePizza();
                pizza.setName("奶酪披萨");
            }
        return pizza;



    }
}


















