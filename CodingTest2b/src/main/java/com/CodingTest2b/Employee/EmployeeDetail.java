package com.CodingTest2b.Employee;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity

@Table(name="Emp777")

public class EmployeeDetail {
	
	@Id

	  private int e_num;

	  private String e_name;

	  private String e_desig;
	  
	  private float e_sal;
	  
	  public EmployeeDetail(int e_num, String e_name, String e_desig, float e_sal) {

		    super();

		    this.e_num = e_num;
		    this.e_name = e_name;
		    this.e_desig = e_desig;
		    this.e_sal = e_sal;

		  }

	  public EmployeeDetail() {
		  super();
	  }

	public int getE_num() {
		return e_num;
	}

	public void setE_num(int e_num) {
		this.e_num = e_num;
	}

	public String getE_name() {
		return e_name;
	}

	public void setE_name(String e_name) {
		this.e_name = e_name;
	}

	public String getE_desig() {
		return e_desig;
	}

	public void setE_desig(String e_desig) {
		this.e_desig = e_desig;
	}

	public float getE_sal() {
		return e_sal;
	}

	public void setE_sal(float e_sal) {
		this.e_sal = e_sal;
	}
	  
}
