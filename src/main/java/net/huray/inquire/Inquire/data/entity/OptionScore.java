package net.huray.inquire.Inquire.data.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class OptionScore {

    @Id
    Long id;

    @Column(name = "score", nullable = false, columnDefinition = "int(20) not null comment '점수'")
    Integer score;

    // relation
    @OneToOne(mappedBy = "optionScore")
    InquireOption inquireOption;
}
