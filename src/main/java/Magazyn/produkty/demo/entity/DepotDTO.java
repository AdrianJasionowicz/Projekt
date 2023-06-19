package Magazyn.produkty.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

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
    private List<SupplyDTO> supplyDTOList;

    public DepotDTO(Depot depot) {
        this.id = depot.getId();
        this.name = depot.getName();
        this.description = depot.getDescription();
        this.price = depot.getPrice();
        this.currency = depot.getCurrency();
        this.availableAmount = depot.getAvailableAmount();
        this.supplyDTOList = mapSuppliesToDTOs(depot.getSupply());
    }

    private List<SupplyDTO> mapSuppliesToDTOs(List<Supply> supplies) {
        List<SupplyDTO> supplyDTOs = new ArrayList<>();
        for (Supply supply : supplies) {
            supplyDTOs.add(new SupplyDTO(supply));
        }
        return supplyDTOs;
    }
}