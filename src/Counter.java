import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class Counter extends JFrame
{
    public Counter()
    {
        final int[] x = {0};
        final int[] y = {0};

        JButton AC = new JButton("AC Milan");
        JButton Real = new JButton("Real Madrid");
        JLabel Result = new JLabel("Result: ");
        JLabel Scorer = new JLabel("Last Scorer: ");
        JLabel Winner = new JLabel("Winner: Draw");
        add(AC, BorderLayout.WEST);
        add(Real, BorderLayout.EAST);
        add(Result, BorderLayout.CENTER);
        add(Scorer, BorderLayout.NORTH);
        add(Winner, BorderLayout.SOUTH);
        AC.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                x[0]++;
                Result.setText("AC Milan " + x[0] + ": " + y[0] + "Real Madrid");
                Scorer.setText("Last Scorer AC Milan");
                if(x[0]>y[0])
                    Winner.setText("Winner: AC Milan");
                if(x[0]==y[0])
                    Winner.setText("Winner: DRAW");
            }
        });
        Real.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                y[0]++;
                Result.setText("AC Milan " + x[0] + ": " + y[0] + "Real Madrid");
                Scorer.setText("Last Scorer Real Madrid");
                if(x[0]>y[0])
                    Winner.setText("Winner: Real Madrid");
                if(x[0]==y[0])
                    Winner.setText("Winner: DRAW");
            }
        });
        setSize(800,500);
    }
    public static void main(String[]args)
    {
        new Counter().setVisible(true);
    }
}