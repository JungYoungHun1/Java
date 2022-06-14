package blood.transfusion.view;

import java.util.ArrayList;

import blood.transfusion.dto.BloodTransfusionProject;

public class EndView {

	// 특정 프로젝트 출력_
	public static void projectView(BloodTransfusionProject project) {
		if (project != null) {
			System.out.println(project);
		} else {
			System.out.println("존재하지않습니다.");
		}
	}

	// 모든 프로젝트 출력_
	public static void projectListView(ArrayList<BloodTransfusionProject> allBTPrjoects) {
//		System.out.println(allBTPrjoects);
		for (int i = 0; i < allBTPrjoects.size(); i++) {
			System.out.println(allBTPrjoects.get(i));
		}
	}

	// 예외가 아닌 단순 메세지 출력
	public static void messageView(String message) {
		System.out.println(message);
	}
}
