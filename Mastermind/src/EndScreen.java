
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import nu.xom.Builder;
import nu.xom.Document;
import nu.xom.Element;
import nu.xom.Elements;
import nu.xom.ParsingException;
import javax.xml.parsers.*;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.*;
import org.xml.sax.*;

//End Screen 
//win / lose screen

public class EndScreen extends javax.swing.JDialog {
    private long endTime ;
    private long elapsedTime;
    
    EndScreen(boolean gameDecision, long startTime) {
        initComponents();
        
        //if they win
        if (gameDecision){
            outputLabel.setText("Congratulations!!\n You Win!");
        }
        //if they lose
        else{
            outputLabel.setText("You Lose :(\n You Used All 8 Guesses");
        }
        
        //if the timed wasn't selected
        if (startTime == 0){
            return;
        }
        
        //creates the time it took user to finish
        endTime = System.currentTimeMillis();
        elapsedTime = (endTime - startTime)/1000;
        
        //sets the label as the time they took
        timeLabel.setText("It took you " + (String.valueOf(elapsedTime)) + " seconds to complete");
        
        //just so they cant lose quickly to get the high score
        if (!gameDecision){
            return; 
        }
        
        long score;
        
        //gets value for the previous high score
        try {
            score= XMLHighScoreValue ();

        } catch (Exception exception) {
            System.out.println("Error: " + exception.getMessage());
            return;
        }
         
       //writes over preivous score with new one
        try {
            XMLHighScoreWrite (score);

        } catch (Exception exception) {
            System.out.println("Error: " + exception.getMessage());
            return;
        }
       
    }
    
    public EndScreen() {
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        highScoreLabel = new javax.swing.JLabel();
        highScoreTitleLabel = new javax.swing.JLabel();
        timeLabel = new javax.swing.JLabel();
        outputLabel = new javax.swing.JLabel();
        startButton = new javax.swing.JButton();
        exitButton = new javax.swing.JButton();
        backgroundColour = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        highScoreLabel.setForeground(new java.awt.Color(255, 255, 255));
        highScoreLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(highScoreLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(511, 30, 80, 30));

        highScoreTitleLabel.setForeground(new java.awt.Color(255, 255, 255));
        highScoreTitleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        highScoreTitleLabel.setText("High Score");
        getContentPane().add(highScoreTitleLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 10, 70, 20));

        timeLabel.setFont(new java.awt.Font("Calibri Light", 2, 14)); // NOI18N
        timeLabel.setForeground(new java.awt.Color(255, 255, 255));
        timeLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(timeLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 280, 300, 30));

        outputLabel.setFont(new java.awt.Font("Mermaid", 1, 24)); // NOI18N
        outputLabel.setForeground(new java.awt.Color(255, 255, 255));
        outputLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(outputLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 540, 190));

        startButton.setBackground(new java.awt.Color(0, 255, 153));
        startButton.setForeground(new java.awt.Color(0, 0, 0));
        startButton.setText("Back to Start");
        startButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startButtonActionPerformed(evt);
            }
        });
        getContentPane().add(startButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 400, 160, -1));

        exitButton.setBackground(new java.awt.Color(204, 0, 0));
        exitButton.setForeground(new java.awt.Color(255, 255, 255));
        exitButton.setText("Exit");
        exitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButtonActionPerformed(evt);
            }
        });
        getContentPane().add(exitButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(406, 400, 150, -1));

        backgroundColour.setBackground(new java.awt.Color(102, 102, 102));
        backgroundColour.setOpaque(true);
        getContentPane().add(backgroundColour, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 620, 450));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButtonActionPerformed
        //exits program
        System.exit(0);
    }//GEN-LAST:event_exitButtonActionPerformed

    private void startButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startButtonActionPerformed
        //goes back to starting / info screen
        InfoScreen startingScreen = new InfoScreen();
        startingScreen.setVisible(true);
        dispose();
    }//GEN-LAST:event_startButtonActionPerformed

    private long XMLHighScoreValue() throws ParsingException, IOException{
        try {
            File file = new File ("XMLHighScores.xml");
            
            Builder builder = new Builder();
            Document doc = builder.build(file);
             
            Element root = doc.getRootElement();

            Elements highScore = root.getChildElements("highscore");
            
            Element scores = highScore.get(0);
            
            long score = Long.parseLong(scores.getValue());
            return (score);
            
        }
         catch (ParsingException ex) {
            Logger.getLogger(InfoScreen.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(InfoScreen.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return(elapsedTime);
   
    }
    
    private void XMLHighScoreWrite (long score) throws ParsingException, IOException{
        try {
            File file = new File ("XMLHighScores.xml");
            String filepath = ("XMLHighScores.xml");
            
            DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
            org.w3c.dom.Document doc = docBuilder.parse(file);

            Node Score = doc.getElementsByTagName("highscore").item(0);
             
            //if previous high score is shorter than this users time 
            //it outputs the previous score from the xml file
            if (elapsedTime>score){
                
               highScoreLabel.setText(String.valueOf(score) + " secs"); 
                return;
            }
            
            //if not, it outputs the new score and changes the score in the xml file
            highScoreLabel.setText(String.valueOf(elapsedTime) + " secs");
            Score.setTextContent(String.valueOf(elapsedTime)); 

            //write the content into xml file
            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            DOMSource source = new DOMSource(doc);
            StreamResult result =  new StreamResult(new File(filepath));
            transformer.transform(source, result);
            
        }
        catch(ParserConfigurationException pce){
	 pce.printStackTrace();
        }catch(IOException ioe){
	 ioe.printStackTrace();
        }catch(TransformerException tfe){
	 tfe.printStackTrace();
        }catch(SAXException sae){
	 sae.printStackTrace();
   }

    }
   
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
            java.util.logging.Logger.getLogger(EndScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EndScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EndScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EndScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EndScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel backgroundColour;
    private javax.swing.JButton exitButton;
    private javax.swing.JLabel highScoreLabel;
    private javax.swing.JLabel highScoreTitleLabel;
    private javax.swing.JLabel outputLabel;
    private javax.swing.JButton startButton;
    private javax.swing.JLabel timeLabel;
    // End of variables declaration//GEN-END:variables
}
