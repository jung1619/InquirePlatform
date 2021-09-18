package net.huray.inquire.Inquire.data.entity;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import javax.persistence.*;

/**
 * 문진 컨텐츠
 * - 기본 문진 질문 내용
 *
 * */
@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@TableGenerator(
        name = "INQUIRE_CONTENT_SEQ_GENERATOR",
        table = "INQUIRE_SEQUENCE",
        pkColumnValue = "INQUIRE_CONTENT_SEQ",
        allocationSize = 50
)
public class InquireContent {

    @Id
    @GeneratedValue(strategy = GenerationType.TABLE, generator = "INQUIRE_CONTENT_SEQ_GENERATOR")
    @Column(nullable = false, length = 20, columnDefinition = "bigint(20) not null comment '문진 내용 식별자 ID'")
    private Long id;

    @Column(name = "content", length = 255, columnDefinition = "varchar(255) comment '문진 내용'")
    private String content;

    @Column(name = "inquire_content_index", length = 20, columnDefinition = "int(20) comment '문진 순서'")
    private Integer inquireContentIndex;

    /* relation */
    @ManyToOne
    @JoinColumn(name = "inquire_group_id", referencedColumnName = "id")
    private InquireGroup inquireGroup;

    @Column(name = "inquire_group_id", insertable = false, updatable = false)
    private Long inquireGroupId;
}
