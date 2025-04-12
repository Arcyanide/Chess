public class Knight extends Pieces{

    Knight(String color, int x, int y) {
        super(color, x, y);
    }

    int[][] directions = {
            {2, 1}, {1, 2}, {-1, 2}, {-2, 1},
            {-2, -1}, {-1, -2}, {1, -2}, {2, -1}
    };

    public boolean isValidMove (int newX, int newY) {
        int rows = directions.length;
        int cols = directions[0].length;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
//                System.out.print(matrix[i][j] + " ");
                if(getX()+directions[0][j] == newX && (getY()+directions[i][0] == newY)) {
                    return true;
                }

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
