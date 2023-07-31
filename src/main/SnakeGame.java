import java.util.*;
import javax.imageio.ImageIO;
import java.util.Timer;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.*;
import java.io.*;
import javax.swing.*;

public class SnakeGame extends JFrame {
    public SnakeGame() {
        initUI();
    }

    private void initUI() {
        add(new Game());

        setTitle("Snake");
        setSize(800, 610);

        setLocationRelativeTo(null);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            SnakeGame ex = new SnakeGame();
            ex.setVisible(true);
        });
    }
}
