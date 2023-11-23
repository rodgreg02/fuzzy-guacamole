import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("1 TicTacToe \n2 Client");
        Scanner scanner = new Scanner(System.in);
        switch (scanner.next()){
            case "1":
                TicTacToe field = new TicTacToe();
                field.setGameBoard();
                field.printGameBoard();
                while (!field.checkWinner()){
                    field.printGameBoard();
                    String localMove = Client.myClient();
                    field.localPlay(localMove);
                    field.printGameBoard();
                    String onlineMove = Server.startServer();
                    field.onlinePlay(onlineMove);
                }

        break;
            case "2":
                TicTacToe field1 = new TicTacToe();
                field1.setGameBoard();
                while (!field1.checkWinner()){
                    field1.printGameBoard();
                    String onlineMove = Server.startServer();
                    field1.onlinePlay(onlineMove);
                    field1.printGameBoard();
                    String localMove = Client.myClient();
                    field1.localPlay(localMove);
                }
        break;
        }
    }
}