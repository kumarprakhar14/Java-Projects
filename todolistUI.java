import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class todolistUI {
    private DefaultListModel<String> listModel;

    public todolistUI() {
        JFrame frame = new JFrame("Todo List");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 400);

        listModel = new DefaultListModel<>();
        JList<String> todoList = new JList<>(listModel);
        JScrollPane scrollPane = new JScrollPane(todoList);
        frame.add(scrollPane);

        JTextField taskField = new JTextField();
        JButton addButton = new JButton("Add Task");
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String task = taskField.getText().trim();
                if (!task.isEmpty()) {
                    listModel.addElement(task);
                    taskField.setText("");
                }
            }
        });

        JPanel panel = new JPanel();
        panel.add(taskField);
        panel.add(addButton);
        frame.add(panel, "South");

        frame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new todolistUI();
            }
        });
    }
}

