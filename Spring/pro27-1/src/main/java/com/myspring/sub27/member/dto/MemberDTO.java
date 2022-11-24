package com.myspring.sub27.member.dto;

import java.util.Date;

public class MemberDTO {

	private int empno;
	   private String ename;
	   private String job;
	   private int MGR;
	   private int sal;
	   private int comm;
	   private int deptno;
	   private Date hireDate;
	   private String dname;
	   private String loc;
	   
	   public int getEmpno() {
	      return empno;
	   }
	   public void setEmpno(int empno) {
	      this.empno = empno;
	   }
	   public String getEname() {
	      return ename;
	   }
	   public void setEname(String ename) {
	      this.ename = ename;
	   }
	   public String getJob() {
	      return job;
	   }
	   public void setJob(String job) {
	      this.job = job;
	   }
	   public int getMGR() {
	      return MGR;
	   }
	   public void setMGR(int mGR) {
	      MGR = mGR;
	   }
	   public int getSal() {
	      return sal;
	   }
	   public void setSal(int sal) {
	      this.sal = sal;
	   }
	   public int getComm() {
	      return comm;
	   }
	   public void setComm(int comm) {
	      this.comm = comm;
	   }
	   public int getDeptno() {
	      return deptno;
	   }
	   public void setDeptno(int deptno) {
	      this.deptno = deptno;
	   }
	   public Date getHireDate() {
	      return hireDate;
	   }
	   public void setHireDate(Date hireDate) {
	      this.hireDate = hireDate;
	   }
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	public String getLoc() {
		return loc;
	}
	public void setLoc(String loc) {
		this.loc = loc;
	}

	   
	}
