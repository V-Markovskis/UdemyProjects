import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try (FileOutputStream binFile = new FileOutputStream("data.dat");
            FileChannel binChannel = binFile.getChannel()) {

            byte[] outputBytes = "Hello world!".getBytes();
            //wrap() method resets position to zero by himself
            ByteBuffer buffer = ByteBuffer.wrap(outputBytes);
            int numBytes = binChannel.write(buffer);
            System.out.println("numBytes written was: " + numBytes);

            //So we're calling the byte buffer.allocate method, and we're
            //passing to it the size that we want the buffer to be, which in this
            //case is because we mentioned we want to write an integer
            //this is the number of bytes in an integer.
            ByteBuffer intBuffer = ByteBuffer.allocate(Integer.BYTES);
            //When you created the buffer, the position of
            //the buffer was set to zero.
            //Now when you call the put int method on line 35 here, we wrote
            //the int into the buffer, which changed the buffer's position.
            //Now when the bin channel.write method, which we're using on the
            //next line, line 38 goes to read the buffer's contents, it'll start
            //the read at the buffer's position.
            intBuffer.putInt(245);
            //to reset position to zero
            intBuffer.flip();
            numBytes = binChannel.write(intBuffer);
            System.out.println("numBytes written was: " + numBytes);

            intBuffer.flip();
            intBuffer.putInt(-98765);
            intBuffer.flip();
            numBytes = binChannel.write(intBuffer);
            System.out.println("numBytes written was: " + numBytes);

            RandomAccessFile ra = new RandomAccessFile("data.dat", "rwd");
            FileChannel channel = ra.getChannel();
            // So we've actually changed the buffer in memory
            outputBytes[0] = 'a';
            outputBytes[1] = 'b';
            buffer.flip();
            //Thus after channel.read(buffer) the output is "Hello World" which we read from data.dat.
            long numBytesRead = channel.read(buffer);
            if(buffer.hasArray()) {
                System.out.println("byte buffer = " + new String(buffer.array()));
            }

            intBuffer.flip();
            //Считывает последовательность байтов из этого канала в заданный буфер.
            numBytesRead = channel.read(intBuffer);
            intBuffer.flip();
            System.out.println(intBuffer.getInt());
            intBuffer.flip();
            numBytesRead = channel.read(intBuffer);
            intBuffer.flip();
            System.out.println(intBuffer.getInt());
            channel.close();
            ra.close();


//            System.out.println("outputBytes = " + new String(outputBytes));

//            RandomAccessFile ra = new RandomAccessFile("data.dat", "rwd");
//            //we're going to define a new byte array that's going to contain
//            //the data we're reading
//            byte[] b = new byte[outputBytes.length];
//            ra.read(b);
//            System.out.println(new String(b));

//            long int1 = ra.readInt();
//            long int2 = ra.readInt();
//            System.out.println(int1);
//            System.out.println(int2);


//            //create the file input stream
//            FileInputStream file = new FileInputStream("data.txt");
//            //calling the channel method to get a file channel
//            FileChannel channel = file.getChannel();

//            Path dataPath = FileSystems.getDefault().getPath("data.txt");
//            // code to write some data to that file.
//            Files.write(dataPath, "\nLine 5".getBytes("UTF-8"), StandardOpenOption.APPEND);
//            List<String> lines = Files.readAllLines(dataPath);
//            for(String line: lines) {
//                System.out.println(line);
//            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}