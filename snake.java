import java.awt. *;
import java.until.LikedList;

public class Snake {
    
    public enum Direction { UP, DOWN, LEFT, RIGHT }
    private Direction direction = Direction.RIGHT;

    public void reset(int startX, int startY) {
        body.clear();

        body.add(new Point(startX, startY)); 
        body.add(new Point(startX - 1, startY));
        body.add(new Point(startX - 2, startY));
        direction = Direction.RIGHT;
    }
}


public LinkedList<Point> getBody() {
    return body;
}

public Direction getDirection() {
    return direction;
}