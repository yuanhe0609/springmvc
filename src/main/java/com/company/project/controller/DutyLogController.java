package com.company.project.controller;

import com.company.project.service.impl.DutyLogService;
import io.swagger.annotations.Api;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @description:
 * @author: ManolinCoder
 * @time: 2024/10/9
 */
@RestController
@Api(value = "DutyLogController")
@Slf4j
public class DutyLogController {

    @Autowired
    private DutyLogService dutyLogService;

    @RequestMapping("/get_log/{name}")
    public String getLog(@PathVariable String name) throws SQLException, ParseException {
//        dutyLogService.calculateWorkTime();

        String dateString = "2024-09";
        Date date= new SimpleDateFormat("yyyy-MM").parse(dateString);

        dutyLogService.calculateMonthWorkTime(date,name);
        return "";
    }
}
