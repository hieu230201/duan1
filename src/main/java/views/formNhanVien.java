package views;




import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import java.awt.event.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.sql.SQLException;
import java.util.logging.Level;

public class formNhanVien extends JFrame{
    private String user;
    private int role;
    private JPanel mainPanel;
    private JTabbedPane tabbedPane1;
    private JTable tblNhanVien;
    private JTextField txtHoTen;
    private JTextField txtDiaChi;
    private JTextField txtSDT;
    private JTextField txtEmail;
    private JPasswordField txtMk;
    private JRadioButton rdbNV;
    private JRadioButton rdbChu;
    private JButton btnThem;
    private JButton btnSua;
    private JButton btnXoa;
    private JButton btnMoi;
    private JTextField txtMaNV;
    private JTextField txtTimKiem;
    private JButton btnTBLXoa;
    DefaultTableModel _dtm;

    boolean check = false;

    public  formNhanVien() throws SQLException, IOException {

        this.setTitle("Quản lí nhân viên");
        this.setContentPane(mainPanel);
        this.setSize(700,500);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(2);
        this.setResizable(false); // chống chỉnh sửa size frame
        this.setVisible(true);
        _dtm = (DefaultTableModel) tblNhanVien.getModel();
        _dtm.setColumnIdentifiers(new String []{
                "Mã Nhân Viên", "Họ Tên", "Địa Chỉ", "Số Điện Thoại", "Email", "Mật Khẩu", "Chức Vụ"
        });
        tblNhanVien.setModel(_dtm);
        rdbChu.setSelected(true);

    }





    public static void main(String[] args) throws SQLException, IOException {
        new formNhanVien();
    }
}
