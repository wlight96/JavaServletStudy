package example.servletbindingex2;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MemberDAO {
    private Statement stmt;
    private Connection con;
    public List<MemberVO> listMembers(){
        List<MemberVO> list = new ArrayList<MemberVO>();
        try{
            connDB();
            String stm = "select * from t_member";
            ResultSet rs = stmt.executeQuery(stm);
            while(rs.next()){
                String id = rs.getString("id");
                String pwd = rs.getString("pwd");
                String name = rs.getString("name");
                String email = rs.getString("email");
                Date joinDate = rs.getDate("joinDate");
                MemberVO vo = new MemberVO();
                vo.setId(id);
                vo.setPwd(pwd);
                vo.setName(name);
                vo.setEmail(email);
                vo.setJoinDate(joinDate);
                list.add(vo);
            }
            rs.close();
            stmt.close();
            con.close();
        }catch(Exception e){
            e.printStackTrace();
        }
        return list;
    }

    private void connDB() {
        String dbacct = "wlight96";
        String passward = "sj2015034!";
        String dbname = "test";
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/test?serverTimezone=UTC";
            System.out.println("mysql 드라이버 로딩 성공");
            con = DriverManager.getConnection(url, dbacct, passward);
            System.out.println("Connection 성공");
            stmt = con.createStatement();
            System.out.println("statement 생성 성공");
        }catch (Exception e) {
            e.printStackTrace();
        }
    }

}
