import java.util.Scanner;
import java.io.*;
import java.net.*;
public class Main {
    static Socket clientSocket;
    public static void main(String[] args) {
        System.out.println("1 TicTacToe \n2 Client");
        Scanner scanner = new Scanner(System.in);
        switch (scanner.next()) {
            case "1":
                try {
                    ServerSocket serverSocket = new ServerSocket(69);
                    System.out.println("Servidor aguardando conexões...");
                    while (true) {
                        clientSocket = serverSocket.accept();
                        System.out.println("Cliente conectado: " + clientSocket.getInetAddress().getHostAddress());
                        new Thread(() -> Server.handleClient(clientSocket)).start();
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }

                TicTacToe field = new TicTacToe();
                field.setGameBoard();
                while (!field.checkWinner()) {
                    field.printGameBoard();
                    String localMove = Client.myClient(scanner.next());
                    field.localPlay(localMove);
                    field.printGameBoard();
                    String onlineMove = Server.handleClient(clientSocket);
                    field.onlinePlay(onlineMove);
                }
                Client.closeConnection();

                break;
           /* case "2":
                TicTacToe field1 = new TicTacToe();
                field1.setGameBoard();
                while (!field1.checkWinner()){
                    field.printGameBoard();
                    String onlineMove = Server.handleClient(clientSocket);
                    field.onlinePlay(onlineMove);
                    field.printGameBoard();
                    String localMove = Client.myClient(scanner.next());
                    field.localPlay(localMove);
                }
        break;*/
        }
    }
}