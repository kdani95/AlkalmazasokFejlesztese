package hu.elte.keza.issuetracker.entities;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.UpdateTimestamp;

@Entity
@Table(name = "item")
@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class Item extends BaseWithCreatedInfo implements Serializable
{   
    @Column
    @NotNull
    private String name;
        
    @NotNull
    @Column
    private String manufacturer;
    
    @NotNull
    @Column
    private int typeNumber;
    
    @NotNull
    @Column
    private String description;
    
    @NotNull
    @Column
    private int nettPrice;

    @NotNull
    @Column
    private int stock;
    
    @NotNull
    @Column
    private boolean active;
    
    @JoinColumn(updatable = false)
    @ManyToOne(targetEntity = Category.class)
    private Category category;

}
