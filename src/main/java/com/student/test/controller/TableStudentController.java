package com.student.test.controller;


import com.alibaba.druid.support.json.JSONUtils;
import com.student.test.doo.TableStudentDo;
import com.student.test.dto.TableStudentDto;
import com.student.test.entity.LayuiTable;
import com.student.test.entity.TableStudent;
import com.student.test.service.TableStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author DaoChen
 * @since 2020-09-30
 */
@Controller
@RequestMapping("/student")
public class TableStudentController {

    @Autowired
    private TableStudentService tableStudentService;

    @ResponseBody
    @RequestMapping("list")
    public LayuiTable queryList(){
        List<TableStudentDto> tableStudents = tableStudentService.queryList();
        LayuiTable layuiTable = new LayuiTable();
        layuiTable.setData(tableStudents);
        layuiTable.setCode(0);
        return layuiTable;
    }
}

