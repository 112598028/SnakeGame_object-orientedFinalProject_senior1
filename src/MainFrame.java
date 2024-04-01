/*
    references:
    1. https://github.com/janbodnar/Java-Snake-Game
    2. https://www.twblogs.net/a/5b8ff6ad2b71776722163daa
    3. https://www.youtube.com/watch?v=bI6e6qjJ8JQ&ab_channel=BroCode

 */

import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {

    private GamePanel gamePanel = new GamePanel();
    private InfoPanel infoPanel = new InfoPanel();

    // constructor
    public MainFrame(){
        // 基本設置
        this.setTitle("貪食蛇");
        this.setSize(800, 600);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setVisible(true);

        this.add(gamePanel);
        this.add(infoPanel);
    }

    public static void main(String[] args) {
        new MainFrame();
    }
}
