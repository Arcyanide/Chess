public class Queen extends Pieces {

    Queen(String color, int x, int y) {
        super(color, x, y);
    }
    public String toString(){
        if (getColor().equals("W")) {return "'Q";}
        else {return "Q'";}
    }}

