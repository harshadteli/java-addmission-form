## 🖼️ Simple Java Frame and Dialog Boxes Demo

This project provides a minimal example of a Java Swing application (`JFrame`) and demonstrates the use of three common `JOptionPane` dialog types triggered by buttons.

---

### 🚀 Features

* **Main Window (`JFrame`):** A basic container window.
* **Message Dialog:** Shows an information message (OK button only).
* **Input Dialog:** Prompts the user to enter text and displays the result.
* **Confirmation Dialog:** Asks a Yes/No question and reports the user's choice.

---

### 📸 Project Output Screenshots



---

### 💻 Code Snippet (SimpleFrameApp.java)

The core application logic is handled by adding an `ActionListener` to submit button, which calls the appropriate `JOptionPane.show...Dialog` method.

```java
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
