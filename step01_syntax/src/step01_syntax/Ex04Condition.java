package step01_syntax;

public class Ex04Condition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	     // if문) 관리자 id가 admin혹은 admin2일때 접속 성공(단, else if 사용하기)!
	      String id = "admin2";
	      if(id.equals("admin")) {
	         System.out.println("접속 성공");
	      }else if(id.equals("admin2")) {
	         System.out.println("접속 성공");
	      }else {
	         System.out.println("접속 실패");
	      }
	      
	      byte month = 2;
	      // switch/case문) 1~3월까지 해당 월을 비교 -> 해당 월이라면 "month월 입니다"문구 출력
	      switch (month) {
	      case 1:
	         System.out.println(month+"월입니다.");
	         break;
	      case 2:
	         System.out.println(month+"월입니다.");
	         break;
	      case 3:
	         System.out.println(month+"월입니다.");
	         break;
	      default:
	         System.out.println(month+"은 해당월이 아닙니다.");
	         break;
	      }


	}

}
