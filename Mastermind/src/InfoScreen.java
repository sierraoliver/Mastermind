/*Sierra Oliver
Mastermind Assignment
A casual guessing game where the user need to guess a 
randomly generated 4 colour code
*/

//Info Screen

import java.io.File;
import java.io.IOException;
import javax.swing.JRadioButton;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import nu.xom.*;

public class InfoScreen extends javax.swing.JDialog {
    public InfoScreen() {
        initComponents();
    }

    //declaring needed variables
    private ArrayList<String> colourList = new ArrayList<>();
    private ArrayList<String> code = new ArrayList<>();
    private int arraySize;
    private Random r = new Random();
    private int randomNumber;
    private long startTime;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        difficultyGroup = new javax.swing.ButtonGroup();
        duplicateGroup = new javax.swing.ButtonGroup();
        timedGroup = new javax.swing.ButtonGroup();
        titleLabel = new javax.swing.JLabel();
        titleBackground = new javax.swing.JLabel();
        difficultyLabel = new javax.swing.JLabel();
        duplicateLabel = new javax.swing.JLabel();
        timedLabel = new javax.swing.JLabel();
        easyDifficulty = new javax.swing.JRadioButton();
        mediumDifficulty = new javax.swing.JRadioButton();
        hardDifficulty = new javax.swing.JRadioButton();
        duplicatesAllowed = new javax.swing.JRadioButton();
        duplicatesDisallowed = new javax.swing.JRadioButton();
        timedAllowed = new javax.swing.JRadioButton();
        timedDisallowed = new javax.swing.JRadioButton();
        exitButton = new javax.swing.JButton();
        gameRulesButton = new javax.swing.JButton();
        playButton = new javax.swing.JButton();
        errorLabel = new javax.swing.JLabel();
        backgroundColour = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(102, 102, 102));
        setForeground(null);
        setResizable(false);
        setSize(new java.awt.Dimension(530, 450));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        titleLabel.setBackground(new java.awt.Color(0, 0, 0));
        titleLabel.setFont(new java.awt.Font("Avenir Next", 1, 36)); // NOI18N
        titleLabel.setForeground(new java.awt.Color(0, 0, 0));
        titleLabel.setText("Mastermind");
        getContentPane().add(titleLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 10, -1, -1));

        titleBackground.setBackground(new java.awt.Color(255, 255, 255));
        titleBackground.setOpaque(true);
        getContentPane().add(titleBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 530, 50));

        difficultyLabel.setFont(new java.awt.Font("Andale Mono", 1, 18)); // NOI18N
        difficultyLabel.setForeground(new java.awt.Color(255, 255, 255));
        difficultyLabel.setText("Level of Difficulty");
        getContentPane().add(difficultyLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 79, -1, -1));

        duplicateLabel.setFont(new java.awt.Font("Andale Mono", 1, 18)); // NOI18N
        duplicateLabel.setForeground(new java.awt.Color(255, 255, 255));
        duplicateLabel.setText("Duplicate Colours Allowed");
        getContentPane().add(duplicateLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 188, -1, -1));

        timedLabel.setFont(new java.awt.Font("Andale Mono", 1, 18)); // NOI18N
        timedLabel.setForeground(new java.awt.Color(255, 255, 255));
        timedLabel.setText("Timed Play");
        getContentPane().add(timedLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 300, -1, -1));

        easyDifficulty.setBackground(new java.awt.Color(102, 102, 102));
        difficultyGroup.add(easyDifficulty);
        easyDifficulty.setForeground(new java.awt.Color(255, 255, 255));
        easyDifficulty.setText("Easy");
        getContentPane().add(easyDifficulty, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 118, -1, -1));

        mediumDifficulty.setBackground(new java.awt.Color(102, 102, 102));
        difficultyGroup.add(mediumDifficulty);
        mediumDifficulty.setForeground(new java.awt.Color(255, 255, 255));
        mediumDifficulty.setText("Medium");
        getContentPane().add(mediumDifficulty, new org.netbeans.lib.awtextra.AbsoluteConstraints(101, 118, -1, -1));

        hardDifficulty.setBackground(new java.awt.Color(102, 102, 102));
        difficultyGroup.add(hardDifficulty);
        hardDifficulty.setForeground(new java.awt.Color(255, 255, 255));
        hardDifficulty.setText("Hard");
        getContentPane().add(hardDifficulty, new org.netbeans.lib.awtextra.AbsoluteConstraints(202, 118, -1, -1));

        duplicatesAllowed.setBackground(new java.awt.Color(102, 102, 102));
        duplicateGroup.add(duplicatesAllowed);
        duplicatesAllowed.setForeground(new java.awt.Color(255, 255, 255));
        duplicatesAllowed.setText("Yes");
        getContentPane().add(duplicatesAllowed, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 227, -1, -1));

        duplicatesDisallowed.setBackground(new java.awt.Color(102, 102, 102));
        duplicateGroup.add(duplicatesDisallowed);
        duplicatesDisallowed.setForeground(new java.awt.Color(255, 255, 255));
        duplicatesDisallowed.setText("No");
        getContentPane().add(duplicatesDisallowed, new org.netbeans.lib.awtextra.AbsoluteConstraints(98, 227, -1, -1));

        timedAllowed.setBackground(new java.awt.Color(102, 102, 102));
        timedGroup.add(timedAllowed);
        timedAllowed.setForeground(new java.awt.Color(255, 255, 255));
        timedAllowed.setText("Yes");
        getContentPane().add(timedAllowed, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 339, -1, -1));

        timedDisallowed.setBackground(new java.awt.Color(102, 102, 102));
        timedGroup.add(timedDisallowed);
        timedDisallowed.setForeground(new java.awt.Color(255, 255, 255));
        timedDisallowed.setText("No");
        getContentPane().add(timedDisallowed, new org.netbeans.lib.awtextra.AbsoluteConstraints(99, 339, -1, -1));

        exitButton.setBackground(new java.awt.Color(255, 0, 51));
        exitButton.setForeground(new java.awt.Color(255, 255, 255));
        exitButton.setText("Exit");
        exitButton.setBorderPainted(false);
        exitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButtonActionPerformed(evt);
            }
        });
        getContentPane().add(exitButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 390, 110, 50));

        gameRulesButton.setBackground(new java.awt.Color(0, 153, 204));
        gameRulesButton.setForeground(new java.awt.Color(255, 255, 255));
        gameRulesButton.setText("Rules of Play");
        gameRulesButton.setBorderPainted(false);
        gameRulesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gameRulesButtonActionPerformed(evt);
            }
        });
        getContentPane().add(gameRulesButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 390, 130, 50));

        playButton.setBackground(new java.awt.Color(0, 153, 0));
        playButton.setForeground(new java.awt.Color(255, 255, 255));
        playButton.setText("Play");
        playButton.setBorderPainted(false);
        playButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                playButtonActionPerformed(evt);
            }
        });
        getContentPane().add(playButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 387, 100, 50));

        errorLabel.setFont(new java.awt.Font("Andale Mono", 0, 10)); // NOI18N
        errorLabel.setForeground(new java.awt.Color(255, 255, 255));
        errorLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        getContentPane().add(errorLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 350, 320, 30));

        backgroundColour.setBackground(new java.awt.Color(102, 102, 102));
        backgroundColour.setOpaque(true);
        getContentPane().add(backgroundColour, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 530, 450));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButtonActionPerformed
        //exits program
        System.exit(0);
    }//GEN-LAST:event_exitButtonActionPerformed

    private void gameRulesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gameRulesButtonActionPerformed
        //goes to game rules screen
        RulesOfPlay rulesScreen = new RulesOfPlay();
        rulesScreen.setVisible(true);

        dispose();
    }//GEN-LAST:event_gameRulesButtonActionPerformed

    private void playButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_playButtonActionPerformed
        errorLabel.setText("");

        String difficultySelect;
        String duplicateSelect;
        String timedSelect;

        //checks the buttons to see which is selected
        difficultySelect = CheckModeButton(easyDifficulty, mediumDifficulty, hardDifficulty);
        duplicateSelect = CheckRadioButton(duplicatesAllowed, duplicatesDisallowed);
        timedSelect = CheckRadioButton(timedAllowed, timedDisallowed);

        //if one of the button groups is empty, it tells user there is an error
        if (difficultySelect == null || duplicateSelect == null || timedSelect == null) {
            errorLabel.setText("Please select a button for each group");
            return;
        }

        //reads the xml file
        try {
            XMLColours();

        } catch (Exception exception) {
            errorLabel.setText("Error: " + exception.getMessage());
            return;
        }

        CodeMaker(duplicateSelect);

        if (timedSelect.equals("yes")) {
            startTime = System.currentTimeMillis();
        }

        MastermindUI gameScreen = new MastermindUI(difficultySelect, code, startTime);
        
        gameScreen.setVisible(true);
        
        dispose();
        
    }//GEN-LAST:event_playButtonActionPerformed

    public void XMLColours() throws ParsingException, IOException {
        try {
            File file = new File ("XMLColours.xml");
            //get the xml file from the web and store the info locally in doc            
            Builder builder = new Builder();
            Document doc = builder.build(file);

            //get root element
            Element root = doc.getRootElement();

            Elements colours = root.getChildElements("colours");

            //get each colour element depending on the gamemode chosen
            for (int i = 0; i < colours.size(); i++) {
                Element colour = colours.get(i);

                if (i < arraySize) {
                    String colourName = colour.getValue();
                    colourList.add(colourName);
                }
            }
        } catch (ParsingException ex) {
            Logger.getLogger(InfoScreen.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(InfoScreen.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InfoScreen().setVisible(true);
            }
        });
    }

    private String CheckModeButton(JRadioButton radio1, JRadioButton radio2, JRadioButton radio3) {
        String element;

        //if easy mode is selected
        if (radio1.isSelected()) {
            element = "easy";
            arraySize = 4;
            randomNumber = 3;
            return (element);
        } 
        
        //if medium mode is selected
        else if (radio2.isSelected()) {
            element = "medium";
            arraySize = 6;
            randomNumber = 5;
            return (element);
        } 
        
        //if hard mode is selected
        else if (radio3.isSelected()) {
            element = "hard";
            arraySize = 8;
            randomNumber = 7;
            return (element);
        }
        
        
        return null;
    }

    private String CheckRadioButton(JRadioButton radio1, JRadioButton radio2) {
        String element;

        //if yes button is selected (for either duplicate or timed)
        if (radio1.isSelected()) {
            element = "yes";
            return (element);
        } 
        
        //if no button is selected (for either duplicate or timed)
        else if (radio2.isSelected()) {
            element = "no";
            return (element);
        }

        return null;

    }

    private void CodeMaker(String duplicates) {
        int num;

        //if duplicates are allowed, it will not remove the colour from array
        if (duplicates.equals("yes")) {
            for (int x = 0; x < arraySize; x++) {
                num = r.nextInt(randomNumber - (0) + 1) + 0;

                code.add(colourList.get(num));
            }
        } 
        
        //if duplicates aren't allowed, it will remove colour from array
        else {
            for (int x = 0; x < arraySize; x++) {
                num = r.nextInt(randomNumber - (0) + 1) + 0;

                code.add(colourList.get(num));
                colourList.remove(num);
                randomNumber -= 1;
            }
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel backgroundColour;
    private javax.swing.ButtonGroup difficultyGroup;
    private javax.swing.JLabel difficultyLabel;
    private javax.swing.ButtonGroup duplicateGroup;
    private javax.swing.JLabel duplicateLabel;
    private javax.swing.JRadioButton duplicatesAllowed;
    private javax.swing.JRadioButton duplicatesDisallowed;
    private javax.swing.JRadioButton easyDifficulty;
    private javax.swing.JLabel errorLabel;
    private javax.swing.JButton exitButton;
    private javax.swing.JButton gameRulesButton;
    private javax.swing.JRadioButton hardDifficulty;
    private javax.swing.JRadioButton mediumDifficulty;
    private javax.swing.JButton playButton;
    private javax.swing.JRadioButton timedAllowed;
    private javax.swing.JRadioButton timedDisallowed;
    private javax.swing.ButtonGroup timedGroup;
    private javax.swing.JLabel timedLabel;
    private javax.swing.JLabel titleBackground;
    private javax.swing.JLabel titleLabel;
    // End of variables declaration//GEN-END:variables
}
