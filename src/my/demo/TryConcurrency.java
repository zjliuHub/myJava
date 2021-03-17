package my.demo;

import java.util.concurrent.TimeUnit;

public class TryConcurrency {

    public static void main(String[] args) {
        new Thread(){
            public void run(){
                enjoyMusic();
            }
        }.start();
//        new Thread(TryConcurrency::enjoyMusic).start();
        browseNews();
    }

    private static void browseNews(){
        for(;;){
            System.out.println("browseNews");
            sleep(1);
        }
    }

    private static void enjoyMusic(){
        for(;;){
            System.out.println("enjoyMusic");
            sleep(1);
        }
    }

    private static void sleep(int seconds){
        try{
            TimeUnit.SECONDS.sleep(seconds);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
