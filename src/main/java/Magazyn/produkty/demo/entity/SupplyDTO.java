package Magazyn.produkty.demo.entity;

import Magazyn.produkty.demo.entity.DepotDTO;
import Magazyn.produkty.demo.entity.Supply;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SupplyDTO {

    private Integer id;
    private String name;
    private String location;
    private Integer capacity;
    private Integer depotId;

    public SupplyDTO(Supply supply) {
        this.id = supply.getId();
        this.name = supply.getName();
        this.location = supply.getLocation();
        this.capacity = supply.getCapacity();
        if (supply.getDepot() != null) {
           this.depotId = supply.getDepot().getId();
        }
    }


}