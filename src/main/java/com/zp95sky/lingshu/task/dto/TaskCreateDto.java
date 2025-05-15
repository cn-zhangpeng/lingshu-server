package com.zp95sky.lingshu.task.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

/**
 * 任务创建DTO
 */
@Data
@ApiModel(value = "任务创建参数")
public class TaskCreateDto {

    @NotBlank(message = "任务名称不能为空")
    @ApiModelProperty(value = "任务名称", required = true)
    private String name;

    @NotBlank(message = "任务描述不能为空")
    @ApiModelProperty(value = "任务描述", required = true)
    private String description;

    @NotBlank(message = "项目ID不能为空")
    @ApiModelProperty(value = "项目ID", required = true)
    private String projectId;

}