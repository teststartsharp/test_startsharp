package is.serenity.demo.utils;

public class Waits {

    public void waitSeconds(int seconds){
        try{
            Thread.sleep((long)(seconds * 1000));
        }catch (InterruptedException var3){
            var3.printStackTrace();
        }

    }
}
