public class Pieces extends Board{

    private String color;
    private int x;
    private int y;

    Pieces(String color, int x, int y) {
    if (color.equals("W") || color.equals("B")) {
        this.color = color;
    }
    this.x = x;
    this.y = y;
}

    public Pieces(int x, int y) {
    }

    public String getColor() {
    return color;
}
public int getX() {
        return x;
    }
public int getY() {
        return y;
    }
public boolean isValidMove(int oldX, int oldY, int newX, int newY) {
        return false;
    }
public Pieces move(String Color, int newX, int newY) {
    return null;
}
}
