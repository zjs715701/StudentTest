package com.student.test.service.impl;

import com.student.test.dao.TableScoreDao;
import com.student.test.doo.TableStudentDo;
import com.student.test.dto.TableStudentDto;
import com.student.test.entity.TableStudent;
import com.student.test.dao.TableStudentDao;
import com.student.test.service.TableStudentService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author DaoChen
 * @since 2020-09-30
 */
@Service
public class TableStudentServiceImpl extends ServiceImpl<TableStudentDao, TableStudent> implements TableStudentService {

    @Autowired
    private TableStudentDao tableStudentDao;

    @Override
    public List<TableStudentDto> queryList() {
        List<TableStudent> tableStudents = tableStudentDao.queryList();
        List<TableStudentDto> list = new ArrayList<>();
        for (TableStudent tableStudent:tableStudents) {
            TableStudentDto dto = new TableStudentDto();
            dto.setScore(tableStudent.getTableScore().getScore());
            dto.setStudentName(tableStudent.getStudentName());
            dto.setStudentAge(tableStudent.getStudentAge());
            dto.setStudentSex(tableStudent.getStudentSex());
            list.add(dto);
        }
        return list;
    }


}
