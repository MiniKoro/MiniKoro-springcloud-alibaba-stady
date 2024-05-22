package cn.visaka.ssj.service.impl;

import cn.visaka.ssj.entity.Permission;
import cn.visaka.ssj.mapper.PermissionMapper;
import cn.visaka.ssj.service.PermissionService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

@Service("permissionService")
public class PermissionServiceImpl extends ServiceImpl<PermissionMapper, Permission> implements PermissionService {
}
