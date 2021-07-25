package 设计模式.组合模式;


public class Client {
    public static void main(String[] args) {
        Folder f1=new Folder("f1");
        Folder f2=new Folder("f2");
        NormalFile f3=new NormalFile("f3");
        NormalFile f4=new NormalFile("f4");
        f1.add(f2);
        f1.add(f3);
        f2.add(f4);

    }
}
