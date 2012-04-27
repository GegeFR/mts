/* 
 * Copyright 2012 Devoteam http://www.devoteam.com
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 * 
 * 
 * This file is part of Multi-Protocol Test Suite (MTS).
 * 
 * Multi-Protocol Test Suite (MTS) is free software: you can redistribute
 * it and/or modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation, either version 3 of the
 * License.
 * 
 * Multi-Protocol Test Suite (MTS) is distributed in the hope that it will
 * be useful, but WITHOUT ANY WARRANTY; without even the implied warranty 
 * of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with Multi-Protocol Test Suite (MTS).
 * If not, see <http://www.gnu.org/licenses/>.
 * 
 */

package com.devoteam.srit.xmlloader.gui.frames;

import com.devoteam.srit.xmlloader.core.TestcaseRunner;
import com.devoteam.srit.xmlloader.core.Testcase;
import com.devoteam.srit.xmlloader.core.log.TextEvent;
import com.devoteam.srit.xmlloader.gui.JTableLogs;
import com.devoteam.srit.xmlloader.gui.better.TestcaseLineCtrl;
import com.devoteam.srit.xmlloader.gui.logs.LoggingSet;
import java.awt.CardLayout;
import java.io.File;
import java.net.URI;
import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import javax.swing.JScrollPane;

/**
 *
 * @author  gpasquiers
 */
public class JFrameLogsSession extends javax.swing.JFrame {

    /** Creates new form JFrameLogsSession */
    public JFrameLogsSession(boolean mainLogs) {
        initComponents();
        initUserCode(mainLogs);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        levelRadioGroup = new javax.swing.ButtonGroup();
        jPanel2 = new javax.swing.JPanel();
        jComboBoxRuns = new javax.swing.JComboBox();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTabbedPane = new javax.swing.JTabbedPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuFile = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenuItemClear = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        jMenuItemClose = new javax.swing.JMenuItem();
        jMenuTopics = new javax.swing.JMenu();
        jMenuItemCALLFLOWOnly = new javax.swing.JMenuItem();
        jMenuItemALLTopics = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JSeparator();
        jCheckBoxMenuItemCALLFLOW = new javax.swing.JCheckBoxMenuItem();
        jCheckBoxMenuItemPROTOCOL = new javax.swing.JCheckBoxMenuItem();
        jCheckBoxMenuItemPARAM = new javax.swing.JCheckBoxMenuItem();
        jCheckBoxMenuItemCORE = new javax.swing.JCheckBoxMenuItem();
        jCheckBoxMenuItemUSER = new javax.swing.JCheckBoxMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jRadioButtonMenuItemERROR = new javax.swing.JRadioButtonMenuItem();
        jRadioButtonMenuItemWARNING = new javax.swing.JRadioButtonMenuItem();
        jRadioButtonMenuItemINFO = new javax.swing.JRadioButtonMenuItem();
        jRadioButtonMenuItemDEBUG = new javax.swing.JRadioButtonMenuItem();

        setTitle("Session logs");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setIconImage(java.awt.Toolkit.getDefaultToolkit().getImage(getClass().getResource("/icons/internet-group-chat.png")));
        setLocationByPlatform(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jComboBoxRuns.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxRunsActionPerformed(evt);
            }
        });

        jPanel3.setLayout(new java.awt.CardLayout());
        jPanel3.add(jScrollPane1, "card3");
        jPanel3.add(jTabbedPane, "card2");

        org.jdesktop.layout.GroupLayout jPanel2Layout = new org.jdesktop.layout.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                    .add(org.jdesktop.layout.GroupLayout.LEADING, jPanel3, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 560, Short.MAX_VALUE)
                    .add(org.jdesktop.layout.GroupLayout.LEADING, jComboBoxRuns, 0, 560, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .add(jComboBoxRuns, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel3, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 469, Short.MAX_VALUE)
                .addContainerGap())
        );

        jMenuFile.setText("Action");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem1.setText("Search");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemSearchActionPerformed(evt);
            }
        });
        jMenuFile.add(jMenuItem1);
        jMenuFile.add(jSeparator1);

        jMenuItemClear.setText("Clear");
        jMenuItemClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemClearActionPerformed(evt);
            }
        });
        jMenuFile.add(jMenuItemClear);
        jMenuFile.add(jSeparator3);

        jMenuItemClose.setText("Close");
        jMenuItemClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCloseActionPerformed(evt);
            }
        });
        jMenuFile.add(jMenuItemClose);

        jMenuBar1.add(jMenuFile);

        jMenuTopics.setText("Topics");

        jMenuItemCALLFLOWOnly.setText("CALLFLOW only");
        jMenuItemCALLFLOWOnly.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCALLFLOWOnlyActionPerformed(evt);
            }
        });
        jMenuTopics.add(jMenuItemCALLFLOWOnly);

        jMenuItemALLTopics.setText("ALL topics");
        jMenuItemALLTopics.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemALLTopicsActionPerformed(evt);
            }
        });
        jMenuTopics.add(jMenuItemALLTopics);
        jMenuTopics.add(jSeparator2);

        jCheckBoxMenuItemCALLFLOW.setSelected(true);
        jCheckBoxMenuItemCALLFLOW.setText("CALLFLOW");
        jCheckBoxMenuItemCALLFLOW.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxMenuItemCALLFLOWActionPerformed(evt);
            }
        });
        jMenuTopics.add(jCheckBoxMenuItemCALLFLOW);

        jCheckBoxMenuItemPROTOCOL.setText("PROTOCOL");
        jCheckBoxMenuItemPROTOCOL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxMenuItemPROTOCOLActionPerformed(evt);
            }
        });
        jMenuTopics.add(jCheckBoxMenuItemPROTOCOL);

        jCheckBoxMenuItemPARAM.setText("PARAM");
        jCheckBoxMenuItemPARAM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxMenuItemPARAMActionPerformed(evt);
            }
        });
        jMenuTopics.add(jCheckBoxMenuItemPARAM);

        jCheckBoxMenuItemCORE.setText("CORE");
        jCheckBoxMenuItemCORE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxMenuItemCOREActionPerformed(evt);
            }
        });
        jMenuTopics.add(jCheckBoxMenuItemCORE);

        jCheckBoxMenuItemUSER.setText("USER");
        jCheckBoxMenuItemUSER.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxMenuItemUSERActionPerformed(evt);
            }
        });
        jMenuTopics.add(jCheckBoxMenuItemUSER);

        jMenuBar1.add(jMenuTopics);

        jMenu3.setText("Level");

        levelRadioGroup.add(jRadioButtonMenuItemERROR);
        jRadioButtonMenuItemERROR.setText("ERROR");
        jRadioButtonMenuItemERROR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonMenuItemERRORActionPerformed(evt);
            }
        });
        jMenu3.add(jRadioButtonMenuItemERROR);

        levelRadioGroup.add(jRadioButtonMenuItemWARNING);
        jRadioButtonMenuItemWARNING.setText("WARN");
        jRadioButtonMenuItemWARNING.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonMenuItemWARNINGActionPerformed(evt);
            }
        });
        jMenu3.add(jRadioButtonMenuItemWARNING);

        levelRadioGroup.add(jRadioButtonMenuItemINFO);
        jRadioButtonMenuItemINFO.setText("INFO");
        jRadioButtonMenuItemINFO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonMenuItemINFOActionPerformed(evt);
            }
        });
        jMenu3.add(jRadioButtonMenuItemINFO);

        levelRadioGroup.add(jRadioButtonMenuItemDEBUG);
        jRadioButtonMenuItemDEBUG.setSelected(true);
        jRadioButtonMenuItemDEBUG.setText("DEBUG");
        jRadioButtonMenuItemDEBUG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonMenuItemDEBUGActionPerformed(evt);
            }
        });
        jMenu3.add(jRadioButtonMenuItemDEBUG);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel2, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel2, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosing(java.awt.event.WindowEvent evt)//GEN-FIRST:event_formWindowClosing
    {//GEN-HEADEREND:event_formWindowClosing
        if(null != _testcaseLineCtrl){
            _testcaseLineCtrl.setLogSelected(false);
        }
    }//GEN-LAST:event_formWindowClosing

    private void jComboBoxRunsActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jComboBoxRunsActionPerformed
    {//GEN-HEADEREND:event_jComboBoxRunsActionPerformed
        String runId = (String) this.jComboBoxRuns.getSelectedItem();

        this.jTabbedPane.removeAll();

        if (logTables.containsKey(runId)) {
            /*
             * Add the callflow tab (null key)
             */
            this.jTabbedPane.addTab(logTables.get(runId).getTestcaseLogs().getTitle(),
                    new JScrollPane(logTables.get(runId).getTestcaseLogs()));

            /*
             * Then add the other tabs (all but null keys)
             */
            for (Entry<String, JTableLogs> entry : logTables.get(runId).getJTableMap().entrySet()) {
                if (null != entry.getKey()) {
                    this.jTabbedPane.addTab(entry.getValue().getTitle(), new JScrollPane(entry.getValue()));
                }
            }

            jTabbedPane.setSelectedIndex(0);
        }

        if (jTabbedPane.getTabCount() > 0) {
            jTabbedPane.setSelectedIndex(0);
        }

        this.updateHideShow();
    }//GEN-LAST:event_jComboBoxRunsActionPerformed

    private void jMenuItemCloseActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jMenuItemCloseActionPerformed
    {//GEN-HEADEREND:event_jMenuItemCloseActionPerformed
        if(null != _testcaseLineCtrl){
            _testcaseLineCtrl.setLogSelected(false);
        }
}//GEN-LAST:event_jMenuItemCloseActionPerformed

    private void jMenuItemClearActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jMenuItemClearActionPerformed
    {//GEN-HEADEREND:event_jMenuItemClearActionPerformed
        clearLogs();
    }//GEN-LAST:event_jMenuItemClearActionPerformed

    private void jRadioButtonMenuItemERRORActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jRadioButtonMenuItemERRORActionPerformed
    {//GEN-HEADEREND:event_jRadioButtonMenuItemERRORActionPerformed
        this.updateHideShow();
    }//GEN-LAST:event_jRadioButtonMenuItemERRORActionPerformed

    private void jRadioButtonMenuItemWARNINGActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jRadioButtonMenuItemWARNINGActionPerformed
    {//GEN-HEADEREND:event_jRadioButtonMenuItemWARNINGActionPerformed
        this.updateHideShow();
    }//GEN-LAST:event_jRadioButtonMenuItemWARNINGActionPerformed

    private void jRadioButtonMenuItemINFOActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jRadioButtonMenuItemINFOActionPerformed
    {//GEN-HEADEREND:event_jRadioButtonMenuItemINFOActionPerformed
        this.updateHideShow();
    }//GEN-LAST:event_jRadioButtonMenuItemINFOActionPerformed

    private void jRadioButtonMenuItemDEBUGActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jRadioButtonMenuItemDEBUGActionPerformed
    {//GEN-HEADEREND:event_jRadioButtonMenuItemDEBUGActionPerformed
        this.updateHideShow();
    }//GEN-LAST:event_jRadioButtonMenuItemDEBUGActionPerformed

    private void jCheckBoxMenuItemCALLFLOWActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jCheckBoxMenuItemCALLFLOWActionPerformed
    {//GEN-HEADEREND:event_jCheckBoxMenuItemCALLFLOWActionPerformed
        this.updateHideShow();
    }//GEN-LAST:event_jCheckBoxMenuItemCALLFLOWActionPerformed

    private void jCheckBoxMenuItemPROTOCOLActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jCheckBoxMenuItemPROTOCOLActionPerformed
    {//GEN-HEADEREND:event_jCheckBoxMenuItemPROTOCOLActionPerformed
        this.updateHideShow();
    }//GEN-LAST:event_jCheckBoxMenuItemPROTOCOLActionPerformed

    private void jCheckBoxMenuItemPARAMActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jCheckBoxMenuItemPARAMActionPerformed
    {//GEN-HEADEREND:event_jCheckBoxMenuItemPARAMActionPerformed
        this.updateHideShow();
    }//GEN-LAST:event_jCheckBoxMenuItemPARAMActionPerformed

    private void jCheckBoxMenuItemCOREActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jCheckBoxMenuItemCOREActionPerformed
    {//GEN-HEADEREND:event_jCheckBoxMenuItemCOREActionPerformed
        this.updateHideShow();
    }//GEN-LAST:event_jCheckBoxMenuItemCOREActionPerformed

    private void jCheckBoxMenuItemUSERActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jCheckBoxMenuItemUSERActionPerformed
    {//GEN-HEADEREND:event_jCheckBoxMenuItemUSERActionPerformed
        this.updateHideShow();
    }//GEN-LAST:event_jCheckBoxMenuItemUSERActionPerformed

    private void jMenuItemCALLFLOWOnlyActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jMenuItemCALLFLOWOnlyActionPerformed
    {//GEN-HEADEREND:event_jMenuItemCALLFLOWOnlyActionPerformed
        this.jCheckBoxMenuItemCALLFLOW.setSelected(true);
        this.jCheckBoxMenuItemCORE.setSelected(false);
        this.jCheckBoxMenuItemPARAM.setSelected(false);
        this.jCheckBoxMenuItemPROTOCOL.setSelected(false);
        this.jCheckBoxMenuItemUSER.setSelected(false);
        this.updateHideShow();
    }//GEN-LAST:event_jMenuItemCALLFLOWOnlyActionPerformed

    private void jMenuItemALLTopicsActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jMenuItemALLTopicsActionPerformed
    {//GEN-HEADEREND:event_jMenuItemALLTopicsActionPerformed
        this.jCheckBoxMenuItemCALLFLOW.setSelected(true);
        this.jCheckBoxMenuItemCORE.setSelected(true);
        this.jCheckBoxMenuItemPARAM.setSelected(true);
        this.jCheckBoxMenuItemPROTOCOL.setSelected(true);
        this.jCheckBoxMenuItemUSER.setSelected(true);
        this.updateHideShow();
    }//GEN-LAST:event_jMenuItemALLTopicsActionPerformed

    private void jMenuItemSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemSearchActionPerformed
        JDialogSearch searchDialog = new JDialogSearch(this, false);
        searchDialog.setVisible(true);

    }//GEN-LAST:event_jMenuItemSearchActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItemCALLFLOW;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItemCORE;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItemPARAM;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItemPROTOCOL;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItemUSER;
    private javax.swing.JComboBox jComboBoxRuns;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenuFile;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItemALLTopics;
    private javax.swing.JMenuItem jMenuItemCALLFLOWOnly;
    private javax.swing.JMenuItem jMenuItemClear;
    private javax.swing.JMenuItem jMenuItemClose;
    private javax.swing.JMenu jMenuTopics;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItemDEBUG;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItemERROR;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItemINFO;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItemWARNING;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JTabbedPane jTabbedPane;
    private javax.swing.ButtonGroup levelRadioGroup;
    // End of variables declaration//GEN-END:variables
    // <editor-fold defaultstate="collapsed" desc=" User Code ">                          
    private LinkedHashMap<String, LoggingSet> logTables;
    private boolean mainLogs;
    private JTableLogs jMainTableLogs;
    private TestcaseLineCtrl _testcaseLineCtrl;
    
    public void initUserCode(boolean mainLogs) {
        //myJFrameLogsSession.add(this);

        this.jRadioButtonMenuItemDEBUG.getModel().setActionCommand(jRadioButtonMenuItemDEBUG.getActionCommand());
        this.jRadioButtonMenuItemINFO.getModel().setActionCommand(jRadioButtonMenuItemINFO.getActionCommand());
        this.jRadioButtonMenuItemWARNING.getModel().setActionCommand(jRadioButtonMenuItemWARNING.getActionCommand());
        this.jRadioButtonMenuItemERROR.getModel().setActionCommand(jRadioButtonMenuItemERROR.getActionCommand());
        this.mainLogs = mainLogs;
        if (!mainLogs) {
            this.logTables = new LinkedHashMap();
            this.setTestcaseLineCtrl(null);
            this.jMainTableLogs = null;
            ((CardLayout) this.jPanel3.getLayout()).show(jPanel3, "card2");
        }
        else {
            this.setTitle("Main logs");
            this.logTables = new LinkedHashMap();
            this.jComboBoxRuns.setVisible(false);
            this.jMainTableLogs = new JTableLogs("application logs", null, null);
            this.jTabbedPane.setVisible(false);
            ((CardLayout) this.jPanel3.getLayout()).show(jPanel3, "card3");
            this.jScrollPane1.setViewportView(jMainTableLogs);
            this.jScrollPane1.setAutoscrolls(true);
            this.updateHideShow();
        }
    }

    public LoggingSet getLoggingSet(TestcaseRunner runner) {
        String runId = runner.getRunId();

        synchronized (logTables) {
            LoggingSet loggingSet = logTables.get(runId);

            if (null == loggingSet) {
                loggingSet = new LoggingSet(runner, runId);
                logTables.put(runId, loggingSet);
                this.jComboBoxRuns.addItem(runId);
            }
            
            return loggingSet;
        }

    }

    public void setTestcaseLineCtrl(TestcaseLineCtrl testcaseLineCtrl) {
        _testcaseLineCtrl = testcaseLineCtrl;
    }

    private void updateHideShow() {
        String levelStr = this.levelRadioGroup.getSelection().getActionCommand();

        int level = TextEvent.string2Level(levelStr);

        if (!this.mainLogs) {
            String runId = (String) this.jComboBoxRuns.getSelectedItem();

            if (logTables.containsKey(runId)) {
                for (JTableLogs logTable : logTables.get(runId).getJTableMap().values()) {
                    if (this.jCheckBoxMenuItemCALLFLOW.isSelected()) {
                        logTable.show(TextEvent.Topic.CALLFLOW);
                    }
                    else {
                        logTable.hide(TextEvent.Topic.CALLFLOW);
                    }

                    if (this.jCheckBoxMenuItemCORE.isSelected()) {
                        logTable.show(TextEvent.Topic.CORE);
                    }
                    else {
                        logTable.hide(TextEvent.Topic.CORE);
                    }

                    if (this.jCheckBoxMenuItemPARAM.isSelected()) {
                        logTable.show(TextEvent.Topic.PARAM);
                    }
                    else {
                        logTable.hide(TextEvent.Topic.PARAM);
                    }

                    if (this.jCheckBoxMenuItemPROTOCOL.isSelected()) {
                        logTable.show(TextEvent.Topic.PROTOCOL);
                    }
                    else {
                        logTable.hide(TextEvent.Topic.PROTOCOL);
                    }

                    if (this.jCheckBoxMenuItemUSER.isSelected()) {
                        logTable.show(TextEvent.Topic.USER);
                    }
                    else {
                        logTable.hide(TextEvent.Topic.USER);
                    }

                    logTable.setLevel(level);
                }
            }
        }
        else {
            if (this.jCheckBoxMenuItemCALLFLOW.isSelected()) {
                jMainTableLogs.show(TextEvent.Topic.CALLFLOW);
            }
            else {
                jMainTableLogs.hide(TextEvent.Topic.CALLFLOW);
            }

            if (this.jCheckBoxMenuItemCORE.isSelected()) {
                jMainTableLogs.show(TextEvent.Topic.CORE);
            }
            else {
                jMainTableLogs.hide(TextEvent.Topic.CORE);
            }

            if (this.jCheckBoxMenuItemPARAM.isSelected()) {
                jMainTableLogs.show(TextEvent.Topic.PARAM);
            }
            else {
                jMainTableLogs.hide(TextEvent.Topic.PARAM);
            }

            if (this.jCheckBoxMenuItemPROTOCOL.isSelected()) {
                jMainTableLogs.show(TextEvent.Topic.PROTOCOL);
            }
            else {
                jMainTableLogs.hide(TextEvent.Topic.PROTOCOL);
            }

            if (this.jCheckBoxMenuItemUSER.isSelected()) {
                jMainTableLogs.show(TextEvent.Topic.USER);
            }
            else {
                jMainTableLogs.hide(TextEvent.Topic.USER);
            }

            jMainTableLogs.setLevel(level);
        }
    }

    @Override
    public void setVisible(boolean visible) {
        if (true == visible) {
            this.jComboBoxRuns.setSelectedIndex(this.jComboBoxRuns.getItemCount() - 1);
        }
        super.setVisible(visible);
    }

    // <editor-fold defaultstate="collapsed" desc=" Application logs methods ">
    public JTableLogs getLogTable() {
        return jMainTableLogs;
    }

    public void gotoBottom() {
        jScrollPane1.getVerticalScrollBar().setValue(jScrollPane1.getVerticalScrollBar().getMaximum());
    }
    // </editor-fold>

    // </editor-fold>                        
    public void clearLogs() {
        if (null != this.logTables) {
            this.jTabbedPane.removeAll();
            this.jComboBoxRuns.removeAllItems();
            this.logTables.clear();
        }

        if (null != this.jMainTableLogs) {
            this.jMainTableLogs.clean();
        }
    }

    public void saveLogs(URI logApplicationPathName) {
        if (null != this.logTables) {
            for (Entry<String, LoggingSet> entry : this.logTables.entrySet()) {
                LoggingSet loggingSet = entry.getValue();
                loggingSet.save(logApplicationPathName);
            }
        }
        if (null != this.jMainTableLogs) {
            this.jMainTableLogs.save(logApplicationPathName);
        }
    }

    public void openLogs(Testcase testCase, String testCaseName, URI logApplicationPathName) throws Exception {

        //scenario Log
        if (null != testCase) {
            int idx;
            File logApplicationPath = new File(logApplicationPathName);

            File[] listFile = logApplicationPath.listFiles();
            String[] listFileString = new String[listFile.length];

            // sort by date of modification to avoid this : 1, 10, 11, 12, 13, 2, 3
            Arrays.sort(listFile, new Comparator<File>() {

                public int compare(File o1, File o2) {
                    return o1.lastModified() < o2.lastModified() ? -1 : o1.lastModified() == o2.lastModified() ? 0 : 1;
                }
            });

            for (idx = 0; idx < listFile.length; idx++) {
                listFileString[idx] = listFile[idx].getName();
                if (listFileString[idx].contains(testCase.getName())) {
                    LoggingSet loggingSet = this.logTables.get(listFileString[idx]);
                    if (loggingSet == null) {
                        loggingSet = new LoggingSet(testCase, testCaseName);
                        this.jComboBoxRuns.addItem(listFileString[idx]);
                        this.logTables.put(listFileString[idx], loggingSet);
                        loggingSet = this.logTables.get(listFileString[idx]);
                    }
                    loggingSet.open(listFileString[idx], testCase.getName(), logApplicationPathName);
                }
            }
        } // Application log
        else {
            this.jMainTableLogs.open(null, null, logApplicationPathName);
        }
    }

    public int searchLogs(String search, int idx) {
        if (!this.mainLogs) {
            String runId = (String) this.jComboBoxRuns.getSelectedItem();
            LoggingSet loggingSet = this.logTables.get(runId);
            int index = loggingSet.search(search, this.jTabbedPane.getTitleAt(this.jTabbedPane.getSelectedIndex()), idx);
            return index;
        }
        else {
            int index = this.jMainTableLogs.search(search, idx);
            return index;
        }
    }

    public boolean mainLog() {
        return this.mainLogs;
    }
}
