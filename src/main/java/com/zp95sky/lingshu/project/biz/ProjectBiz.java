package com.zp95sky.lingshu.project.biz;

import com.zp95sky.lingshu.project.domain.BoardColumnDo;
import com.zp95sky.lingshu.project.domain.ProjectDetailDo;
import com.zp95sky.lingshu.project.domain.ProjectDo;
import com.zp95sky.lingshu.project.dto.ProjectDto;
import com.zp95sky.lingshu.task.domain.TaskDo;

import java.util.List;

/**
 * 项目业务逻辑接口
 */
public interface ProjectBiz {
    List<ProjectDo> getProjects();
    ProjectDetailDo getProjectDetail(Long projectId);
    List<BoardColumnDo> getBoardColumns(Long projectId);
    List<TaskDo> getTasks(Long projectId);
    ProjectDo createProject(ProjectDto projectDto);
}