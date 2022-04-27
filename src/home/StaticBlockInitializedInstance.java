package home;

public class StaticBlockInitializedInstance {

    private static StaticBlockInitializedInstance instance;
    private StaticBlockInitializedInstance(){
        MyUtils.log("STATIC INIT CONSTRUCTOR","constructor called");
    }
    static{

        MyUtils.log("STATIC INIT STATIC BLOCK", "static block called");
        try{
                instance=new StaticBlockInitializedInstance();
        }catch(Exception e){
            throw new RuntimeException("Exception occured while creating instance ");
        }
    }

    public static StaticBlockInitializedInstance getInstance(){

        return instance;
    }
    

}
