package Magazyn.produkty.demo.entity;

import lombok.*;
import Magazyn.produkty.demo.entity.Supply;
import org.hibernate.annotations.Cascade;

import javax.naming.Name;
import javax.persistence.*;
import javax.validation.constraints.DecimalMax;
import javax.validation.constraints.Digits;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Depot {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "name")
    private String name;
    @Column(name = "description")
    private String description;
    @Column(name = "price")
    @Digits(integer = 5, fraction = 2)
    @DecimalMax(value = "99999.99", message = "Price can have up to 2 decimal places")
    private Double price;
    @Column(name = "currency", columnDefinition = "VARCHAR(10) DEFAULT 'PLN'")
    private String currency = "PLN";
    @Column(name = "available_amount", columnDefinition = "INTEGER DEFAULT 0")
    private Integer availableAmount = 0;
    @OneToMany
    @JoinColumn(name = "depot_id")
    private List<Supply> supply;
}
