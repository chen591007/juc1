package 设计模式.单例模式.type1;
/*类装载的时候就完成了实例化，避免了线程同步的问题
* 但是在类装载的时候就完成实例化，没有达到懒加载的效果
* 如果至始至终未用到这个实例，会造成内存的浪费
*
*
* */


//饿汉式（静态变量）
public class SingletonTest01 {
    public static void main(String[] args) {
        Singleton instance=Singleton.getInstance();
        Singleton instance2=Singleton.getInstance();
        System.out.println(instance==instance2);//true
    }
}


class Singleton{
    //1.构造器私有化 外部不能new
    private Singleton(){

    }
    //2.本类内部创建一个对象实例
    private final static Singleton instance=new Singleton();

    //3.对外提供一个共有方法返回实例对象
    public static Singleton getInstance(){
        return instance;
    }
}






















