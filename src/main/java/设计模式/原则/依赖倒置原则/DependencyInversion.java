package 设计模式.原则.依赖倒置原则;

public class DependencyInversion {
    public static void main(String[] args) {
        Person person=new Person();
        person.receive(new Email());
    }
}
class Email{
    public String getInfo(){
        return "电子邮件信息: hello,world";
    }
}





//完成Person接受消息的功能

//方式1完成
//在接受消息的时候，直接在这里写了个Email类，就要依赖Email类
//1.简单，容易想到
//2.如果我们获取的对象是微信或者短信获取消息，则这个方案要新增类，同时Person类也要增加相应的
//接收方法
//解决思路：引入一个抽象的接口IRceiver，表示接收者，这样Person和接口发生依赖
//因为Email，WeiXin等等属于接收的范畴，它们各自实现IReceiver接口就可以，这样就符合依赖倒置原则
class Person{
    public void receive(Email email){
        System.out.println(email.getInfo());
    }
}













