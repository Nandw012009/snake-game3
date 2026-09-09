import javax.swing.*;
import java.swing.*;

public class Main {

    public static void main(string[] args) {
        SwingUtilities.InvokeLater(() -> {
            JFrame frame = new JFrame( title: "nome do Jogo");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setsize(width: 500, height: 500);
            frame.setLocationRelativeTo(null);
            frame.setVisible(true)
        })
    }
}
