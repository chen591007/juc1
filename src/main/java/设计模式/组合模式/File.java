package 设计模式.组合模式;

public abstract class File {
    String name;

    public File(String name) {
        this.name = name;
    }
    public abstract String getName();
}
