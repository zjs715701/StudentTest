package com.student.test.doo;

import com.baomidou.mybatisplus.annotations.TableField;
import lombok.Data;

/**
 * @author ：Super张
 * @date ：Created in 2020/9/30 14:53
 * @description：
 * @modified By：
 * @version:
 */
@Data
public class TableStudentDo {
    private Integer studentId;

    private String studentName;

    private String studentSex;

    private Integer studentAge;

    private String score;
}
