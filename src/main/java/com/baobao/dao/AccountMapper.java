package com.baobao.dao;

import com.baobao.po.AccountBookPO;
import org.apache.ibatis.annotations.Param;

public interface AccountMapper {


        AccountBookPO getAccount(@Param("abc") int id);

}
