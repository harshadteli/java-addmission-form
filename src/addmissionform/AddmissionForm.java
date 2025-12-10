package addmissionform;

import java.awt.Color;
import java.awt.Font;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
//import javax.swing.*;

public class AddmissionForm extends JFrame {
    JTextField nameField;
    JRadioButton male,female;
    JCheckBox sports,music,reading;
    JComboBox<String> coursebox;
    JList<String> cityList;
    JButton submitBtn;
    
    public AddmissionForm()
    {
        setTitle("College Addmission Form");
        setSize(600,500);
        setLayout(null);
       // To set the background color
       // getContentPane().setBackground(Color.BLACK);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JLabel lblTitle = new JLabel("College Addmission Form");
        lblTitle.setFont(new Font("Arial",Font.BOLD,19));
        lblTitle.setForeground(Color.RED);
        lblTitle.setBounds(170,10,300,30);
        add(lblTitle);
        
        JLabel lblName = new JLabel("Enter Full Name:");
        lblName.setBounds(50,60,100,25);
        add(lblName);
        
        JLabel lblGender = new JLabel("Gender:");
        lblGender.setBounds(50,100,100,25);
        add(lblGender);
        
        JLabel lblCourse = new JLabel("Course:");
        lblCourse.setBounds(50,140,100,25);
        add(lblCourse);
        
        JLabel lblHobbies = new JLabel("Hobbies:");
        lblHobbies.setBounds(50,180,100,25);
        add(lblHobbies);
        
        JLabel lblCity = new JLabel("Select City:");
        lblCity.setBounds(50,220,100,25);
        add(lblCity);
        
        nameField = new JTextField();
        nameField.setBounds(160,60,200,25);
        add(nameField);
        
        male = new JRadioButton("Male");
        female = new JRadioButton("Female");
        male.setBounds(160,100,80,25);
        female.setBounds(240,100,80,25);
        ButtonGroup genderGroup = new ButtonGroup();
        genderGroup.add(male);
        genderGroup.add(female);
        add(male);
        add(female);
        
        String[] courses = {"B.Sc Computer Science", "B.A","B.COM","BBA","BCA"};
        coursebox = new JComboBox<>(courses);
        coursebox.setBounds(160,140,200,25);
        add(coursebox);
        
        sports = new JCheckBox("Sports");
        music = new JCheckBox("Music");
        reading =  new JCheckBox("Reading");
        sports.setBounds(160,180,80,25);
        music.setBounds(240,180,80,25);
        reading.setBounds(320,180,100,25);
        add(sports);
        add(music);
        add(reading);
        
        String[] cities = {"Kolhapur","Pune","Mumbai","Nashik","Nagpur"};
        cityList = new JList<>(cities);
        cityList.setVisibleRowCount(4);
        JScrollPane cityPane = new JScrollPane(cityList);
        cityPane.setBounds(160,220,200,80);
        add(cityPane);
        
        submitBtn = new JButton("Submit");
        submitBtn.setBounds(150,320,100,30);
        //To set the Background Color of the below button
        submitBtn.setForeground(Color.WHITE);
        submitBtn.setBackground(new Color(0,102,204));
        add(submitBtn);
        
        //when the form is submiited then following action performs
        submitBtn.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                String name = nameField.getText();
                
                //Show Popup Message when submit the given form
                
                int response = JOptionPane.showConfirmDialog(null,"Form Submitted Successfully!\n\n"+ name+
                        "\n\nDo you Like To Apply any  Scholarship from our College\n\n","NCKBCS-Registration-2025-26",
                        JOptionPane.YES_NO_OPTION);
                if(response==JOptionPane.YES_NO_OPTION)
                {
                    String email = JOptionPane.showInputDialog("Enter Your Email "+name);
                    if(email!=null && !email.trim().isEmpty())
                    {
                        JOptionPane.showMessageDialog(null, "Our Scholarship Department will be inform you on following email"
                            +" Address\n\n "+ email);
                    }
                    else
                    {
                         JOptionPane.showMessageDialog(null, "Please Enter Appropriate Email ID");
                    }
                }
                else
                {
                     JOptionPane.showMessageDialog(null, "Your Response has been Recorded");
                    
                }
            }
            
        });
    setVisible(true);
        
   }
    public static void main(String[] args) {
       new AddmissionForm();
    }
}
