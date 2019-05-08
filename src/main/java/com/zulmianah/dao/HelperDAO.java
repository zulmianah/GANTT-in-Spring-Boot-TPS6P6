/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zulmianah.dao;

import com.zulmianah.model.Administrateur;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

/**
 *
 * @author Komun
 */
public class HelperDAO {

    //public static final String HOST = "jdbc:postgresql://localhost:5432/", DB_NAME = "journal", USERNAME = "postgres", PASSWORD = "root";
    public static final String HOST = "jdbc:postgresql://ec2-50-17-246-114.compute-1.amazonaws.com:5432/", DB_NAME = "dd5isfn7uh2uvo", USERNAME = "ulcjgnvoknjgdx", PASSWORD = "ef37c9ecd47ff7078b4081add008ffc3ffa12b92dc466e827ae9b7797f08b330";
     public static final String url = "jdbc:mysql://www.db4free.net:3306/fahmi230995?useSSL=false", user = "fahmi230995", password = "fahmi230995";
//    public static final String url = "jdbc:mysql://localhost:3306/journal?useSSL=false", user = "root", password = "";

    public Connection getConnection() throws Exception {
//        try {
//            Class.forName("org.postgresql.Driver");
//            Properties p = new Properties();
//            p.setProperty("sslmode", "required");
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        return DriverManager.getConnection(HOST + DB_NAME, USERNAME, PASSWORD);
        return DriverManager.getConnection(url, user, password);
    }

    public void update(Connection c) throws Exception {
        PreparedStatement ps = null;
        try {
            String query = "UPDATE table_name SET column1 = value1, column2 = value2 WHERE [condition]";
            ps = c.prepareStatement(query);
            ps.setString(1, "col");
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (ps != null) {
                ps.close();
            }
        }
    }

    public void delete(Connection c) throws Exception {
        PreparedStatement ps = null;
        try {
            String query = "DELETE FROM table_name WHERE [condition];";
            ps = c.prepareStatement(query);
            ps.setString(1, "col");
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (ps != null) {
                ps.close();
            }
        }
    }

    public void insert(Connection c) throws Exception {
        PreparedStatement ps = null;
        try {
            String query = "insert into user(col) values (?)";
            ps = c.prepareStatement(query);
            ps.setString(1, "col");
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (ps != null) {
                ps.close();
            }
        }
    }

    public List<Object> select(Connection c) throws Exception {
        List<Object> v = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            String query = "select * from user";
            ps = c.prepareStatement(query);
            rs = ps.executeQuery();
            v = new ArrayList();
            while (rs.next()) {
                Object o = new Object();
                v.add(o);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (rs != null) {
                rs.close();
            }
            if (ps != null) {
                ps.close();
            }
        }
        return v;
    }

    public List<Administrateur> essai(Connection c) throws Exception {
        List<Administrateur> v = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            String query = "select * from ADMINISTRATEUR";
            ps = c.prepareStatement(query);
            rs = ps.executeQuery();
            v = new ArrayList();
            while (rs.next()) {
                Administrateur o = new Administrateur();
                o.setIdadministrateur(rs.getInt("Idadministrateur"));
                v.add(o);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (rs != null) {
                rs.close();
            }
            if (ps != null) {
                ps.close();
            }
        }
        return v;
    }

    public static void main(String[] args) throws Exception {
        HelperDAO h = new HelperDAO();
        Connection c = null;
        try {
            c = h.getConnection();
            System.out.println(h.essai(c));
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (c != null) {
                c.close();
            }
        }
    }
}
