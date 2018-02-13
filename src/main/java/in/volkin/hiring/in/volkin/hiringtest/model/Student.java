package in.volkin.hiring.in.volkin.hiringtest.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {
	@Id
	private int student_id;
	private String student_name;
	private String student_mobile;
	private String student_email;
	private String highest_qualification;
	private String branch;
	private String entrance_name;
	private long entrance_rank;
	private byte ssc_maths_marks;
	
	
	public int getStudent_id() {
		return student_id;
	}
	public void setStudent_id(int student_id) {
		this.student_id = student_id;
	}
	public String getStudent_name() {
		return student_name;
	}
	public void setStudent_name(String student_name) {
		this.student_name = student_name;
	}
	public String getStudent_mobile() {
		return student_mobile;
	}
	public void setStudent_mobile(String student_mobile) {
		this.student_mobile = student_mobile;
	}
	public String getStudent_email() {
		return student_email;
	}
	public void setStudent_email(String student_email) {
		this.student_email = student_email;
	}
	public String getHighest_qualification() {
		return highest_qualification;
	}
	public void setHighest_qualification(String highest_qualification) {
		this.highest_qualification = highest_qualification;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public String getEntrance_name() {
		return entrance_name;
	}
	public void setEntrance_name(String entrance_name) {
		this.entrance_name = entrance_name;
	}
	public long getEntrance_rank() {
		return entrance_rank;
	}
	public void setEntrance_rank(long entrance_rank) {
		this.entrance_rank = entrance_rank;
	}
	public byte getSsc_maths_marks() {
		return ssc_maths_marks;
	}
	public void setSsc_maths_marks(byte ssc_maths_marks) {
		this.ssc_maths_marks = ssc_maths_marks;
	}	
	
}
