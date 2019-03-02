package com.baobao.dao;


import com.baobao.model.SysPrivilege;

import java.util.List;

public interface SysPrivilegeMapper {
    List<SysPrivilege> selectByPrivilegeIds(List<Long> privilegeIds);

}
