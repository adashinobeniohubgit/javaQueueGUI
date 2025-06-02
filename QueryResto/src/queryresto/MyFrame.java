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
    
    JRadioButton dineIn;
    JRadioButton takeOut;
    //
    JPanel paneldrinksMenu;
    JCheckBox coffeelist;
    JCheckBox lemonlist;
    JCheckBox spritelist;
    JCheckBox chocolatelist;
    JCheckBox orangelist;
    JCheckBox cokelist;
    
    JButton hamburgerAddbtn;
    JButton hamburgerSubbtn;
    
    JButton tacoAddbtn;
    JButton tacoSubbtn;
    
    JButton pizzaAddbtn;
    JButton pizzaSubbtn;
    
    JButton hotdogAddbtn;
    JButton hotdogSubbtn;
    
    JButton fruitsaladAddbtn;
    JButton fruitsaladSubbtn;
        
    JButton pansitcantonAddbtn;
    JButton pansitcantonSubbtn;
    
    
    MyFrame(){
        
        coffeelist = new JCheckBox();
        coffeelist.setText("Coffee");
        coffeelist.setBounds(150,0,150,50);
        coffeelist.setFocusable(false);
        
        lemonlist = new JCheckBox();
        lemonlist.setText("Lemon");
        lemonlist.setBounds(150,50,150,50);
        lemonlist.setFocusable(false);
        
        spritelist = new JCheckBox();
        spritelist.setText("Sprite");
        spritelist.setBounds(150,100,150,50);
        spritelist.setFocusable(false);
        
        chocolatelist = new JCheckBox();
        chocolatelist.setText("Chocolate");
        chocolatelist.setBounds(150,150,150,50);
        chocolatelist.setFocusable(false);
        
        orangelist = new JCheckBox();
        orangelist.setText("Orange");
        orangelist.setBounds(150,200,150,50);
        orangelist.setFocusable(false);
        
        cokelist = new JCheckBox();
        cokelist.setText("Coke");
        cokelist.setBounds(150,250,150,50);
        cokelist.setFocusable(false);
        
        
        
        
        dineIn = new JRadioButton();
        dineIn.setText("DINE IN");
        dineIn.setFont(new Font("Consolas", Font.PLAIN, 15));
        dineIn.setBounds(100, 300, 125, 40);
        dineIn.setFocusable(false);
        
        paneldrinksMenu = new JPanel();
        paneldrinksMenu.setBackground(Color.GREEN);
        paneldrinksMenu.setBounds(300,150,300,340);
        paneldrinksMenu.add(coffeelist);
        paneldrinksMenu.add(lemonlist);
        paneldrinksMenu.add(spritelist);
        paneldrinksMenu.add(chocolatelist);
        paneldrinksMenu.add(orangelist);
        paneldrinksMenu.add(cokelist);
        
        paneldrinksMenu.add(dineIn);
        paneldrinksMenu.setLayout(null);
        
        
        takeOut = new JRadioButton();
        takeOut.setText("TAKE OUT");
        takeOut.setFont(new Font("Consolas", Font.PLAIN, 15));
        takeOut.setBounds(100,300,125,40);
        takeOut.setFocusable(false);
        
        
        hamburgerlist = new JCheckBox();
        hamburgerlist.setText("Hamburger");
        hamburgerlist.setBounds(150,0,150,50);
        hamburgerlist.setFocusable(false);
        
        
        tacolist = new JCheckBox();
        tacolist.setText("Taco");
        tacolist.setBounds(150,50,150,50);
        tacolist.setFocusable(false);
        
        pizzalist = new JCheckBox();
        pizzalist.setText("Pizza");
        pizzalist.setBounds(150,100,150,50);
        pizzalist.setFocusable(false);
        
        hotdoglist = new JCheckBox();
        hotdoglist.setText("Hotdog");
        hotdoglist.setBounds(150,150,150,50);
        hotdoglist.setFocusable(false);
        
        fruitsaladlist = new JCheckBox();
        fruitsaladlist.setText("FruitSalad");
        fruitsaladlist.setBounds(150,200,150,50);
        fruitsaladlist.setFocusable(false);
        
        pansitcantonlist = new JCheckBox();
        pansitcantonlist.setText("PansitCanton");
        pansitcantonlist.setBounds(150,250,150,50);
        pansitcantonlist.setFocusable(false);
        
        //
        hamburgerAddbtn = new JButton();
        hamburgerAddbtn.setText("+");
        hamburgerAddbtn.setBounds(0,10,40,30);
        hamburgerAddbtn.setFont(new Font("Consolas", Font.PLAIN,11));
        hamburgerAddbtn.setFocusable(false);
        
        
        hamburgerSubbtn = new JButton();
        hamburgerSubbtn.setText("-");
        hamburgerSubbtn.setBounds(110,10,40,30);
        hamburgerSubbtn.setFont(new Font("Consolas", Font.PLAIN,11));
        hamburgerSubbtn.setFocusable(false);
        //
        //
        tacoAddbtn = new JButton();
        tacoAddbtn.setText("+");
        tacoAddbtn.setBounds(0,60,40,30);
        tacoAddbtn.setFont(new Font("Consolas", Font.PLAIN,11));
        tacoAddbtn.setFocusable(false);
        
        tacoSubbtn = new JButton();
        tacoSubbtn.setText("-");
        tacoSubbtn.setBounds(110,60,40,30);
        tacoSubbtn.setFont(new Font("Consolas", Font.PLAIN,11));
        tacoSubbtn.setFocusable(false);
        //
        //
        pizzaAddbtn = new JButton();
        pizzaAddbtn.setText("+");
        pizzaAddbtn.setBounds(0,110,40,30);
        pizzaAddbtn.setFont(new Font("Consolas", Font.PLAIN,11));
        pizzaAddbtn.setFocusable(false);
        
        
        pizzaSubbtn = new JButton();
        pizzaSubbtn.setText("-");
        pizzaSubbtn.setBounds(110,110,40,30);
        pizzaSubbtn.setFont(new Font("Consolas", Font.PLAIN,11));
        pizzaSubbtn.setFocusable(false);
        //
        //
        hotdogAddbtn = new JButton();
        hotdogAddbtn.setText("+");
        hotdogAddbtn.setBounds(0,160,40,30);
        hotdogAddbtn.setFont(new Font("Consolas", Font.PLAIN,11));
        hotdogAddbtn.setFocusable(false);
        
        
        hotdogSubbtn = new JButton();
        hotdogSubbtn.setText("-");
        hotdogSubbtn.setBounds(110,160,40,30);
        hotdogSubbtn.setFont(new Font("Consolas", Font.PLAIN,11));
        hotdogSubbtn.setFocusable(false);
        //
        //
        fruitsaladAddbtn = new JButton();
        fruitsaladAddbtn.setText("+");
        fruitsaladAddbtn.setBounds(0,210,40,30);
        fruitsaladAddbtn.setFont(new Font("Consolas", Font.PLAIN,11));
        fruitsaladAddbtn.setFocusable(false);
        
        
        fruitsaladSubbtn = new JButton();
        fruitsaladSubbtn.setText("-");
        fruitsaladSubbtn.setBounds(110,210,40,30);
        fruitsaladSubbtn.setFont(new Font("Consolas", Font.PLAIN,11));
        fruitsaladSubbtn.setFocusable(false);
        //
        //
        pansitcantonAddbtn = new JButton();
        pansitcantonAddbtn.setText("+");
        pansitcantonAddbtn.setBounds(0,260,40,30);
        pansitcantonAddbtn.setFont(new Font("Consolas", Font.PLAIN,11));
        pansitcantonAddbtn.setFocusable(false);
        
        
        pansitcantonSubbtn = new JButton();
        pansitcantonSubbtn.setText("-");
        pansitcantonSubbtn.setBounds(110,260,40,30);
        pansitcantonSubbtn.setFont(new Font("Consolas", Font.PLAIN,11));
        pansitcantonSubbtn.setFocusable(false);
        //
        
        panelfoodsMenu = new JPanel();
        panelfoodsMenu.setBackground(Color.yellow);
        panelfoodsMenu.setBounds(0,150,300,340);
        
        panelfoodsMenu.add(hamburgerAddbtn);
        panelfoodsMenu.add(hamburgerSubbtn);
        
        panelfoodsMenu.add(tacoAddbtn);
        panelfoodsMenu.add(tacoSubbtn);
        
        panelfoodsMenu.add(pizzaAddbtn);
        panelfoodsMenu.add(pizzaSubbtn);
        
        panelfoodsMenu.add(hotdogAddbtn);
        panelfoodsMenu.add(hotdogSubbtn);
//        
        panelfoodsMenu.add(fruitsaladAddbtn);
        panelfoodsMenu.add(fruitsaladSubbtn);
//        
        panelfoodsMenu.add(pansitcantonAddbtn);
        panelfoodsMenu.add(pansitcantonSubbtn);
        
        
        
        panelfoodsMenu.add(hamburgerlist);
        panelfoodsMenu.add(tacolist);
        panelfoodsMenu.add(pizzalist);
        panelfoodsMenu.add(hotdoglist);
        panelfoodsMenu.add(fruitsaladlist);
        panelfoodsMenu.add(pansitcantonlist);
        panelfoodsMenu.add(takeOut);
        
       
        panelfoodsMenu.setLayout(null);
        //
        
        
        //
        welcomeDrinks = new JLabel();
        welcomeDrinks.setText("DRINKS");
        welcomeDrinks.setFont(new Font("MV Boli", Font.PLAIN, 25));
        
        panelDrinks = new JPanel();
        panelDrinks.setBackground(Color.ORANGE);
        panelDrinks.setBounds(300, 100, 300,50);
        panelDrinks.add(welcomeDrinks);
        //
        //
        welcomeFoods = new JLabel();
        welcomeFoods.setText("FOODS");
        welcomeFoods.setFont(new Font("MV Boli", Font.PLAIN, 25));
        
        panelFoods = new JPanel();
        panelFoods.setBackground(Color.MAGENTA);
        panelFoods.setBounds(0, 100, 300,50);
        panelFoods.add(welcomeFoods);
        //
        
        //
        welcomeQueue = new JLabel();
        welcomeQueue.setText("QUEUE");
        welcomeQueue.setFont(new Font("MV Boli", Font.PLAIN, 25));
        
        
        panelQueue = new JPanel();
        panelQueue.setBackground(Color.GRAY);
        panelQueue.setBounds(600, 50, 400, 50);
        panelQueue.add(welcomeQueue);
        //
        
        
        //
        welcomeMenu = new JLabel();
        welcomeMenu.setText("MENU");
        welcomeMenu.setFont(new Font("MV Boli", Font.PLAIN, 25));
        
        
        panelMenu = new JPanel();
        panelMenu.setBackground(Color.blue);
        panelMenu.setBounds(0, 50, 600, 50);
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
        this.add(paneldrinksMenu);
        
        this.setResizable(false);
        this.setVisible(true);
        
        
        
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        }
    }