package 设计模式.单例模式.type5;
/*双重检测方式
*
* */
public class SingletonTest5 {
    public static void main(String[] args) {

    }
}

class Singleton{
    private static Singleton instance;
    private Singleton(){

    }
    //提供以恶静态的公有方法，加入双重检查代码，解决线程安全问题，同时解决懒加载问题
    public static Singleton getInstance(){
        if(instance==null)
            synchronized (Singleton.class) {
                if (instance == null)
                    instance = new Singleton();
            }
        return instance;
    }
}











