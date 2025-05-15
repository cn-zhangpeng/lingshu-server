package com.zp95sky.lingshu.task.controller;

import com.zp95sky.lingshu.task.biz.TaskBiz;
import com.zp95sky.lingshu.task.dto.TaskUpdateDto;
import com.zp95sky.lingshu.task.service.TaskService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/tasks")
@RequiredArgsConstructor
public class TaskController {

    private final TaskBiz taskBiz;

    @PatchMapping("/{taskId}")
    public void updateTaskStatus(@PathVariable Long taskId, @RequestBody TaskUpdateDto updateDto) {
        taskBiz.updateTaskStatus(taskId, updateDto);
    }

}