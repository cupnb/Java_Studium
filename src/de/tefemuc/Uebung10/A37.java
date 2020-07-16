package de.tefemuc.Uebung10;

import java.sql.*;

public class A37 {

    public static void main(String[] args){
        Connection c = null;
        try {
            c = DriverManager.getConnection("jdbc:mysql://educos-srv01.informatik.uni-augsburg.de:3306/theDatabase?useSSL=false", "student", "inFormatik2");
            printBooks(c);
            printPreis(c, "00003");
        } catch (SQLException e){
            System.out.println(e.getMessage());
        }

    }

    public static void printBooks(Connection c) throws SQLException{
        try (Statement s = c.createStatement()) {
            String com = "select isbn from Buch;";
            ResultSet resultSet = s.executeQuery(com);

            while (resultSet.next()) {
                System.out.println(resultSet.getString("isbn"));
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void printPreis(Connection c, String customer) throws SQLException{
        float preis = 0.0f;
        try (Statement s = c.createStatement()) {
            String com = "select preis from Auftrag where auftraggeber = '" + customer + "';";
            ResultSet resultSet = s.executeQuery(com);

            while (resultSet.next()) {
                preis += resultSet.getFloat("preis");
            }

            System.out.println(preis);

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }


}
