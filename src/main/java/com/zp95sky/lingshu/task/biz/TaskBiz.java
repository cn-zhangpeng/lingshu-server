package com.zp95sky.lingshu.task.biz;

import com.zp95sky.lingshu.task.dto.TaskUpdateDto;

public interface TaskBiz {

    void updateTaskStatus(Long taskId, TaskUpdateDto updateDto);

}