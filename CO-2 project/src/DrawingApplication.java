import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class DrawingApplication {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new DrawingApplication().createAndShowGUI());
    }

    private void createAndShowGUI() {
        JFrame frame = new JFrame("Drawing Application");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(new DrawingBoard());
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    public class DrawingBoard extends JPanel {
        private int prevX, prevY;

        public DrawingBoard() {
            setPreferredSize(new Dimension(640, 480));
            setBackground(Color.WHITE);
            addMouseListener(new MouseAdapter() {
                @Override
                public void mousePressed(MouseEvent e) {
                    prevX = e.getX();
                    prevY = e.getY();
                }
            });
            addMouseMotionListener(new MouseMotionAdapter() {
                @Override
                public void mouseDragged(MouseEvent e) {
                    int x = e.getX();
                    int y = e.getY();
                    Graphics g = getGraphics();
                    g.drawLine(prevX, prevY, x, y);
                    prevX = x;
                    prevY = y;
                    g.dispose();
                }
            });
        }
    }
}
