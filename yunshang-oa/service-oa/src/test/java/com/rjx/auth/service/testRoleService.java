package com.rjx.auth.service;

import com.rjx.model.system.SysRole;
import lombok.val;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

/**
 * @Author junxi
 * @Date 2023/7/7   13:45
 * @Project yunshang-oa-parent
 * @description:
 */
@SpringBootTest
public class testRoleService {
    @Autowired
    SysRoleService sysRoleService;

    @Test
    public void testSelectList(){
        System.out.println(("----- selectAll method test ------"));
        //UserMapper 中的 selectList() 方法的参数为 MP 内置的条件封装器 Wrapper
        //所以不填写就是无任何条件
        List<SysRole> users = sysRoleService.list();
        users.forEach(System.out::println);
    }
    @Test
    public void testInsert(){
        SysRole role = new SysRole();
        role.setRoleCode("role");
        role.setRoleName("管理员");
        role.setDescription("角色管理员");

        boolean res = sysRoleService.save(role);
        if(res){
            System.out.println(res); //影响的行数
            System.out.println(role); //id自动回填
        }else{
            System.out.println("添加失败");
        }
    }

    @Test
    public void testUpdateById(){
        SysRole role = new SysRole();
        role.setId(9L);
        role.setRoleName("lyy");
        boolean res = sysRoleService.updateById(role);
        System.out.println(res);
    }
    @Test
    public void testDeleteById(){
        boolean result = sysRoleService.removeById(9L);
        System.out.println(result);
    }
}
