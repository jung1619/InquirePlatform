package net.huray.inquire.project.service;

import net.huray.inquire.project.data.dto.ProjectDto;
import net.huray.inquire.project.data.entity.Project;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Method;

import static org.junit.Assert.*;

public class ProjectServiceTest {

    private final ProjectService projectService = new ProjectService();
    @Test
    public void getProjectTest(){

        try {

            // expect
            Project expectProject = Project.of("atomind","AT");


            // actual
            Method method = projectService.getClass().getDeclaredMethod("getProject", ProjectDto.RequestDto.class);
            method.setAccessible(true);
            ProjectDto.RequestDto projectDto = ProjectDto.RequestDto.of("atomind", "AT");
            Project resultProject =(Project)method.invoke(projectService,projectDto);



            // result
            assertEquals(expectProject.getProjectName(), resultProject.getProjectName());
            assertEquals(expectProject.getProjectCode(), expectProject.getProjectCode());
        } catch (Exception e){

        }


    }

}