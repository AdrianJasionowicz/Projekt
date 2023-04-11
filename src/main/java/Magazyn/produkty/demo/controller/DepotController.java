package Magazyn.produkty.demo.controller;

import Magazyn.produkty.demo.entity.Depot;
import Magazyn.produkty.demo.entity.DepotDTO;
import Magazyn.produkty.demo.service.DepotService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class DepotController {
    private final DepotService depotService;

    public DepotController(DepotService depotService) {
        this.depotService = depotService;
    }

    @GetMapping("/depot")
    public List<Depot> showDepot() {
        return depotService.getAll();
    }

 /*   @GetMapping("/depot/{id}")
    public Depot showDepot(@PathVariable Integer id) {
        return depotService.getById(id);
    }
*/
    @GetMapping("/depot/{id}")
    public ResponseEntity<DepotDTO> getDepot(@PathVariable Integer id) {
        Depot depot = depotService.getById(id);
        DepotDTO depotDTO = new DepotDTO(depot);
        return ResponseEntity.ok().body(depotDTO);
    }


    @PostMapping("/depot")
    public Depot addDepot(@RequestBody Depot object) {
        return depotService.add(object);
    }

    @DeleteMapping("/depot/{id}")
    public void deleteDepot(@PathVariable Integer id) {
        depotService.deleteById(id);
    }

    @PutMapping("/depot/{id}")
    public Depot updateDepot(@RequestBody Depot updater, @PathVariable Integer id) {
        if (!updater.getId().equals(id)) {
            throw new IllegalArgumentException("Depot not found");
        }
        return depotService.updateDepot(updater);
    }

}
