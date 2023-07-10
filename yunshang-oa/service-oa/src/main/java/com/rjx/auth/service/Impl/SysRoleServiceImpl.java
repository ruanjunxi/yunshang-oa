package com.rjx.auth.service.Impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.rjx.auth.mapper.SysRoleMapper;
import com.rjx.auth.service.SysRoleService;
import com.rjx.model.system.SysRole;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author junxi
 * @Date 2023/7/7   13:43
 * @Project yunshang-oa-parent
 * @description:
 */
@Service
public class SysRoleServiceImpl extends ServiceImpl<SysRoleMapper, SysRole> implements SysRoleService{

    @Autowired
    SysRoleMapper sysRoleMapper;
}
