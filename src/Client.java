import java.io.*;
import java.net.*;
import java.util.Scanner;
public class Client {
    private static Socket socket;
    private static DataOutputStream dout;
    static {
        try {
            // Inicialize a conexão do socket uma vez durante a inicialização da classe
            socket = new Socket("192.168.43.153", 69);
            dout = new DataOutputStream(socket.getOutputStream());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    static public String myClient(String move) {
        try {
            // Envie a mensagem
            dout.writeUTF(move);
            dout.flush();

            return move;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    // Feche a conexão do socket quando não for mais necessária
    static public void closeConnection() {
        try {
            if (dout != null) {
                dout.close();
            }
            if (socket != null) {
                socket.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}