package net.huray.inquire.Inquire.data.entity;

import javax.persistence.*;

@Entity
public class OptionContent {

    @Id
    Long id;

    @Column(name = "content", nullable = false , columnDefinition = "varchar(255) not null comment '보기 컨텐츠'")
    String content;

    // relation
    @OneToOne(mappedBy = "optionContent")
    InquireOption inquireOption;


}
