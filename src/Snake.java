import java.util.LinkedList;

public class Snake {

    // 設置行進方向
    public static final int DIRECTION_UP = 1;
    public static final int DIRECTION_DOWN = 2;
    public static final int DIRECTION_LEFT = 3;
    public static final int DIRECTION_RIGHT = 4;

    // 初始化行進方向：向右
    private int direction = DIRECTION_RIGHT;

    // 初始化head
    private Dot head = new Dot();

    // 初始化body -> linked list
    private LinkedList<Dot> body = new LinkedList<Dot>();

    // constructor
    public Snake(){

    }


    // getter
    public int getDirection() {
        return direction;
    }

    public Dot getHead() {
        return head;
    }

    public LinkedList<Dot> getBody() {
        return body;
    }

    // setter
    public void setDirection(int direction) {
        this.direction = direction;
    }

    public void setHead(Dot head) {
        this.head = head;
    }

    public void setBody(LinkedList<Dot> body) {
        this.body = body;
    }
}
