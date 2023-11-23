import java.io.*;
import java.net.*;
public class Server {
    public static String handleClient(Socket clientSocket) {
        try {
            DataInputStream din = new DataInputStream(clientSocket.getInputStream());
            while (true) {
                String receivedMessage = din.readUTF();
                return receivedMessage;

            }
            System.out.println("Cliente desconectado: " + clientSocket.getInetAddress().getHostAddress());
            clientSocket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }}
