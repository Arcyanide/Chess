public class Board {

    //initializes board
    static Pieces[][] board = {{new Rook("W", 0, 0), new Knight("W", 1, 0), new Bishop("W", 2, 0), new Queen("W", 3, 0), new King("W", 4, 0), new Bishop("W", 5, 0), new Knight("W", 6, 0), new Rook("W", 7, 0)},
            {new Pawn("W", 0, 1), new Pawn("W", 1, 1), new Pawn("W", 2, 1), new Pawn("W", 3, 1), new Pawn("W", 4, 1), new Pawn("W", 5, 1), new Pawn("W", 6, 1), new Pawn("W", 7, 1)},
            {new Empty("N",0, 2), new Empty("N",1, 2), new Empty("N",2, 2), new Empty("N",3, 2), new Empty("N",4, 2), new Empty("N",5, 2), new Empty("N",6, 2), new Empty("N",7, 2)},
            {new Empty("N",0, 3), new Empty("N",1, 3), new Empty("N",2, 3), new Empty("N",3, 3), new Empty("N",4, 3), new Empty("N",5, 3), new Empty("N",6, 3), new Empty("N",7, 3)},
            {new Empty("N",0, 4), new Empty("N",1, 4), new Empty("N",2, 4), new Empty("N",3, 4), new Empty("N",4, 4), new Empty("N",5, 4), new Empty("N",6, 4), new Empty("N",7, 4)},
            {new Empty("N",0, 5), new Empty("N",1, 5), new Empty("N",2, 5), new Empty("N",3, 5), new Empty("N",4, 5), new Empty("N",5, 5), new Empty("N",6, 5), new Empty("N",7, 5)},
            {new Pawn("B", 0, 6), new Pawn("B", 1, 6), new Pawn("B", 2, 6), new Pawn("B", 3, 6), new Pawn("B", 4, 6), new Pawn("B", 5, 6), new Pawn("B", 6, 6), new Pawn("B", 7, 6)},
            {new Rook("B", 0, 7), new Knight("B", 1, 7), new Bishop("B", 2, 7), new Queen("B", 3, 7), new King("B", 4, 7), new Bishop("B", 5, 7), new Knight("B", 6, 7), new Rook("B", 7, 7)}};


    //displays the board to console
    public static void updateBoard() {
        System.out.println("      ||   |   |   |   |   |   |   |   ||");
        System.out.println("      || A | B | C | D | E | F | G | H ||");


        for (int i = 7; i > -1; i--) {
            if (i == 7 ) {
                System.out.println(" =====||===|===|===|===|===|===|===|===||=====");
            }
            else {System.out.println(" -----||---|---|---|---|---|---|---|---||-----");}
            int k=i+1; //cant do math in a string


            System.out.print("    " + k + " ||");
            for (int j = 0; j < 8; j++) {
                if ( j == 7) {
                    System.out.print(" " + board[i][j] + " ||");
                }
                else {System.out.print(" " + board[i][j] + " |");}
            }
            System.out.println(" " + k);
            //System.out.println("");
        }
        System.out.println(" =====||===|===|===|===|===|===|===|===||=====");
        System.out.println("      || A | B | C | D | E | F | G | H ||");
        System.out.println("      ||   |   |   |   |   |   |   |   ||");
    }

    public Pieces[][] getBoard() {
        return (board);
    }
    public void setBoard(Pieces[][] newBoard) {
        board = newBoard;
    }
}