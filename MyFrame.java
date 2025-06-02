package queryresto;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author dayso
 */
public class MyFrame extends JFrame implements ActionListener {
      
    
    JPanel panelWelcome;
    JLabel welcomeText;
   
    JPanel panelMenu;
    JLabel welcomeMenu;
    
    JPanel panelQueue;
    JLabel welcomeQueue;
    
    JPanel panelFoods;
    JLabel welcomeFoods;
    
    JPanel panelDrinks;
    JLabel welcomeDrinks;
    
    JPanel panelfoodsMenu;
    JCheckBox hamburgerlist;
    JCheckBox tacolist;
    JCheckBox pizzalist;
    JCheckBox hotdoglist;
    JCheckBox fruitsaladlist;
    JCheckBox pansitcantonlist;
    
    JButton button;
    
    
    MyFrame(){
        button = new JButton();
        button.setText("Submit");
        button.addActionListener(this);
        button.setBounds(100,300,100,50);
        button.setFocusable(false);
        
        hamburgerlist = new JCheckBox();
        hamburgerlist.setText("Hamburger");
        hamburgerlist.setBounds(70,0,179,50);
        hamburgerlist.setFocusable(false);
        
        
        tacolist = new JCheckBox();
        tacolist.setText("Taco");
        tacolist.setBounds(70,50,179,50);
        tacolist.setFocusable(false);
        
        pizzalist = new JCheckBox();
        pizzalist.setText("Pizza");
        pizzalist.setBounds(70,100,179,50);
        pizzalist.setFocusable(false);
        
        hotdoglist = new JCheckBox();
        hotdoglist.setText("Hotdog");
        hotdoglist.setBounds(70,150,179,50);
        hotdoglist.setFocusable(false);
        
        fruitsaladlist = new JCheckBox();
        fruitsaladlist.setText("FruitSalad");
        fruitsaladlist.setBounds(70,200,179,50);
        fruitsaladlist.setFocusable(false);
        
        pansitcantonlist = new JCheckBox();
        pansitcantonlist.setText("PansitCanton");
        pansitcantonlist.setBounds(70,250,179,50);
        pansitcantonlist.setFocusable(false);
        
        
        panelfoodsMenu = new JPanel();
        panelfoodsMenu.setBackground(Color.yellow);
        panelfoodsMenu.setBounds(0,150,250,550);
        panelfoodsMenu.add(hamburgerlist);
        panelfoodsMenu.add(tacolist);
        panelfoodsMenu.add(pizzalist);
        panelfoodsMenu.add(hotdoglist);
        panelfoodsMenu.add(fruitsaladlist);
        panelfoodsMenu.add(pansitcantonlist);
        panelfoodsMenu.add(button);
        panelfoodsMenu.setLayout(null);
        //
        
        
        //
        welcomeDrinks = new JLabel();
        welcomeDrinks.setText("DRINKS");
        welcomeDrinks.setFont(new Font("MV Boli", Font.PLAIN, 25));
        
        panelDrinks = new JPanel();
        panelDrinks.setBackground(Color.ORANGE);
        panelDrinks.setBounds(250, 100, 250,50);
        panelDrinks.add(welcomeDrinks);
        //
        //
        welcomeFoods = new JLabel();
        welcomeFoods.setText("FOODS");
        welcomeFoods.setFont(new Font("MV Boli", Font.PLAIN, 25));
        
        panelFoods = new JPanel();
        panelFoods.setBackground(Color.MAGENTA);
        panelFoods.setBounds(0, 100, 250,50);
        panelFoods.add(welcomeFoods);
        //
        
        //
        welcomeQueue = new JLabel();
        welcomeQueue.setText("QUEUE");
        welcomeQueue.setFont(new Font("MV Boli", Font.PLAIN, 25));
        
        
        panelQueue = new JPanel();
        panelQueue.setBackground(Color.GRAY);
        panelQueue.setBounds(500, 50, 500, 50);
        panelQueue.add(welcomeQueue);
        //
        
        
        //
        welcomeMenu = new JLabel();
        welcomeMenu.setText("MENU");
        welcomeMenu.setFont(new Font("MV Boli", Font.PLAIN, 25));
        
        
        panelMenu = new JPanel();
        panelMenu.setBackground(Color.blue);
        panelMenu.setBounds(0, 50, 500, 50);
        panelMenu.add(welcomeMenu);
        //
        
        
        //
        welcomeText = new JLabel();
        welcomeText.setText("WELCOME");
        welcomeText.setFont(new Font("MV Boli", Font.PLAIN, 25));
        
        
        panelWelcome = new JPanel();
        panelWelcome.setBackground(Color.red);
        panelWelcome.setBounds(0,0,1000,50);
        panelWelcome.add(welcomeText);
        //
        
        this.setSize(1000,1000);
        this.setLayout(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
        this.add(panelWelcome);
        this.add(panelQueue);
        this.add(panelMenu);
        this.add(panelFoods);
        this.add(panelDrinks);
        this.add(panelfoodsMenu);
        
        this.setResizable(false);
        this.setVisible(true);
        
        
        
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==button){
            System.out.println(hamburgerlist.isSelected()+ " hamburger");
            System.out.println(tacolist.isSelected()+" taco");
            System.out.println(pizzalist.isSelected()+" pizza");
            System.out.println(hotdoglist.isSelected()+" hotdog");
            System.out.println(fruitsaladlist.isSelected()+" fruitsalad");        
            System.out.println(pansitcantonlist.isSelected()+" pansitcanton");
            
            
        }
    }

    
}