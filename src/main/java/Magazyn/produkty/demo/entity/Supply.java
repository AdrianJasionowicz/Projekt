    package Magazyn.produkty.demo.entity;

    import lombok.AllArgsConstructor;
    import lombok.Data;
    import lombok.NoArgsConstructor;
    import org.apache.catalina.webresources.StandardRoot;

    import javax.persistence.*;
    import java.util.List;


    @Entity
    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    public class Supply {


        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)

        @Column(name = "name")
        private String name;
        @Column(name = "location")
        private String location;
        @Column(name = "capacity")
        private Integer capacity;

        private  Long id;

      @ManyToOne (fetch = FetchType.EAGER)
      @JoinColumn(name = "depot_id",insertable = false, updatable = false)
      private Depot depot;
    }
