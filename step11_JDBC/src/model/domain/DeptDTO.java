package model.domain;

public class DeptDTO {
	private int deptno;
	private String dname;
	private String loc;
	private String enamedept;
	private double saldept;

	public String getEnamedept() {
		return enamedept;
	}

	public void setEnamedept(String enamedept) {
		this.enamedept = enamedept;
	}

	public double getSaldept() {
		return saldept;
	}

	public void setSaldept(double saldept) {
		this.saldept = saldept;
	}

	public DeptDTO(int deptno, String dname, String loc, String enamedept, double saldept) {
		super();
		this.deptno = deptno;
		this.dname = dname;
		this.loc = loc;
		this.enamedept = enamedept;
		this.saldept = saldept;
	}

	public DeptDTO() {
	}

	public DeptDTO(int deptno, String dname, String loc) {
		super();
		this.deptno = deptno;
		this.dname = dname;
		this.loc = loc;
	}

	public int getDeptno() {
		return deptno;
	}

	public void setDeptno(int deptno) {
		this.deptno = deptno;
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

	@Override
	public String toString() {
		return "DeptDTO [loc=" + loc + ", enamedept=" + enamedept + ", saldept=" + saldept + "]";
	}

}
