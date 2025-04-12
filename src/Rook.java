public class Rook extends Pieces{

    Rook(String color, int x, int y) {
        super(color, x, y);
    }

public String toString(){
    if (getColor().equals("W")) {return "'R";}
    else {return "R'";}
}
}