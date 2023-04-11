package Magazyn.produkty.demo.entity;

import Magazyn.produkty.demo.entity.Depot;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DepotDTO {
    private Integer id;
    private String name;
    private String description;
    private Double price;
    private String currency;
    private Integer availableAmount;


    public DepotDTO(Depot depot) {
        this.id = depot.getId();
        this.name = depot.getName();
        this.description = depot.getDescription();
        this.price = depot.getPrice();
        this.currency = depot.getCurrency();
        this.availableAmount = depot.getAvailableAmount();
    }
}