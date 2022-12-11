package Magazyn.produkty.demo.repository;

import Magazyn.produkty.demo.entity.Depot;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface DepotRepository extends CrudRepository<Depot, Integer> {

    List<Depot> findAll();
}
