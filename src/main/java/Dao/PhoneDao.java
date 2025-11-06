package Dao;

import DBConnection.ConnectionSQL;
import PhoneModel.phone;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class PhoneDao {
//
//    import PhoneModel.Phone;
//import PhoneModel.DBUtil;
//import java.sql.*;
//import java.util.*;
//
//    public class PhoneDAO {
//
    private final Connection conn = ConnectionSQL.getConnection();

    public PhoneDao() throws SQLException {

    }


    public boolean save(phone p) {
            try (PreparedStatement ps = conn.prepareStatement(
                    "INSERT INTO phone VALUES (?,?,?)")) {


                ps.setInt(1, p.getPhoneid());
                ps.setString(2, p.getModelname());
                ps.setInt(3, p.getPrice());


                return ps.executeUpdate() > 0; // {1>0}
            } catch (Exception e) {
                return false;
            }
        }
        // Statement (I) -> PreparedStatement(I) -> Callable (I)
//
//        public List<Phone> getAll() {
//            List<Phone> list = new ArrayList<>();
//
//            try (Statement st = conn.createStatement();
//                 ResultSet rs = st.executeQuery("SELECT * FROM phone")) {
//
//                while (rs.next()) {
//                    list.add(new Phone(
//                            rs.getInt(1),
//                            rs.getString(2),
//                            rs.getInt(3)
//                    ));
//                }
//            } catch (Exception e) { }
//
//            return list;
//        }
//    }
//
}
