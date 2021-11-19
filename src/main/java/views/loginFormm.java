package views;




import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.sql.SQLException;
import java.util.logging.Level;

public class loginFormm extends JFrame{

    private JPanel mainPanel;
    private JTextField txtTaiKhoan;
    private JPasswordField txtPass;
    private JCheckBox ckcRemember;
    private JButton btnLogin;
    private JButton btnThoat;
    private JLabel lblQuenPass;
    int dem = 0;
    public loginFormm() throws SQLException {
        this.setTitle("Đăng Nhập");
        this.setContentPane(mainPanel);
        this.setLocationRelativeTo(null);
        this.setSize(700,500);
        this.setVisible(true);
        this.setDefaultCloseOperation(2);
        this.setResizable(false); // chống chỉnh sửa size frame

    }




    // main chạy chương trình
    public static void main(String[] args) throws SQLException {
        new loginFormm();
    }
}
