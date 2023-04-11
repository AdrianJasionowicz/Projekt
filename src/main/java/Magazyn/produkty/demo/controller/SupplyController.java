package Magazyn.produkty.demo.controller;

import Magazyn.produkty.demo.entity.Supply;
import Magazyn.produkty.demo.service.DepotService;
import Magazyn.produkty.demo.service.SupplyService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SupplyController {
    private final SupplyService supplyService;

    public SupplyController(SupplyService supplyService) {
        this.supplyService = supplyService;
    }

    @GetMapping("/supply")
    public List<Supply> showSupply() {
        return supplyService.getAll();
    }


}

