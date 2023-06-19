package Magazyn.produkty.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.catalina.webresources.StandardRoot;

import javax.persistence.*;
import java.util.List;


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
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id", nullable = false,insertable = false,updatable = false)
    private Depot depot;

}
