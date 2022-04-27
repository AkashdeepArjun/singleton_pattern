package home;

import java.lang.reflect.Constructor;

public class ReflectionSingletonTest {

    public static void main(String[] args){


        EagerInitializedSingleton instance_one=EagerInitializedSingleton.getInstance();
        EagerInitializedSingleton instance_two=null;

        try{
            Constructor[] cons=EagerInitializedSingleton.class.getDeclaredConstructors();
            for(Constructor constructor:cons){
                constructor.setAccessible(true);
                instance_two=(EagerInitializedSingleton)constructor.newInstance();
                break;
            }

        }catch(Exception e){
            e.printStackTrace();
        }
        MyUtils.log("REFLECTION TEST SINGLETON", "instance 1 have hash id "+String.valueOf(instance_one.hashCode()));
        MyUtils.log("REFLECTION TEST SINGLETON", "instance 2 have hash id "+String.valueOf(instance_two.hashCode()));
        
    }
    
    
}
