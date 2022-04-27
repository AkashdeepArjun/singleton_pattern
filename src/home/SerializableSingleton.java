package home;

import java.io.ObjectStreamException;
import java.io.Serializable;

public class SerializableSingleton implements Serializable{

    private static final long version_id=-7555002223332L;
    private SerializableSingleton(){
        MyUtils.log("SERIALIZABLE SINGLETON", "constructor called");
        
    }
    private static class SingletonHelper{
        private static final SerializableSingleton instance = new SerializableSingleton();
        
    }
    public static SerializableSingleton getInstance(){
        return SingletonHelper.instance;
    }

        
    private Object readResolve() throws ObjectStreamException{
        return this.getInstance();
    }

    // @Override
    // protected Object readResolve() {
    //     super.readResolve();
    //     return getInstance();
    // }
}