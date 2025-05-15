package com.zp95sky.lingshu.task.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.zp95sky.lingshu.task.entity.Task;
import org.apache.ibatis.annotations.Mapper;

/**
 * 任务Mapper接口
 */
@Mapper
public interface TaskMapper extends BaseMapper<Task> {

}