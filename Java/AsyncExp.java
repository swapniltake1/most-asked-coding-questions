package Java;

import java.util.concurrent.CompletableFuture;

public class AsyncExp {
    
    static String fetchData(String from){

        try {

            Thread.sleep(2000);

        } catch (Exception e) {
            
            e.printStackTrace();
        }

        return " Data Comming From :"+from;
    }

    public static void main(String[] args) {
        
        // Fetching data from two diffrent sources

      CompletableFuture<String> data1 =  CompletableFuture.supplyAsync(()-> fetchData("Wifi 1 5G"));
      CompletableFuture<String> data2 =  CompletableFuture.supplyAsync(()-> fetchData("Wifi 2 JioFiber"));

      CompletableFuture<Void> runAtOneTime = CompletableFuture.allOf(data1, data2);

      runAtOneTime.thenRun(()-> {

        try {

            String dataDevice1 = data1.join();    // 
            String dataDevice2 = data2.join();

            System.out.println("DataDevice1:: "+dataDevice1);
             System.out.println("DataDevice2:: "+dataDevice2);

        } catch (Exception e) {

            e.printStackTrace();

        }

      });

      System.out.println("Completing other tasks till getting data devices ::::::");

      try {

        Thread.sleep(5000);  // waiting for completing asynchronous tasks 

      } catch (Exception e) {

        e.printStackTrace();

      }
      

    }
    
}
