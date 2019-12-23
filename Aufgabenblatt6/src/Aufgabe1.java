/*
    Aufgabe 1) Zweidimensionale Arrays und Rekursion - TicTacToe
*/
import java.awt.*;

public class Aufgabe1 {
    public static void main(String[] args) {

        int size = 600;
        StdDraw.setCanvasSize(size, size);
        StdDraw.setXscale(0,size);
        StdDraw.setYscale(0,size);
        StdDraw.setPenRadius(0.002);
        
        char[][] gameBoard = new char[][]{
                {' ', ' ', ' '},
                {' ', ' ', ' '},
                {' ', ' ', ' '}
        };
        
        boolean twoPlayer = false; //true -> human vs. human - false -> human vs. computer
        boolean player = true; //true -> human - false -> computer
        int maxDepth = 3;
        
        //*********************************************************************
        // TODO: Implementieren Sie hier Ihre Lösung für main
        //*********************************************************************
        
    }
    
    private static int[] minimax(char[][] gameBoard, boolean player, int depth) {
        // TODO: Implementieren Sie hier Ihre Lösung für die Methode
        return null; //Zeile kann geändert oder entfernt werden.
    }
    
    private static boolean checkIfFull(char[][] gameBoard) {
        // TODO: Implementieren Sie hier Ihre Lösung für die Methode
        return false; //Zeile kann geändert oder entfernt werden.
    }
    
    private static boolean checkIfWinner(char[][] gameBoard, boolean player) {
        // TODO: Implementieren Sie hier Ihre Lösung für die Methode
        return false; //Zeile kann geändert oder entfernt werden.
    }
    
    private static void drawGameBoard(char[][] gameBoard, int size) {
        // TODO: Implementieren Sie hier Ihre Lösung für die Methode
    }
    
}




