package hu.elte.keza.issuetracker.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.io.Serializable;
import java.util.List;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;


@Entity
@Table(name = "customers")
@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class Customer extends BaseEntity implements Serializable{
    
    @NotNull
    @Column
    private String userName;
    
    @NotNull
    @Column
    private String name;
    
    @NotNull
    @Column
    private String password;
    
    @NotNull
    @Column
    private String emailAddress;

    @OneToMany(targetEntity = Order.class, mappedBy = "customer")
    private List<Order> orders;
}
