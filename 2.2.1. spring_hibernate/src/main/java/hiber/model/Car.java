package hiber.model;

import javax.persistence.*;


@Entity
@Table(name = "cars")
public class Car {

    @Id
    @OneToOne(cascade =  CascadeType.ALL, mappedBy = "email")
    private Long id;

    @Column(name = "model")
    private String model;

    @Column(name = "series")
    private int series;
}
