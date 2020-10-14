package com.student.test.dao;


import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.student.test.doo.TableStudentDo;
import com.student.test.entity.TableStudent;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author DaoChen
 * @since 2020-09-30
 */
@Repository
@Mapper
public interface TableStudentDao extends BaseMapper<TableStudent> {
    List<TableStudent> queryList();
}
