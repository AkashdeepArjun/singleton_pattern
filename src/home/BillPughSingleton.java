package home;
public class BillPughSingleton{

    private BillPughSingleton(){
        MyUtils.log("BILL PUGH SINGLETON", "Constructor loaded");
    }
    private static class SingletonHelper{
        private static final BillPughSingleton instance=new BillPughSingleton();
    }
    public static BillPughSingleton getInstance(){
        MyUtils.log("BILL PUGH SINGLETON", "instance returned with hash code "+String.valueOf(SingletonHelper.instance.hashCode()));
        return SingletonHelper.instance;

    }

}