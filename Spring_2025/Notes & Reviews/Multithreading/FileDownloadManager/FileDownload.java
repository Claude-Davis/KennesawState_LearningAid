public class FileDownload extends Thread{
    public String fileName;
    public static int percentage=0;

    public FileDownload(String fileName){
        this.fileName = fileName;
    }

    @Override
    public void run(){
        while(percentage <0.1){
            try{
                Thread.sleep(5000);
                percentage+=0.10;
    
                while (percentage <= 0.1){
                    System.out.println((percentage * 100) + "% complete");
                }
            } catch (InterruptedException e){
                System.out.println("Download interrupted: " + e.getMessage());
            }
        }
    }

    public String toString(){
        return this.fileName + (percentage*100) + "% dowloded.";
    }
    
}
