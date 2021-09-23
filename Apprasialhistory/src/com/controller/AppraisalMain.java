package com.controller;

import com.dao.*;
import com.model.*;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/*import com.Dao.EmpDao;
import com.Dao.EmpDaoImpl;
import com.Dao.RoleDao;
import com.Dao.RoleDaoImpl;*/
import com.model.Role;

public class AppraisalMain {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		RoleDao roledao = new RoleDaoImplement();
		EmpDao empdao = new EmpDaoImplement();
		AppraisalDao appriasalDao = new AppraisalDaoImplement();

		do {
			System.out.println("********Welcome in Apprasial System*******");
			System.out.println("Welcome Appraisal System");
			System.out.println(
					"1->Add \n2->Update \n3->Delete \n4->Add Apprasial Information \n5->View all roles \n6-Report \n7->Exit");
			System.out.println("Enter your choice");
			int choice = scanner.nextInt();
			switch (choice) {
			case 1:
				System.out.println("Role Insertion");
				System.out.println("Enter roleid,rolename");
				int rid = scanner.nextInt();
				String name = scanner.next();
				Role r = new Role(rid, name);
				boolean isinsert = roledao.addRole(r);
				if (isinsert)
					System.out.println("Insertion successfully");
				else
					System.out.println("Unsuccessful insertion failed");
				break;
			case 2:
				System.out.println("Role Updation");
				System.out.println("enter id to update");
				int roleid = scanner.nextInt();
				System.out.println("enter new rolename");
				String rolename = scanner.next();
				Role role1 = new Role(roleid, rolename);
				boolean isupdated = roledao.updateRole(role1);
				if (isupdated)
					System.out.println("Record updated successfully");
				else
					System.out.println("Unsuccessful updation");
				break;
			case 3:
				System.out.println("enter id to delete");
				int id = scanner.nextInt();
				boolean isdeleted = roledao.deleteRole(id);
				if (isdeleted)
					System.out.println("Role Deletion Sucessful");
				else
					System.out.println("Role Deletion unSucessful");

				break;
			case 4:
				System.out.println("Add information about appraisal");
				System.out.println("enter employee id");
				int empid = scanner.nextInt();
				System.out.println("enter appraisal date");
				String appraisaldate = scanner.next();
				System.out.println("enter currentrole");
				String currentrole = scanner.next();
				System.out.println("enter newrole");
				String newrole = scanner.next();
				
				Appraisal appraisal = new Appraisal();
				appraisal.setEmpid(empid);
				appraisal.setAppraisaldate(appraisaldate);
				appraisal.setCurrentrole(currentrole);
				appraisal.setNewrole(newrole);
				boolean isAdd = appriasalDao.addAppraisal(appraisal);
				if (isAdd)
					System.out.println("Added Information Successfully in Appraisal!!");
				else
					System.out.println("Add Information is Unsuccessful");
				break;
			case 5:
				List<Role> roleList = roledao.getAllRoles();
				Iterator<Role> itr = roleList.iterator();
				System.out.println("Role information");
				System.out.println("Role id" + "\t" + "Role name");
				while (itr.hasNext()) {
					Role role11 = itr.next();
					System.out.println(role11.getRoleid() + "\t\t" + role11.getRolename());
				}
				System.out.println("Successful");
				break;
			case 6:Map<String,Integer> map=empdao.getDepartmentWiseCount();
					System.out.println("Departname   \t EmployeeCount");
			       for(String dname:map.keySet())
			       {
			    	   System.out.println(dname+"\t"+map.get(dname));
			       }
			       break;
			}
			if (choice == 7)
				break;
		} while (true);
		
		System.out.println("Thank you!!!");
	}

}
