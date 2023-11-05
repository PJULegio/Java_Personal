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
        BtnCountListener listener = new BtnCountListener();
        btnCount.addActionListener(listener);

        setTitle("AWT Counter");
        setSize(300, 100);

        // DEBUG - START
        /* System.out.println(this);
        System.out.println(lblCount);
        System.out.println(tfCount);
        System.out.println(btnCount); */
        // DEBUG END

        setVisible(true);

        // DEBUG - START
        /* System.out.println(this);
        System.out.println(lblCount);
        System.out.println(tfCount);
        System.out.println(btnCount); */
        // DEBUG END
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
}