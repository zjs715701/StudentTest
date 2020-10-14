package com.student.test.service;

import com.student.test.doo.TableStudentDo;
import com.student.test.dto.TableStudentDto;
import com.student.test.entity.TableStudent;
import com.baomidou.mybatisplus.service.IService;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author DaoChen
 * @since 2020-09-30
 */
public interface TableStudentService extends IService<TableStudent> {
    List<TableStudentDto> queryList();

}
