package demo.practice.demo.item;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "POS_ITEM_MASTER")
@NoArgsConstructor
@AllArgsConstructor
@EnableAutoConfiguration
public class ItemEntity {
    
    @Id
    @GeneratedValue
    private Long Id;
    
    private String itemName;
    private String itemDescription;
    private double itemPrice;

    public ItemEntity() {
    }

    public ItemEntity(Long id, String itemName, String itemDescription, double itemPrice) {
        Id = id;
        this.itemName = itemName;
        this.itemDescription = itemDescription;
        this.itemPrice = itemPrice;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getItemDescription() {
        return itemDescription;
    }

    public void setItemDescription(String itemDescription) {
        this.itemDescription = itemDescription;
    }

    public double getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(double itemPrice) {
        this.itemPrice = itemPrice;
    }

}
