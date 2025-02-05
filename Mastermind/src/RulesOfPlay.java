//Game Rules Screen

public class RulesOfPlay extends javax.swing.JDialog {

    public RulesOfPlay (){
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        titleLabel = new javax.swing.JLabel();
        objectiveLabel = new javax.swing.JLabel();
        objectiveLabel2 = new javax.swing.JLabel();
        rulesLabel = new javax.swing.JLabel();
        rule1Label = new javax.swing.JLabel();
        rule1Label2 = new javax.swing.JLabel();
        rule2Label = new javax.swing.JLabel();
        rule2Label2 = new javax.swing.JLabel();
        rule2Label3 = new javax.swing.JLabel();
        rule2Label4 = new javax.swing.JLabel();
        rule3Label = new javax.swing.JLabel();
        duplicateInfo = new javax.swing.JLabel();
        timedInfo = new javax.swing.JLabel();
        easyInfo = new javax.swing.JLabel();
        mediumInfo = new javax.swing.JLabel();
        hardInfo = new javax.swing.JLabel();
        backButton = new javax.swing.JButton();
        backgroundColour = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        setSize(new java.awt.Dimension(530, 450));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        titleLabel.setFont(new java.awt.Font("Avenir Next", 1, 36)); // NOI18N
        titleLabel.setForeground(new java.awt.Color(255, 255, 255));
        titleLabel.setText("Rules of Play");
        getContentPane().add(titleLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(143, 15, -1, -1));

        objectiveLabel.setForeground(new java.awt.Color(255, 255, 255));
        objectiveLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        objectiveLabel.setText("The objective of the game is to guess the exact positions of the ");
        getContentPane().add(objectiveLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, 410, 30));

        objectiveLabel2.setForeground(new java.awt.Color(255, 255, 255));
        objectiveLabel2.setText("randomly generated code consiting of 4 colours.");
        getContentPane().add(objectiveLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 90, -1, -1));

        rulesLabel.setForeground(new java.awt.Color(255, 255, 255));
        rulesLabel.setText("Rules");
        getContentPane().add(rulesLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, 20));

        rule1Label.setForeground(new java.awt.Color(255, 255, 255));
        rule1Label.setText("1. Each turn you will pick a code consiting of 4 colours. After selection you will click the");
        getContentPane().add(rule1Label, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, -1, -1));

        rule1Label2.setForeground(new java.awt.Color(255, 255, 255));
        rule1Label2.setText("guess button. If you make a mistake, click the undo button. ");
        getContentPane().add(rule1Label2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, -1, -1));

        rule2Label.setForeground(new java.awt.Color(255, 255, 255));
        rule2Label.setText("2. After a guess is made, the program will tell you infromation about the placement.");
        getContentPane().add(rule2Label, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, -1, -1));

        rule2Label2.setForeground(new java.awt.Color(255, 255, 255));
        rule2Label2.setText("If the icon is green, this means it is the correct colour in the correct position. ");
        getContentPane().add(rule2Label2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, -1, -1));

        rule2Label3.setForeground(new java.awt.Color(255, 255, 255));
        rule2Label3.setText("If the icon is white, this means it is the correct colour in the wrong position.");
        getContentPane().add(rule2Label3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, -1, -1));

        rule2Label4.setForeground(new java.awt.Color(255, 255, 255));
        rule2Label4.setText("If there is no icon at all, this means that colour isn't present in the code.");
        getContentPane().add(rule2Label4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, -1, -1));

        rule3Label.setForeground(new java.awt.Color(255, 255, 255));
        rule3Label.setText("3. You will win the game if you guess the code. You will lose if you run out of guesses.");
        getContentPane().add(rule3Label, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, -1, -1));

        duplicateInfo.setForeground(new java.awt.Color(255, 255, 255));
        duplicateInfo.setText("If duplicate mode is selected, there can be duplicate colours in the code.");
        getContentPane().add(duplicateInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, -1, -1));

        timedInfo.setForeground(new java.awt.Color(255, 255, 255));
        timedInfo.setText("If timed mode is selected, it will tell you how long it took you to win or lose.");
        getContentPane().add(timedInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, -1, -1));

        easyInfo.setForeground(new java.awt.Color(255, 255, 255));
        easyInfo.setText("Easy mode means there are 4 colours to choose from for the code.");
        getContentPane().add(easyInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, -1, -1));

        mediumInfo.setForeground(new java.awt.Color(255, 255, 255));
        mediumInfo.setText("Medium mode means there are 6 colours to choose from for the code.");
        getContentPane().add(mediumInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 370, -1, -1));

        hardInfo.setForeground(new java.awt.Color(255, 255, 255));
        hardInfo.setText("Hard mode means there are 8 colours to choose from for the code.");
        getContentPane().add(hardInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 390, -1, -1));

        backButton.setBackground(new java.awt.Color(0, 153, 204));
        backButton.setForeground(new java.awt.Color(255, 255, 255));
        backButton.setText("Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });
        getContentPane().add(backButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 420, 110, -1));

        backgroundColour.setBackground(new java.awt.Color(102, 102, 102));
        backgroundColour.setOpaque(true);
        getContentPane().add(backgroundColour, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 530, 450));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        //goes back to the starting / info screen
        InfoScreen screen = new InfoScreen ();
        screen.setVisible(true);
        
        dispose();
    }//GEN-LAST:event_backButtonActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               new RulesOfPlay().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JLabel backgroundColour;
    private javax.swing.JLabel duplicateInfo;
    private javax.swing.JLabel easyInfo;
    private javax.swing.JLabel hardInfo;
    private javax.swing.JLabel mediumInfo;
    private javax.swing.JLabel objectiveLabel;
    private javax.swing.JLabel objectiveLabel2;
    private javax.swing.JLabel rule1Label;
    private javax.swing.JLabel rule1Label2;
    private javax.swing.JLabel rule2Label;
    private javax.swing.JLabel rule2Label2;
    private javax.swing.JLabel rule2Label3;
    private javax.swing.JLabel rule2Label4;
    private javax.swing.JLabel rule3Label;
    private javax.swing.JLabel rulesLabel;
    private javax.swing.JLabel timedInfo;
    private javax.swing.JLabel titleLabel;
    // End of variables declaration//GEN-END:variables
}
