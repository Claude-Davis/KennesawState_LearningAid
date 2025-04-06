
import java.util.ArrayList;

public class Driver {
    public static void main (String[] args){
        //ArrayList<FileDownload> list = new ArrayList<>();

        FileDownload file1 = new FileDownload("W2_2022.pdf");
       // FileDownload file2 = new FileDownload("account_statements.pdf");
        //FileDownload file3 = new FileDownload("liscence.docx");

        file1.start();
        //file2.start();
        //file3.start();

        System.out.println("All files dowloaded:");
        /* for (int i=0; i<=list.size(); i++){
            System.out.println((list.get(i)).toString());
        } */
    }
}
