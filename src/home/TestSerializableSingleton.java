package home;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

public class TestSerializableSingleton {

    public static void main(String[] args) throws FileNotFoundException,IOException,ClassNotFoundException{

        

        //INSTANCE 
        SerializableSingleton instance_1=SerializableSingleton.getInstance();
        // instance_1.enableResolve(true);
                    //SERIALIZATION OF INSTANCE
        ObjectOutput out=new ObjectOutputStream(new FileOutputStream("ins1.ser"));
        
        out.writeObject(instance_1);
        out.close();

                //DESERIALIZATION

                ObjectInput in=new ObjectInputStream(new FileInputStream("ins1.ser"));
                SerializableSingleton instance_2=(SerializableSingleton)in.readObject();
                in.close();

                MyUtils.log("SERIALIZABLE INSTANCE 1 HASH CODE",String.valueOf(instance_1.hashCode()));
                MyUtils.log("SERIALIZABLE INSTANCE 2 HASH CODE",String.valueOf(instance_2.hashCode()));


    }
    
    
}
