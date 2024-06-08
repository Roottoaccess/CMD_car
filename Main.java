import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(200, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {}

            @Override
            public void keyPressed(KeyEvent e) {
                int keyCode = e.getKeyCode();
                switch (keyCode) {
                    case KeyEvent.VK_UP:
                        System.out.println("Up key pressed");
                        break;
                    case KeyEvent.VK_DOWN:
                        System.out.println("Down key pressed");
                        break;
                    case KeyEvent.VK_LEFT:
                        System.out.println("Left key pressed");
                        break;
                    case KeyEvent.VK_RIGHT:
                        System.out.println("Right key pressed");
                        break;
                }
            }

            @Override
            public void keyReleased(KeyEvent e) {}
        });
        frame.setVisible(true);
    }
}
