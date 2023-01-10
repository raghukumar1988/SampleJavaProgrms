
package designPatterns.singleton.breakers.deserializer;

import designPatterns.singleton.breakers.deserializer.SerializedSingleton;

import java.io.*;

public class SingletonSerializedTest {

    public static void main(String[] args) throws  IOException, ClassNotFoundException {
        SerializedSingleton instanceOne = SerializedSingleton.getInstance();
        ObjectOutput out = new ObjectOutputStream(new FileOutputStream(
                "filename.ser"));
        out.writeObject(instanceOne);
        out.close();
        
        //deserailize from file to object
        ObjectInput in = new ObjectInputStream(new FileInputStream(
                "filename.ser"));
        SerializedSingleton instanceTwo = (SerializedSingleton) in.readObject();
        in.close();

        // Run again after enabling readResolve()
        System.out.println("instanceOne hashCode="+instanceOne.hashCode());
        System.out.println("instanceTwo hashCode="+instanceTwo.hashCode());
        
    }

}

/* Without readResolve method, the deserialization will create a new instance which breaks singelton. */
