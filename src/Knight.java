public class Knight extends Pieces{

    Knight(String color, int x, int y) {
        super(color, x, y);
    }
//Possible movement patterns for the Knight
    int[] directions1 = {
-2,-1,1,2
    };
    int[] directions2 = {
            -2,-1,1,2
    };

    public boolean isValidMove (int oldX, int oldY, int newX, int newY) {
        int rows = directions1.length;
        int cols = directions2.length;
//Loop cycles checking all the new x's & y's to the old ones to see if the move is valid
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if(oldX+directions1[j] == newX && (oldY+directions2[i] == newY)) {
                    //Checks if the function is inside the board
//                    if (newX > 0 && newX < 7 && newY > 0 && newY < 7) {

                        return true;
//                    }
                }

                }

            }
        return false;
        }


    public Knight move(String Color, int newX, int newY) {
      Knight nKnight = new Knight(Color, newX, newY);
      return nKnight;
//    Pieces[][] Temp = getBoard();
//
//
//
//    Temp[oldY][oldX] = new Empty(oldX, oldY);
//    Temp[newY][newX] = new Knight(getColor(), newX, newY);
//            System.out.println("Temp[0][0]");
//
//        setBoard(Temp);
//    return Temp;
    }

//    public Pieces[][] getTemp() {
//        return Temp;
//    }

    public String toString(){
        if (getColor().equals("W")) {return "N";}
        else {return "n";}
    }
}

