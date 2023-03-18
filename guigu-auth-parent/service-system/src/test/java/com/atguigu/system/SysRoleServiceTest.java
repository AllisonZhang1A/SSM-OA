package com.atguigu.system;

import com.atguigu.common.result.Result;
import com.atguigu.model.system.SysRole;
import com.atguigu.system.service.SysRoleService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

/**
 * @author ZhangYiAn
 * @version 1.0.0
 * @ClassName SysRoleServiceTest.java
 * @Description TODO
 * @createTime 2022年12月04日 16:47:00
 */

@SpringBootTest
@ExtendWith(SpringExtension.class)
public class SysRoleServiceTest {
    @Autowired
    private SysRoleService sysRoleService;
    /**
     * 查询所有
     */
    @Test
    public void findAll(){
        List<SysRole> list = sysRoleService.list();
        System.out.println(list);

    }


    @Test
    public void saveRole(){
        SysRole sysRole=new SysRole();
        sysRole.setRoleName("测试");
        sysRole.setRoleCode("test");
        sysRole.setId("2");
        sysRoleService.save(sysRole);
    }
}
