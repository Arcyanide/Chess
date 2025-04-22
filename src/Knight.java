public class Knight extends Pieces{

    Knight(String color, int x, int y) {
        super(color, x, y);
    }
//Possible movement patterns for the Knight
    int[][] directions = {
            {2, 1}, {1, 2}, {-1, 2}, {-2, 1},
            {-2, -1}, {-1, -2}, {1, -2}, {2, -1}
    };

    public boolean isValidMove (int newX, int newY) {
        int rows = directions.length;
        int cols = directions[0].length;
//Loop cycles checking all the new x's & y's to the old ones to see if the move is valid
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if(getX()+directions[0][j] == newX && (getY()+directions[i][0] == newY)) {
                    //Checks if the function is inside the board
                    if (newX > 0 && newX < 7 && newY > 0 && newY < 7) {
                        return true;
                    }
                }
                else {return false;}

            }
        }
        return false;
    }
    public boolean move(int newX, int newY) {
return false;
    }

    public String toString(){
        if (getColor().equals("W")) {return "'N";}
        else {return "N'";}
    }
}
