package com.baobao.dao;

import com.baobao.model.SysRolePrivilege;

import java.util.List;


public interface SysRolePrivilegeMapper {

    List<SysRolePrivilege> selectByRoleIds(List<Long> roleIds);


}
