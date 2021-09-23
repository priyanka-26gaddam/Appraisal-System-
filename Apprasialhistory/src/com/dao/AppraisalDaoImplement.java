package com.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.configuration.DBConnect;
import com.model.Appraisal;
import com.configuration.DBConnect;
import com.model.Employee;

public class AppraisalDaoImplement implements AppraisalDao
{
	
	public boolean addAppraisal(Appraisal a) {
	
		
				try(Connection con=DBConnect.getConnection();
						PreparedStatement pst=con.prepareStatement("insert into appraisal values(?,?,?,?)"))
				{
					
					pst.setString(1,a.getAppraisaldate());
				    pst.setString(2,a.getCurrentrole());
					pst.setString(3,a.getNewrole());
					pst.setInt(4,a.getEmpid());
				    pst.execute();
					return true;
				}
				catch(SQLException e) {
					e.printStackTrace();
				}
				return false;
	}
	public List<Appraisal> getAllapprasial() {
		ArrayList<Appraisal> appraisalList = new ArrayList<>();
		try (Connection connection = DBConnect.getConnection();
				PreparedStatement pst = connection.prepareStatement("select * from appraisal")) {
			
			ResultSet rs = pst.executeQuery();
			while (rs.next()) {
				Appraisal appraisal = new Appraisal();
				
				appraisal.setAppraisaldate(rs.getString(1));
				appraisal.setCurrentrole(rs.getString(2));
				appraisal.setNewrole(rs.getString(3));
				appraisal.setEmpid(rs.getInt(4));
				appraisalList.add(appraisal);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
         return appraisalList;
	}
	
}


