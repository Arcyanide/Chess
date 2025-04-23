import java.util.Scanner;

public class Game {
    static String currentPlayer = "W";
    static Scanner scanner = new Scanner(System.in);
    static Board board = new Board();
    int[] tempMove;
    boolean valMove = true;

    public void startGame() {

        String CurrentMove = "";


        runTurn();
    }


    //ran if move is valid, swaps player, starts next turn
    public void goNext() {
        //changes player
        if (currentPlayer.equals("W")) {
            currentPlayer = "B";
        } else {
            currentPlayer = "W";
        }

        runTurn();

    }

    //run everytime a turn starts, whether or not valid or invalid
    public void runTurn() {
        for (int i = 0; i < 50; i++) {
            System.out.println("");
        }


        board.updateBoard();
        for (int i = 0; i < 3; i++) {
            System.out.println("");
        }

        if (currentPlayer.equals("W")) {
            System.out.println("White");
        }
        if (currentPlayer.equals("B")) {
            System.out.println("Black");
        }
        if (!valMove) {System.out.println("Invalid move, please try again");}
        System.out.print("   Enter your move (Type your moves like A3B4) :");

        String CurrentMove = scanner.nextLine(); //gets input from player

        MakeMove(CurrentMove);
        if (valMove) {
            goNext();
        }
        runTurn();

    }


    //returns piece being moved
    public static Pieces getPiece(String Rawmove) {
        int[] coords = decodeMove(Rawmove);

        //takes old x and old y
        //returns those put into board array for the piece
        Pieces[][] b = board.getBoard();
        return b[coords[1]][coords[0]];

    }

    //returns x1 y1 (coords of piece moving) and x2 y2 (where moving to)
    public static int[] decodeMove(String Rawmove) {

        //converts letters to numbers for our grid, a-0 h-7
        String x1raw = Rawmove.substring(0, 1);
        String x2raw = Rawmove.substring(2, 3);
        int x1 = Character.toLowerCase(x1raw.charAt(0)) - 'a'; //gpt'd this
        int x2 = Character.toLowerCase(x2raw.charAt(0)) - 'a';

        //extracts y's
        // - 1 to go from 1-8 to 0-7
        int y1 = Integer.parseInt(Rawmove.substring(1, 2))-1;
        int y2 = Integer.parseInt(Rawmove.substring(3, 4))-1;


        int[] coords = new int[4];
        coords[0] = x1;
        coords[1] = y1;
        coords[2] = x2;
        coords[3] = y2;

//        //makes sure inputs exist on the board
        // NO LONGER NEEDED AS THIS CHECK IS INSIDE ISVALIDMOVE
//        if (x1 < 0 || x1 > 8 || x2 < 0 || x2 > 8 || y1 < 0 || y1 > 8 || y2 < 0 || y2 > 8) {
//            invalidInput();
//            x1 = 0;
//            x2 = 0;
//            y1 = 0;
//            y2 = 0;
//        }


        return coords;


        //    xy,xy
        //    A3,B4

    }

//    public void invalidInput(){
//        System.out.println("move was invalid, try again");
//        runTurn();
//    }

    public void MakeMove(String Rawmove) {
        Pieces[][] Temp = board.getBoard();
        int[] coords = decodeMove(Rawmove);
        if (getPiece(Rawmove).isValidMove(coords[0],coords[1], coords[2], coords[3])) {
            if (Temp[coords[3]][coords[2]] instanceof Empty || !Temp[coords[3]][coords[2]].getColor().equals(currentPlayer)) {
                valMove = true;
                String cColor = getPiece(Rawmove).getColor();
                Pieces nPiece = getPiece(Rawmove).move(getPiece(Rawmove).getColor(), coords[2], coords[3]);
                Temp[coords[3]][coords[2]] = nPiece;
                Temp[coords[1]][coords[0]] = new Empty("N", coords[2], coords[3]);


                board.setBoard(Temp);
                board.updateBoard();
            }
            else {valMove = false;}
        }
        else {valMove = false;}
    }
//        getPiece(Rawmove).move(coords[0], coords[1], coords[2], coords[3]);
//        board.setBoard(Temp);
//        System.out.println("ISSUE HERE");
//        System.out.println(Temp[0][0]);
    }


