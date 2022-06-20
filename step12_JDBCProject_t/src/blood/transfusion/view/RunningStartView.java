package blood.transfusion.view;

import blood.transfusion.contoller.BTController;
import blood.transfusion.dto.BTProjectDTO;
import blood.transfusion.dto.DonorDTO;
import blood.transfusion.dto.RecipientDTO;

public class RunningStartView {

	public static void main(String[] args) {
		BTController controller = BTController.getInstance();

		// 새로운 헌혈 프로젝트
		BTProjectDTO newProject = new BTProjectDTO("AB-", "bt4", "donor4", "recipient4", "응급 처치 프로젝트");
		DonorDTO donorDTO = new DonorDTO("donor4", "헌혈4", 99, "M", "AB-", "검사");
		RecipientDTO recipientDTO = new RecipientDTO("recipient4", "수혈4", 5, "M", "AB-", "질병");

		System.out.println("=====모든 프로젝트 검색=====");
		controller.allBTProjects();

		// 새로운 프로젝트 저장
		System.out.println("===== 2. 새로운 프로젝트 저장 및 확인 =====");
//		controller.insertProject(newProject, donorDTO, recipientDTO);
//		controller.BTProjects("AB-");

		// 존재하는 프로젝트 검색
		System.out.println("=====3. 특정 프로젝트 검색 =====");
		controller.BTProjects("A-");

		System.out.println();
//
		System.out.println("===== 4. 존재하지 않는 프로젝트 검색 - 예외처리 =====");
		controller.BTProjects("DD");

		System.out.println();
//
		// 존재하는 프로젝트 수정
		System.out.println("===== 5. 존재하는 프로젝트 수정 및 확인 =====");
		controller.updateProject("AB-", "응급처치11122");
		controller.BTProjects("AB-");

		System.out.println();
//
//		// 존재하지 않는 프로젝트 수정 : 예외 발생
		System.out.println("===== 6. 존재하지 않는 프로잭트 수정 - 예외처리 확인용 =====");
		controller.updateProject("bbb", "응급처치222");

		System.out.println();
////
		// 존재하는 프로젝트 삭제 및 삭제여부 확인
//		System.out.println("===== 7. 존재하는 프로젝트 삭제 및 확인 =====");
//		controller.deleteProject("AB-");
//		controller.BTProjects("AB-");
	}
}
