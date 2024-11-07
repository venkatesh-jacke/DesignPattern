package Singleton.Example2;

import Singleton.Example1.Singleton;

import java.io.*;

public class SingletonSerialized {
    public static void main(String[] args) throws Exception {
        Singleton serializeObject= Singleton.getInstance();
        ObjectOutput output= new ObjectOutputStream(new FileOutputStream("D:\\DesignPattern\\src\\Singleton\\Example2\\serialize.ser"));
        output.writeObject(serializeObject);
        output.close();

        ObjectInput input= new ObjectInputStream(new FileInputStream("D:\\DesignPattern\\src\\Singleton\\Example2\\serialize.ser"));
        Singleton deSerializeObject= (Singleton) input.readObject();
        input.close();


        System.out.println(serializeObject.hashCode());
        System.out.println(deSerializeObject.hashCode());
    }
}
