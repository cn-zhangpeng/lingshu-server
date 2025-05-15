package com.zp95sky.lingshu.task.biz.impl;

import com.zp95sky.lingshu.task.biz.TaskBiz;
import com.zp95sky.lingshu.task.dto.TaskUpdateDto;
import com.zp95sky.lingshu.task.entity.Task;
import com.zp95sky.lingshu.task.service.TaskService;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class TaskBizImpl implements TaskBiz {

    private final TaskService taskService;

    @Override
    public void updateTaskStatus(Long taskId, TaskUpdateDto updateDto) {
        // 参数校验
        if (taskId == null || updateDto == null) {
            throw new IllegalArgumentException("参数不能为空");
        }

        // 更新任务状态
        Task task = taskService.getById(taskId);
        if (task == null) {
            throw new IllegalArgumentException("任务不存在");
        }

        taskService.updateById(task);
    }

}