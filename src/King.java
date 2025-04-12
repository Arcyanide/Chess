public class King extends Pieces {

    King(String color, int x, int y) {
        super(color, x, y);
    }
    public String toString(){
        if (getColor().equals("W")) {return "'K";}
        else {return "K'";}
    }
}
