package com.zp95sky.lingshu.project.controller;

import com.zp95sky.lingshu.project.biz.ProjectBiz;
import com.zp95sky.lingshu.project.domain.BoardColumnDo;
import com.zp95sky.lingshu.project.domain.ProjectDetailDo;
import com.zp95sky.lingshu.project.domain.ProjectDo;
import com.zp95sky.lingshu.project.dto.ProjectDto;
import com.zp95sky.lingshu.task.domain.TaskDo;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/projects")
@RequiredArgsConstructor
public class ProjectController {

    private final ProjectBiz projectBiz;

    @GetMapping
    public List<ProjectDo> getProjects() {
        return projectBiz.getProjects();
    }

    @GetMapping("/{projectId}")
    public ProjectDetailDo getProjectDetail(@PathVariable Long projectId) {
        return projectBiz.getProjectDetail(projectId);
    }

    @GetMapping("/{projectId}/columns")
    public List<BoardColumnDo> getBoardColumns(@PathVariable Long projectId) {
        return projectBiz.getBoardColumns(projectId);
    }

    @GetMapping("/{projectId}/tasks")
    public List<TaskDo> getTasks(@PathVariable Long projectId) {
        return projectBiz.getTasks(projectId);
    }

    @PostMapping
    public ProjectDo createProject(@RequestBody ProjectDto projectDto) {
        return projectBiz.createProject(projectDto);
    }
}