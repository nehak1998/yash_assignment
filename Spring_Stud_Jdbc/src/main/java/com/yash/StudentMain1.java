package com.yash;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.yash.dao.StudentDao1;
import com.yash.model.*;

import java.io.*;
import java.util.List;

public class StudentMain1 {
 public static void main(String s[])throws IOException{
	 int ch;
	 ApplicationContext objAC = new ClassPathXmlApplicationContext("applicationContext.xml");
	 StudentDao1 objed = (StudentDao1) objAC.getBean("sdao");
	 Student1 objS = new Student1();
	 
	 //objS.setsid(1);
/*	 objS.setfirst_name("Neha");
	 objS.setlast_name("Kadve");
	 objS.setfather_name("Janardhan");
	 objS.setmother_name("Rupali");
	 objS.setclass_name("MCS");
	 objS.setsection("A");
	 objS.setDOB("1998-06-09");
	 objS.setdate_of_admission("2019-06-23");
	 objS.setgender("Female");
	 objS.setaddress1("Pathardi Phata");
	 objS.setaddress2("Nashik");
	 objS.setstudent_phoneno("8565658898");
	 objS.setparent_phoneno("7868774990");
	 objS.setparent_email("kadve@gmail.com");
	 objS.setcityid(1);
	 
	System.out.println("Total record saved "+objed.saveStud(objS)); */
	
	 BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

	 int choice;
	 do{
		 System.out.println("1.Insert Record  \n2.Print all Record  \n3.Update Record \n4.Delete Record");
		 System.out.println("Enter your choice: ");
		 choice = Integer.parseInt(reader.readLine());
		 
		 switch(choice) {
			 case 1:
				 while(true)
				 {
					 System.out.println("Enter First Name: ");
					 String f_n=reader.readLine();
					 System.out.println("Enter last Name: ");
					 String l_n=reader.readLine();
					 System.out.println("Enter Father Name: ");
					 String father_n=reader.readLine();
					 System.out.println("Enter Mother Name: ");
					 String m_n=reader.readLine();
					 System.out.println("Enter class Name: ");
					 String c_n=reader.readLine();
					 System.out.println("Enter section: ");
					 String s2=reader.readLine();
					 System.out.println("Enter date of birth: ");
					 String d=reader.readLine();
					 System.out.println("Enter date of admission: ");
					 String d_a=reader.readLine();
					 System.out.println("Enter Gender: ");
					 String g=reader.readLine();
					 System.out.println("Enter Address1: ");
					 String a1=reader.readLine();
					 System.out.println("Enter Address2: ");
					 String a2=reader.readLine();
					 System.out.println("Enter Student phone no: ");
					 String s_p=reader.readLine();
					 System.out.println("Enter Parent phone no: ");
					 String p_p=reader.readLine();
					 System.out.println("Enter Parent Email: ");
					 String p_e=reader.readLine();
					 System.out.println("Enter city id: ");
					 int c=Integer.parseInt(reader.readLine());
					
					 objS.setfirst_name(f_n);
					 objS.setlast_name(l_n);
					 objS.setfather_name(father_n);
					 objS.setmother_name(m_n);
					 objS.setclass_name(c_n);
					 objS.setsection(s2);
					 objS.setDOB(d);
					 objS.setdate_of_admission(d_a);
					 objS.setgender(g);
					 objS.setaddress1(a1);
					 objS.setaddress2(a2);
					 objS.setstudent_phoneno(s_p);
					 objS.setparent_phoneno(p_p);
					 objS.setparent_email(p_e);
					 objS.setcityid(c);
				 
				System.out.println("Total record saved:- "+objed.saveStud(objS));
					System.out.println("want to do more 1 for yes 0 for no");
					ch=Integer.parseInt(reader.readLine());
					if(ch==0)
						 break;
				 }
				 break;
				 
			 case 2:
				 List<Student1> studlist=objed.getAllRecordStud();
				 System.out.println("sid\t FirstName \t LastName \t FatherName \t MotherName \t ClassName \t Section \t DOB \t Date of Admission \t Gender \t Address1 \t Address2 \t StudentPhone \t     ParentPhone \t ParentEmail \t CityId");
				 for (Student1 s1:studlist)
				  System.out.println(s1.getsid()+"\t "+s1.getfirst_name()+"\t "+s1.getlast_name()+"\t "+s1.getfather_name()+"\t "+s1.getmother_name()+"\t "+s1.getclass_name()+"\t "+s1.getsection()+"\t "+"\t "+s1.getDOB()+"\t "+s1.getdate_of_admission()+s1.getgender()+"\t "+s1.getaddress1()+"\t "+s1.getaddress2()+"\t "+s1.getstudent_phoneno()+"\t "+s1.getparent_phoneno()+"\t "+s1.getparent_email()+"\t "+s1.getaddress1());	  
				break;
				 
			 case 3:
				 System.out.println("Which record do you want to update : ");
				 System.out.println("Enter s_id: ");
				 int r1=Integer.parseInt(reader.readLine());
				     System.out.println("Enter First Name: ");
					 String f_n=reader.readLine();
					 System.out.println("Enter last Name: ");
					 String l_n=reader.readLine();
					 System.out.println("Enter Father Name: ");
					 String father_n=reader.readLine();
					 System.out.println("Enter Mother Name: ");
					 String m_n=reader.readLine();
					 System.out.println("Enter class Name: ");
					 String c_n=reader.readLine();
					 System.out.println("Enter section: ");
					 String s1=reader.readLine();
					 System.out.println("Enter date of birth: ");
					 String d=reader.readLine();
					 System.out.println("Enter date of admission: ");
					 String d_a=reader.readLine();
					 System.out.println("Enter Gender: ");
					 String g=reader.readLine();
					 System.out.println("Enter Address1: ");
					 String a1=reader.readLine();
					 System.out.println("Enter Address2: ");
					 String a2=reader.readLine();
					 System.out.println("Enter Student phone no: ");
					 String s_p=reader.readLine();
					 System.out.println("Enter Parent phone no: ");
					 String p_p=reader.readLine();
					 System.out.println("Enter Parent Email: ");
					 String p_e=reader.readLine();
					 System.out.println("Enter city id: ");
					 int c=Integer.parseInt(reader.readLine());
				
					 objS.setsid(r1);
				 	 objS.setfirst_name(f_n);
					 objS.setlast_name(l_n);
					 objS.setfather_name(father_n);
					 objS.setmother_name(m_n);
					 objS.setclass_name(c_n);
					 objS.setsection(s1);
					 objS.setDOB(d);
					 objS.setdate_of_admission(d_a);
					 objS.setgender(g);
					 objS.setaddress1(a1);
					 objS.setaddress2(a2);
					 objS.setstudent_phoneno(s_p);
					 objS.setparent_phoneno(p_p);
					 objS.setparent_email(p_e);
					 objS.setcityid(c);
				
				System.out.println("Record updated successfully..."+objed.updateStud(objS));
				
				break;
				
			 case 4:
				 System.out.println("Enter sid to delete record: ");
				 int sid = Integer.parseInt(reader.readLine());
				 System.out.println("Record deleted successfully..."+objed.deleteStud(sid));
				 
				 break;
				 
			default:
				System.out.println("Invalid choice!!");
				break;
				
			 }
	 }while(choice != 5); 
 }
}
