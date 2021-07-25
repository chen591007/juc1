package 设计模式.组合模式;

public class NormalFile extends File {
    public NormalFile(String name) {
        super(name);
    }

    @Override
    public String getName() {
        return this.name;
    }
}
