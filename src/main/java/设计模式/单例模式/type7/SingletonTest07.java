package 设计模式.单例模式.type7;
/*
* 枚举实现单例模式
* */
public class SingletonTest07 {
    public static void main(String[] args) {
        Singleton instance=Singleton.INSTANCE;
        Singleton instance2=Singleton.INSTANCE;
        System.out.println(instance==instance2);
    }
}




enum Singleton{
    INSTANCE;//属性
    public void sayOK(){
        System.out.println("OK~");
    }
}