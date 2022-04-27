package home;

public class EagerInitializedSingleton{

        static{
            
            MyUtils.log("EAGERINIT STATIC BLOCK","static block started");
            
        }

    private static final EagerInitializedSingleton instance =new EagerInitializedSingleton();

    private EagerInitializedSingleton(){

            MyUtils.log("EAGERINIT CONSTRUCTOR BLOCK","constructor called");
        
    }

    public void useInstance(){
        System.out.println("instance is being used ");
    }
    public static EagerInitializedSingleton getInstance(){
        // MyUtils.log("EAGER INIT GETTING INSTANCE","instance returned with " );
        return instance;
    }

}