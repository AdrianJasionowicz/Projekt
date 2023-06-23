package Magazyn.produkty.demo.service;

import Magazyn.produkty.demo.entity.Depot;
import Magazyn.produkty.demo.entity.Supply;
import Magazyn.produkty.demo.exception.DepotNotFound;
import Magazyn.produkty.demo.exception.SupplyNotFound;
import Magazyn.produkty.demo.repository.DepotRepository;
import Magazyn.produkty.demo.repository.SupplyRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class SupplyService {
    private final SupplyRepository supplyRepository;
    public SupplyService(SupplyRepository supplyRepository) {
        this.supplyRepository = supplyRepository;
    }

    public List<Supply> getAll() {
        return supplyRepository.findAll();
    }
    public Supply add(Supply object) {
        if (object.getId() != null) {
            throw new IllegalArgumentException("Supply id already exist");
        }
        return supplyRepository.save(object);
    }

    public Supply getById(Integer id) {
        Optional<Supply> supply = supplyRepository.findById(id);
        return supply.orElseThrow(() -> new SupplyNotFound("Nie ma takiego Magazynu"));
    }

}
