package Arrays;/*
> Stream is abstraction and can be thought of as a flow of data from source to sink.
> Source or input stream initiate the flow of data.
> Sink or output stream terminates the flow of data.
> There is no concept of indexing like array in stream.
> Two types of stream in Java we have : Byte and Character stream.
 */

import java.io.*;

public class p025_JavaIO {
    public static void main(String[] args) {
        try {
            int size = 0, i = 0;
            byte[] arr = new byte[256];

            InputStream in = new FileInputStream("/Users/jak/Simply/workspace/src/inputFile.txt");
            OutputStream out = new FileOutputStream("/Users/jak/Simply/workspace/src/inputFile2.txt");
            while ((i = in.read(arr)) != -1) {
                size++;
                out.write(arr,0,i);
            }

            in.close();
            System.out.println("The size of array is :" + size);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
