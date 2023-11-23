import java.io.*;
import java.net.*;
import java.util.Scanner;

public class Client {

    static public String myClient() {
        try {
            Scanner scanner = new Scanner(System.in);
            String move = scanner.next();
            Socket s = new Socket("192.168.43.153", 69);
            DataOutputStream dout = new DataOutputStream(s.getOutputStream());
            dout.writeUTF(move);
            dout.flush();
            dout.close();
            s.close();
            return move;
        } catch (Exception e) {
            System.out.println(e);
        }
        return null;
    }
}

