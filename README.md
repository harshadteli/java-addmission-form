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

The core application logic is handled by adding an `ActionListener` to each button, which calls the appropriate `JOptionPane.show...Dialog` method.

```java
public class SimpleFrameApp {

    public static void main(String[] args) {
        // Setup the Main Frame
        JFrame frame = new JFrame("Simple Dialog Demo");
        frame.setSize(300, 150);
        // ... (setup other buttons and layout)

        // Example: Message Dialog Button Logic
        JButton messageButton = new JButton("Show Message");
        messageButton.addActionListener(e -> {
            JOptionPane.showMessageDialog(frame, "Hello! This is a simple message dialog.");
        });

        // ... (rest of the code for Input and Confirmation dialogs)

        frame.setVisible(true);
    }
}
