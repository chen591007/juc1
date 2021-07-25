package 设计模式.单例模式.type6;
/*
* 静态内部类中，当Singleton进行被类装载时候，静态内部类是不会被装载的
*当调用了getInstance方法时候，会让静态内部类装载，仅仅装载一次！
* 并且类装载中线程是安全的
*类的静态属性只有在类的第一次加载后被初始化！所以JVM为我们保证了线程安全性
* 在类初始化时候，别的线程是无法进入的
* */
public class SingletonTest06 {
    public static void main(String[] args) {

    }
}


class Singleton{
    private Singleton(){

    }

    private static class SingletonInstance{
        private static final Singleton INSTANCE=new Singleton();
    }
    public static Singleton getInstance(){
        return SingletonInstance.INSTANCE;
    }


}



















