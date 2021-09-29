package net.huray.inquire.project.data.dto;

import lombok.Getter;

@Getter
public class ProjectDto {

    @Getter
    public static class RequestDto{
        private String projectName;
        private String projectCode;

        private RequestDto(String projectName, String projectCode){
            this.projectName = projectName;
            this.projectCode = projectCode;
        }

        public static RequestDto of(String projectName, String projectCode){
            return new RequestDto(projectName, projectCode);
        }
    }


}
