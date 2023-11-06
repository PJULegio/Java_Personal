import java.awt.*;
import java.awt.event.*;

public class MouseEventDemo extends Frame
{
    private TextField tfMouseX;
    private TextField tfMouseY;

    public MouseEventDemo()
    {
        setLayout(new FlowLayout());

        add(new Label("X-Click: "));

        tfMouseX = new TextField(10);
        tfMouseX.setEditable(false);
        add(tfMouseX);

        add(new Label("Y-click: "));

        tfMouseY = new TextField(10);
        tfMouseY.setEditable(false);
        add(tfMouseY);

        addMouseListener(new MyMouseListener());
        addWindowListener(new MyWindowListener());

        setSize(300, 100);
        setTitle("MouseEvent Demo");
        setVisible(true);
    }

    public static void main(String[] args) { new MouseEventDemo(); }

    public class MyMouseListener implements MouseListener
    {
        @Override
        public void mouseClicked(MouseEvent evt)
        {
            tfMouseX.setText(evt.getX() + "");
            tfMouseY.setText(evt.getY() + "");
        }

        @Override public void mousePressed(MouseEvent evt) { }
        @Override public void mouseReleased(MouseEvent evt) { }
        @Override public void mouseEntered(MouseEvent evt) { }
        @Override public void mouseExited(MouseEvent evt) { }
    }

    public class MyWindowListener implements WindowListener
    {
        @Override
        public void windowClosing(WindowEvent evt)
        {
            System.exit(0);
        }

        @Override public void windowOpened(WindowEvent evt) { }
        @Override public void windowClosed(WindowEvent evt) { }
        @Override public void windowActivated(WindowEvent evt) { }
        @Override public void windowDeactivated(WindowEvent evt) { }
        @Override public void windowIconified(WindowEvent evt) { }
        @Override public void windowDeiconified(WindowEvent evt) { }
    }
}