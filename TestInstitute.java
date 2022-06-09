package hw11Abstraction;

public class TestInstitute {
	public static void main(String[] args) {
		ColumbiaUniversity columbiaUniversity = new ColumbiaUniversity();

		ColumbiaUniversity.rayhan();
		columbiaUniversity.chemistry();
		columbiaUniversity.commonRoom();
		columbiaUniversity.languageClub();
		columbiaUniversity.emergencyRoom();
		columbiaUniversity.cafeteria();
		columbiaUniversity.vocationalInfo();
		columbiaUniversity.classSize();
		columbiaUniversity.playGround();
		columbiaUniversity.teacher();
		columbiaUniversity.anatomyLab();
		columbiaUniversity.lawInfo();
		columbiaUniversity.hygiene();

		System.out.println("These method from University Interface ");
		University.library();
		columbiaUniversity.rayhan1();
		columbiaUniversity.classSize();
		columbiaUniversity.playGround();
		columbiaUniversity.teacher();
		columbiaUniversity.gymnasium();

		System.out.println("These method from VocationalSchool Interface ");
		columbiaUniversity.vocationalInfo();

		System.out.println("These method from LawSchool Interface ");

		columbiaUniversity.lawInfo();

		System.out.println("These method from MedicalSchool abstract class ");
		columbiaUniversity.anatomyLab();
		columbiaUniversity.biochemistryLab();
		columbiaUniversity.MedicalSchool();

		System.out.println("These method from NursingSchool class ");
		columbiaUniversity.caring();
		columbiaUniversity.hygiene();

		System.out.println("These method from  RockefellerUniversity class ");
		columbiaUniversity.maths();
		columbiaUniversity.aeronauticalInfo();
		columbiaUniversity.mechanicalLab();

		System.out.println("These method from  EngineeringSchool class ");
		columbiaUniversity.mechanicalLab();
		columbiaUniversity.computerLab();

		System.out.println("These method from  NYUniversity class ");

		columbiaUniversity.anthropology();

	}
}
