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

    @GetMapping("/depots")
    public List<Depot> showDepot() {
        return depotService.getAll();
    }

 /*   @GetMapping("/depot/{id}")
    public Depot showDepot(@PathVariable Integer id) {
        return depotService.getById(id);
    }
*/
    @GetMapping("/depots/{id}")
    public ResponseEntity<DepotDTO> getDepot(@PathVariable Integer id) {
        Depot depot = depotService.getById(id);
        DepotDTO depotDTO = new DepotDTO(depot);
        return ResponseEntity.ok().body(depotDTO);
    }


    @PostMapping("/depots")
    public DepotDTO addDepot(@RequestBody DepotDTO dto) {
        Depot depot = convertDTOToEntity(dto);
                Depot updatedDepot = depotService.add(depot);
        return convertEntityToDTO(updatedDepot);
    }

    @DeleteMapping("/depots/{id}")
    public void deleteDepot(@PathVariable Integer id) {
        depotService.deleteById(id);
    }

    @PutMapping("/depots/{id}")
    public DepotDTO updateDepot(@RequestBody DepotDTO updater, @PathVariable Integer id) {
        if (!updater.getId().equals(id)) {
            throw new IllegalArgumentException("Depot not found");
        }
        Depot depot = DepotMapper.convertDTOToEntity(updater);
        Depot updatedDepot = depotService.updateDepot(depot);
        return DepotMapper.convertEntityToDTO(updatedDepot);
    }


        private Depot convertDTOToEntity(DepotDTO dto) {
            Depot depot = new Depot();
            depot.setId(dto.getId());
            depot.setName(dto.getName());
            depot.setDescription(dto.getDescription());


            return depot;
        }

        private DepotDTO convertEntityToDTO(Depot depot) {
            DepotDTO dto = new DepotDTO();
            dto.setId(depot.getId());
            dto.setName(depot.getName());
            dto.setDescription(depot.getDescription());


            return dto;
        }


}
