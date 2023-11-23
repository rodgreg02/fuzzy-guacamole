import java.util.Scanner;
import java.io.*;
import java.net.*;
public class Main {

    public static void main(String[] args) {
        System.out.println("1 TicTacToe \n2 Client");
        Scanner scanner = new Scanner(System.in);
        switch (scanner.next()) {
            case "1":


                TicTacToe field = new TicTacToe();
                field.setGameBoard();
                while (!field.checkWinner()) {
                    field.printGameBoard();
                    String localMove = Client.myClient(scanner.next());
                    field.localPlay(localMove);
                    field.printGameBoard();
                    String onlineMove = Server.receivedMessage;
                    field.onlinePlay(onlineMove);
                }
                Client.closeConnection();

                break;
            case "2":
                TicTacToe field1 = new TicTacToe();
                field1.setGameBoard();
                while (!field1.checkWinner()){
                    field.printGameBoard();
                    String onlineMove = Server.receivedMessage;
                    field.onlinePlay(onlineMove);
                    field.printGameBoard();
                    String localMove = Client.myClient(scanner.next());
                    field.localPlay(localMove);
                }
        break;
        }
    }
}