package org.example;

import Dao.PhoneDao;
import PhoneModel.phone;

import java.sql.SQLException;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class PhoneMain {
    public static void main(String[] args) {
        phone p = new phone(101, "Realme C3", 10999);
        try {
            PhoneDao pd = new PhoneDao();
            // To insert
            boolean res = pd.save(p);
            if(res) {
                System.out.println("Data Inserted Succefully!");
            } else {
                System.out.println("Data Not Inserted !");
            }
        } catch (SQLException e){
            e.printStackTrace();
        }
    }
}