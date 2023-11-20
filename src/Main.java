import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("1 Server\n2 Client");
        Scanner scanner = new Scanner(System.in);
        switch (scanner.next()){
            case "1":
                Server.startServer();
        break;
            case "2":
                Client.myClient();
        break;
        }
    }
}