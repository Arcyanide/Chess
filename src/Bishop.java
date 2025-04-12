public class Bishop extends Pieces{

    Bishop(String color, int x, int y) {
        super(color, x, y);
    }

public String toString(){
    if (getColor().equals("W")) {return "'B";}
    else {return "B'";}
}
}
