public class Dot {

    // 設置基本座標
    private int x = 0;
    private int y = 0;

    // constructor
    public Dot(){

    }
    public Dot(int x, int y){
        this.x = x;
        this.y = y;
    }

    // getter
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    // setter
    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }
}
