package 设计模式.原则.依赖倒置原则.improve;

public class DependencyInversion {
    public static void main(String[] args) {
        Person person=new Person();
        person.receive(new Email());
    }
}

//定义一个接口
interface IRecevier{
    public String getInfo();
}


class Email implements IRecevier{
    public String getInfo(){
        return "电子邮件信息: hello,world";
    }
}


class WeiXin implements IRecevier{
    public String getInfo(){
        return "微信信息: hello,world";
    }
}


class Person{
    //这边我们是依赖接口的所以不需要改动
    public void receive(IRecevier iRecevier){
        System.out.println(iRecevier.getInfo());
    }
}













