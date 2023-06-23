package Magazyn.produkty.demo.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.*;
import org.apache.catalina.webresources.StandardRoot;

import javax.persistence.*;
import java.util.List;

@ToString
@Getter
@Setter
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Supply {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "name")
    private String name;
    @Column(name = "location")
    private String location;
    @Column(name = "capacity")
    private Integer capacity;
    @JsonBackReference
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id", nullable = false,insertable = false,updatable = false)
    private Depot depot;

}
