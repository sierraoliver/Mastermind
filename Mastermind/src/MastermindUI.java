//Main Game Screen

import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JLabel;

public class MastermindUI extends javax.swing.JFrame {
    
    MastermindUI(String difficultySelect, ArrayList<String> code, long startTime) {
        initComponents();
        
        //gets variables from info screen
        this.startTime = startTime;
        this.gamemode = difficultySelect;
        this.code = code;
        
        //sets button background
        redButton.setBackground(red);
        blueButton.setBackground(blue);
        greenButton.setBackground(green);
        yellowButton.setBackground(yellow);
        tealButton.setBackground(teal);
        purpleButton.setBackground(purple);
        blackButton.setBackground(black);
        whiteButton.setBackground(white);

        //creates peg array list
        AddPegs();
    }
    
    //needed for the timed mode
    private long startTime;
    
    //array lists used
    private ArrayList<String> code = new ArrayList<> ();
    private ArrayList <Peg> pegs = new ArrayList <>();
    private ArrayList <String> guess = new ArrayList <>();
    
    //mode of the game
    private String gamemode;
    
    //counters used
    private int overallGuessCounter =1; //overall guesses (the coluumns)
    private int guessCounter =0;//all guesses (after each guess its added by 1)
    private int currentGuess =0;//resets after each column
    
    //sees if they win or lose game
    private boolean gameDecision;
    
    //button colours
    private final Color red = new Color(255, 51, 51);
    private final Color blue = new Color(102, 153, 255);
    private final Color green = new Color(102, 255, 102);
    private final Color yellow = new Color(255, 255, 102);
    private final Color teal = new Color(0, 204, 204);
    private final Color purple = new Color(204, 153, 255);
    private final Color black = new Color(0, 0, 0);
    private final Color white = new Color(255, 255, 255);
    
    //board and peg colours
    private final Color pegColour = new Color (207,151,81);
    private final Color boardColour = new Color (117,82,34);

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        h4Indicator = new javax.swing.JLabel();
        h4 = new javax.swing.JLabel();
        h3Indicator = new javax.swing.JLabel();
        h3 = new javax.swing.JLabel();
        h2Indicator = new javax.swing.JLabel();
        h2 = new javax.swing.JLabel();
        h1Indicator = new javax.swing.JLabel();
        h1 = new javax.swing.JLabel();
        g4Indicator = new javax.swing.JLabel();
        g4 = new javax.swing.JLabel();
        g3Indicator = new javax.swing.JLabel();
        g3 = new javax.swing.JLabel();
        g2Indicator = new javax.swing.JLabel();
        g2 = new javax.swing.JLabel();
        g1Indicator = new javax.swing.JLabel();
        g1 = new javax.swing.JLabel();
        f4Indicator = new javax.swing.JLabel();
        f4 = new javax.swing.JLabel();
        f3Indicator = new javax.swing.JLabel();
        f3 = new javax.swing.JLabel();
        f2Indicator = new javax.swing.JLabel();
        f2 = new javax.swing.JLabel();
        f1Indicator = new javax.swing.JLabel();
        f1 = new javax.swing.JLabel();
        e4Indicator = new javax.swing.JLabel();
        e4 = new javax.swing.JLabel();
        e3Indicator = new javax.swing.JLabel();
        e3 = new javax.swing.JLabel();
        e2Indicator = new javax.swing.JLabel();
        e2 = new javax.swing.JLabel();
        e1Indicator = new javax.swing.JLabel();
        e1 = new javax.swing.JLabel();
        d4Indicator = new javax.swing.JLabel();
        d4 = new javax.swing.JLabel();
        d3Indicator = new javax.swing.JLabel();
        d3 = new javax.swing.JLabel();
        d2Indicator = new javax.swing.JLabel();
        d2 = new javax.swing.JLabel();
        d1Indicator = new javax.swing.JLabel();
        d1 = new javax.swing.JLabel();
        c4Indicator = new javax.swing.JLabel();
        c4 = new javax.swing.JLabel();
        c3Indicator = new javax.swing.JLabel();
        c3 = new javax.swing.JLabel();
        c2Indicator = new javax.swing.JLabel();
        c2 = new javax.swing.JLabel();
        c1Indicator = new javax.swing.JLabel();
        c1 = new javax.swing.JLabel();
        b4Indicator = new javax.swing.JLabel();
        b4 = new javax.swing.JLabel();
        b3Indicator = new javax.swing.JLabel();
        b3 = new javax.swing.JLabel();
        b2Indicator = new javax.swing.JLabel();
        b2 = new javax.swing.JLabel();
        b1Indicator = new javax.swing.JLabel();
        b1 = new javax.swing.JLabel();
        a4Indicator = new javax.swing.JLabel();
        a4 = new javax.swing.JLabel();
        a3Indicator = new javax.swing.JLabel();
        a3 = new javax.swing.JLabel();
        a2Indicator = new javax.swing.JLabel();
        a2 = new javax.swing.JLabel();
        a1Indicator = new javax.swing.JLabel();
        a1 = new javax.swing.JLabel();
        boardBackground = new javax.swing.JLabel();
        redButton = new javax.swing.JButton();
        blueButton = new javax.swing.JButton();
        greenButton = new javax.swing.JButton();
        yellowButton = new javax.swing.JButton();
        tealButton = new javax.swing.JButton();
        purpleButton = new javax.swing.JButton();
        blackButton = new javax.swing.JButton();
        whiteButton = new javax.swing.JButton();
        exitButton = new javax.swing.JButton();
        undoButton = new javax.swing.JButton();
        guessButton = new javax.swing.JButton();
        modeLabel = new javax.swing.JLabel();
        backgroundColour = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(0, 0, 720, 455));
        setMinimumSize(new java.awt.Dimension(720, 450));
        setResizable(false);
        setSize(new java.awt.Dimension(714, 455));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        h4Indicator.setBackground(new java.awt.Color(117, 82, 34));
        h4Indicator.setOpaque(true);
        getContentPane().add(h4Indicator, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 270, 10, 40));

        h4.setBackground(new java.awt.Color(207, 151, 81));
        h4.setOpaque(true);
        getContentPane().add(h4, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 270, 50, 40));

        h3Indicator.setBackground(new java.awt.Color(117, 82, 34));
        h3Indicator.setOpaque(true);
        getContentPane().add(h3Indicator, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 200, 10, 40));

        h3.setBackground(new java.awt.Color(207, 151, 81));
        h3.setOpaque(true);
        getContentPane().add(h3, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 200, 50, 40));

        h2Indicator.setBackground(new java.awt.Color(117, 82, 34));
        h2Indicator.setOpaque(true);
        getContentPane().add(h2Indicator, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 130, 10, 40));

        h2.setBackground(new java.awt.Color(207, 151, 81));
        h2.setOpaque(true);
        getContentPane().add(h2, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 130, 50, 40));

        h1Indicator.setBackground(new java.awt.Color(117, 82, 34));
        h1Indicator.setOpaque(true);
        getContentPane().add(h1Indicator, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 60, 10, 40));

        h1.setBackground(new java.awt.Color(207, 151, 81));
        h1.setOpaque(true);
        getContentPane().add(h1, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 60, 50, 40));

        g4Indicator.setBackground(new java.awt.Color(117, 82, 34));
        g4Indicator.setOpaque(true);
        getContentPane().add(g4Indicator, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 270, 10, 40));

        g4.setBackground(new java.awt.Color(207, 151, 81));
        g4.setOpaque(true);
        getContentPane().add(g4, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 270, 50, 40));

        g3Indicator.setBackground(new java.awt.Color(117, 82, 34));
        g3Indicator.setOpaque(true);
        getContentPane().add(g3Indicator, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 200, 10, 40));

        g3.setBackground(new java.awt.Color(207, 151, 81));
        g3.setOpaque(true);
        getContentPane().add(g3, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 200, 50, 40));

        g2Indicator.setBackground(new java.awt.Color(117, 82, 34));
        g2Indicator.setOpaque(true);
        getContentPane().add(g2Indicator, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 130, 10, 40));

        g2.setBackground(new java.awt.Color(207, 151, 81));
        g2.setOpaque(true);
        getContentPane().add(g2, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 130, 50, 40));

        g1Indicator.setBackground(new java.awt.Color(117, 82, 34));
        g1Indicator.setOpaque(true);
        getContentPane().add(g1Indicator, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 60, 10, 40));

        g1.setBackground(new java.awt.Color(207, 151, 81));
        g1.setOpaque(true);
        getContentPane().add(g1, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 60, 50, 40));

        f4Indicator.setBackground(new java.awt.Color(117, 82, 34));
        f4Indicator.setOpaque(true);
        getContentPane().add(f4Indicator, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 270, 10, 40));

        f4.setBackground(new java.awt.Color(207, 151, 81));
        f4.setOpaque(true);
        getContentPane().add(f4, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 270, 50, 40));

        f3Indicator.setBackground(new java.awt.Color(117, 82, 34));
        f3Indicator.setOpaque(true);
        getContentPane().add(f3Indicator, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 200, 10, 40));

        f3.setBackground(new java.awt.Color(207, 151, 81));
        f3.setOpaque(true);
        getContentPane().add(f3, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 200, 50, 40));

        f2Indicator.setBackground(new java.awt.Color(117, 82, 34));
        f2Indicator.setOpaque(true);
        getContentPane().add(f2Indicator, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 130, 10, 40));

        f2.setBackground(new java.awt.Color(207, 151, 81));
        f2.setOpaque(true);
        getContentPane().add(f2, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 130, 50, 40));

        f1Indicator.setBackground(new java.awt.Color(117, 82, 34));
        f1Indicator.setOpaque(true);
        getContentPane().add(f1Indicator, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 60, 10, 40));

        f1.setBackground(new java.awt.Color(207, 151, 81));
        f1.setOpaque(true);
        getContentPane().add(f1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 60, 50, 40));

        e4Indicator.setBackground(new java.awt.Color(117, 82, 34));
        e4Indicator.setOpaque(true);
        getContentPane().add(e4Indicator, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 270, 10, 40));

        e4.setBackground(new java.awt.Color(207, 151, 81));
        e4.setOpaque(true);
        getContentPane().add(e4, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 270, 50, 40));

        e3Indicator.setBackground(new java.awt.Color(117, 82, 34));
        e3Indicator.setOpaque(true);
        getContentPane().add(e3Indicator, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 200, 10, 40));

        e3.setBackground(new java.awt.Color(207, 151, 81));
        e3.setOpaque(true);
        getContentPane().add(e3, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 200, 50, 40));

        e2Indicator.setBackground(new java.awt.Color(117, 82, 34));
        e2Indicator.setOpaque(true);
        getContentPane().add(e2Indicator, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 130, 10, 40));

        e2.setBackground(new java.awt.Color(207, 151, 81));
        e2.setOpaque(true);
        getContentPane().add(e2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 130, 50, 40));

        e1Indicator.setBackground(new java.awt.Color(117, 82, 34));
        e1Indicator.setOpaque(true);
        getContentPane().add(e1Indicator, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 60, 10, 40));

        e1.setBackground(new java.awt.Color(207, 151, 81));
        e1.setOpaque(true);
        getContentPane().add(e1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 60, 50, 40));

        d4Indicator.setBackground(new java.awt.Color(117, 82, 34));
        d4Indicator.setOpaque(true);
        getContentPane().add(d4Indicator, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 270, 10, 40));

        d4.setBackground(new java.awt.Color(207, 151, 81));
        d4.setOpaque(true);
        getContentPane().add(d4, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 270, 50, 40));

        d3Indicator.setBackground(new java.awt.Color(117, 82, 34));
        d3Indicator.setOpaque(true);
        getContentPane().add(d3Indicator, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 200, 10, 40));

        d3.setBackground(new java.awt.Color(207, 151, 81));
        d3.setOpaque(true);
        getContentPane().add(d3, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 200, 50, 40));

        d2Indicator.setBackground(new java.awt.Color(117, 82, 34));
        d2Indicator.setOpaque(true);
        getContentPane().add(d2Indicator, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 130, 10, 40));

        d2.setBackground(new java.awt.Color(207, 151, 81));
        d2.setOpaque(true);
        getContentPane().add(d2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 130, 50, 40));

        d1Indicator.setBackground(new java.awt.Color(117, 82, 34));
        d1Indicator.setOpaque(true);
        getContentPane().add(d1Indicator, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 60, 10, 40));

        d1.setBackground(new java.awt.Color(207, 151, 81));
        d1.setOpaque(true);
        getContentPane().add(d1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 60, 50, 40));

        c4Indicator.setBackground(new java.awt.Color(117, 82, 34));
        c4Indicator.setOpaque(true);
        getContentPane().add(c4Indicator, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 270, 10, 40));

        c4.setBackground(new java.awt.Color(207, 151, 81));
        c4.setOpaque(true);
        getContentPane().add(c4, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 270, 50, 40));

        c3Indicator.setBackground(new java.awt.Color(117, 82, 34));
        c3Indicator.setOpaque(true);
        getContentPane().add(c3Indicator, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 200, 10, 40));

        c3.setBackground(new java.awt.Color(207, 151, 81));
        c3.setOpaque(true);
        getContentPane().add(c3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 200, 50, 40));

        c2Indicator.setBackground(new java.awt.Color(117, 82, 34));
        c2Indicator.setOpaque(true);
        getContentPane().add(c2Indicator, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 130, 10, 40));

        c2.setBackground(new java.awt.Color(207, 151, 81));
        c2.setOpaque(true);
        getContentPane().add(c2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 130, 50, 40));

        c1Indicator.setBackground(new java.awt.Color(117, 82, 34));
        c1Indicator.setOpaque(true);
        getContentPane().add(c1Indicator, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 60, 10, 40));

        c1.setBackground(new java.awt.Color(207, 151, 81));
        c1.setOpaque(true);
        getContentPane().add(c1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 60, 50, 40));

        b4Indicator.setBackground(new java.awt.Color(117, 82, 34));
        b4Indicator.setOpaque(true);
        getContentPane().add(b4Indicator, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 270, 10, 40));

        b4.setBackground(new java.awt.Color(207, 151, 81));
        b4.setOpaque(true);
        getContentPane().add(b4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 270, 50, 40));

        b3Indicator.setBackground(new java.awt.Color(117, 82, 34));
        b3Indicator.setOpaque(true);
        getContentPane().add(b3Indicator, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 200, 10, 40));

        b3.setBackground(new java.awt.Color(207, 151, 81));
        b3.setOpaque(true);
        getContentPane().add(b3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 200, 50, 40));

        b2Indicator.setBackground(new java.awt.Color(117, 82, 34));
        b2Indicator.setOpaque(true);
        getContentPane().add(b2Indicator, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 130, 10, 40));

        b2.setBackground(new java.awt.Color(207, 151, 81));
        b2.setOpaque(true);
        getContentPane().add(b2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 130, 50, 40));

        b1Indicator.setBackground(new java.awt.Color(117, 82, 34));
        b1Indicator.setOpaque(true);
        getContentPane().add(b1Indicator, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 60, 10, 40));

        b1.setBackground(new java.awt.Color(207, 151, 81));
        b1.setOpaque(true);
        getContentPane().add(b1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 60, 50, 40));

        a4Indicator.setBackground(new java.awt.Color(117, 82, 34));
        a4Indicator.setOpaque(true);
        getContentPane().add(a4Indicator, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, 10, 40));

        a4.setBackground(new java.awt.Color(207, 151, 81));
        a4.setOpaque(true);
        getContentPane().add(a4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, 50, 40));

        a3Indicator.setBackground(new java.awt.Color(117, 82, 34));
        a3Indicator.setOpaque(true);
        getContentPane().add(a3Indicator, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 10, 40));

        a3.setBackground(new java.awt.Color(207, 151, 81));
        a3.setOpaque(true);
        getContentPane().add(a3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 50, 40));

        a2Indicator.setBackground(new java.awt.Color(117, 82, 34));
        a2Indicator.setOpaque(true);
        getContentPane().add(a2Indicator, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 10, 40));

        a2.setBackground(new java.awt.Color(207, 151, 81));
        a2.setOpaque(true);
        getContentPane().add(a2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 50, 40));

        a1Indicator.setBackground(new java.awt.Color(117, 82, 34));
        a1Indicator.setOpaque(true);
        getContentPane().add(a1Indicator, new org.netbeans.lib.awtextra.AbsoluteConstraints(13, 60, 10, 40));

        a1.setBackground(new java.awt.Color(207, 151, 81));
        a1.setOpaque(true);
        getContentPane().add(a1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 50, 40));

        boardBackground.setBackground(new java.awt.Color(117, 82, 34));
        boardBackground.setOpaque(true);
        getContentPane().add(boardBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 45, 720, 280));

        redButton.setBackground(new java.awt.Color(255, 51, 51));
        redButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        redButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                redButtonActionPerformed(evt);
            }
        });
        getContentPane().add(redButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, 80, 40));

        blueButton.setBackground(new java.awt.Color(102, 153, 255));
        blueButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        blueButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                blueButtonActionPerformed(evt);
            }
        });
        getContentPane().add(blueButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 340, 80, 40));

        greenButton.setBackground(new java.awt.Color(102, 255, 102));
        greenButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        greenButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                greenButtonActionPerformed(evt);
            }
        });
        getContentPane().add(greenButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 340, 80, 40));

        yellowButton.setBackground(new java.awt.Color(255, 255, 102));
        yellowButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        yellowButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yellowButtonActionPerformed(evt);
            }
        });
        getContentPane().add(yellowButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 340, 80, 40));

        tealButton.setBackground(new java.awt.Color(0, 204, 204));
        tealButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tealButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tealButtonActionPerformed(evt);
            }
        });
        getContentPane().add(tealButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 390, 80, 40));

        purpleButton.setBackground(new java.awt.Color(204, 153, 255));
        purpleButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        purpleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                purpleButtonActionPerformed(evt);
            }
        });
        getContentPane().add(purpleButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 390, 80, 40));

        blackButton.setBackground(new java.awt.Color(9, 9, 9));
        blackButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(204, 204, 204), new java.awt.Color(102, 102, 102), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0)));
        blackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                blackButtonActionPerformed(evt);
            }
        });
        getContentPane().add(blackButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 390, 80, 40));

        whiteButton.setBackground(new java.awt.Color(255, 255, 255));
        whiteButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        whiteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                whiteButtonActionPerformed(evt);
            }
        });
        getContentPane().add(whiteButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 390, 80, 40));

        exitButton.setBackground(new java.awt.Color(153, 0, 0));
        exitButton.setText("Exit");
        exitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButtonActionPerformed(evt);
            }
        });
        getContentPane().add(exitButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 400, 130, -1));

        undoButton.setBackground(new java.awt.Color(204, 204, 204));
        undoButton.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        undoButton.setForeground(new java.awt.Color(0, 0, 0));
        undoButton.setText("Undo");
        undoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                undoButtonActionPerformed(evt);
            }
        });
        getContentPane().add(undoButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 350, 130, -1));

        guessButton.setBackground(new java.awt.Color(204, 204, 204));
        guessButton.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        guessButton.setForeground(new java.awt.Color(0, 0, 0));
        guessButton.setText("Guess");
        guessButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guessButtonActionPerformed(evt);
            }
        });
        getContentPane().add(guessButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 350, 130, -1));
        getContentPane().add(modeLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(601, 10, 110, 30));

        backgroundColour.setBackground(new java.awt.Color(102, 102, 102));
        backgroundColour.setText("jLabel1");
        backgroundColour.setOpaque(true);
        getContentPane().add(backgroundColour, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 720, 450));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void redButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_redButtonActionPerformed
        boolean error;
        
        //checks if 4 guesses have already been made
        error = CheckCounter();
        
        //if so it returns
        if (error){
           return; 
        }
        
        //changes peg colour to red
        ChangeColour(red);
        
        //increases guess counter
        guessCounter++;
        currentGuess++;
        
        //first 4 colours (red, blue, yellow and green) have the same code (other than the colour the peg is changed to)
    }//GEN-LAST:event_redButtonActionPerformed

    private void blueButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_blueButtonActionPerformed
        boolean error;
        
        error = CheckCounter();
        
        if (error){
           return; 
        }
        
        ChangeColour(blue);
        
        guessCounter++;
        currentGuess++;
    }//GEN-LAST:event_blueButtonActionPerformed

    private void greenButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_greenButtonActionPerformed
        boolean error;
        
        error = CheckCounter();
        
        if (error){
           return; 
        }
        
        ChangeColour(green);
        
        guessCounter++;
        currentGuess++;
    }//GEN-LAST:event_greenButtonActionPerformed

    private void yellowButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yellowButtonActionPerformed
        boolean error;
        
        error = CheckCounter();
        
        if (error){
           return; 
        }
        
        ChangeColour(yellow);
        
        guessCounter++;
        currentGuess++;
    }//GEN-LAST:event_yellowButtonActionPerformed

    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButtonActionPerformed
        //exits program
        System.exit(0);
    }//GEN-LAST:event_exitButtonActionPerformed

    private void tealButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tealButtonActionPerformed
        boolean error;
        boolean medModeError;
        boolean hardMode;
        
        //checks if the mode is hard
        hardMode = CheckHardMode();
        
        //if it is not then
        if (hardMode){
            
            //checks if the mode is medium
            medModeError = CheckMedMode();

            //if it is not then it returns
            if (medModeError){
                return;
            }
        }
        
        //checks if the 4 slots have been filled already
        error = CheckCounter();
        
        //if so, it returns
        if (error){
           return; 
        }
        
        //changes colour of peg to teal
        ChangeColour(teal);
        
        //increases counters
        guessCounter++;
        currentGuess++;
        
        //same code for teal and purple (other than the colour the peg is changed to)
    }//GEN-LAST:event_tealButtonActionPerformed

    private void purpleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_purpleButtonActionPerformed
        boolean error;
        boolean medModeError;
        boolean hardMode;
        
        hardMode = CheckHardMode();
        if (hardMode){
            
            medModeError = CheckMedMode();

            if (medModeError){
                return;
            }
        }
        
        error = CheckCounter();
        
        if (error){
           return; 
        }
        
        
        ChangeColour(purple);
        
        guessCounter++;
        currentGuess++;
    }//GEN-LAST:event_purpleButtonActionPerformed

    private void blackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_blackButtonActionPerformed
        boolean error;
        boolean modeError;
        
        //checks if hard mode is enabled
        modeError = CheckHardMode();
        
        //if it is not it returns
        if (modeError){
            return;
        }
        
        //checks if 4 slots have been filled
        error = CheckCounter();
        
        //if so it returns
        if (error){
           return; 
        }
        
        //changes colour to black
        ChangeColour(black);
        
        //increases counters
        guessCounter++;
        currentGuess++;
        
        //same code for colours black and white (other than the colour the peg is changed to)
    }//GEN-LAST:event_blackButtonActionPerformed

    private void whiteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_whiteButtonActionPerformed
        boolean error;
        boolean modeError;
        
        modeError = CheckHardMode();
        
        if (modeError){
            return;
        }
        
        error = CheckCounter();
        
        if (error){
           return; 
        }
        
        
        ChangeColour(white);
        
        guessCounter++;
        currentGuess++;
    }//GEN-LAST:event_whiteButtonActionPerformed

    private void guessButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guessButtonActionPerformed
        boolean guessError;
        
        //checks that all 4 slots are full
        guessError = CheckCounter();
        
        //if not then it returns
        if (!guessError){
            return;
        }
        
        //determines the guess made (the colours)
        DetermineGuess();
        
        //determines the indicator colours based on guess
        DetermineIndicators();
        
        //increases the overall guess counter
        overallGuessCounter++;
        
        //checks if user won (has the correct placement of colours)
        CheckWin();
        
        //checks if they have passed the overall counter
        CheckOverallCounter();
        
        //clears the guess array list
        guess.clear();
        
        //sets current guess to 0
        currentGuess=0;
        
    }//GEN-LAST:event_guessButtonActionPerformed

    private void undoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_undoButtonActionPerformed
        //if they are on the first guess, they cannot undo
        //so its returns
        if (currentGuess ==0){
            return;
        }
        
        //decreases counters
        currentGuess --;
        guessCounter--;
        
        //changes the colour of the peg back to the orignal
        ChangeColour(pegColour);
    }//GEN-LAST:event_undoButtonActionPerformed
    
    private void AddPegs(){
        //this creates the peg array
        //made up of the position, peg colour, indicator postition, and indicator colour
        
        //declare the arrays
        JLabel [] positions = {a1,a2,a3,a4,b1,b2,b3,b4,c1,c2,c3,c4,d1,d2,d3,d4,e1,e2,e3,e4,
                f1,f2,f3,f4,g1,g2,g3,g4,h1,h2,h3,h4};
        
        JLabel [] indicators = {a1Indicator,a2Indicator,a3Indicator,a4Indicator,b1Indicator,b2Indicator,b3Indicator,b4Indicator,
            c1Indicator,c2Indicator,c3Indicator,c4Indicator,d1Indicator,d2Indicator,d3Indicator,d4Indicator,e1Indicator,e2Indicator,e3Indicator,e4Indicator,
            f1Indicator,f2Indicator,f3Indicator,f4Indicator,g1Indicator,g2Indicator,g3Indicator,g4Indicator,h1Indicator,h2Indicator,h3Indicator,h4Indicator};
        
        //declare needed variables
        Peg p;
        JLabel label;
        Color pegColours = pegColour;
        Color inColours = boardColour;
        JLabel indicator;
        
        //adds the information to array list pegs
        for (int x = 0; x<(positions.length); x++){
            
            label = positions[x];
            indicator = indicators[x];
            p = new Peg (label, pegColours ,indicator, inColours);
            pegs.add(p);
        }
        
       
    }
    
    private void CheckOverallCounter(){
        
        //if they go over the 8 guesses, they lose and go to the end screen
        if (overallGuessCounter ==9){
            
            gameDecision = false;
            
            EndWinScreen();
        }
        
    }
    
    private boolean CheckCounter(){
        boolean error = false;
        
        //if on the first guesses they cannot guess the colours
        if (guessCounter == 0 || currentGuess < 3){
            error = false;
        }
        
        //essentially if the guess counter is a multiple of 4, they can guess
        else if (guessCounter%4 ==0){
            error = true;
        }
        
        return error;
    }
    
    private void ChangeColour(Color colour){
        //changes the peg colour, and the array value
       (pegs.get(guessCounter).position).setBackground(colour);
       (pegs.get(guessCounter)).SetPegColour(colour);
       
    }
    
    public boolean CheckMedMode (){
        boolean error = true;
        
        //if the gamemode is medium, there is no error and button can be pressed
        if (gamemode.equals("medium")){
            error = false;
        }
        
        return (error);
    }
    
    public boolean CheckHardMode (){
        boolean error = true;
        
        //if the gamemode is hard, there is no error and button can be pressed
        if (gamemode.equals("hard")){
            error = false;
        }
        
        return (error);
    }
    
    public void DetermineGuess(){
        String peg;
        int y = guessCounter -4;
        
        //gets the colour of the pegs and adds it to a guess array list
        for (int x =y; x<(y+4);x++){
            peg = String.valueOf(pegs.get(x).pegColour);
            guess.add(peg);
        }    
        
    }
    
    private void DetermineIndicators(){
        String codePeg,guessPeg;
        int counter = guessCounter -4;
        ArrayList <String> guessedColours = new ArrayList <>();
        
        //sees if the guess is the same as the code
        for (int x = 0; x<4; x++){
                codePeg = code.get(x);
                guessPeg = guess.get(x);

                //if so it will change that indicator will turn green
                if (guessPeg.equals(codePeg)){
                    (pegs.get(counter).indicator).setBackground(green);
                    (pegs.get(counter)).SetIndicatorColour(green);
                    guessedColours.add(guessPeg);
                }
            counter++;
                   
        } 
        
        counter = guessCounter -4;
        
        //searches to see if that colour is in the array
        for (int s = 0; s<4; s++){
            for (int x = 0; x<4; x++){
                codePeg = code.get(s);
                guessPeg = guess.get(x);

                //if one of the colours is already guessed, it wont show the
                //white indicator as it should be clear it is in the lineup
                if (!guessedColours.contains(guessPeg)){
                    
                    //otheriwse, it will see if the values match, if so the indicator turns white
                    if (guessPeg.equals(codePeg)){
                        (pegs.get(counter +x).indicator).setBackground(white);
                        (pegs.get(counter+x)).SetIndicatorColour(white);
                    }
                }    
            }
        }
        
        
    }
    
    private void CheckWin (){
        int counter = guessCounter -4;
        Color in1;
        Color in2;
        Color in3;
        Color in4;
        
        in1 = pegs.get(counter).indicatorColour;
        in2 = pegs.get(counter+1).indicatorColour;
        in3 =  pegs.get(counter+2).indicatorColour;
        in4 =  pegs.get(counter+3).indicatorColour;
        
        //if all 4 indicators are green, it takes them to end screen
        if (in1 ==green && in2 == green && in3 == green && in4 ==green ){
            gameDecision = true;
            EndWinScreen();
        }
    }
    
    private void EndWinScreen (){
        //goes to end/win screen
        EndScreen endwinScreen = new EndScreen(gameDecision, startTime);
        endwinScreen.setVisible(true);
        dispose();

    }
    
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel a1;
    private javax.swing.JLabel a1Indicator;
    private javax.swing.JLabel a2;
    private javax.swing.JLabel a2Indicator;
    private javax.swing.JLabel a3;
    private javax.swing.JLabel a3Indicator;
    private javax.swing.JLabel a4;
    private javax.swing.JLabel a4Indicator;
    private javax.swing.JLabel b1;
    private javax.swing.JLabel b1Indicator;
    private javax.swing.JLabel b2;
    private javax.swing.JLabel b2Indicator;
    private javax.swing.JLabel b3;
    private javax.swing.JLabel b3Indicator;
    private javax.swing.JLabel b4;
    private javax.swing.JLabel b4Indicator;
    private javax.swing.JLabel backgroundColour;
    private javax.swing.JButton blackButton;
    private javax.swing.JButton blueButton;
    private javax.swing.JLabel boardBackground;
    private javax.swing.JLabel c1;
    private javax.swing.JLabel c1Indicator;
    private javax.swing.JLabel c2;
    private javax.swing.JLabel c2Indicator;
    private javax.swing.JLabel c3;
    private javax.swing.JLabel c3Indicator;
    private javax.swing.JLabel c4;
    private javax.swing.JLabel c4Indicator;
    private javax.swing.JLabel d1;
    private javax.swing.JLabel d1Indicator;
    private javax.swing.JLabel d2;
    private javax.swing.JLabel d2Indicator;
    private javax.swing.JLabel d3;
    private javax.swing.JLabel d3Indicator;
    private javax.swing.JLabel d4;
    private javax.swing.JLabel d4Indicator;
    private javax.swing.JLabel e1;
    private javax.swing.JLabel e1Indicator;
    private javax.swing.JLabel e2;
    private javax.swing.JLabel e2Indicator;
    private javax.swing.JLabel e3;
    private javax.swing.JLabel e3Indicator;
    private javax.swing.JLabel e4;
    private javax.swing.JLabel e4Indicator;
    private javax.swing.JButton exitButton;
    private javax.swing.JLabel f1;
    private javax.swing.JLabel f1Indicator;
    private javax.swing.JLabel f2;
    private javax.swing.JLabel f2Indicator;
    private javax.swing.JLabel f3;
    private javax.swing.JLabel f3Indicator;
    private javax.swing.JLabel f4;
    private javax.swing.JLabel f4Indicator;
    private javax.swing.JLabel g1;
    private javax.swing.JLabel g1Indicator;
    private javax.swing.JLabel g2;
    private javax.swing.JLabel g2Indicator;
    private javax.swing.JLabel g3;
    private javax.swing.JLabel g3Indicator;
    private javax.swing.JLabel g4;
    private javax.swing.JLabel g4Indicator;
    private javax.swing.JButton greenButton;
    private javax.swing.JButton guessButton;
    private javax.swing.JLabel h1;
    private javax.swing.JLabel h1Indicator;
    private javax.swing.JLabel h2;
    private javax.swing.JLabel h2Indicator;
    private javax.swing.JLabel h3;
    private javax.swing.JLabel h3Indicator;
    private javax.swing.JLabel h4;
    private javax.swing.JLabel h4Indicator;
    private javax.swing.JLabel modeLabel;
    private javax.swing.JButton purpleButton;
    private javax.swing.JButton redButton;
    private javax.swing.JButton tealButton;
    private javax.swing.JButton undoButton;
    private javax.swing.JButton whiteButton;
    private javax.swing.JButton yellowButton;
    // End of variables declaration//GEN-END:variables
}

class Peg{
    JLabel position;
    Color pegColour;
    JLabel indicator;
    Color indicatorColour;
    
    Peg (JLabel _position, Color _pegColour, JLabel _indicator, Color _indicatorColour){
        position = _position;
        pegColour = _pegColour;
        indicator = _indicator;
        indicatorColour = _indicatorColour;
    }
    
    public void SetPegColour(Color colour){
        pegColour = colour;
        
    }
    
    public void SetIndicatorColour (Color colour){
        indicatorColour = colour;
    }
}