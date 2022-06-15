package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import model.domain.DeptDTO;
import util.DBUtil;

public class DeptDAO {

	// step01
	// Driver 로딩
//	static {
//		try {
//			Class.forName("com.mysql.cj.jdbc.Driver");
//		} catch (ClassNotFoundException e) {
//			e.printStackTrace();
//		}
//	}

	// step02
	// DB 연결
	// ip주소, DB 이름, 계정 이름/비밀번호, ...
	//

	// 모든 부서 검색 메소드
	// Query : "select * from dept";
	public static ArrayList<DeptDTO> getAllDept() throws SQLException {
		ArrayList<DeptDTO> allData = null;
		Connection conn = null;
		Statement stmt = null;
		ResultSet rset = null;
		String sql = "select * from dept";
		try {
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/scott", "scott", "tiger");
			// step03
			// SQL 문장 객체
			stmt = conn.createStatement();

			// step04
			// SQL 문장 객체 실행 - 결과 반환
			rset = stmt.executeQuery(sql);

			// step05
			// Data 활용
			allData = new ArrayList<DeptDTO>();
			while (rset.next()) {
				allData.add(new DeptDTO(rset.getInt("deptno"), rset.getString("dname"), rset.getString("loc")));
			}
//			conn.commit();

			// step06
			// DB 종료
		} finally {
			conn.close();
		}
		return allData;
	}

	public static DeptDTO getDept(String dname, int deptno) throws SQLException {
		DeptDTO allData = new DeptDTO();
		Connection conn = null;
//		Statement stmt = null;
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		String sql = "select * from dept where dname = ? and deptno = ?";
		try {
//			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/scott", "scott", "tiger");
			conn = DBUtil.getConnection();
			// step03
			// SQL 문장 객체
//			stmt = conn.createStatement();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, dname);
			pstmt.setInt(2, deptno);

			// step04
			// SQL 문장 객체 실행 - 결과 반환
//			rset = stmt.executeQuery(sql);
			rset = pstmt.executeQuery();

			// step05
			// Data 활용

			while (rset.next()) {
//				allData.(new DeptDTO(rset.getInt("deptno"), rset.getString("dname"), rset.getString("loc")));
				allData.setDeptno((rset.getInt("deptno")));
				allData.setDname(rset.getString("dname"));
				allData.setLoc(rset.getString("loc"));

			}
//			conn.commit();

			// step06
			// DB 종료
		} finally {
			DBUtil.close(rset, pstmt, conn);
		}
		return allData;
	}

	// 부서 생성
	public static boolean insertDept(DeptDTO dto) throws SQLException {

		Connection con = null;
		PreparedStatement pstmt = null;
		String sql = "insert into dept (deptno, dname, loc) values(?,?,?)";

		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/scott", "scott", "tiger");
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, dto.getDeptno());
			pstmt.setString(2, dto.getDname());
			pstmt.setString(3, dto.getLoc());

			int r = pstmt.executeUpdate();
			if (r != 0) {
				return true;
			}
		} finally {
			DBUtil.close(pstmt, con);
		}
		return false;
	}

	// 부서 삭제
	public static boolean deleteDept(int deptno) throws SQLException {
		Connection con = null;
		PreparedStatement pstmt = null;
		String sql = "delete from dept where deptno = ?";
		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/scott", "scott", "tiger");
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, deptno);
			int r = pstmt.executeUpdate();
			if (r != 0) {
				return true;
			}
		} finally {
			pstmt.close();
			con.close();
		}
		return false;
	}

	// 부서 수정
	public static boolean updateDept(int deptno, String loc) throws SQLException {
		Connection con = null;
		PreparedStatement pstmt = null;
		String sql = "update dept set loc = ? where deptno = ?";
		try {
			con = DBUtil.getConnection();
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, loc);
			pstmt.setInt(2, deptno);
			int r = pstmt.executeUpdate();
			if (r != 0) {
				return true;
			}
		} finally {
			pstmt.close();
			con.close();
		}
		return false;
	}

	public static List<DeptDTO> getJoinDept(String loc) throws SQLException {
		List<DeptDTO> allData = new ArrayList<>();
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		String sql = "SELECT A.SAL as saldept, A.ENAME as enamedept, B.LOC FROM EMP A inner JOIN DEPT B ON A.DEPTNO = B.DEPTNO WHERE B.LOC = ?";
		try {

			conn = DBUtil.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, loc);

			rset = pstmt.executeQuery();

			while (rset.next()) {
				DeptDTO deptDTO = new DeptDTO();
				deptDTO.setLoc(rset.getString("loc"));
				deptDTO.setEnamedept(rset.getString("enamedept"));
				deptDTO.setSaldept(rset.getDouble("saldept"));
				allData.add(deptDTO);
			}
		} finally {
			DBUtil.close(rset, pstmt, conn);
		}
		return allData;
	}

	public static void main(String[] args) {
		try {
//			for (DeptDTO dept : getAllDept()) {
////				System.out.println(dept);
//			}

			// 부서이름으로 검색
			// getDept(String dname);

			System.out.println(getJoinDept("DALLAS"));
//			System.out.println(insertDept(new DeptDTO(50, "PROGRAMING", "BUSAN")));

			// 부서 번호로 검색한 해당 부서의 위치 수정
//			updateDept(50, "SEOUL");

			// 부서 번호로 검색한 해당 부서 삭제
//			System.out.println(deleteDept(50));
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
