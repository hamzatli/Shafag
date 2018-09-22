package az.shafag.testapp.model;


import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "body_type",schema = "shafag")
public class BodyType {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "label")
    private String label;

    @Column(name = "is_active")
    private Integer isActive;

    @OneToMany(mappedBy = "bodyType")
    private Set<Vehicle> vehicles;


    public BodyType() {
    }

    public BodyType(String name, String label, Integer isActive, Set<Vehicle> vehicles) {
        this.name = name;
        this.label = label;
        this.isActive = isActive;
        this.vehicles = vehicles;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public Integer getIsActive() {
        return isActive;
    }

    public void setIsActive(Integer isActive) {
        this.isActive = isActive;
    }

    public Set<Vehicle> getVehicles() {
        return vehicles;
    }

    public void setVehicles(Set<Vehicle> vehicles) {
        this.vehicles = vehicles;
    }
}