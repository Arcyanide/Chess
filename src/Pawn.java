 public class Pawn extends Pieces {

        Pawn(String color, int x, int y) {
            super(color, x, y);
        }

     public String toString(){
         if (getColor().equals("W")) {return "'P";}
         else {return "P'";}
     }

    }

