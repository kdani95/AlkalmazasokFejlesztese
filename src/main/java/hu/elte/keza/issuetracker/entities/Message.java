package hu.elte.keza.issuetracker.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "messages")
@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class Message extends BaseWithCreatedInfo implements Serializable {
    @NotNull
    @Column
    private String message;

    @JoinColumn(updatable = false)
    @ManyToOne(targetEntity = Item.class)
    @JsonIgnore
    private Item issue;
   
}
