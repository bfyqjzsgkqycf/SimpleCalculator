import javax.swing.*;
import java.awt.*;

public class SimpleCalculator {
    private JFrame frame;
    private JTextField textField;

    public SimpleCalculator() {
        // 创建一个 JFrame 窗口，标题为 "计算器"
        frame = new JFrame("计算器");
        // 设置窗口的大小为 300x400 像素
        frame.setSize(300, 400);
        // 设置窗口关闭时的操作，即退出程序
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // 设置窗口的布局为 BorderLayout
        frame.setLayout(new BorderLayout());

        // 创建一个 JTextField 用于显示输入和结果
        textField = new JTextField();
        // 设置文本框的字体为 Arial 加粗，大小为 24
        textField.setFont(new Font("Arial", Font.BOLD, 24));
        // 设置文本框内文本右对齐
        textField.setHorizontalAlignment(JTextField.RIGHT);
        // 将文本框添加到窗口的北部
        frame.add(textField, BorderLayout.NORTH);

        // 设置窗口可见
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        // 创建 SimpleCalculator 类的实例，启动计算器程序
        new SimpleCalculator();
    }
}