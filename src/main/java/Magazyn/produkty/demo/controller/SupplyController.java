package Magazyn.produkty.demo.controller;

import Magazyn.produkty.demo.entity.Depot;
import Magazyn.produkty.demo.entity.DepotDTO;
import Magazyn.produkty.demo.entity.Supply;
import Magazyn.produkty.demo.entity.SupplyDTO;
import Magazyn.produkty.demo.service.DepotService;
import Magazyn.produkty.demo.service.SupplyService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class SupplyController {
    private final SupplyService supplyService;

    public SupplyController(SupplyService supplyService) {
        this.supplyService = supplyService;
    }

    @GetMapping("/supplies")
    public List<Supply> showSupply() {
        return supplyService.getAll();
    }

    @GetMapping("/supplies/{id}")
    public ResponseEntity<SupplyDTO> getSupply(@PathVariable Integer id) {
        Supply supply = supplyService.getById(id);
        SupplyDTO supplyDTO = new SupplyDTO(supply);
        return ResponseEntity.ok().body(supplyDTO);
    }




    @PostMapping("/supplies")
    public Supply addSupply(@RequestBody Supply object) {

        return supplyService.add(object);
    }


}

