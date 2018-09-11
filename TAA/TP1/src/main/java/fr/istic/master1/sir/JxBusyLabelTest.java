package fr.istic.master1.sir;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import org.jdesktop.swingx.JXBusyLabel;

public class JxBusyLabelTest extends JFrame implements ActionListener {

    private JXBusyLabel label;
    private JComboBox<String> comboBackground;
    private JComboBox<String> comboForeground;
    private JButton btnStart;
    private JButton btnStop;
    private Color[] colors = {
        Color.BLACK,
        Color.WHITE,
        Color.RED,
        Color.BLUE,
        Color.GREEN,
        Color.GRAY,
        Color.YELLOW
    };

    private JxBusyLabelTest() {
        label = new JXBusyLabel(new Dimension(60, 60));
        label.setBusy(true);

        String[] colorsName = {
            "Choose a color",
            "BLACK",
            "WHITE",
            "RED",
            "BLUE",
            "GREEN",
            "GRAY",
            "YELLOW"
        };
        comboBackground = new JComboBox<>(colorsName);
        comboForeground = new JComboBox<>(colorsName);
        btnStart = new JButton("Start");
        btnStop = new JButton("Stop");

        comboBackground.addActionListener(this);
        comboForeground.addActionListener(this);
        btnStart.addActionListener(this);
        btnStop.addActionListener(this);

        JPanel panelSouth = new JPanel();
        panelSouth.add(new JLabel("Background"));
        panelSouth.add(comboBackground);
        panelSouth.add(new JLabel("Foreground"));
        panelSouth.add(comboForeground);
        JPanel panelNorth = new JPanel();
        panelNorth.add(btnStart);
        panelNorth.add(btnStop);

        add(panelNorth, BorderLayout.NORTH);
        add(label, BorderLayout.CENTER);
        add(panelSouth, BorderLayout.SOUTH);

        setSize(400, 160);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    /**
     * actionPerformed.
     * @param e the event
     */
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == comboBackground) {
            Color color = colors[comboBackground.getSelectedIndex() - 1];
            label.getBusyPainter().setBaseColor(color);
        } else if (e.getSource() == comboForeground) {
            Color color = colors[comboBackground.getSelectedIndex() - 1];
            label.getBusyPainter().setHighlightColor(color);
        } else if (e.getSource() == btnStart) {
            label.setBusy(true);
        } else if (e.getSource() == btnStop) {
            label.setBusy(false);
        }
    }

    /**
     * Main.
     * @param args the args
     */
    public static void main(String[] args) {
        new JxBusyLabelTest();
    }

}