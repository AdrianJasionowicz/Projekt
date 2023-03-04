package Magazyn.produkty.demo.data;

import Magazyn.produkty.demo.entity.Depot;
import Magazyn.produkty.demo.repository.DepotRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
@Slf4j
public class DataInitializer {

    private final DepotRepository depotRepository;

    /**
     * Ta metoda odpala sie po tym jak apka wstanie.
     * Zapisuje do bazy dwie encje magazyn1 i magazyn2.
     */
    /*
    @EventListener(ApplicationReadyEvent.class)
    public void initializeDataAfterStartup() {
        log.info("Initializing startup data...");

        Depot depot1 = new Depot(null, "Depot Test1", 400,"Koszarowa 2 50-610 Wroclaw Poland");
        Depot depot2 = new Depot(null, "Depot Test2", 300,"Powstancow Slaskich 5 50-606 Wroclaw Poland");

        log.info("Saving: " + depot1);
        log.info("Saving: " + depot2);

        depotRepository.save(depot1);
        depotRepository.save(depot2);
    }

     */
}
