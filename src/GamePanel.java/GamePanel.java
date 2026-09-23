import javax.swing.*;
import java.awt.*;

public class GamePanel extends JPanel {

    private fnal Board = new Board();

    public GamePanel() {
        setPreferredSize(new Dimension(GameConstants.WIDTH, GameConstants.HEIGHT));

    }


@Override //Subscrever um método
protected void paintComponent(Graphic g) {
    super.paintComponent(g);

    Graphics2D g2 = (Graphics2D) g;
    board.draw(g2);
}


}