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
import java.util.logging.Level;

public class formDoiMatKhau extends JFrame{
    private String user;
    private int role;
    private JPasswordField txtPassOld;
    private JPasswordField txtPassNew;
    private JPasswordField txtConfirm;
    private JButton btnDoiPass;
    private JButton btnThoat;
    private JPanel mainPanel;
    private JLabel lblTitle;



    public formDoiMatKhau() throws IOException {

        this.setTitle("Đổi Mật Khẩu");
        this.setContentPane(mainPanel);
        this.setDefaultCloseOperation(2);
        this.setSize(400,300);
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        this.setResizable(false); // chống chỉnh sửa size frame


    }




    public static void main(String[] args) throws IOException {
        new formDoiMatKhau();
    }
}
