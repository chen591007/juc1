package 设计模式.原型模式;

public class Client {
    public static void main(String[] args) {
        //传统的方法解决
        Sheep sheep=new Sheep("tom",1,"白色");
        Sheep sheep2=new Sheep(sheep.getName(),sheep.getAge(),sheep.getColor());
        Sheep sheep3=new Sheep(sheep.getName(),sheep.getAge(),sheep.getColor());

        //在创建新对象时候总是要获取原始对象属性
        //创建一个就要get一次，需要重新初始化对象
        //而不是动态地获取运行时对象的状态
        System.out.println(sheep);
        System.out.println(sheep2);
        System.out.println(sheep3);
    }

/*Java中的Object类是所有类的根类，Object类提供了clone()方法
* 该方法可以将一个Java对象复制一份，但是要实现clone的Java类必须
* 实现一个Cloneable接口，该接口表示该类能够复制并由复制能力
*
*bean中的scope=prototype是原型模式  其中通过id可以获取bean
* 其中获取到的bean不是同一个对象
* */


/*深拷贝：
* 复制对象的所有基本数据类型的成员变量值
* 为所有引用数据类型的成员变量申请内存空间
* 并且复制每个引用数据类型的成员变量所引用的对象
* 直到该对象可达的所有对象
*
* 深拷贝的实现方式
* 1.通过克隆来实现深拷贝
* 2.通过对象序列化来实现深拷贝
* */





}












