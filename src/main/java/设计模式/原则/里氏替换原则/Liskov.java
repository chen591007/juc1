package 设计模式.原则.里氏替换原则;

public class Liskov {
    public static void main(String[] args) {
        A a=new A();
        System.out.println("11-3="+a.func1(11,3));
        System.out.println("-----------------------");
        B b=new B();
        System.out.println("11-3="+b.func1(11,3));//以为调用的是父类的fun1实际上是子类的
        System.out.println("11+3+8="+b.func2(11,3));
    }

}
//A类
class A{
    //返回两个数的差
    public int func1(int num1,int num2){
        return num1-num2;
    }
}
//B类继承了A类
//增加了一个新的功能：完成两个数相加然后和8求和
class B extends A{
    public int func1(int a,int b){
        return a+b;
    }
    public int func2(int a,int b){
        return func1(a,b)+8;
    }
}









