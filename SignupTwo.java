package bank.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SignupTwo extends JFrame implements ActionListener{

    
    JTextField  cpan, caadhar;
    JButton next;
    JRadioButton syes, sno, eyes, eno;
    String formno;
    JComboBox<String> religion,category,occupation,income,education;


    SignupTwo(String formno){
        this.formno = formno;
        setLayout(null);

        setTitle("NEW ACCOUNT APPLICATION FORM-PAGE 2");


         JLabel additionalDetails=new JLabel("Page 2: Additional Details" ) ;
         additionalDetails.setFont(new Font("Raleway", Font.BOLD, 22));
         additionalDetails.setBounds(290,80,400,30);
        add(additionalDetails);

         JLabel rreligion=new JLabel("Religion:" ) ;
        rreligion.setFont(new Font("Raleway", Font.BOLD, 20));
        rreligion.setBounds(100,140,100,30);
        add(rreligion);

        String valReligion[]={"Hindu","Muslim","Sikh","Christian","Other"};
        religion =new JComboBox<>(valReligion);
        religion.setBounds(300,140,400,30);
        religion.setBackground(Color.WHITE);
        add(religion);


             
         JLabel ccategory=new JLabel(" Category:" ) ;
        ccategory.setFont(new Font("Raleway", Font.BOLD, 20));
        ccategory.setBounds(100,190,200,30);
        add(ccategory);

        String valCategory[]={"General","OBC","SC","ST","Other"};   
        category =new JComboBox<>(valCategory);
       category.setBounds(300,190,400,30);
       category.setBackground(Color.WHITE);
        add(category);


         JLabel iincome=new JLabel("Income" ) ;
        iincome.setFont(new Font("Raleway", Font.BOLD, 20));
        iincome.setBounds(100,240,200,30);
        add(iincome);

        String IncomeCategory[]={"Null","< 1,50,000","<2,50,000","<5,00,000","upto 10,00,00"};   
         income=new JComboBox<>(IncomeCategory);
       income.setBounds(300,240,400,30);
       income.setBackground(Color.WHITE);
        add(income);



         JLabel eeducation=new JLabel(" Educational " ) ;
        eeducation.setFont(new Font("Raleway", Font.BOLD, 20));
        eeducation.setBounds(100,290,200,30);
        add(eeducation);

        
         JLabel Qualification =new JLabel(" Qualification :" ) ;
         Qualification .setFont(new Font("Raleway", Font.BOLD, 20));
         Qualification .setBounds(100,315,200,30);
        add(Qualification );

        String educationValues[]={"Non-Graduate","Graduate","Post-Graduate","Doctorate","Others"};   
        education =new JComboBox<>(educationValues);
        education.setBounds(300,390,400,30);
        education.setBackground(Color.WHITE);
        add(education);



         JLabel Occupation=new JLabel("Occupation:" ) ;
         Occupation.setFont(new Font("Raleway", Font.BOLD, 20));
         Occupation.setBounds(100,390,200,30);
        add(Occupation);

        String occupationValues[]={"Salaried","Self-employed","Businessman","Student","Retired","Others"};   
        occupation=new JComboBox<>(occupationValues);
        occupation.setBounds(300,315,400,30);
        occupation.setBackground(Color.WHITE);
        add(occupation);


        JLabel pan=new JLabel(" PAN Number " ) ;
        pan.setFont(new Font("Raleway", Font.BOLD, 20));
        pan.setBounds(100,440,200,30);
        add(pan);

         cpan= new JTextField();
        cpan.setFont(new Font("Raleway", Font.BOLD, 14));
        cpan.setBounds(300,440,400,30);
        add(cpan);

        
         JLabel Aadhar =new JLabel(" Aadhar Number: " ) ;
         Aadhar .setFont(new Font("Raleway", Font.BOLD, 20));
         Aadhar .setBounds(100,490,200,30);
        add(Aadhar );

        caadhar= new JTextField();
        caadhar.setFont(new Font("Raleway", Font.BOLD, 14));
        caadhar.setBounds(300,490,400,30);
        add(caadhar);


         JLabel senior=new JLabel(" Senior Citizen " ) ;
         senior.setFont(new Font("Raleway", Font.BOLD, 20));
         senior.setBounds(100,540,200,30);
        add(senior);

        syes =new JRadioButton("Yes");
        syes.setBounds(300,540,100,30);
        syes.setBackground(Color.WHITE);
        add(syes);


       sno=new JRadioButton("No"); 
        sno.setBounds(450,540,100,30);
        sno.setBackground(Color.WHITE);
        add(sno);

    

        ButtonGroup mGroup = new ButtonGroup();
        mGroup.add(syes);
        mGroup.add(sno);



         JLabel Existing=new JLabel(" Existing Account: " ) ;
         Existing.setFont(new Font("Raleway", Font.BOLD, 20));
         Existing.setBounds(100,590,200,30);
        add(Existing);

        eyes =new JRadioButton("Yes");
        eyes.setBounds(300,590,100,30);
        eyes.setBackground(Color.WHITE);
        add(eyes);


       eno=new JRadioButton("No"); 
        eno.setBounds(450,590,100,30);
        eno.setBackground(Color.WHITE);
        add(eno);

    

        ButtonGroup smGroup = new ButtonGroup();
        smGroup.add(eyes);
        smGroup.add(eno);
        

         next = new JButton("Next");
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.setFont(new Font("Raleway",Font.BOLD,14));
        next.setBounds(620,660,80,30);
        next.addActionListener(this);
        add(next);




        getContentPane().setBackground((Color.WHITE));



        setSize(850,800);
        setLocation(350,10);
        setVisible(true);


    }

    public void actionPerformed(ActionEvent ae){

    
        String sreligion= (String)religion.getSelectedItem();
        String scategory= (String)category.getSelectedItem();
        String sincome=(String)income.getSelectedItem();
        String seducation= (String)education.getSelectedItem();
        String soccupation =(String)occupation.getSelectedItem();
        String seniorcitizen= null;
        if(syes.isSelected()){
            seniorcitizen="Yes";
        }else if(sno.isSelected()){
            seniorcitizen="No";
        }
    
        String existingaccount=null;
        if(eyes.isSelected()){
            existingaccount="Yes";
        }else if(eno.isSelected()){
            existingaccount ="No";
        }
        String span =cpan.getText();
        String saadhar= caadhar.getText();
    



        try {

        
                Conn c = new Conn();
                String query = "insert into signuptwo values('"+formno+"','"+sreligion+"','"+scategory+"','"+sincome+"','"+seducation+"','"+soccupation+"','"+span+"','"+saadhar+"','"+seniorcitizen+"','"+existingaccount+"')";
                c.S.executeUpdate(query);


                setVisible(false);
                new SignupThree(formno).setVisible(true);

                
            
            
        } catch (Exception e) {
           System.out.println(e);
        }





    }

    public static void main(String[] args) {
        
        new SignupTwo("");
    

    }

    
}
