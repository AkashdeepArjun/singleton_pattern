package home;

public class ThreadSafeSingleton {
    private static ThreadSafeSingleton instance;
    private ThreadSafeSingleton(){
        MyUtils.log("THREAD SAFE SINGLETON","constructor called");
    }

    public static synchronized ThreadSafeSingleton getInstance(){
        if(instance==null){
            instance=new ThreadSafeSingleton();
        }
        MyUtils.log("THREAD SAFE SINGLETON","instance returned with hash code "+String.valueOf(instance.hashCode()));
        return instance;
    }
    
}
