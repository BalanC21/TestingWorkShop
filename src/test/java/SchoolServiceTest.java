import dao.ModuleRepository;
import dao.StudentReepository;
import models.Student;
import org.junit.jupiter.api.Test;
import service.SchoolService;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class SchoolServiceTest {
    @Test
    public void fakeExample_FindNumOfStudents() {
        //Dublura a clasei
        StudentReepository fakeStudent = mock(StudentReepository.class);
        SchoolService service = new SchoolService(fakeStudent);

        Student student1 = new Student("cc11", "Ion",
                LocalDate.of(1999, 6, 22), LocalDate.of(2022, 6, 22));
        Student student2 = new Student("cc12", "Petru",
                LocalDate.of(1990, 6, 22), LocalDate.of(2022, 7, 12));

        List<Student> studentList = Arrays.asList(student1, student2);

        when(fakeStudent.getAll()).thenReturn(studentList);

        assertEquals(2, service.findNumberOfStudents());
    }

    @Test
    public void dummyExample_FindNumOFStudents() {
        StudentReepository fakeStudent = mock(StudentReepository.class);
        ModuleRepository dummyModule = mock(ModuleRepository.class);

        //Gestionezi dependinte pe care nu le folosesti
        SchoolService service = new SchoolService(fakeStudent, dummyModule);


        Student student1 = new Student("cc11", "Ion",
                LocalDate.of(1999, 6, 22), LocalDate.of(2022, 6, 22));
        Student student2 = new Student("cc12", "Petru",
                LocalDate.of(1990, 6, 22), LocalDate.of(2022, 7, 12));

        List<Student> studentList = Arrays.asList(student1, student2);

        when(fakeStudent.getAll()).thenReturn(studentList);

        assertEquals(2, service.findNumberOfStudents());
    }
    @Test
    public void stubExample_GetNewStudentsWithAppliedDiscount() {
        StudentReepository stab = mock(StudentReepository.class);
        SchoolService schoolService = new SchoolService(stab);

        Student student1 = new Student("cc11", "Ion",
                LocalDate.of(1999, 6, 22), LocalDate.of(2022, 1, 1));
        Student student2 = new Student("cc12", "Petru",
                LocalDate.of(1990, 6, 22), LocalDate.of(2022, 7, 12));

        List<Student> studentList = Arrays.asList(student1, student2);

        when(stab.findRecentEnrolledStudents(60)).thenReturn(studentList);

        List<Student> students = schoolService.getNewStudentsWithAppliedDiscount(60, 100);

        assertEquals(2, students.size());
    }
}
