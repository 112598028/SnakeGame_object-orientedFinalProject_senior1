import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GamePanel extends JPanel implements ActionListener {

    private int width = 500;
    private int height = 600;
    // constructor
    public GamePanel(){
        // 基本設置
        this.setSize(width, height);
        this.setVisible(true);
        this.setBackground(Color.BLACK);
    }

    // startGame
    // move

    // paintComponent
    // draw

    // checkFood
    // checkCollision -> self or wall
    // gameOver

    // ActionListener
    @Override
    public void actionPerformed(ActionEvent e) {

    }

    // keyAdapter
}
