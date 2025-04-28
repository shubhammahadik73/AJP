import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class KeyStatusFrame extends JFrame implements KeyListener {
    String msg = "";

    KeyStatusFrame() {
        addKeyListener(this);
        setFocusable(true);
        setSize(300, 200);
        setTitle("Key Status Frame");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void keyPressed(KeyEvent e) {
        msg = "Key Pressed";
        repaint();
    }

    public void keyReleased(KeyEvent e) {
        msg = "Key Released";
        repaint();
    }

    public void keyTyped(KeyEvent e) {
        msg = "Key Typed";
        repaint();
    }

    public void paint(Graphics g) {
        super.paint(g);
        g.drawString(msg, 100, 100);
    }

    public static void main(String[] args) {
        new KeyStatusFrame();
    }
}