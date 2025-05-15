package com.zp95sky.lingshu.project.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zp95sky.lingshu.project.entity.Project;
import com.zp95sky.lingshu.project.mapper.ProjectMapper;
import com.zp95sky.lingshu.project.service.ProjectService;
import org.springframework.stereotype.Service;

/**
 * 项目服务实现类
 */
@Service
public class ProjectServiceImpl extends ServiceImpl<ProjectMapper, Project> implements ProjectService {

}