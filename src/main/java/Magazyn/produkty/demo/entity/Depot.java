package Magazyn.produkty.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import Magazyn.produkty.demo.entity.Supply;
import javax.persistence.*;
import javax.validation.constraints.DecimalMax;
import javax.validation.constraints.Digits;
import java.util.List;
import java.util.Map;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Depot {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String description;
    @Digits(integer = 5, fraction = 2)
    @DecimalMax(value = "99999.99", message = "Price can have up to 2 decimal places")
    private Double price;
    @Column(columnDefinition = "VARCHAR(10) DEFAULT 'PLN'")
    private String currency = "PLN";
    @Column(columnDefinition = "INTEGER DEFAULT 0")
    private Integer availableAmount = 0;
    private Integer supplyIdAlt;

    @OneToMany(mappedBy = "depot")
    private List<Supply> supplies;
}
