import java.io.*;
import java.net.*;
public class Client {

    static public void myClient(){
        try {
            Socket s = new Socket("192.168.3.139", 3333);
            DataInputStream din = new DataInputStream(s.getInputStream());
            DataOutputStream dout = new DataOutputStream(s.getOutputStream());
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            String str = "", str2 = "";
            while (!str.equals("stop")) {
                str = br.readLine();
                dout.writeUTF(str);
                dout.flush();
                str2 = din.readUTF();
                System.out.println("Server says: " + str2);
            }

            dout.close();
            s.close();
        }catch (IOException e){
            System.out.println("Damn");
        }
    }
    }

