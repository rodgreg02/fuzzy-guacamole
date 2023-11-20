import java.io.*;
import java.net.*;
public class Client {

    static public void myClient(){
        try{
            Socket s=new Socket("192.168.3.139",6666);
            DataOutputStream dout=new DataOutputStream(s.getOutputStream());
            dout.writeUTF("A tua tia de 4 é bom");
            dout.flush();
            dout.close();
            s.close();

        }catch(Exception e){System.out.println(e);}
    }
    }

