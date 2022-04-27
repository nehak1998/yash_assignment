
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserMain {
  public static void main(String args[])throws IOException
  {
	  ApplicationContext ctxobj = new ClassPathXmlApplicationContext("applicationcontext.xml");
	  USERHQL objEH= (USERHQL) ctxobj.getBean("userhql");
	  
	  BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	  
	  int choice;
		 do{
			 System.out.println("1.Update Record  \n2.Print all Record  \n3.Search Record by name");
			 System.out.println("Enter your choice: ");
			 choice = Integer.parseInt(reader.readLine());
			 
			 switch(choice) {
				 case 1:
					 	objEH.UpdateEmpHQL();
					 	break;
				 case 2:
					 	objEH.getAllUser();
					 break;
				 case 3:
					 objEH.searchByName();
					 break;
				 case 4:
					 objEH.searchByMobileRange();
					 break;
					
				 default:
						System.out.println("Invalid choice!!");
						break;
						
					 }
			 }while(choice != 5); 
  }
}
