public class Pawn extends Pieces {

    Pawn(String color, int x, int y) {
        super(color, x, y);
    }

    public String toString(){
        if (getColor().equals("W")) {return "P";}
        else {return "p";}
    }
Pieces [][] Temp = getBoard();
    @Override
    public boolean isValidMove(int oldX, int oldY, int newX, int newY) {
        if (getColor().equals("W")) {
            if (oldY + 1 == newY && oldX == newX) {
                return true;
            } else if ((oldY == 1 || oldY == 6) && oldY + 2 == newY && oldX == newX) {
                return true;
            } else if ((oldX + 1 == newX || oldX - 1 == newX) && oldY + 1 == newY) {
                return true;
            } else {
                return false;
            }

        }
        else {
            if (oldY - 1 == newY && oldX == newX) {
                return true;
            } else if ((oldY == 1 || oldY == 6) && oldY - 2 == newY && oldX == newX) {
                return true;
            } else if ((oldX + 1 == newX || oldX - 1 == newX) && oldY - 1 == newY && !(Temp[oldY][oldX] instanceof Empty)) {
                return true;
            } else {
                return false;
            }

        }
    }
    public Pawn move (String Color, int newX, int newY) {
        Pawn nPawn = new Pawn(Color, newX, newY);
        return nPawn;
    }
}
