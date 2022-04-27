package com.yash.model;

public class Student1 {
	 int sid;
	  String first_name;
	  String last_name;
	  String father_name;
	  String mother_name;
	  String class_name;
	  String section;
	  String DOB;
	  String date_of_admission;
	  String gender; 
	  String address1;
	  String address2;
	  String student_phoneno;
	  String parent_phoneno;
	  String parent_email;
	  int cityid;
	  
	  public Student1() {
			super();
		}

		public Student1(int sid, String first_name,String last_name,String father_name,String mother_name,String class_name,String section, String DOB,String date_of_admission,String gender,String address1,String address2, String student_phoneno,String parent_phoneno,String parent_email,int cityid){
			super();
			this.sid = sid;
			this. first_name = first_name;
		    this.last_name = last_name;
		    this.father_name = father_name;
		    this.mother_name = mother_name;
		    this.class_name = class_name;
		    this.section = section;
		    this.DOB = DOB;
		    this.date_of_admission = date_of_admission;
		    this.gender = gender; 
		    this.address1 = address1;
		    this.address2 = address2;
		    this.student_phoneno = student_phoneno;
		    this.parent_phoneno = parent_phoneno;
		    this.parent_email = parent_email;
		    this.cityid = cityid;
		}
		
	public int getsid() {
		return sid;
	}

	public void setsid(int sid) {
		this. sid =  sid;
	}

	public String  getfirst_name() {
		return  first_name;
	}

	public void setfirst_name(String  first_name) {
		this.first_name =  first_name;
	}
	
	public String  getlast_name () {
		return  last_name ;
	}

	public void setlast_name (String  last_name ) {
		this.last_name  =  last_name ;
	}

	public String  getfather_name() {
		return  father_name;
	}

	public void setfather_name(String father_name) {
		this.father_name =  father_name;
	}
	
	public String getmother_name () {
		return mother_name ;
	}

	public void setmother_name (String mother_name ) {
		this.mother_name  = mother_name ;
	}
	
	public String getclass_name () {
		return class_name ;
	}

	public void setclass_name (String class_name ) {
		this.class_name  = class_name ;
	}
	
	public String getsection () {
		return section ;
	}

	public void setsection(String section ) {
		this.section  = section ;
	}

	public String getDOB () {
		return DOB ;
	}

	public void setDOB (String DOB ) {
		this.DOB  = DOB ;
	}
	
	public String getdate_of_admission () {
		return date_of_admission ;
	}

	public void setdate_of_admission (String date_of_admission ) {
		this.date_of_admission  = date_of_admission ;
	}
	
	public String getgender() {
		return gender  ;
	}

	public void setgender(String gender  ) {
		this.gender   = gender  ;
	}
	
	public String getaddress1() {
		return address1  ;
	}

	public void setaddress1(String address1  ) {
		this.address1   = address1  ;
	}
	
	public String getaddress2() {
		return address2  ;
	}

	public void setaddress2  (String address2) {
		this.address2   = address2  ;
	}
	
	public String getstudent_phoneno() {
		return student_phoneno   ;
	}

	public void setstudent_phoneno(String student_phoneno) {
		this.student_phoneno = student_phoneno;
	}
	
	public String getparent_phoneno() {
		return parent_phoneno  ;
	}

	public void setparent_phoneno(String parent_phoneno) {
		this.parent_phoneno = parent_phoneno  ;
	}
	
	public String getparent_email() {
		return parent_email  ;
	}

	public void setparent_email(String parent_email) {
		this.parent_email   = parent_email  ;
	}
	
	public int getcityid() {
		return cityid   ;
	}

	public void setcityid(int cityid   ) {
		this.cityid    = cityid   ;
	}
}
