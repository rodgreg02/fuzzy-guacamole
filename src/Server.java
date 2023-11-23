import java.io.*;
import java.net.*;

public class Server {

    static public String startServer(){
        try {
            ServerSocket ss = new ServerSocket(69);
            Socket s = ss.accept();
            DataInputStream dis=new DataInputStream(s.getInputStream());
            String  str=(String)dis.readUTF();
            System.out.println("message= "+str);
            ss.close();
            return str;
        }catch (IOException e){
            System.out.println("WREEEEEEE");
        }
   return null; }
}