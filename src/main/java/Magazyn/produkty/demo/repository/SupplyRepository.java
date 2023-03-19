package Magazyn.produkty.demo.repository;

import Magazyn.produkty.demo.entity.Depot;
import Magazyn.produkty.demo.entity.Supply;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface SupplyRepository extends CrudRepository<Supply, Integer>{

        List<Supply> findAll();

    }
