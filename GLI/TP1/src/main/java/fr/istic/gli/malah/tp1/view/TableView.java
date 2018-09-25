package fr.istic.gli.malah.tp1.view;

import javax.swing.JComponent;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ScrollPaneConstants;
import java.awt.GridBagConstraints;
import java.awt.Insets;

public class TableView extends JComponent {

    public TableView() {
        JScrollPane scrlTable = new JScrollPane();
        scrlTable.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        scrlTable.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        GridBagConstraints gbc_scrlTable = new GridBagConstraints();
        gbc_scrlTable.gridwidth = 2;
        gbc_scrlTable.insets = new Insets(0, 0, 5, 5);
        gbc_scrlTable.fill = GridBagConstraints.BOTH;
        gbc_scrlTable.gridx = 1;
        gbc_scrlTable.gridy = 2;
        pnlContent.add(scrlTable, gbc_scrlTable);

        tblTable = new JTable();
        tblTable.setFillsViewportHeight(true);
        scrlTable.setViewportView(tblTable);
    }
}
