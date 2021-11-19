package views;



import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.sql.SQLException;
import java.util.logging.Level;

public class formKhachHang extends JFrame{
    private String user;
    private int role;
    private JPanel mainPanel;
    private JTabbedPane tabbedPane1;
    private JTextField txtSdt;
    private JTextField txtName;
    private JTable tblKhachHang;
    private JButton btnSua;
    private JButton btnThem;
    private JButton btnMoi;
    DefaultTableModel _dtm;

    public formKhachHang() throws SQLException, IOException {

        this.setTitle("Thượng đế của cửa hàng");
        this.setContentPane(mainPanel);
        this.setSize(500,300);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(2);
        this.setResizable(false); // chống chỉnh sửa size frame
        this.setVisible(true);
        _dtm = (DefaultTableModel) tblKhachHang.getModel();
        _dtm.setColumnIdentifiers(new String []{
                "Họ tên",  "Số Điện Thoại", "Điểm tích lũy"
        });
        tblKhachHang.setModel(_dtm);

    }

    public static void main(String[] args) throws SQLException, IOException {
        new formKhachHang();
    }
}
