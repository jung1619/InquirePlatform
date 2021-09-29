package net.huray.inquire.Inquire.data.entity;

import javax.persistence.*;

@Entity
public class InquireOption {

    @Id
    Long id;

    // relation
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "option_content_id" , referencedColumnName = "id")
    OptionContent optionContent;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "option_score_id", referencedColumnName = "id")
    OptionScore optionScore;

}
