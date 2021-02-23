package springConfTest.entity;

import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
@NoArgsConstructor
@Getter
@Setter
@ToString(exclude = {"id", "courseEntity", "instructorDetailId"})
@Entity
@Table(name = "instructor", schema = "public", catalog = "hb_student_tracker")
public class InstructorEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @Basic
    @Column(name = "first_name")
    private String firstName;

    @Basic
    @Column(name = "last_name")
    private String lastName;

    @Basic
    @Column(name = "email")
    private String email;

    @OneToOne(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "instructor_detail_id")
    private InstructorDetailEntity instructorDetailId;

    @OneToMany(mappedBy = "instructor", fetch = FetchType.LAZY,
            cascade = {CascadeType.MERGE, CascadeType.PERSIST, CascadeType.DETACH, CascadeType.REFRESH})
    private List<CourseEntity> courseEntity;

    public void add(CourseEntity course){
        if(courseEntity == null)
            courseEntity = new ArrayList<>();
        courseEntity.add(course);
        course.setInstructor(this);
    }
}
