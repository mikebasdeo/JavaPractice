package Misc.Infor_Interview_4;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;



public class Solution {

    public int countSeniorEmployeesInCity(Connection c, String city) throws SQLException {

/*
    (
        SELECT DISTINCT COUNT(EMPL.EMP_ID) as result
        FROM
        EMPL, CITY
        WHERE
        EMPL.EMP_SENIOR = 'Y'
        AND
        EMPL.CITY_ID = CITY.CITY_ID
        AND
        CITY.CITY_NAME = 'Montreal'
    )
*/
        PreparedStatement stm = c.prepareStatement("SELECT DISTINCT COUNT(EMPL.EMP.ID) as result " +
                                                        "FROM " +
                                                            "EMPL, CITY " +
                                                        "WHERE " +
                                                            "EMPL.EMP_SENIOR = 'y' " +
                                                        "AND " +
                                                            "EMPL.CITY_ID = CITY.CITY_ID " +
                                                        "AND CITY.CITY_NAME = \n");



        PreparedStatement ps = c.prepareStatement("SELECT EMP_ID, EMP_SENIOR FROM EMPL, CITY WHERE CITY_NAME EQUALS ?");
        ps.setString(1, city);
        ResultSet rs = ps.executeQuery();

        int numActive = 0;
        while (rs.next()) {
            if ("Y".equals(rs.getString("EMP_SENIOR"))) {
                numActive++;
            }
        }

        ps.close();
        return numActive;
    }


}
