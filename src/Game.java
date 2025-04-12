import java.util.Scanner;

public class Game {
    static String currentPlayer = "W";
    static Scanner scanner = new Scanner(System.in);
    static Board board = new Board();

    public void startGame(){

        String CurrentMove = "";



        runTurn();
    }


    //ran if move is valid, swaps player, starts next turn
    public void goNext(){
        //changes player
        if (currentPlayer.equals("W")){
            currentPlayer = "B";
        }
        else {
        currentPlayer = "W";
        }

        runTurn();

    }

    //run everytime a turn starts, whether or not valid or invalid
    public static void runTurn(){
        for (int i=0; i<50; i++){System.out.println("");}


        board.updateBoard();
        for (int i=0; i<3; i++){System.out.println("");}

        if (currentPlayer.equals("W")){ System.out.println("White");}
        if (currentPlayer.equals("B")){ System.out.println("Black");}
        System.out.print("   Enter your move :");

        String CurrentMove = scanner.nextLine(); //gets input from player

        getpiece(CurrentMove);


    }





    //returns piece being moved
    public static Pieces getpiece(String Rawmove){
        int[] coords = decodeMove(Rawmove);

        //takes old x and old y
        //returns those put into board array for the piece
        Pieces[][] b = board.getBoard();
        return b[coords[0]][coords[1]];

    }

    //returns x1 y1 (coords of piece moving) and x2 y2 (where moving to)
    public static int[] decodeMove(String Rawmove){

        //converts letters to numbers for our grid, a-0 h-7
        String x1raw = Rawmove.substring(0,1);
        String x2raw = Rawmove.substring(2,3);
        int x1 = Character.toLowerCase(x1raw.charAt(0)) - 'a'; //gpt'd this
        int x2 = Character.toLowerCase(x1raw.charAt(0)) - 'a';

        //extracts y's
        int y1 = Integer.parseInt(Rawmove.substring(1,2));
        int y2 = Integer.parseInt(Rawmove.substring(3,4));




        int[] coords = new int[4];
        coords[0] = x1;
        coords[1] = y1;
        coords[2] = x2;
        coords[3] = y2;

        //makes sure inputs exist on the board
        if (x1<0||x1>8 || x2<0||x2>8 || y1<0||y1>8 || y2<0||y2>8){
            invalidInput();
            x1=0; x2=0; y1=0; y2=0;
        }



            return coords;





    //    xy,xy
    //    A3,B4

    }







public static void invalidInput(){
            System.out.println("move was invalid, try again");
            runTurn();
        }
}



