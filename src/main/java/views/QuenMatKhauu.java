package views;


import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.Properties;
import java.util.Random;
import java.util.logging.Level;

public class QuenMatKhauu extends JFrame{
    private JTextField txtEmail;
    private JButton btnLayCode;
    private JTextField txtCode;
    private JTextField txtTaiKhoan;
    private JPasswordField txtPassNew;
    private JPasswordField txtComfimPass;
    private JButton btnDoiPass;
    private JButton btnThoat;
    private JLabel lblTitle;
    private JLabel lblTime;
    private JPanel mainPanle;
    int code;
    public QuenMatKhauu() throws IOException {

        this.setTitle("Quên Mật Khẩu");
        this.setContentPane(mainPanle);
        this.setVisible(true);
        this.setSize(400, 300);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(2);

    }






}
