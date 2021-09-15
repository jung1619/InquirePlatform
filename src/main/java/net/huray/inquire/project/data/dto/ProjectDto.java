package net.huray.inquire.project.data.dto;

import lombok.Getter;

@Getter
public class ProjectDto {

    @Getter
    public static class RequestDto{
        private String projectName;
        private String projectCode;
    }
}
