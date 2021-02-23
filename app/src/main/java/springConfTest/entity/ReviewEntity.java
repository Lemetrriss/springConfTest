package springConfTest.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.util.Objects;
@NoArgsConstructor
@Getter
@Setter
@ToString(exclude = "id")
@Entity
@Table(name = "review", schema = "public", catalog = "hb_student_tracker")
public class ReviewEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Basic
    @Column(name = "comment")
    private String comment;
    }

