package home;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class TestEi {
    
    public static void main(String[] args){

        //ONLY ISSUE IS THIS DOES NOT HANDLE EXCEPTION

        //TEST EAGER INITIALIZE INSTANCE
        EagerInitializedSingleton instance1= EagerInitializedSingleton.getInstance();
         EagerInitializedSingleton instance2=EagerInitializedSingleton.getInstance();
        MyUtils.log("EAGERINIT instance1 hash code", String.valueOf(instance1.hashCode()));
        MyUtils.log("EAGERINIT instance2 hash code",String.valueOf(instance2.hashCode()));


            //TEST STATIC BLOCK INITIALIZED SINGLETON
        MyUtils.log("main ","creating instances of static block singleton");
        try{

            StaticBlockInitializedInstance sb_instance1=StaticBlockInitializedInstance.getInstance();
            StaticBlockInitializedInstance sb_instance2=StaticBlockInitializedInstance.getInstance();
            MyUtils.log("STATIC BLOCK instance", String.valueOf(sb_instance1.hashCode()));
            MyUtils.log("Static BLOCK instanc2", String.valueOf(sb_instance2.hashCode()));
        }catch(Exception e)
        {
            MyUtils.log("STATIC BLOCK instance creation failure", e.getMessage());
            
            e.printStackTrace();
        
        }

        //TEST LAZY INIT SINGLETON

        LazyInit lazy_instance=LazyInit.getInstance();
        LazyInit lazy_instance2=LazyInit.getInstance();
        MyUtils.log("LAZY INIT instance 1",String.valueOf(lazy_instance.hashCode()));
        MyUtils.log("LAZY INIT instance 2",String.valueOf(lazy_instance2.hashCode()));


        //TEST THREAD SAFE SINGLETON

        Thread t1=new Thread(new Runnable() {
            @Override
            public void run() {
               ThreadSafeSingleton instance=ThreadSafeSingleton.getInstance();
                
            }
        });
        t1.setPriority(10);
       

        Thread t2=new Thread(new Runnable() {
            @Override
            public void run() {
               ThreadSafeSingleton instance=ThreadSafeSingleton.getInstance();
                
            }
        });

        t2.setPriority(9);
        
        try{
        t1.start();
        t2.start();
        }catch(Exception e){
            MyUtils.log("Thread interruption", e.getMessage());
        }

            // TEST BILL PUGH SINGLETON


        BillPughSingleton bp_instanc1=BillPughSingleton.getInstance();
           
        BillPughSingleton bp_instance2=BillPughSingleton.getInstance();

    }


        
    
    

}
