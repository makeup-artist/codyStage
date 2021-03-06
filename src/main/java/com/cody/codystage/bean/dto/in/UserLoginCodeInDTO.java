package com.cody.codystage.bean.dto.in;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

/**
 * @Classname UserLoginCodeInDTO
 * @Description TODO
 * @Date 2019/5/25 18:46
 * @Created by ZQ
 */
@Data
@ApiModel(value = "用户手机登录参数")
public class UserLoginCodeInDTO {

    @ApiModelProperty(value = "手机号码")
    @Pattern(regexp = "^((13[0-9])|(14[5|7])|(15([0-3]|[5-9]))|(17[013678])|(18[0,5-9]))\\d{8}$"
            , message = "手机号格式错误")
    private String mobile;

    @ApiModelProperty(value = "验证码")
    @NotNull(message = "验证码不能为空")
    @Size(min =4, max = 4, message = "验证码长度不符合要求")
    private String code;
}
