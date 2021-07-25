package 设计模式.单例模式.type2;



public class SingletonTest02 {
    public static void main(String[] args) {
        Singleton instance= Singleton.getInstance();
        Singleton instance2= Singleton.getInstance();
        System.out.println(instance==instance2);//true
    }
}






class Singleton{
    //1.构造器私有化 外部不能new
    private Singleton(){

    }
    //2.本类内部创建一个对象实例
    private static Singleton instance;

    static {  //在静态代码块中创建单例对象
        instance=new Singleton();
    }

    //3.对外提供一个共有方法返回实例对象
    public static Singleton getInstance(){
        return instance;
    }
}







