package nl.example.volleybal.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
public class Volleybal implements Serializable {

    @Id
    @GeneratedValue
    private long id;

    private String name;

    private double pressure;


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

    public double getPressure() {
        return pressure;
    }

    public void setPressure(double pressure) {
        this.pressure = pressure;
    }

    @Override
    public String toString() {
        return "Volleybal{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
