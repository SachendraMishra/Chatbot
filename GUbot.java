import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.io.IOException;
import java.io.File;
import java.util.Date;


public class GUbot extends JFrame {

	JPanel panel;
	JTextField User_Input;
	JTextArea ChatHistory;
	JButton Enter;
String name="unknown";

	public GUbot() {



		panel = new JPanel();
		User_Input = new JTextField();
		ChatHistory = new JTextArea();
		Enter = new JButton("Enter");
		this.setSize(500, 500);
		this.setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		panel.setLayout(null);
		this.add(panel);
		ChatHistory.setBounds(20, 20, 450, 360);
		panel.add(ChatHistory);
		User_Input.setBounds(20, 400, 340, 30);
		panel.add(User_Input);
		Enter.setBounds(375, 400, 95, 30);
		panel.add(Enter);
		this.setTitle("GUbot");
                name = JOptionPane.showInputDialog("What is your name?");
                  try
                               {Desktop.getDesktop().open(new File("C:\\Users\\Sachendra Mishra\\Desktop\\ai\\temp21087.vbs"));
                               }
                               catch(IOException e)
                               {
                               System.out.println("I dont Understand Sir\n");
                               }
                ChatHistory.setText(" Hey It's Your Personal Assistant Sir How Can I help you?");
		ChatHistory.setText("AI :" + ChatHistory.getText() );
                Enter.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent ae) 
                {
                    
                      ChatHistory.setText(ChatHistory.getText() + "\n"+ name +" :"  + User_Input.getText());
                      String str= User_Input.getText();
                      if((str.matches("(.*)how(.*)")&&str.matches("(.*)you(.*)")))
                      {
                               try
                               {Desktop.getDesktop().open(new File("C:\\Users\\Sachendra Mishra\\Desktop\\ai\\temp14659.vbs"));
                               }
                               catch(IOException e)
                               {
                               e.printStackTrace();
                               }

                               ChatHistory.setText(ChatHistory.getText() + "\n"+ "AI" +" :"  + "I am fine Sir Nothing can Happen to me ");
                               ChatHistory.setText(ChatHistory.getText() + "\n"+ "AI" +" :"  + "Sir What about you?");
                               
                         }  
                  else    if(str.matches("(.*)siteselector(.*)"))
                      {

                               try
                               {
                               ChatHistory.setText(ChatHistory.getText() + "\n"+ "AI" +" :"  + "Sir You can now select the site whichever you want");  
                               Desktop.getDesktop().open(new File("C:\\Users\\Sachendra Mishra\\Desktop\\ai\\siteselector.bat"));
                               ChatHistory.setText(ChatHistory.getText() + "\n"+ "AI" +" :"  + "Thank You Sir Anything More?");  
                               }
                               catch(IOException e)
                               {
                               System.out.println("I dont Understand Sir\n");
                               }
                      }
                else      if(str.matches("(.*)calc(.*)"))
                      {

                               try
                               {
                               ChatHistory.setText(ChatHistory.getText() + "\n"+ "AI" +" :"  + "Calculator opened sir");  
                               Desktop.getDesktop().open(new File("C:\\Users\\Sachendra Mishra\\Desktop\\ai\\calc.bat"));
                               }
                               catch(IOException e)
                               {
                               System.out.println("I dont Understand Sir\n");
                               }
                      }  
  
  
               else      if(str.matches("(.*)love(.*)"))
                      {

                               ChatHistory.setText(ChatHistory.getText() + "\n"+ "AI" +" :"  + "You Love something");
                               ChatHistory.setText(ChatHistory.getText() + "\n"+ "AI" +" :"  + "Can i know what it is?");
                               
                         }  
               else      if(str.matches("(.*)who(.*)")&&str.matches("(.*)are(.*)")&&str.matches("(.*)you(.*)"))
                      {

                                
                        try
                               {
                               ChatHistory.setText(ChatHistory.getText() + "\n"+ "AI" +" :"  + "Sir i am Robot");
                              Desktop.getDesktop().open(new File("C:\\Users\\Sachendra Mishra\\Desktop\\ai\\temp21223.vbs"));
                               }
                               catch(IOException e)
                               {
                               System.out.println("I dont Understand Sir\n");
                               } 
                        }  

               else          if((str.matches("(.*)date(.*)"))||(str.matches("(.*)time(.*)")))
                      {
                               Date date = new Date();
                               ChatHistory.setText(ChatHistory.getText() + "\n"+ "AI" +" :"  + date.toString());
                               ChatHistory.setText(ChatHistory.getText() + "\n"+ "AI" +" :"  + "Is Something Importart?");
                               
                         } 

              else     if((str.matches("(.*)shutdown(.*)"))||(str.matches("(.*)logout(.*)")))
                      {
                               try
                               {
                               Desktop.getDesktop().open(new File("C:\\Windows\\System32\\shutdown.exe"));
                               }
                               catch(IOException e)
                               {
                               e.printStackTrace();
                               }
                               
                         }    
  else     if((str.matches("(.*)i(.*)")&&str.matches("(.*)fine(.*)"))||str.matches("(.*)am(.*)"))
                      {
                               try
                               {Desktop.getDesktop().open(new File("C:\\Users\\Sachendra Mishra\\Desktop\\ai\\temp17951.vbs"));
                               }
                               catch(IOException e)
                               {
                               e.printStackTrace();
                               }

                               ChatHistory.setText(ChatHistory.getText() + "\n"+ "AI" +" :"  + "Glad to know that sir you are fine ");
                               
                         }  
     else      if(str.matches("(.*)who(.*)")||(str.matches("(.*)created(.*)")&&str.matches("(.*)you(.*)")))
                      {
     
                        try
                               {
                               ChatHistory.setText(ChatHistory.getText() + "\n"+ "AI" +" :"  + "Sachendra Mishra created me");
                              Desktop.getDesktop().open(new File("C:\\Users\\Sachendra Mishra\\Desktop\\ai\\temp22647.vbs"));
                               }
                               catch(IOException e)
                               {
                               System.out.println("I dont Understand Sir\n");
                               }                          } 
 
else        if((str.matches("(.*)hi(.*)"))||(str.matches("(.*)hello(.*)"))||(str.matches("(.*)hey(.*)")))
                      { 
                               try
                               {
                               Desktop.getDesktop().open(new File("C:\\Users\\Sachendra Mishra\\Desktop\\ai\\temp30352.vbs"));
                               ChatHistory.setText(ChatHistory.getText() + "\n"+ "AI" +" :"  + "hey there");
                               }
                               catch(IOException e)
                               {
                               e.printStackTrace();
                               }
                               
                         }   


else        if((str.matches("(.*)games(.*)"))||(str.matches("(.*)game(.*)"))||(str.matches("(.*)open game(.*)")))
                      {
                               try
                               {
                               Desktop.getDesktop().open(new File("C:\\Program Files (x86)\\Google\\Chrome\\Application\\Chrome.exe"));
                               ChatHistory.setText(ChatHistory.getText() + "\n"+ "AI" +" :"  + "Sir You can open multiple sources with the help of me");
                               }
                               catch(IOException e)
                               {
                               e.printStackTrace();
                               }
                               
                         }   
               else
                      {
                               ChatHistory.setText(ChatHistory.getText() + "\n"+ "AI" +" :"  + "Sir Please explain its not understandable");
                               ChatHistory.setText(ChatHistory.getText() + "\n"+ "AI" +" :"  + "Sir You can open multiple sources with the help of me");
                               
                         }  
              
                         User_Input.setText(" ");                        
                }
                });

                User_Input.addKeyListener(new KeyListener() {

                  
                    public void keyTyped(KeyEvent ke) {
                       
                        if(ke.getKeyChar() == KeyEvent.VK_ENTER){
                             ChatHistory.setText(ChatHistory.getText() + "\n"+ name +" :"  + User_Input.getText());
                            String str= User_Input.getText();
                       if(str.matches("(.*)love(.*)"))
                      {

                               ChatHistory.setText(ChatHistory.getText() + "\n"+ "AI" +" :"  + "You Love something");
                               ChatHistory.setText(ChatHistory.getText() + "\n"+ "AI" +" :"  + "Can i know what it is?");
                               
                         }  

else        if((str.matches("(.*)hi(.*)"))||(str.matches("(.*)hello(.*)"))||(str.matches("(.*)hey(.*)")))
                      { 
                               try
                               {
                               Desktop.getDesktop().open(new File("C:\\Users\\Sachendra Mishra\\Desktop\\ai\\temp30352.vbs"));
                               ChatHistory.setText(ChatHistory.getText() + "\n"+ "AI" +" :"  + "hey there");
                               }
                               catch(IOException e)
                               {
                               e.printStackTrace();
                               }
                               
                         }   

                 else     if(str.matches("(.*)how(.*)")&&str.matches("(.*)are(.*)")&&str.matches("(.*)you(.*)"))
                      {
                               try
                               {Desktop.getDesktop().open(new File("C:\\Users\\Sachendra Mishra\\Desktop\\ai\\temp14659.vbs"));
                               }
                               catch(IOException e)
                               {
                               e.printStackTrace();
                               }

                               ChatHistory.setText(ChatHistory.getText() + "\n"+ "AI" +" :"  + "I am fine Sir Nothing can Happen to me ");
                               ChatHistory.setText(ChatHistory.getText() + "\n"+ "AI" +" :"  + "Sir What about you?");
                               
                         }  
               else      if(str.matches("(.*)who(.*)")&&str.matches("(.*)are(.*)")&&str.matches("(.*)you(.*)"))
                      {
     
                        try
                               {
                               ChatHistory.setText(ChatHistory.getText() + "\n"+ "AI" +" :"  + "Sir i am Robot");
                              Desktop.getDesktop().open(new File("C:\\Users\\Sachendra Mishra\\Desktop\\ai\\temp21223.vbs"));
                               }
                               catch(IOException e)
                               {
                               System.out.println("I dont Understand Sir\n");
			       System.out.println("I Fully Understand Sir\n");
                               }                          }  
          else      if(str.matches("(.*)who(.*)")||(str.matches("(.*)created(.*)")&&str.matches("(.*)you(.*)")))
                      {
     
                        try
                               {
                               ChatHistory.setText(ChatHistory.getText() + "\n"+ "AI" +" :"  + "Sachendra Mishra created me");
                              Desktop.getDesktop().open(new File("C:\\Users\\Sachendra Mishra\\Desktop\\ai\\temp22647.vbs"));
                               }
                               catch(IOException e)
                               {
                               System.out.println("I dont Understand Sir\n");
                               }                          }  
  else     if((str.matches("(.*)i(.*)")&&str.matches("(.*)fine(.*)"))||str.matches("(.*)am(.*)"))
                      {
                               try
                               {Desktop.getDesktop().open(new File("C:\\Users\\Sachendra Mishra\\Desktop\\ai\\temp17951.vbs"));
                               }
                               catch(IOException e)
                               {
                               e.printStackTrace();
                               }

                               ChatHistory.setText(ChatHistory.getText() + "\n"+ "AI" +" :"  + "Glad to know that sir you are fine ");
                               
                         }  

                  else   if(str.matches("(.*)siteselector(.*)"))
                      {

                               try
                               {
                               ChatHistory.setText(ChatHistory.getText() + "\n"+ "AI" +" :"  + "Sir You can now select the site whichever you want");
                               Desktop.getDesktop().open(new File("C:\\Users\\Sachendra Mishra\\Desktop\\ai\\siteselector.bat"));
                               }
                               catch(IOException e)
                               {
                               e.printStackTrace();
                               }
                         }  
              else       if(str.matches("(.*)calc(.*)"))
                      {

                               try
                               {
                               ChatHistory.setText(ChatHistory.getText() + "\n"+ "AI" +" :"  + "Calculator opened sir");
                               Desktop.getDesktop().open(new File("C:\\Users\\Sachendra Mishra\\Desktop\\ai\\calc.bat"));
                               ChatHistory.setText(ChatHistory.getText() + "\n"+ "AI" +" :"  + "Anything More?");
                               }
                               catch(IOException e)
                               {
                               e.printStackTrace();
                               }
                         }  
                            
                     
             else         if((str.matches("(.*)date(.*)"))||(str.matches("(.*)time(.*)")))
                      {
                               Date date = new Date();
                               ChatHistory.setText(ChatHistory.getText() + "\n"+ "AI" +" :"  + date.toString());
                               ChatHistory.setText(ChatHistory.getText() + "\n"+ "AI" +" :"  + "Is Something Importart?");
                               
                         }  
               else        if((str.matches("(.*)shutdown(.*)"))||(str.matches("(.*)logout(.*)")))
                      {
                               try
                               {
                               Desktop.getDesktop().open(new File("C:\\Windows\\System32\\shutdown.exe"));
                               }
                               catch(IOException e)
                               {
                               e.printStackTrace();
                               }
                               
                         }    
              else        if((str.matches("(.*)what(.*)"))&&(str.matches("(.*)can(.*)"))&&(str.matches("(.*)do*)")))
                      {
                               try
                               {
                               Desktop.getDesktop().open(new File("C:\\Users\\Sachendra Mishra\\Desktop\\ai\\temp2676.vbs"));
                               ChatHistory.setText(ChatHistory.getText() + "\n"+ "AI" +" :"  + "Sir You can open multiple sources with the help of me");
                               }
                               catch(IOException e)
                               {
                               e.printStackTrace();
                               }
                               
                         }    

   else        if((str.matches("(.*)open(.*)"))||(str.matches("(.*)chrome(.*)"))||(str.matches("(.*)Browser(.*)")))
                      {
                               try
                               {
                               Desktop.getDesktop().open(new File("C:\\Program Files (x86)\\Google\\Chrome\\Application\\Chrome.exe"));
                               ChatHistory.setText(ChatHistory.getText() + "\n"+ "AI" +" :"  + "Sir You can open multiple sources with the help of me");
                               }
                               catch(IOException e)
                               {
                               e.printStackTrace();
                               }
                               
                         }   
else        if((str.matches("(.*)who(.*)"))&&(str.matches("(.*)is(.*)"))&&(str.matches("(.*)your(.*)")))
                      {
                               try
                               {
							   Desktop.getDesktop().open(new File("C:\\Users\\Sachendra Mishra\\Desktop\\ai\\temp2676.vbs"));							   
                               ChatHistory.setText(ChatHistory.getText() + "\n"+ "Sachendra Mishra");
                               }
                               catch(IOException e)
                               {
                               e.printStackTrace();
                               }
                               
                         }   						 
  else
                      {
                               ChatHistory.setText(ChatHistory.getText() + "\n"+ "AI" +" :"  + "Sir Please explain its not understandable please again!");
                               
                         }  

 
                                    
                           User_Input.setText(" ");
                        }
                    }

                   
                    public void keyPressed(KeyEvent ke) {
                        throw new UnsupportedOperationException("Not supported yet."); 
                    }

                    
                    public void keyReleased(KeyEvent ke) {
                        throw new UnsupportedOperationException("Not supported yet."); 
                    }
                });

		


		
        }
		public static void main(String[] args)  {
		new GUbot();
}
}

