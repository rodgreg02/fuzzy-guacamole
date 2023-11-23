import java.util.Scanner;

public class TicTacToe {
        String[][] gameBoard = new String[3][3];

        public void setGameBoard(){
            for (int i = 0; i < gameBoard.length; i++) {
                for (int j = 0; j < gameBoard[i].length; j++) {
                    gameBoard[i][j] = "-";
                }
            }
        }

        public void printGameBoard(){
            for (int i = 0; i < gameBoard.length; i++) {
                System.out.println("");
                for (int j = 0; j < gameBoard[i].length; j++) {
                    System.out.print(gameBoard[i][j] + " ");
                }
            }
        }

        public boolean checkWinner() {
            if(gameBoard[0][0].equals("X") && gameBoard[0][1].equals("X") && gameBoard[0][2].equals("X") ||
                    gameBoard[0][0].equals("X") && gameBoard[1][1].equals("X") && gameBoard[2][2].equals("X") ||
                    gameBoard[0][0].equals("X") && gameBoard[1][0].equals("X") && gameBoard[2][0].equals("X") ||
                    gameBoard[0][1].equals("X") && gameBoard[1][1].equals("X") && gameBoard[2][1].equals("X")||
                    gameBoard[0][2].equals("X") && gameBoard[1][2].equals("X") && gameBoard[2][2].equals("X") ||
                    gameBoard[0][2].equals("X") && gameBoard[1][1].equals("X") && gameBoard[2][0].equals("X") ||
                    gameBoard[1][0].equals("X") && gameBoard[1][1].equals("X") && gameBoard[1][2].equals("X") ||
                    gameBoard[2][0].equals("X") && gameBoard[2][1].equals("X") && gameBoard[2][2].equals("X")) {
                System.out.println("X ganhou! ");
                return true;
            }

            if(gameBoard[0][0].equals("O") && gameBoard[0][1].equals("O") && gameBoard[0][2].equals("O") ||
                    gameBoard[0][0].equals("O") && gameBoard[1][1].equals("O") && gameBoard[2][2].equals("O") ||
                    gameBoard[0][0].equals("O") && gameBoard[1][0].equals("O") && gameBoard[2][0].equals("O") ||
                    gameBoard[0][1].equals("O") && gameBoard[1][1].equals("O") && gameBoard[2][1].equals("O")||
                    gameBoard[0][2].equals("O") && gameBoard[1][2].equals("O") && gameBoard[2][2].equals("O") ||
                    gameBoard[0][2].equals("O") && gameBoard[1][1].equals("O") && gameBoard[2][0].equals("O") ||
                    gameBoard[1][0].equals("O") && gameBoard[1][1].equals("O") && gameBoard[1][2].equals("O") ||
                    gameBoard[2][0].equals("O") && gameBoard[2][1].equals("O") && gameBoard[2][2].equals("O")) {
                System.out.println("O ganhou! ");
                return true;
            }
            return false;
        }

        public void localPlay(String move){
            String[] actualMove = move.split("");
            gameBoard[Integer.parseInt(actualMove[0])][Integer.parseInt(actualMove[1])] = "O";
        }

        public void onlinePlay(String move){
            String[] actualMove = move.split("");
            gameBoard[Integer.parseInt(actualMove[0])][Integer.parseInt(actualMove[1])] = "X";
        }
    }

