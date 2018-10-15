package hu.elte.keza.issuetracker.entities;

import java.time.LocalDateTime;
import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MappedSuperclass;
import javax.validation.constraints.NotNull;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;

@Data
@MappedSuperclass
public abstract class BaseWithCreatedInfo extends BaseEntity implements Comparable<BaseWithCreatedInfo>{
    
    @NotNull
    @Column(updatable = false)
    @CreationTimestamp
    protected LocalDateTime createdAt;
    
    @NotNull
    @JoinColumn(updatable = false)
    @ManyToOne(targetEntity = Customer.class)
    protected Customer createdBy;
    
    @Override
    public int compareTo(BaseWithCreatedInfo o) {
        int result = this.getCreatedAt().compareTo(o.getCreatedAt());
        if(result == 0) {
            return this.getId().compareTo(o.getId());
        }
        return result;
    }
}
