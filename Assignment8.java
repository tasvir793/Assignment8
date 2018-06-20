Que:1 Make a program of File Reader?
Ans:1

package FileRead;
import java.io.*;
public class FileRead;
public static void main(String[] args) {
        File kst=new File("C:\\Users\\Kamal\\Desktop\\NewFolder\\kst.text");
      FileInputStream input;
        try
        {
       input =new FileInputStream(kst);
            int c;
            while ((c=input.read())!=-1) 
            {
                System.out.print(""+(char)c);
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
       }
}
