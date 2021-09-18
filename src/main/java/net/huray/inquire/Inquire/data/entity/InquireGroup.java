package net.huray.inquire.Inquire.data.entity;

import net.huray.inquire.project.data.entity.Project;

import javax.persistence.*;
import java.util.List;

/**
 * 문진 종료별 그룹핑
 *
 * - 문진 항목들을 그룹핑 하는 엔티티
 *
 * */
@Entity
public class InquireGroup {

    @Id
    private Long id;

    @Column(name = "inquire_group_name", columnDefinition = "varchar(100) comment '문진 그룹 이름'")
    private String inquireGroupName;

    @Column(name = "inquire_group_code", columnDefinition = "varchar(25) comment '문진 그룹 코드'")
    private String inquireGroupCode;

    @Column(name ="inquire_group_index", columnDefinition = "int(20) comment '문진 그룹 인덱스'")
    private Integer inquireGroupIndex;

    /* relation */
    @ManyToOne
    @JoinColumn(name = "project_id", referencedColumnName = "id")
    private Project project;

    @Column(name = "project_id", insertable = false, updatable = false, nullable = false)
    private Long projectId;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "inquireGroup")
    private List<InquireContent> inquireContent;

    @ManyToOne
    @JoinColumn(name = "inquire_package_id", referencedColumnName = "id")
    private InquirePackage inquirePackage;

    @Column(name = "inquire_package_id", insertable = false, updatable = false )
    private Long inquirePackageId;


}
