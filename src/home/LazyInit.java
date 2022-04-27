package home;

public class LazyInit {
        private static LazyInit instance;
        private LazyInit(){
            MyUtils.log("LAZY INIT CONSTRUCTOR", "constructor called");

        }
        public static LazyInit getInstance(){
            if(instance==null){
                instance=new LazyInit();
            }
            return instance;
        }
}
