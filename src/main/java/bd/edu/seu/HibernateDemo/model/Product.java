package bd.edu.seu.HibernateDemo.model;


import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Product {
    @Id
    private long id;
    private String name;
    private double PricePerUnit;
    private double UnitInStoke;

    public Product() {
    }

    public Product(long id, String name, double pricePerUnit, double unitInStoke) {
        this.id = id;
        this.name = name;
        PricePerUnit = pricePerUnit;
        UnitInStoke = unitInStoke;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPricePerUnit() {
        return PricePerUnit;
    }

    public void setPricePerUnit(double pricePerUnit) {
        PricePerUnit = pricePerUnit;
    }

    public double getUnitInStoke() {
        return UnitInStoke;
    }

    public void setUnitInStoke(double unitInStoke) {
        UnitInStoke = unitInStoke;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", PricePerUnit=" + PricePerUnit +
                ", UnitInStoke=" + UnitInStoke +
                '}';
    }
}
