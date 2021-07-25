package 设计模式.原型模式.deepclone;

import java.io.*;

public class DeepProtoType implements Serializable,Cloneable {
    public String name;  //String属性
    public DeepCloneableTarget deepCloneableTarget; //引用属性

    public DeepProtoType() {
    }

    //完成深拷贝实现

    //方式1：使用clone()方法

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Object deep=null;
        //这里完成对基本数据类型(属性)和String的克隆 基本数据类型处理！
        deep = super.clone();
        //对引用类型的属性进行单独处理 如果引用数据类型很多这种方式很不方便
        DeepProtoType deepProtoType=(DeepProtoType)deep;
        deepProtoType.deepCloneableTarget= (DeepCloneableTarget) deepCloneableTarget.clone();
        return deepProtoType;
    }

    //深拷贝方式2：通过对象的序列化实现(推荐)
    public Object deepClone(){
        //创建流对象
        ByteArrayOutputStream bos=null;
        ObjectOutput oos=null;
        ByteArrayInputStream bis=null;
        ObjectInputStream ois=null;
        try {
            //序列化
            bos=new ByteArrayOutputStream();
            oos=new ObjectOutputStream(bos);
            oos.writeObject(this);//当前这个对象以对象流方式输出

            //反序列化
            bis=new ByteArrayInputStream(bos.toByteArray());
            ois=new ObjectInputStream(bis);
            DeepProtoType copyObj= (DeepProtoType) ois.readObject();
            return copyObj;
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }finally {
            //关闭流
            try{
                bos.close();
                oos.close();
                bis.close();
                ois.close();
            }catch (IOException e) {
                e.printStackTrace();
            }
        }
    }



}
























