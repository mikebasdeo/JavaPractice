package Misc.Infor_Interview_4;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;



public class Solution {

    public int countSeniorEmployeesInCity(Connection c, String city) throws SQLException {

        PreparedStatement ps = c.prepareStatement("SELECT DISTINCT COUNT(EMPL.EMP.ID) as numActive " +
                                                        "FROM " +
                                                            "EMPL, CITY " +
                                                        "WHERE " +
                                                            "EMPL.EMP_SENIOR='y' " +
                                                        "AND " +
                                                            "EMPL.CITY_ID=CITY.CITY_ID " +
                                                        "AND CITY.CITY_NAME=?");
        ps.setString(1, city);
        ResultSet rs = ps.executeQuery();
        int numActive =  rs.getInt(1);
        ps.close();
        return numActive;
    }
}
