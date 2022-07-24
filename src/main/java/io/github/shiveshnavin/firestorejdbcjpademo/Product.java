package io.github.shiveshnavin.firestorejdbcjpademo;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "product")
public class Product {


    @Column(name = "id")
    @Id
    public String pID;
    public String status;
    public Long timeStamp;
    public boolean active;
    public int amount;


    @Override
    public String toString() {
        return "Product{" +
                "timeStamp=" + timeStamp +
                ", pID='" + pID + '\'' +
                ", status='" + status + '\'' +
                ", active=" + active +
                ", amount=" + amount +
                '}';
    }
}