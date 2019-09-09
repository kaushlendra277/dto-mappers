package root;

import org.dozer.DozerBeanMapper;
import org.dozer.Mapper;

import root.dto.Student;
import root.dto.StudentTo;

public class DozerMappingInAction {

	public static void main(String[] args) {
		Mapper mapper = new DozerBeanMapper();
		StudentTo studentTo = new StudentTo();
		studentTo.setAge("50");
		studentTo.setName("KSC");
		
		Student student = mapper.map(studentTo, Student.class);
		System.out.println(student);
		System.out.println(studentTo);
	}

}
