import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Query;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.orm.hibernate5.HibernateTransactionManager;


public class USERHQL {
	HibernateTransactionManager hbTransMgr;

	 
	public void setHbTransMgr(HibernateTransactionManager hbTransMgr) {
		this.hbTransMgr = hbTransMgr;
	}

	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

	
	public void UpdateEmpHQL( ) throws IOException
	{
		SessionFactory sf= hbTransMgr.getSessionFactory();
		Session objSession = sf.openSession();
		Transaction tx = objSession.beginTransaction();
		Query q = objSession.createQuery("update User set u_add1=?1 where u_id=?2");
		//q.setParameter("ea", "ullash nagar mumbai");
		//q.setParameter("i", 4);
		//String s = "Pune";
		System.out.println("Enter address to update record:");
	    String s=reader.readLine();
		q.setParameter(1, s);
		
		System.out.println("Enter user id to update record:");
	    int a=Integer.parseInt(reader.readLine());
		q.setParameter(2, a);
		int status = q.executeUpdate();
		System.out.println(status);
		tx.commit();
	}
	
	private Object readLine() {
		// TODO Auto-generated method stub
		return null;
	}

	void searchByName() throws IOException
	{
		SessionFactory sf= hbTransMgr.getSessionFactory();
		Session objSession = sf.openSession();
		Transaction tx = objSession.beginTransaction();
		Query q = objSession.createQuery("from User where u_first_name =?1");
		System.out.println("Enter Name to search record: ");
		 String n = reader.readLine();
		q.setParameter(1, n);
		List<User> userlist=q.getResultList();
		
		for (User u: userlist)
		{
		  System.out.println(u.getU_first_name()+" \t "+u.getU_last_name()+" \t "+u.getU_add1()+" \t "+u.getU_add2()+" \t "+u.getU_dob());			
		}		
	}
	
	void searchByMobileRange() throws IOException
	{
		SessionFactory sf= hbTransMgr.getSessionFactory();
		Session objSession = sf.openSession();
		Transaction tx = objSession.beginTransaction();
		Query q = objSession.createQuery("from User where u_mobile =?1 and u_mobile =?2");
		System.out.println("Enter mobile 1: ");
		 String n = reader.readLine();
		q.setParameter(1, n);
		System.out.println("Enter mobile 2: ");
		 String n1 = reader.readLine();
		q.setParameter(1, n1);
	    
		int status = q.executeUpdate();
		System.out.println(status);
		tx.commit();
		List<User> userlist=q.getResultList();
		
		for (User u: userlist)
		{
		  System.out.println(u.getU_first_name()+"\t"+u.getU_last_name()+"\t"+u.getU_add1()+"\t"+u.getU_add2()+"\t"+u.getU_dob());			
		}		
	}
	
/*	void searchByMobile() throws IOException
	{
		SessionFactory sf= hbTransMgr.getSessionFactory();
		Session objSession = sf.openSession();
		Transaction tx = objSession.beginTransaction();
		Query q = objSession.createQuery("from Employee where salary>=?1 and salary <= ?2");
		//System.out.println("Enter first salary: ");
		 //String n1 = reader.readLine();
		q.setParameter(1, 300000);
		//System.out.println("Enter second salary: ");
		 //String n2 = reader.readLine();
		q.setParameter(2, 350000);
		
		List<Employee> emplist = q.getResultList();
		
		for (Employee e: emplist)
		{
		  System.out.println(e.getSalary());			
		}		
	}*/
	public List<User> getAllUser()
	{
		SessionFactory sf= hbTransMgr.getSessionFactory();
		Session objSession = sf.openSession();
		Transaction t = objSession.beginTransaction();
		List<User> userlist = new ArrayList<User>();
		Criteria ctr = objSession.createCriteria(User.class);
		userlist = ctr.list();
		System.out.println("Hello");
		for (User u:userlist)
			System.out.println(u.getU_id()+"\t "+u.getU_first_name()+"\t "+u.getU_last_name()+"\t "+u.getU_add1()+"\t "+u.getU_add2()+"\t "+u.getU_dob()+"\t "+u.getU_email()+"\t "+"\t "+u.getU_city()+"\t "+u.getU_mobile());	
		return userlist;
		
	}
}
