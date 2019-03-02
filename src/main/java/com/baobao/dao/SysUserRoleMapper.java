package com.baobao.dao;


import com.baobao.model.SysPrivilege;
import com.baobao.model.SysUserRole;
import netscape.security.Privilege;

import java.util.List;

public interface SysUserRoleMapper {
    List<SysUserRole> selectByUserId(Long userid);

    List<SysPrivilege> selectPrivilegeIdsIdsByUserId(Long userid);

}
