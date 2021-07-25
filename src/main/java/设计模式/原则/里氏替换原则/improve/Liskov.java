package 设计模式.原则.里氏替换原则.improve;

public class Liskov {
    public static void main(String[] args) {
        A a=new A();
        System.out.println("11-3="+a.func1(11,3));
        System.out.println("-----------------------");
        B b=new B();
        //因为B类不再继承A类，因此调用者不会在认为fun1是求减法了
        //调用完成的功能很明确了
        System.out.println("11+3="+b.func1(11,3));//以为调用的是父类的fun1实际上是子类的
        System.out.println("11+3+8="+b.func2(11,3));
    }

}


//创建一个更加基础的基类
class Base{
    //把更加基础的方法和成员写入Base类中
    //让A类继承Base类

}


//A类
class A extends Base{
    //返回两个数的差
    public int func1(int num1,int num2){
        return num1-num2;
    }
}

//B类继承了A类
//增加了一个新的功能：完成两个数相加然后和8求和
class B extends Base {
    //如果B要使用A类方法，使用组合的关系
    private A a =new A();


    public int func1(int a,int b){
        return a+b;
    }
    public int func2(int a,int b){
        return func1(a,b)+8;
    }

    //加入仍然想使用A的方法
    public int func3(int a,int b){
        return this.a.func1(a,b);
    }
}









