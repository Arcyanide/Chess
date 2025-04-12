    public class Pieces {


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
        public boolean isValidMove() {
            return false;
        }
        public void move() {


        }
    }


