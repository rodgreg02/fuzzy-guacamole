import java.io.*;
import java.net.*;

public class Server {

    static public void startServer(){
        try {
            ServerSocket ss = new ServerSocket(6666);
            Socket s = ss.accept();
            DataInputStream dis=new DataInputStream(s.getInputStream());
            String  str=(String)dis.readUTF();
            System.out.println("message= "+str);
            ss.close();
        }catch (IOException e){
            System.out.println("WREEEEEEE");
        }
    }
}

