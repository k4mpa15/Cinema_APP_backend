// Giftcard.java
package pl.wat.backend.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "Giftcards")
public class Giftcard {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "giftcard_type")
    private String giftcardType;

    @Column(name = "price")
    private double price;

    // Getters and setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getGiftcardType() {
        return giftcardType;
    }

    public void setGiftcardType(String giftcardType) {
        this.giftcardType = giftcardType;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
