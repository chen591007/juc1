package 设计模式.组合模式;

import java.util.ArrayList;

public class Folder extends File {

    ArrayList<File> files=new ArrayList<>();

    public Folder(String name) {
        super(name);
    }

    @Override
    public String getName() {
        return this.name;
    }

    public void add(File file){
        files.add(file);
        System.out.println(this.name+"要添加"+file.name+"成功");
    }

    public void delete(File file){
        files.remove(file);
    }

}
