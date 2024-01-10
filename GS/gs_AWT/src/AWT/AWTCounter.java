import java.awt.*;
import java.awt.event.*;

public class AWTCounter extends Frame
{
    private Label lblCount;
    private TextField tfCount;
    private Button btnCount;
    private int count = 0;

    public AWTCounter()
    {
        setLayout(new FlowLayout());

        lblCount = new Label("Counter");
        add(lblCount);

        tfCount = new TextField(count + "", 8);
        tfCount.setEditable(false);
        add(tfCount);

        btnCount = new Button("Count");
        add(btnCount);

        btnCount.addActionListener(new BtnCountListener());

        addWindowListener(new MyWindowListener());

        setTitle("AWT Counter");
        setSize(300, 100);
        setVisible(true);
    }

    public static void main(String[] args)
    {
        AWTCounter app = new AWTCounter();
    }

    private class BtnCountListener implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent evt)
        {
            ++count;
            tfCount.setText(count + "");
        }
    }

    private class MyWindowListener implements WindowListener
    {
        @Override
        public void windowClosing(WindowEvent evt)
        {
            System.exit(0);
        }

        @Override public void windowOpened(WindowEvent evt) { }
        @Override public void windowClosed(WindowEvent evt) { }
        // Debugging
        @Override public void windowIconified(WindowEvent evt) { System.out.println("Window Iconified"); }
        @Override public void windowDeiconified(WindowEvent evt) { System.out.println("Widnow Deiconified"); }
        @Override public void windowActivated(WindowEvent evt) { System.out.println("Window Activated"); }
        @Override public void windowDeactivated(WindowEvent evt) { System.out.println("Window Deactivated"); }
    }
}