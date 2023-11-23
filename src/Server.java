import java.io.*;
import java.net.*;
public class Server {
    static Socket clientSocket;
    static String receivedMessage;
     static {
         try {
             ServerSocket serverSocket = new ServerSocket(69);
             Socket clientSocket = serverSocket.accept();
             System.out.println("Servidor aguardando conexões...");
             while (true) {
                 clientSocket = serverSocket.accept();
                 System.out.println("Cliente conectado: " + clientSocket.getInetAddress().getHostAddress());
                 DataInputStream din = new DataInputStream(clientSocket.getInputStream());
                 receivedMessage = din.readUTF();

             }
         } catch (IOException e) {
             e.printStackTrace();
         }
     }
    }
