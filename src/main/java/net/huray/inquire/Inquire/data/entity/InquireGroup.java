package net.huray.inquire.Inquire.data.entity;

import net.huray.inquire.project.data.entity.Project;

import javax.persistence.*;
import java.util.List;

@Entity
public class InquireGroup {

    @Id
    private Long id;

    @Column(name = "inquire_group_name", columnDefinition = "varchar(100) comment '문진 그룹 이름")
    private String inquireGroupName;

    @Column(name = "inquire_group_code", columnDefinition = "varchar(25) comment '문진 그룹 코드'")
    private String inquireGroupCode;

    @Column(name ="inquire_group_index", columnDefinition = "int")
    private Integer inquireGroupIndex;

    /* relation */
    @ManyToOne
    private Project project;

    private Long projectId;

    @OneToMany
    private List<InquireContent> inquireContent;

}
