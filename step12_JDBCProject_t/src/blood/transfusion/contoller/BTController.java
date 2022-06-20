package blood.transfusion.contoller;

import java.sql.SQLException;
import java.util.ArrayList;

import blood.transfusion.dto.BTProjectDTO;
import blood.transfusion.dto.DonorDTO;
import blood.transfusion.dto.RecipientDTO;
import blood.transfusion.exception.NotExistException;
import blood.transfusion.model.BTService;
import blood.transfusion.model.DonorDAO;
import blood.transfusion.view.RunningEndView;
import blood.transfusion.view.RunningSuccessView;

public class BTController {
	private static BTController instance = new BTController();
	private BTService service = BTService.getInstance();

	private BTController() {
	}

	public static BTController getInstance() {
		return instance;
	}

	// 모든 프로젝트 검색
	public void allBTProjects() {
		try {
			RunningEndView.projectListView(service.getAllBTProjects());
			RunningSuccessView.showSuccess("모든 프로젝트 검색 성공");
		} catch (SQLException s) {
			s.printStackTrace();
			RunningEndView.showError("모든 프로젝트 검색시 에러 발생");
		}

	}

	// 특정 프로젝트 검색
	public void BTProjects(String btProjectName) {
		try {
			RunningEndView.projectView(service.getBTProject(btProjectName));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// 새로운 프로젝트 저장 로직
	public void insertProject(BTProjectDTO newProject, DonorDTO donorDTO, RecipientDTO recipientDTO) {
		try {
			service.addDonor(donorDTO);
			service.addRecipient(recipientDTO);
			service.addBTProject(newProject);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("저장 불가능");
		}

	}

	// 특정 프로젝트 업데이트
	public void updateProject(String btProjectName, String btProjectContent) {
		try {
			try {
				service.updateBTProject(btProjectName, btProjectContent);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (NotExistException e) {
			// TODO Auto-generated catch block
			RunningEndView.showError(e.getMessage());
//			e.printStackTrace();
		}
	}

	// 특정 프로젝트 삭제
	public void deleteProject(String project) {
		// 모든 테이블에서 정보 삭제

//		BTProjectDTO selectProject = null;
//		try {
//			selectProject = service.getBTProject(project);
//			service.deleteDonor(selectProject.getDonorId());
//			service.deleteRecipient(selectProject.getRecipientId());
//		} catch (Exception e) {
//			// TODO: handle exception
//			e.printStackTrace();
//		}
//		try {
//			service.deleteBTProject(project);
//		} catch (Exception e) {
//			// TODO: handle exception
//			e.printStackTrace();
//		}

		// 프로젝트만 삭제
		try {
			service.deleteBTProject(project);
			System.out.println("삭제 완료");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
//			e.printStackTrace();
		} catch (NotExistException e) {
			// TODO Auto-generated catch block
			RunningEndView.showError(e.getMessage());
		}

	}

	// 모든 헌혈자 검색 로직
	public static ArrayList<DonorDTO> getAllDonors() {
		ArrayList<DonorDTO> allProject = null;
		try {
			RunningEndView.projectListView(DonorDAO.getAllDonors());
			RunningSuccessView.showSuccess("모든  헌혈자 검색 성공");
		} catch (SQLException s) {
			s.printStackTrace();
			RunningEndView.showError("모든  헌혈자 검색시 에러 발생");
		}
		return allProject;
	}

}
