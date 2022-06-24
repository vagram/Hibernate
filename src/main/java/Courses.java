import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Courses")
public class Courses {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private Integer duration;
    @Enumerated(EnumType.STRING)
    @Column(columnDefinition = "enum")
    private CoursesType type;
    @Column(name = "teacher_id")
    private Long teacherId;
    private String description;
    @Column(name = "students_count")
    private int studentCount;
    private int price;
    @Column(name = "price_per_hour")
    private int pricePerHour;
}
