package 设计模式.工厂模式.简单工厂.披萨店.订购;

import 设计模式.工厂模式.简单工厂.披萨店.披萨.CheesePizza;
import 设计模式.工厂模式.简单工厂.披萨店.披萨.GreekPizza;
import 设计模式.工厂模式.简单工厂.披萨店.披萨.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//普通的方法
public class OrderPizza {
    //构造器

    public OrderPizza(SimpleFactory simpleFactory){
        setSimpleFactory(simpleFactory);
    }












    /*
    public String OrderPizza() {

        Pizza pizza = null;
        String orderType;//订购披萨的类型
        do {
            orderType = gettype();
            if (orderType.equals("greek")) {
                pizza = new GreekPizza();
                pizza.setName("希腊披萨");
            } else if ((orderType.equals("cheese"))) {
                pizza = new CheesePizza();
                pizza.setName("奶酪披萨");
            }
            else
                break;
            //输出披萨的制作过程
            pizza.prepare();
            pizza.bake();
            pizza.cut();
            pizza.box();


        } while (true);
    }
*/
    //定义一个简单工厂对象
    SimpleFactory simpleFactory;
    Pizza pizza=null;
    public void setSimpleFactory(SimpleFactory simpleFactory){
        String orderType="";//用户输入
        this.simpleFactory=simpleFactory;//设置一个简单工厂对象
        do{
            orderType=gettype();
            pizza=this.simpleFactory.createPizza(orderType);
            //输出披萨的信息
            if(pizza!=null){//订购成功
                pizza.prepare();
                pizza.bake();
                pizza.cut();
                pizza.box();
            }else
                System.out.println("没有这个披萨");
        }while(true);
    }










    //写一个方法动态地获取客户需要披萨的种类
    private String gettype() {
        try {
            //用户自己输入想要获取的披萨
            BufferedReader strin = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("input pizza 种类:");
            String str = strin.readLine();
            return str;
        } catch (IOException e) {
            e.printStackTrace();
            return "";
        }

    }
}



















