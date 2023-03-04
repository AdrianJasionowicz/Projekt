package Magazyn.produkty.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.DecimalMax;
import javax.validation.constraints.Digits;

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
    private Integer depotId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "depotId")
    private OtherEntity otherEntity;

}
