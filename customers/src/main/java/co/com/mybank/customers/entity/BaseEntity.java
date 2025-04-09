package co.com.mybank.customers.entity;

import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDateTime;

@Getter
@Setter
@ToString
@MappedSuperclass
public class BaseEntity {

    @Column(name = "created_date", updatable = false)
    private LocalDateTime createdDate;

    @Column(name = "created_by", updatable = false)
    private String createdBy;

    @Column(name = "updated_date", insertable = false)
    private LocalDateTime updatedDate;

    @Column(name = "updated_by", insertable = false)
    private String updatedBy;
}
