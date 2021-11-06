package com.torryharris.entiretrain.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class TrainModel {
    @Id
    private int train_no;
    private String train_name;
    private String source_point;
    private String destination_point;
    private long ticket_price;
}
