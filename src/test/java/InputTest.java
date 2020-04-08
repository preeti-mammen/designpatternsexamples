import HeadFirstDecoratorPattern.LowerCaseInputStream;

import java.io.*;

public class InputTest {
    public static void main(String args[]){
        int c;
        try{
            InputStream in = new LowerCaseInputStream(new BufferedInputStream(new FileInputStream("src/test/java/text.txt")));

            while((c=in.read())>=0){
                System.out.print((char)c);
            }
            in.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
