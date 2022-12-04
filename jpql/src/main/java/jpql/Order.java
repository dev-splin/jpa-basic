package jpql;

import javax.persistence.*;

@Entity
public class Order {
    @Id @GeneratedValue
    private Long id;
    private int orderAmount;

    @Embedded
    private Adress adress;

    @ManyToOne
    @JoinColumn(name = "PRODUCT_ID")
    private Order order;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getOrderAmount() {
        return orderAmount;
    }

    public void setOrderAmount(int orderAmount) {
        this.orderAmount = orderAmount;
    }

    public Adress getAdress() {
        return adress;
    }

    public void setAdress(Adress adress) {
        this.adress = adress;
    }
}
