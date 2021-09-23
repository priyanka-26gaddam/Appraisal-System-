package com.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;



import com.configuration.DBConnect;
import com.model.Role;

public class RoleDaoImplement implements RoleDao 
{

	public boolean addRole(Role r) {
		try (Connection con = DBConnect.getConnection();
				PreparedStatement pst = con.prepareStatement("insert into role values(?,?)")) {
			pst.setInt(1, r.getRoleid());
			pst.setString(2, r.getRolename());
			pst.executeUpdate();
			return true;

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return false;
	}
	


	public boolean deleteRole(int id) {
		try (Connection con = DBConnect.getConnection();
				PreparedStatement pst = con.prepareStatement("delete from role where roleid=?")) {
			pst.setInt(1, id);
			pst.executeUpdate();
			return true;

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

	public boolean updateRole(Role r) {
		try (Connection con = DBConnect.getConnection();
				PreparedStatement pst = con.prepareStatement("update role set rolename=? where roleid=?")) {
			pst.setString(1, r.getRolename());
			pst.setInt(2, r.getRoleid());
			pst.executeUpdate();
			return true;

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

	public List<Role> getAllRoles() 
	{
		ArrayList<Role> rolelist = new ArrayList<>();
		
		try (Connection con = DBConnect.getConnection();
				PreparedStatement pst = con.prepareStatement("select * from role")) {

			ResultSet rs = pst.executeQuery();

			while (rs.next()) {
				Role r = new Role();
				r.setRoleid(rs.getInt(1));
				r.setRolename(rs.getString(2));
				rolelist.add(r);
			}

		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return rolelist;
	}

}


