package com.zp95sky.lingshu.project.biz.impl;

import com.zp95sky.lingshu.project.biz.ProjectBiz;
import com.zp95sky.lingshu.project.domain.BoardColumnDo;
import com.zp95sky.lingshu.project.domain.ProjectDetailDo;
import com.zp95sky.lingshu.project.domain.ProjectDo;
import com.zp95sky.lingshu.project.dto.ProjectDto;
import com.zp95sky.lingshu.project.service.ProjectService;
import com.zp95sky.lingshu.task.domain.TaskDo;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 项目业务逻辑实现
 */
@Service
@RequiredArgsConstructor
public class ProjectBizImpl implements ProjectBiz {
    
    private final ProjectService projectService;

    @Override
    public List<ProjectDo> getProjects() {
        return null;
    }

    @Override
    public ProjectDetailDo getProjectDetail(Long projectId) {
        return null;
    }

    @Override
    public List<BoardColumnDo> getBoardColumns(Long projectId) {
        return null;
    }

    @Override
    public List<TaskDo> getTasks(Long projectId) {
        return null;
    }

    @Override
    public ProjectDo createProject(ProjectDto projectDto) {
        return null;
    }
}