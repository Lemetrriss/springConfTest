package springConfTest;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import springConfTest.entity.*;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import static springConfTest.util.HiberUtil.getFactory;

public class App2 {
    public static void main(String[] args) {
        SessionFactory factory = getFactory();
        Session session = factory.getCurrentSession();
//        InstructorEntity instructor = new InstructorEntity();
//        instructor.setFirstName("Chad");
//        instructor.setLastName("Derby");
//        instructor.setEmail("chad@gmail.com");
//
//        InstructorDetailEntity instructorDetail = new InstructorDetailEntity();
//        instructorDetail.setYoutubeChanel("http://youtube.com/luv2code");
//        instructorDetail.setHobby("Love 2 code!!!");
//
//        instructor.setInstructorDetailId(instructorDetail);


        Transaction tr = session.beginTransaction();
//        System.out.println(instructor.getId());
//        Serializable save = session.save(instructor);
//
//        System.out.println(save);

//        InstructorEntity instructorEntity = session.get(InstructorEntity.class, 17L);
//        instructorEntity.getInstructor().setInstructorDetailId(null);
//        session.delete(instructorEntity);



//        InstructorEntity instructor = session.get(InstructorEntity.class, 21L);
//        CourseEntity courseEntity1 = new CourseEntity();
//        courseEntity1.setTitle("new Course 1");
//        CourseEntity courseEntity2 = new CourseEntity();
//        courseEntity2.setTitle("new Course 2");
//        instructor.add(courseEntity1);
//        instructor.add(courseEntity2);
//        session.persist(courseEntity1);
//        session.persist(courseEntity2);


//        CourseEntity course = new CourseEntity();
//        course.setTitle("Pacman - how to score one million points");
//        ReviewEntity review1 = new ReviewEntity();
//        review1.setComment("Great course");
//        ReviewEntity review2 = new ReviewEntity();
//        review2.setComment("Cool course, well done");
//        ReviewEntity review3 = new ReviewEntity();
//        review3.setComment("What a dump course");
//        course.add(review1);
//        course.add(review2);
//        course.add(review3);
//
//        session.persist(course);

//        StudentEntity stud = new StudentEntity();
//        stud.setFirstName("Dmytro");
//        stud.setLastName("Dmytrenko");
//        stud.setEmail("dmytro@gmail.com");
//        stud.setFirstName("Yeuhen");
//        stud.setLastName("Taraschuk");
//        stud.setEmail("yevheno@gmail.com");
//        session.persist(stud);
//        session.flush();


//        CourseEntity courseM = new CourseEntity();
//        courseM.setTitle("time for ManyToMany course");
//        StudentEntity stud1 = new StudentEntity();
//        stud1.setFirstName("Dmytro");
//        stud1.setLastName("Dmytrenko");
//        stud1.setEmail("dmytro@gmail.com");
//        StudentEntity stud2 = new StudentEntity();
//        stud2.setFirstName("Yeuhen");
//        stud2.setLastName("Taraschuk");
//        stud2.setEmail("yevheno@gmail.com");
//        courseM.add(stud1);
//        courseM.add(stud2);
//        session.persist(courseM);

//        StudentEntity dmytrenko = session.get(StudentEntity.class, 6L);
//        List<CourseEntity> courses = dmytrenko.getCourses();
//        System.out.println(courses);

//        CourseEntity course2 = new CourseEntity();
//        course2.setTitle("Rubic's cube");
//        session.persist(course2);
//        CourseEntity course3 = new CourseEntity();
//        course3.setTitle("Atary 2600");
//        session.persist(course3);
//        dmytrenko.add(course2);
//        dmytrenko.add(course3);


        CourseEntity coursePacman = session.get(CourseEntity.class, 6L);
        session.delete(coursePacman);

        tr.commit();

        factory.close();
    }
}
