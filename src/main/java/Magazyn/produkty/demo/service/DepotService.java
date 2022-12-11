package Magazyn.produkty.demo.service;

import Magazyn.produkty.demo.entity.Depot;
import Magazyn.produkty.demo.exception.DepotNotFound;
import Magazyn.produkty.demo.repository.DepotRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DepotService {
    private final DepotRepository depotRepository;

    public DepotService(DepotRepository depotRepository) {
        this.depotRepository = depotRepository;
    }

    public Depot getById(Integer id) {
        Optional<Depot> depot = depotRepository.findById(id);
        return depot.orElseThrow(() -> new DepotNotFound("Nie ma takiej POzycji"));
    }

    public List<Depot> getAll() {
        return depotRepository.findAll();
    }

    public Depot add(Depot object) {
        if (object.getId() != null) {
            throw new IllegalArgumentException("Id Already exist");
        }
        return depotRepository.save(object);
    }

public void deleteById(Integer id) {
depotRepository.deleteById(id);
}

public Depot updateDepot(Depot updater) {
return depotRepository.save(updater);
}
}
