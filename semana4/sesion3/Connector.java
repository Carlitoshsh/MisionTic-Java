package semana4.sesion3;

import java.sql.*;

public class Connector {

    public static void main(String[] args) {
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test",
                    "root", "Grupo41.");
            Statement statement;
            statement = con.createStatement();
            ResultSet resultSet;
            resultSet = statement.executeQuery(
                    "select * from designation");
            int code;
            String title;
            while (resultSet.next()) {
                code = resultSet.getInt("code");
                title = resultSet.getString("title").trim();
                System.out.println("Code : " + code
                        + " Title : " + title);
            }
            resultSet.close();
            statement.close();
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
