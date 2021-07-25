package 设计模式.单例模式.type3;

/*起到了懒加载的效果，但是只能在单线程的时候使用
*多线程情况下，如果一个线程进入了if(singleton==null)判断语句块
*还未来得及往下执行，另一个线程也通过了判断该语句，便会产生多个实例
*所以是线程不安全
* */

public class SingletonTest03 {
    public static void main(String[] args) {
        System.out.println("懒汉式1：线程不安全");
        Singleton instance1=Singleton.getInstance();
        Singleton instance2=Singleton.getInstance();
        System.out.println(instance1==instance2);
    }
}

class Singleton{
    private static Singleton instance;
    private Singleton(){

    }
    //提供一个静态共有方法，当使用该方法时候，才创建instance
    //即懒汉式
    public static Singleton getInstance(){
        if(instance==null)
            instance=new Singleton();
        return instance;
    }

}































