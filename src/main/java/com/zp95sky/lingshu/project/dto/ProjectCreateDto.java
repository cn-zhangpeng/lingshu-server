package com.zp95sky.lingshu.project.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

/**
 * 项目创建DTO
 */
@Data
@ApiModel(value = "项目创建参数")
public class ProjectCreateDto {

    @NotBlank(message = "项目名称不能为空")
    @ApiModelProperty(value = "项目名称", required = true)
    private String name;

    @NotBlank(message = "项目描述不能为空")
    @ApiModelProperty(value = "项目描述", required = true)
    private String description;

}