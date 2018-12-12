package hu.elte.keza.issuetracker.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "orders")
@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class Order extends BaseEntity
{
    
    @ManyToOne(targetEntity = Customer.class)
    @JoinColumn(updatable = false)
    @JsonIgnore
    private Customer customer;
    
    @NotNull
    @Column
    private int orderId;
   
    @NotNull
    @Column
    private String address;
    
    @NotNull
    @Column
    private String phoneNumber;
     
    @NotNull
    @Column
    private boolean complete;
    
    @ManyToOne(targetEntity = ShopItem.class)
    private ShopItem item;
}
