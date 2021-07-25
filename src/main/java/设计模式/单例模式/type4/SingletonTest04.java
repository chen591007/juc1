package 设计模式.单例模式.type4;
/*解决了线程不安全问题
* 但是效率太低了，每个线程在获取类的实例时候，都指向getInstance方法
* 进行线程同步，其实这个方法只执行一次示例代码就够了，所以不推荐使用
* */


public class SingletonTest04 {
    public static void main(String[] args) {
        System.out.println("懒汉式2：线程安全");
        Singleton instance1= Singleton.getInstance();
        Singleton instance2= Singleton.getInstance();
        System.out.println(instance1==instance2);
    }
}

class Singleton{
    private static Singleton instance;
    private Singleton(){

    }
    //提供一个静态共有方法，当使用该方法时候，才创建instance
    //即懒汉式
    //该方式只是在方法前加了synchronized
    public static synchronized Singleton getInstance(){
        if(instance==null)
            instance=new Singleton();
        return instance;
    }

}































