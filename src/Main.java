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
                while (field.checkWinner()){
                    String localMove = Client.myClient();
                    field.localPlay(localMove);
                    String onlineMove = Server.startServer();
                    field.onlinePlay(onlineMove);
                }

        break;
            case "2":

        break;
        }
    }
}