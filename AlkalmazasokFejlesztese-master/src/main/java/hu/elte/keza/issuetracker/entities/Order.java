package hu.elte.keza.issuetracker.entities;

import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
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
    @NotNull
    @Column
    private Customer customer;
    
    @NotNull
    @Column
    private String address;
    
    @NotNull
    @Column
    private int phoneNumber;
     
    @NotNull
    @Column
    private boolean complete;
    
    @ManyToMany(targetEntity = ShopItem.class, mappedBy = "orders")
    private List<ShopItem> items;
}
