/*
* 反射通过配置文件，运行指定的类和方法
* 配置文件写运行类，运行方法
* 读取配置文件，获取键值对
* 类名，方法名，交给反射运行
* */


import java.io.FileInputStream;
import java.lang.reflect.Method;
import java.util.Properties;

public class main {
    public static void main(String[] args)throws Exception{
        //创建集合对象
        Properties pro = new Properties();
        //创建IO流，读取配置文件
        FileInputStream fis = new FileInputStream("E:\\WorkPlace\\Button\\config.txt");
        //集合方法load 读取到键值对时，存储到集合
        pro.load(fis);
        fis.close();
        System.out.println(pro);
        String className = pro.getProperty("className");
        String methodName = pro.getProperty("methodName");

        //获取指定类的class文件对象
        Class c = Class.forName(className);
        Object o = c.newInstance();
        //通过字节码文件对象Class类，获取指定方法
        Method m = c.getMethod(methodName);
        //运行方法
        m.invoke(o);

    }
}
