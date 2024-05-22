package cn.visaka.ssj.service.impl;

import cn.visaka.ssj.entity.Company;
import cn.visaka.ssj.mapper.CompanyMapper;
import cn.visaka.ssj.service.CompanyService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

@Service("companyService")
public class CompanyServiceImpl extends ServiceImpl<CompanyMapper, Company> implements CompanyService {
}
