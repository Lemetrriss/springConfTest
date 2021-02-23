package springConfTest.entity;

import lombok.*;

import javax.persistence.*;
import java.util.Objects;

@NoArgsConstructor
@Getter
@Setter
@ToString(exclude = {"id", "instructor"})
@Entity
@Table(name = "instructor_detail", schema = "public", catalog = "hb_student_tracker")
public class InstructorDetailEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @Basic
    @Column(name = "youtube_chanel")
    private String youtubeChanel;

    @Basic
    @Column(name = "hobby")
    private String hobby;

    @OneToOne(mappedBy = "instructorDetailId")
    private InstructorEntity instructor;
}
