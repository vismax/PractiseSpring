package com.baobao.controllers;


import com.baobao.dao.SysPrivilegeMapper;
import com.baobao.dao.SysRolePrivilegeMapper;
import com.baobao.dao.SysUserMapper;
import com.baobao.dao.SysUserRoleMapper;
import com.baobao.model.SysPrivilege;
import com.baobao.model.SysRolePrivilege;
import com.baobao.model.SysUser;
import com.baobao.model.SysUserRole;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Controller
public class UserRolePrivilegeController {

    @Autowired
    private SysUserRoleMapper userMapper;
    @Autowired
    private SysRolePrivilegeMapper rolePrivilegeMapper;
    @Autowired
    private SysPrivilegeMapper privilegeMapper;
    @Autowired
    private SysUserMapper sysUserMapper;



//    public List<SysPrivilege> input(@RequestParam("userid") Long userid){
//
//        try{

//           List<SysUserRole> sysUserRoleList= new ArrayList<>();
//           sysUserRoleList = userMapper.selectByUserId(userid);
//           List<Long> roleIds =new ArrayList<>();
//           for(SysUserRole sys : sysUserRoleList){
//               roleIds.add(sys.getRoleId());
//           }
//
//           List<SysRolePrivilege> privilegeIdList = new ArrayList<>();
//           privilegeIdList=rolePrivilegeMapper.selectByRoleIds(roleIds);
//           List<Long> privilegeIds= new ArrayList<>();
//           for(SysRolePrivilege sysp :privilegeIdList){
//               privilegeIds.add(sysp.getPrivilegeId());
//           }
//           使用join 的方法
//           List<SysPrivilege> privilegeList= new ArrayList<>();
//           privilegeList=privilegeMapper.selectByPrivilegeIds(privilegeIds);
//            List<SysPrivilege> sysPrivilegeList= new ArrayList<>();
//            sysPrivilegeList=userMapper.selectPrivilegeIdsIdsByUserId(userid);
//
//
//           return sysPrivilegeList;
//
//
//        }catch (Exception e){
//            e.printStackTrace();
//            return null;
//        }
//    }
//  }
    @ResponseBody
    @RequestMapping(value = "/practice/rbac")
    public void insertUser(@RequestBody SysUser sysUser) {
        try {
            sysUserMapper.insertUser(sysUser);


        } catch (Exception e) {
            e.printStackTrace();

        }
    }


}