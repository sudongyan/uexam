package com.dzonesoft.exam.viewmodel.student.user;

import com.dzonesoft.exam.domain.User;
import com.dzonesoft.exam.utility.DateTimeUtil;
import com.dzonesoft.exam.viewmodel.BaseVM;
import lombok.Data;

/**
 * @author dzonesoft
 */

@Data
public class UserResponseVM extends BaseVM {

    private Integer id;

    private String userUuid;

    private String userName;

    private String realName;

    private Integer age;

    private Integer role;

    private Integer sex;

    private String birthDay;

    private String phone;

    private String lastActiveTime;

    private String createTime;

    private String modifyTime;

    private Integer status;

    private Integer userLevel;

    private String imagePath;

    public static UserResponseVM from(User user) {
        UserResponseVM vm = modelMapper.map(user, UserResponseVM.class);
        vm.setBirthDay(DateTimeUtil.dateFormat(user.getBirthDay()));
        vm.setLastActiveTime(DateTimeUtil.dateFormat(user.getLastActiveTime()));
        vm.setCreateTime(DateTimeUtil.dateFormat(user.getCreateTime()));
        vm.setModifyTime(DateTimeUtil.dateFormat(user.getModifyTime()));
        return vm;
    }
}
