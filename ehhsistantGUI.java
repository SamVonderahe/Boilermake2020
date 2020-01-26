package com.mycompany.ehhsistant;


import java.awt.Image;
import java.util.ArrayList;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JDialog;
import javax.swing.SpinnerNumberModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author spencerdouglas
 */
public class EhhsistantGUI extends javax.swing.JFrame {
    static final String NO_PRES_SELECTED_TEXT = "<html>You currently have no presentation selected.  <br>To create a recording, first select or create a new presentation below.</html>";
    static final String PRES_SELECTED_TEXT = "<html>Current Presentation Practice: %s<br>Press record to make a new practice attempt.</html>";

    
    Presentation selectedPresentation = null;
    ArrayList<Presentation> presentationList = new ArrayList<Presentation>(0);
    Speech currentRecording = null;
    
    /**
     * Creates new form mainFrame1
     */
    public EhhsistantGUI() {
        initComponents();
    }
    private SpinnerNumberModel secondFormat = new SpinnerNumberModel(0, 0, 45, 15);
    private SpinnerNumberModel minuteFormat = new SpinnerNumberModel(5, 0, 30, 1);
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        selectPresentationDialog = new javax.swing.JDialog();
        jScrollPane1 = new javax.swing.JScrollPane();
        selectPresentationDialogList = new javax.swing.JList<>();
        presentationDialogLabel = new javax.swing.JLabel();
        cancelPresentationSelectionButton = new javax.swing.JButton();
        confirmSelectionDialogButton = new javax.swing.JButton();
        createPresentationDialog = new javax.swing.JDialog();
        newPresentationNameLabel = new javax.swing.JLabel();
        presentationNameTextField = new javax.swing.JTextField();
        newPresentationNameLabel1 = new javax.swing.JLabel();
        jSpinner1 = new javax.swing.JSpinner(minuteFormat);
        jSpinner2 = new javax.swing.JSpinner(secondFormat);
        newPresentationTimeGoalLabel = new javax.swing.JLabel();
        lengthGoalCheckbox = new javax.swing.JCheckBox();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        newPresentationNameLabel2 = new javax.swing.JLabel();
        jSpinner3 = new javax.swing.JSpinner(minuteFormat);
        newPresentationTimeGoalLabel1 = new javax.swing.JLabel();
        jSpinner4 = new javax.swing.JSpinner(secondFormat);
        jScrollPane5 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        panelContainer = new javax.swing.JTabbedPane();
        recordPanel = new javax.swing.JPanel();
        createNewPresentionButton = new javax.swing.JButton();
        noPresentationSelectedLabel = new javax.swing.JLabel();
        selectPresentationButton = new javax.swing.JButton();
        recordButton = new javax.swing.JButton();
        pausePlayButton = new javax.swing.JButton();
        stopButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        recordingRenderingTextArea = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        managePanel = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        managePresentationList = new javax.swing.JList<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        manageRecordingList = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        selectPresentationDialogList.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = getPresentationNameList();
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(selectPresentationDialogList);

        presentationDialogLabel.setText("Please select a presentation from the list below.");

        cancelPresentationSelectionButton.setText("Cancel");

        confirmSelectionDialogButton.setText("Select Presentation");

        javax.swing.GroupLayout selectPresentationDialogLayout = new javax.swing.GroupLayout(selectPresentationDialog.getContentPane());
        selectPresentationDialog.getContentPane().setLayout(selectPresentationDialogLayout);
        selectPresentationDialogLayout.setHorizontalGroup(
            selectPresentationDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(selectPresentationDialogLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(selectPresentationDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(presentationDialogLabel)
                    .addGroup(selectPresentationDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(selectPresentationDialogLayout.createSequentialGroup()
                            .addComponent(cancelPresentationSelectionButton, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(confirmSelectionDialogButton, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(45, Short.MAX_VALUE))
        );
        selectPresentationDialogLayout.setVerticalGroup(
            selectPresentationDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(selectPresentationDialogLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(presentationDialogLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(selectPresentationDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(confirmSelectionDialogButton)
                    .addComponent(cancelPresentationSelectionButton))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        selectPresentationDialog.setSize(390, 240);
        selectPresentationDialog.setLocationRelativeTo(panelContainer);

        newPresentationNameLabel.setText("Presentation Name:");

        newPresentationNameLabel1.setText("Length Goal (Optional):");

        newPresentationTimeGoalLabel.setText(":");

        lengthGoalCheckbox.setSelected(true);
        lengthGoalCheckbox.setText("Set Length Goal");
        lengthGoalCheckbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lengthGoalCheckboxActionPerformed(evt);
            }
        });

        jButton5.setText("Create Presentation");

        jButton6.setText("Cancel");

        newPresentationNameLabel2.setText("Add Speech Checkpoint Goal: ");

        newPresentationTimeGoalLabel1.setText(":");

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = getPresentationNameList();
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane5.setViewportView(jList1);

        jButton7.setText("Add");

        jButton8.setText("Remove Selected Goal");

        javax.swing.GroupLayout createPresentationDialogLayout = new javax.swing.GroupLayout(createPresentationDialog.getContentPane());
        createPresentationDialog.getContentPane().setLayout(createPresentationDialogLayout);
        createPresentationDialogLayout.setHorizontalGroup(
            createPresentationDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(createPresentationDialogLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(createPresentationDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(newPresentationNameLabel)
                    .addComponent(newPresentationNameLabel1)
                    .addComponent(newPresentationNameLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(createPresentationDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(presentationNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(createPresentationDialogLayout.createSequentialGroup()
                        .addGroup(createPresentationDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(createPresentationDialogLayout.createSequentialGroup()
                                .addComponent(jSpinner3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(2, 2, 2)
                                .addComponent(newPresentationTimeGoalLabel1)
                                .addGap(3, 3, 3)
                                .addComponent(jSpinner4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(29, 29, 29)
                                .addComponent(jButton7))
                            .addGroup(createPresentationDialogLayout.createSequentialGroup()
                                .addComponent(lengthGoalCheckbox)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(2, 2, 2)
                        .addComponent(newPresentationTimeGoalLabel)
                        .addGap(3, 3, 3)
                        .addComponent(jSpinner2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, createPresentationDialogLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(jButton5)
                .addGap(70, 70, 70))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, createPresentationDialogLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, createPresentationDialogLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton8)
                .addGap(160, 160, 160))
        );
        createPresentationDialogLayout.setVerticalGroup(
            createPresentationDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(createPresentationDialogLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(createPresentationDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(newPresentationNameLabel)
                    .addComponent(presentationNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(createPresentationDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(newPresentationNameLabel1)
                    .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSpinner2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(newPresentationTimeGoalLabel)
                    .addComponent(lengthGoalCheckbox))
                .addGap(18, 18, 18)
                .addGroup(createPresentationDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(newPresentationNameLabel2)
                    .addComponent(jSpinner3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSpinner4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(newPresentationTimeGoalLabel1)
                    .addComponent(jButton7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton8)
                .addGap(17, 17, 17)
                .addGroup(createPresentationDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton5)
                    .addComponent(jButton6))
                .addGap(20, 20, 20))
        );

        createPresentationDialog.setSize(500, 350);
        createPresentationDialog.setLocationRelativeTo(panelContainer);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        createNewPresentionButton.setText("Create New Presentation");
        createNewPresentionButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createNewPresentionButtonActionPerformed(evt);
            }
        });

        try {
            noPresentationSelectedLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            String text = (selectedPresentation == null) ? NO_PRES_SELECTED_TEXT : PRES_SELECTED_TEXT;
            noPresentationSelectedLabel.setText(text);

            selectPresentationButton.setText("Select Presentation");
            selectPresentationButton.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    selectPresentationButtonActionPerformed(evt);
                }
            });

            recordButton.setText("Record");
            recordButton.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    recordButtonActionPerformed(evt);
                }
            });

            pausePlayButton.setText("Play/Pause");
            pausePlayButton.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    pausePlayButtonActionPerformed(evt);
                }
            });
            try {
                Image img = ImageIO.read(getClass().getResource("resources/pauseplay.svg"));
                pausePlayButton.setIcon(new ImageIcon(img));
            } catch (Exception ex) {
                System.out.println("How");
            }

            stopButton.setText("Stop");
            stopButton.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    stopButtonActionPerformed(evt);
                }
            });

            deleteButton.setText("Delete Recording");

            recordingRenderingTextArea.setColumns(20);
            recordingRenderingTextArea.setRows(5);
            recordingRenderingTextArea.setText("Audio Suite Placeholder!\n");
            jScrollPane4.setViewportView(recordingRenderingTextArea);
            // appears as recording if a new recording is being made.

            jButton1.setText("Save/Analyze Practice");
            jButton1.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jButton1ActionPerformed(evt);
                }
            });

            noPresentationSelectedLabel.setVisible(true);
        } catch (Exception ex) {
            System.out.println("Exception 2");
        }

        javax.swing.GroupLayout recordPanelLayout = new javax.swing.GroupLayout(recordPanel);
        recordPanel.setLayout(recordPanelLayout);
        recordPanelLayout.setHorizontalGroup(
            recordPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(recordPanelLayout.createSequentialGroup()
                .addGroup(recordPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(recordPanelLayout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addGroup(recordPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(noPresentationSelectedLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 466, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, recordPanelLayout.createSequentialGroup()
                                .addComponent(createNewPresentionButton, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(selectPresentationButton, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(recordPanelLayout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addGroup(recordPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 428, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, recordPanelLayout.createSequentialGroup()
                                .addComponent(recordButton)
                                .addGap(37, 37, 37)
                                .addGroup(recordPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jButton1)
                                    .addGroup(recordPanelLayout.createSequentialGroup()
                                        .addComponent(pausePlayButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(stopButton, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(deleteButton)))))
                .addContainerGap(55, Short.MAX_VALUE))
        );
        recordPanelLayout.setVerticalGroup(
            recordPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, recordPanelLayout.createSequentialGroup()
                .addGap(112, 112, 112)
                .addComponent(noPresentationSelectedLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(recordPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(recordPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(pausePlayButton)
                        .addComponent(stopButton)
                        .addComponent(deleteButton))
                    .addComponent(recordButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 253, Short.MAX_VALUE)
                .addGroup(recordPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(createNewPresentionButton)
                    .addComponent(selectPresentationButton))
                .addGap(51, 51, 51))
        );

        panelContainer.addTab("Record Presentation", recordPanel);

        managePresentationList.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = getPresentationNameList();
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(managePresentationList);

        manageRecordingList.setModel(new javax.swing.AbstractListModel<String>() {
            //String[] strings = getRecordingList(presentationList.get(managePresentationList.getSelectedIndex()));
            String[] strings = {};
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane3.setViewportView(manageRecordingList);

        jLabel1.setText("Presentations");

        jLabel2.setText("Recordings");

        javax.swing.GroupLayout managePanelLayout = new javax.swing.GroupLayout(managePanel);
        managePanel.setLayout(managePanelLayout);
        managePanelLayout.setHorizontalGroup(
            managePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(managePanelLayout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45))
            .addGroup(managePanelLayout.createSequentialGroup()
                .addGap(113, 113, 113)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(118, 118, 118))
        );
        managePanelLayout.setVerticalGroup(
            managePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(managePanelLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(managePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(managePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(292, Short.MAX_VALUE))
        );

        panelContainer.addTab("Manage Presentations", managePanel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(panelContainer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 700, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(panelContainer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>                        

    private void createNewPresentionButtonActionPerformed(java.awt.event.ActionEvent evt) {                                                          
        createPresentationDialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
        createPresentationDialog.setVisible(true);
    }                                                         

    private void selectPresentationButtonActionPerformed(java.awt.event.ActionEvent evt) {                                                         
        selectPresentationDialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
        selectPresentationDialog.setVisible(true);
    }                                                        

    private void lengthGoalCheckboxActionPerformed(java.awt.event.ActionEvent evt) {                                                   
        jSpinner1.setVisible(lengthGoalCheckbox.isSelected());
        jSpinner2.setVisible(lengthGoalCheckbox.isSelected());
        newPresentationTimeGoalLabel.setVisible(lengthGoalCheckbox.isSelected());
    }                                                  

    private void recordButtonActionPerformed(java.awt.event.ActionEvent evt) {                                             
        currentRecording = new Speech("obama.wav", null);
        currentRecording.record();
        recordingRenderingTextArea.setText("Recording...");
    }                                            

    private void stopButtonActionPerformed(java.awt.event.ActionEvent evt) {                                           
        currentRecording.stopRecording();
    }                                          

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
    }                                        

    private void pausePlayButtonActionPerformed(java.awt.event.ActionEvent evt) {                                                
        // TODO add your handling code here:
    }                                               

    private String[] getPresentationNameList() {
        if (presentationList == null) 
            return null;
        String[] stringArr = new String[presentationList.size()];
        for (int i = 0; i < presentationList.size(); i++) {
            stringArr[i] = presentationList.get(i).toString();
        }
        return stringArr;
    }
    private String[] getRecordingList(Presentation pres) {
        String[] stringArr = new String[pres.getSpeechList().size()];
        for (int i = 0; i < pres.getSpeechList().size(); i++) {
            stringArr[i] = pres.getSpeechList().get(i).toString();
        }
        return stringArr;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(EhhsistantGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EhhsistantGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EhhsistantGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EhhsistantGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                EhhsistantGUI gui = new EhhsistantGUI();
                gui.setVisible(true);
                //gui.setLocationRelativeTo(null);
                
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton cancelPresentationSelectionButton;
    private javax.swing.JButton confirmSelectionDialogButton;
    private javax.swing.JButton createNewPresentionButton;
    private javax.swing.JDialog createPresentationDialog;
    private javax.swing.JButton deleteButton;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JList<String> jList1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JSpinner jSpinner2;
    private javax.swing.JSpinner jSpinner3;
    private javax.swing.JSpinner jSpinner4;
    private javax.swing.JCheckBox lengthGoalCheckbox;
    private javax.swing.JPanel managePanel;
    private javax.swing.JList<String> managePresentationList;
    private javax.swing.JList<String> manageRecordingList;
    private javax.swing.JLabel newPresentationNameLabel;
    private javax.swing.JLabel newPresentationNameLabel1;
    private javax.swing.JLabel newPresentationNameLabel2;
    private javax.swing.JLabel newPresentationTimeGoalLabel;
    private javax.swing.JLabel newPresentationTimeGoalLabel1;
    private javax.swing.JLabel noPresentationSelectedLabel;
    private javax.swing.JTabbedPane panelContainer;
    private javax.swing.JButton pausePlayButton;
    private javax.swing.JLabel presentationDialogLabel;
    private javax.swing.JTextField presentationNameTextField;
    private javax.swing.JButton recordButton;
    private javax.swing.JPanel recordPanel;
    private javax.swing.JTextArea recordingRenderingTextArea;
    private javax.swing.JButton selectPresentationButton;
    private javax.swing.JDialog selectPresentationDialog;
    private javax.swing.JList<String> selectPresentationDialogList;
    private javax.swing.JButton stopButton;
    // End of variables declaration                   
}