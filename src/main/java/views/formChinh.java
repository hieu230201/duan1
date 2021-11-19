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
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;

public class formChinh extends JFrame{
    private String user;
    private int role;
    private JPanel mainForm;
    private JMenu mnuHeThong;
    private JMenuItem mniDangXuat;
    private JMenuItem mniDoiPass;
    private JMenuItem mniKetThuc;
    private JMenu mnuQuanLi;
    private JMenuItem mniNhanVien;
    private JMenuItem mniNguonHang;
    private JMenuItem mniLoaiHang;
    private JMenuItem mniSanPham;
    private JMenuItem mniNhapHang;
    private JMenuItem mniThongKe;
    private JButton btnDangXuat;
    private JLabel lblTime;
    private JMenuItem mniXuatHang;
    private JButton btnNhapHang;
    private JButton btnbanHang;
    private JButton btnSanPham;
    private JButton btnBaoLoi;
    private JButton btnKhachHang;

    public formChinh() throws IOException {

        this.setTitle("Cửa sổ chính");
        this.setContentPane(mainForm);
        pack();
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(2);
        this.setResizable(false); // chống chỉnh sửa size frame
        this.setVisible(true);

    }

    public static void main(String[] args) throws IOException {
        new formChinh();
    }
}
