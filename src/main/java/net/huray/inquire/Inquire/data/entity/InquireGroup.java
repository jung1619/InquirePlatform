package net.huray.inquire.Inquire.data.entity;

import net.huray.inquire.project.data.entity.Project;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class InquireGroup {

    @Id
    private Long id;

    private String InquireGroupName;

    private String InquireGroupCode;

    /* relation */
    @ManyToOne
    private Project project;

    private Long projectId;

}
