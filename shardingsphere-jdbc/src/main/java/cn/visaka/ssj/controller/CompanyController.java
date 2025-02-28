package cn.visaka.ssj.controller;

import cn.visaka.ssj.entity.Company;
import cn.visaka.ssj.remote.IdService;
import cn.visaka.ssj.service.CompanyService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.time.LocalDateTime;
import java.util.UUID;


@RestController
@RequestMapping("company")
public class CompanyController {

    @Resource
    private CompanyService companyService;

    @Resource
    private IdService idService;

    @GetMapping("add")
    public Boolean add() {
        Company company = new Company();
        company.setId(idService.generateId("company"));
        company.setName("企业名称；" + UUID.randomUUID());
        company.setCreateTime(LocalDateTime.now());
        company.setUpdateTime(LocalDateTime.now());
        return companyService.save(company);
    }
}
