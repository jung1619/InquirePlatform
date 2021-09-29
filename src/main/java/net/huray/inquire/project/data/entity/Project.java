package net.huray.inquire.project.data.entity;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.time.LocalDateTime;

@Getter
@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@TableGenerator(
        name = "PROJECT_SEQ_GENERATOR",
        table = "INQUIRE_SEQUENCE",
        pkColumnValue = "PROJECT_SEQ",
        allocationSize = 50
)
public class Project {

    @Id
    @GeneratedValue(strategy = GenerationType.TABLE, generator = "PROJECT_SEQ_GENERATOR")
    @Column(nullable = false, length = 20, columnDefinition = "bigint(20) not null comment '프로젝트 식별자ID' ")
    private Long id;

    @Column(length = 100, nullable = false, columnDefinition = "varchar(100) not null comment '프로젝트명' ")
    private String projectName;

    @Column(length = 32, nullable = false, columnDefinition = "varchar(32) not null comment '프로젝트 코드'")
    private String projectCode;

    @CreationTimestamp
    @Column(nullable = false, columnDefinition = "timestamp not null comment '등록 일시'")
    private LocalDateTime createdAt;

    @UpdateTimestamp
    @Column(columnDefinition = "timestamp comment '수정 일시'")
    private LocalDateTime updatedAt;

    private Project(String projectName, String projectCode){
        this.projectName = projectName;
        this.projectCode = projectCode;
    }

    public static Project of(String projectName, String projectCode){
        return new Project(projectName, projectCode);
    }

}
