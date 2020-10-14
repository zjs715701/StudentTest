package com.student.test.dao;

import com.student.test.entity.TableScore;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

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
public interface TableScoreDao extends BaseMapper<TableScore> {

}
