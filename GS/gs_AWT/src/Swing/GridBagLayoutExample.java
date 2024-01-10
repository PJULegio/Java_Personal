import java.awt.*;
import javax.swing.*;

@SuppressWarnings( "serial" )
public class GridBagLayoutExample extends JPanel
{
    JButton button1, button2, button3, button4, button5;

    public GridBagLayoutExample()
    {
        super.setLayout( new GridBagLayout() );
        GridBagConstraints gbc = new GridBagConstraints();

        gbc.fill = GridBagConstraints.HORIZONTAL;

        button1 = new JButton( "B1" );
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.weightx = 0.5;
        super.add( button1, gbc );

        button2 = new JButton( "B2" );
        gbc.gridx = 1;
        gbc.gridy = 0;
        gbc.weightx = 1.0;
        super.add( button2, gbc );

        button3 = new JButton( "B3" );
        gbc.gridx = 2;
        gbc.gridy = 0;
        gbc.weightx = 0.5;
        super.add( button3, gbc );

        button4 = new JButton( "Long-Named Button 4" );
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.gridwidth = 3;
        gbc.ipady = 40;
        super.add( button4, gbc );

        button5 = new JButton( "5" );
        gbc.gridx = 1;
        gbc.gridy = 2;
        gbc.gridwidth = 2;
        gbc.ipady = 0;
        gbc.anchor = GridBagConstraints.PAGE_END;
        gbc.insets = new Insets( 10, 0, 0, 0 );
        gbc.weighty = 1.0;
        super.add( button5, gbc );
    }

    public static void main( String[] args )
    {
        javax.swing.SwingUtilities.invokeLater( new Runnable()
        {
            public void run()
            {
                JFrame frame = new JFrame( "GridBagLayoutDemo" );
                frame.setContentPane( new GridBagLayoutExample() );
                frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
                frame.setSize( 300, 300 );
                frame.setVisible( true );
            }
        });
    }
}