package 设计模式.原型模式.deepclone;

public class Clien {
    public static void main(String[] args) throws CloneNotSupportedException {
        DeepProtoType p=new DeepProtoType();
        p.name="松江";
        p.deepCloneableTarget=new DeepCloneableTarget("大牛","大牛的类");
        //方式1 完成深拷贝
        /*
        DeepProtoType p2= (DeepProtoType) p.clone();
        System.out.println("p.name="+p.name+"p.deepCloneableTarget="+p.deepCloneableTarget);
        System.out.println("p2.name="+p2.name+"p2.deepCloneableTarget="+p2.deepCloneableTarget);
         */


        //方式2完成深拷贝
        DeepProtoType p2= (DeepProtoType) p.deepClone();
        System.out.println("p.name="+p.name+"p.deepCloneableTarget="+p.deepCloneableTarget);
        System.out.println("p2.name="+p2.name+"p2.deepCloneableTarget="+p2.deepCloneableTarget);

    }
}






















