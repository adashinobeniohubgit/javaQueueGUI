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
import java.util.LinkedList;
import java.util.Queue;


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author dayso
 */


public class MyFrame extends JFrame implements ActionListener {
      
    private Queue<order> orderQueue = new LinkedList<>();

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

    JButton submiButton;
    
    
    MyFrame(){
        

        submiButton = new JButton("submit");
        submiButton.setBounds(0, 350, 250, 50);
        submiButton.setFocusable(false);
        submiButton.setFont(new Font("Consolas", Font.PLAIN, 15));
        submiButton.addActionListener(this);
        

        dineIn = new JRadioButton();
        dineIn.setText("DINE IN");
        dineIn.setFont(new Font("Consolas", Font.PLAIN, 15));
        dineIn.setBounds(0, 300, 125, 40);
        dineIn.setFocusable(false);
        
        
        takeOut = new JRadioButton();
        takeOut.setText("TAKE OUT");
        takeOut.setFont(new Font("Consolas", Font.PLAIN, 15));
        takeOut.setBounds(125,300,125,40);
        takeOut.setFocusable(false);
        
        ButtonGroup group = new ButtonGroup();
        group.add(dineIn);
        group.add(takeOut);

        hamburgerlist = new JCheckBox();
        hamburgerlist.setText("Hamburger");
        hamburgerlist.setBounds(70,0,180,50);
        hamburgerlist.setFocusable(false);
        
        
        tacolist = new JCheckBox();
        tacolist.setText("Taco");
        tacolist.setBounds(70,50,180,50);
        tacolist.setFocusable(false);
        
        pizzalist = new JCheckBox();
        pizzalist.setText("Pizza");
        pizzalist.setBounds(70,100,180,50);
        pizzalist.setFocusable(false);
        
        hotdoglist = new JCheckBox();
        hotdoglist.setText("Hotdog");
        hotdoglist.setBounds(70,150,180,50);
        hotdoglist.setFocusable(false);
        
        fruitsaladlist = new JCheckBox();
        fruitsaladlist.setText("FruitSalad");
        fruitsaladlist.setBounds(70,200,180,50);
        fruitsaladlist.setFocusable(false);
        
        pansitcantonlist = new JCheckBox();
        pansitcantonlist.setText("PansitCanton");
        pansitcantonlist.setBounds(70,250,180,50);
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
        panelfoodsMenu.add(dineIn);
        panelfoodsMenu.add(takeOut);
        panelfoodsMenu.add(submiButton);
        
       
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
            
        if(e.getSource() == submiButton) {
            StringBuilder selectedFoods = new StringBuilder("Selected Foods: ");
            if(hamburgerlist.isSelected()){
                selectedFoods.append("Hamburger ");
            }
            if(tacolist.isSelected()){
                selectedFoods.append("Taco ");
            }
            if(pizzalist.isSelected()){
                selectedFoods.append("Pizza ");
            }
            if(hotdoglist.isSelected()){
                selectedFoods.append("Hotdog ");
            }
            if(fruitsaladlist.isSelected()){
                selectedFoods.append("Fruit Salad ");
            }
            if(pansitcantonlist.isSelected()){
                selectedFoods.append("Pansit Canton ");
            }
            
            String diningOption = dineIn.isSelected() ? "Dine In" : "Take Out";
            
            order newOrder = new order(selectedFoods.toString().trim(), diningOption);

            orderQueue.add(newOrder);

            System.out.println("New Order Added: " + newOrder);
            System.out.println("Current Queue: " + orderQueue);



        }
    }
}
