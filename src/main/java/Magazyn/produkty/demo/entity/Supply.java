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
        private Integer supplyId;
        private String name;
        private String location;
        private Integer capacity;

        @ManyToOne(fetch = FetchType.LAZY)
        private Depot depot;

    }
