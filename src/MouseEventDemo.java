import java.awt.*;
import java.awt.event.*;

public class MouseEventDemo extends Frame implements MouseListener {

    // Constructor to set up the frame
    MouseEventDemo() {
        setTitle("Mouse Event Demo");
        setSize(400, 300);
        setLayout(null);
        setVisible(true);

        // Adding MouseListener to the Frame
        addMouseListener(this);

        // Closing the frame
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });
    }

    // Overriding MouseListener methods
    public void mouseClicked(MouseEvent e) {
        System.out.print("Mouse Clicked :");
    }

    public void mouseEntered(MouseEvent e) {
        System.out.println("Mouse Entered the Frame");
    }

    public void mouseExited(MouseEvent e) {
        System.out.println("Mouse Exited the Frame");
    }


    public void mousePressed(MouseEvent e) {
        System.out.println("Pressed");
    }
    public void mouseReleased(MouseEvent e) {
        System.out.println("Mouse Released");
    }

    // Main method
    public static void main(String[] args) {
        new MouseEventDemo();
    }
}
