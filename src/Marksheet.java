import java.awt.*;
import java.awt.event.*;

public class StudentResultManualLayout extends Frame implements ActionListener {

    // Components
    Label nameLabel, subject1Label, subject2Label, subject3Label, subject4Label, resultLabel;
    TextField nameField, subject1Field, subject2Field, subject3Field, subject4Field;
    Button calculateButton;

    // Constructor
    StudentResultManualLayout() {
        setTitle("Student Result Calculator");
        setSize(500, 500);
        setLayout(null);

        // Create components
        nameLabel = new Label("Student Name:");
        nameField = new TextField();

        subject1Label = new Label("Subject 1 Marks:");
        subject1Field = new TextField();

        subject2Label = new Label("Subject 2 Marks:");
        subject2Field = new TextField();

        subject3Label = new Label("Subject 3 Marks:");
        subject3Field = new TextField();

        subject4Label = new Label("Subject 4 Marks:");
        subject4Field = new TextField();

        calculateButton = new Button("Calculate Result");
        resultLabel = new Label();

        // Set positions manually (x, y, width, height)
        nameLabel.setBounds(50, 50, 120, 30);
        nameField.setBounds(200, 50, 200, 30);

        subject1Label.setBounds(50, 100, 120, 30);
        subject1Field.setBounds(200, 100, 200, 30);

        subject2Label.setBounds(50, 150, 120, 30);
        subject2Field.setBounds(200, 150, 200, 30);

        subject3Label.setBounds(50, 200, 120, 30);
        subject3Field.setBounds(200, 200, 200, 30);

        subject4Label.setBounds(50, 250, 120, 30);
        subject4Field.setBounds(200, 250, 200, 30);

        calculateButton.setBounds(150, 320, 150, 40);
        resultLabel.setBounds(100, 380, 300, 30);

        // Add components
        add(nameLabel); add(nameField);
        add(subject1Label); add(subject1Field);
        add(subject2Label); add(subject2Field);
        add(subject3Label); add(subject3Field);
        add(subject4Label); add(subject4Field);
        add(calculateButton); add(resultLabel);

        // Action listener
        calculateButton.addActionListener(this);

        // Window closing event
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });

        setVisible(true);
    }

    // Handle button click
    public void actionPerformed(ActionEvent e) {
        try {
            String name = nameField.getText();
            int marks1 = Integer.parseInt(subject1Field.getText());
            int marks2 = Integer.parseInt(subject2Field.getText());
            int marks3 = Integer.parseInt(subject3Field.getText());
            int marks4 = Integer.parseInt(subject4Field.getText());

            int total = marks1 + marks2 + marks3 + marks4;
            double percentage = total / 4.0;
            String grade;

            if (percentage >= 90) {
                grade = "A+";
            } else if (percentage >= 80) {
                grade = "A";
            } else if (percentage >= 70) {
                grade = "B+";
            } else if (percentage >= 60) {
                grade = "B";
            } else if (percentage >= 50) {
                grade = "C";
            } else {
                grade = "Fail";
            }

            resultLabel.setText("Percentage: " + percentage + "%, Grade: " + grade);

        } catch (NumberFormatException ex) {
            resultLabel.setText("Please enter valid marks!");
        }
    }

    // Main Method
    public static void main(String[] args) {
       new StudentResultManualLayout();
    }}
