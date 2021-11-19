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

public class formNguonHang extends JFrame{
    private String user;
    private int role;
    private JPanel mainPanel;
    private JTabbedPane tabbedPane1;
    private JTextField txtHoTen;
    private JTextField txtDiaChi;
    private JTextField txtSDT;
    private JTable tblNguonHang;
    private JTextField txtTimKiem;
    private JButton btnThem;
    private JButton btnSua;
    private JButton btnXoa;
    private JButton btnMoi;
    private JButton btnTblXoa;
    DefaultTableModel _dtm;

    boolean check = false;
    public formNguonHang() throws SQLException, IOException {

        this.setTitle("Nguồn Hàng");
        this.setContentPane(mainPanel);
        this.setSize(500,300);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(2);
        this.setResizable(false); // chống chỉnh sửa size frame
        this.setVisible(true);
        _dtm = (DefaultTableModel) tblNguonHang.getModel();
        _dtm.setColumnIdentifiers(new String []{
                 "Tên Nguồn Hàng", "Địa Chỉ", "Số Điện Thoại"
        });
        tblNguonHang.setModel(_dtm);

    }



    public static void main(String[] args) throws SQLException, IOException {
        new formNguonHang();
    }
}
