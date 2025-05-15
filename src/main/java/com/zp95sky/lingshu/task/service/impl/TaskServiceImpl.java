package com.zp95sky.lingshu.task.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zp95sky.lingshu.task.entity.Task;
import com.zp95sky.lingshu.task.mapper.TaskMapper;
import com.zp95sky.lingshu.task.service.TaskService;
import org.springframework.stereotype.Service;

/**
 * 任务服务实现类
 */
@Service
public class TaskServiceImpl extends ServiceImpl<TaskMapper, Task> implements TaskService {

}