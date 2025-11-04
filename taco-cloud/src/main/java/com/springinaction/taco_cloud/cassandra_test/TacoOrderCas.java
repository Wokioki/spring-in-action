package com.springinaction.taco_cloud.cassandra_test;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;
import org.hibernate.validator.constraints.CreditCardNumber;
import org.springframework.data.cassandra.core.mapping.Column;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;
import com.datastax.oss.driver.api.core.uuid.Uuids;
import lombok.Data;

@Data
@Table("orders")
public class TacoOrderCas {

    private static final long serialVersionUID = 1L;
    @PrimaryKey
    private UUID id = Uuids.timeBased();
    private Date placedAt = new Date();
    @Column("tacos")
    private List<TacoUDT> tacos = new ArrayList<>();
    public void addTaco(TacoUDT taco) {
        this.tacos.add(taco);
    }
}
