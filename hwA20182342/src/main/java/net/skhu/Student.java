package net.skhu;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class Student {

	int id;
	String studentNumber;
	String studentName;
	String email;
	Date birthday;

	public Student() {

	}

	public Student(int id, String studentNumber, String studentName, String email,Date birthday) {
		this.id = id;
		this.studentNumber = studentNumber;
		this.studentName = studentName;
		this.email = email;
		this.birthday = birthday;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getStudentNumber() {
		return studentNumber;
	}
	public void setStudentNumber(String studentNumber) {
		this.studentNumber = studentNumber;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

    public Date getBirthday() {
        return birthday;
    }

    @DateTimeFormat(pattern="yyyy-MM-dd")
    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }
}
