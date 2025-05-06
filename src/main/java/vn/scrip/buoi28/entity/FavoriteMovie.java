package vn.scrip.buoi28.entity;
import jakarta.persistence.*;
import lombok.*;
import java.io.Serializable;
@Entity
@Getter @Setter

@NoArgsConstructor
@AllArgsConstructor
@Builder
public class FavoriteMovie implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;


    @ManyToOne(fetch = FetchType.LAZY)
    private User user;

    @ManyToOne(fetch = FetchType.LAZY)
    private Movie movie;
}






