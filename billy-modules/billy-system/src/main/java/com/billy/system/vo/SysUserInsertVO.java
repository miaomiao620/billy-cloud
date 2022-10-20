package com.billy.system.vo;

import com.billy.common.core.web.validate.IsMobile;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ApiModel("新增用户视图数据")
public class SysUserInsertVO {
    @ApiModelProperty(required = true, value = "部门ID",example = "100")
    @NotNull(message = "部门ID不允许空值")
    private Long deptId;

    @ApiModelProperty(required = true, value = "登录账号,创建后禁止修改",example = "admin")
    @Size(max = 30,message = "长度不超过30个字符")
    @NotBlank(message = "登录账号不允许空值")
    private String loginName;

    @ApiModelProperty(required = true, value = "用户昵称",example = "小盆友")
    @Size(max = 30,message = "长度不超过30个字符")
    @NotBlank(message = "用户昵称不允许空值")
    private String userName;

    @ApiModelProperty(required = false, value = "手机号码",example = "13100001111")
    @IsMobile(required = true)
    private String phoneNumber;

    @ApiModelProperty(required = false, value = "用户邮箱",example = "admin@qq.com")
    @Size(max = 50,message = "长度不超过50个字符")
    @Email(message = "电子邮箱格式不正确")
    private String email;

    @ApiModelProperty(required = false, value = "用户性别,0男|1女|2未知",example = "0")
    @Size(max = 1,message = "sex长度不超过1个字符")
    private String sex;

    @ApiModelProperty(required = false, value = "头像路径",example = "https://api.sprout-data.xyz/hr/UploadFile/png/201701091031423059.png")
    @Size(max = 100,message = "avatar长度不超过100个字符")
    private String avatar;

    @ApiModelProperty(required = false, value = "用户密码(明文)",example = "pwdPWD123!@#")
    @Size(max = 12,message = "password长度不超过12个字符")
    private String password;

    @ApiModelProperty(required = false, value = "备注",example = "数字零售部门给外部人员使用")
    @Size(max = 500,message = "remark长度不超过500个字符")
    private String remark;

    @ApiModelProperty(required = false, value = "角色集合")
    private List<Long> roleIds;

    @ApiModelProperty(required = false, value = "岗位集合")
    private Long[] postIds;

}
