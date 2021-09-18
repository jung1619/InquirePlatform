package net.huray.inquire.Inquire.data.entity;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Entity
public class InquirePackage {

    @Id
    private Long Id;

    @Column(length = 100, nullable = false, columnDefinition = "varchar(100) not null comment '문진 패키지명'")
    private String inquirePackageName;

    @Column(length = 32, nullable = false, columnDefinition = "varchar(32) not null comment '문진 패키지 코드'")
    private String inquirePackageCode;

    @CreationTimestamp
    @Column(nullable = false, columnDefinition = "timestamp not null comment '등록 일시'")
    private LocalDateTime createdDate;

    @UpdateTimestamp
    @Column(columnDefinition = "timestamp comment '수정 일시'")
    private LocalDateTime updatedDate;

    /* relation */

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "inquirePackage")
    private List<InquireGroup> inquireGroupList;


}
