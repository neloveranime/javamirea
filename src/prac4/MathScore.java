package prac4;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class MatchScore extends JFrame {
    JButton firstTeam = new JButton("Shelli");
    JButton secondTeam = new JButton("Capitan Gavs");
    JLabel score = new JLabel("");
    JLabel lastScorer = new JLabel("Last Scorer: N/A");
    Label winner = new Label("Winner: DRAW");

    private int scoreFirstTeam = 0;
    private int scoreSecondTeam = 0;

    public MatchScore() {
        super("Shelli VS Capitan Gavs");
        setLayout(null);
        Font fontForScore = new Font("Times new Roman", Font.PLAIN, 30);

        firstTeam.setBounds(20, 200, 150, 20);
        secondTeam.setBounds(310, 200, 150, 20);
        score.setBounds(200, 50, 100, 40);
        score.setText(scoreFirstTeam + " X " + scoreSecondTeam);
        score.setFont(fontForScore);
        winner.setBounds(110, 10, 300, 25);
        winner.setFont(fontForScore);
        lastScorer.setBounds(165, 90, 150, 20);

        add(firstTeam);
        add(secondTeam);
        add(score);
        add(lastScorer);
        add(winner);

        firstTeam.addMouseListener(new MouseListener() {
            public void mouseExited(MouseEvent a) {
            }

            public void mouseClicked(MouseEvent a) {
                scoreFirstTeam++;
                score.setText(scoreFirstTeam + " X " + scoreSecondTeam);
                lastScorer.setText("Last Scorer: Shelli");
                winnerUpdate();

            }

            public void mouseEntered(MouseEvent a) {
            }

            public void mouseReleased(MouseEvent a) {
            }

            public void mousePressed(MouseEvent a) {
            }
        });

        secondTeam.addMouseListener(new MouseListener() {
            public void mouseExited(MouseEvent a) {
            }

            public void mouseClicked(MouseEvent a) {
                scoreSecondTeam++;
                score.setText(scoreFirstTeam + " X " + scoreSecondTeam);
                lastScorer.setText("Last Scorer: Capitan Gavs");
                winnerUpdate();
            }

            public void mouseEntered(MouseEvent a) {
            }

            public void mouseReleased(MouseEvent a) {
            }

            public void mousePressed(MouseEvent a) {
            }
        });

        setSize(500, 300);
    }

    private void winnerUpdate() {
        if (scoreFirstTeam > scoreSecondTeam) {
            winner.setText("Winner: Shelli");
        } else if (scoreFirstTeam < scoreSecondTeam) {
            winner.setText("Winner: Capitan Gavs");
        } else {
            winner.setText("Winner: DRAW");
        }
    }

    public static void main(String[] args) {
        new MatchScore().setVisible(true);
    }
}
