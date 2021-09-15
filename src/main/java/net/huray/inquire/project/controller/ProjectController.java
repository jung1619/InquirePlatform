package net.huray.inquire.project.controller;

import lombok.RequiredArgsConstructor;
import net.huray.inquire.project.data.dto.ProjectDto;
import net.huray.inquire.project.service.ProjectService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping(value = "project")
public class ProjectController {

    private final ProjectService projectService;

    @PostMapping(value = "")
    private void createProject(@RequestBody ProjectDto.RequestDto requestDto){
        projectService.createProject(requestDto);
    }
}
