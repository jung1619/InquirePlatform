package net.huray.inquire.project.service;

import lombok.RequiredArgsConstructor;
import net.huray.inquire.project.data.dto.ProjectDto;
import net.huray.inquire.project.data.entity.Project;
import net.huray.inquire.project.repository.ProjectRepository;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ProjectService {

    private final ProjectRepository projectRepository;

    public void createProject(ProjectDto.RequestDto requestDto){
        Project project = getProject(requestDto);
        projectRepository.save(project);

    }

    private Project getProject(ProjectDto.RequestDto requestDto){
        return Project.of(requestDto.getProjectName(), requestDto.getProjectCode());
    }
}
