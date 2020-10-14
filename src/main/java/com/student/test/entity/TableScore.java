package com.student.test.entity;

import com.baomidou.mybatisplus.enums.IdType;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author DaoChen
 * @since 2020-09-30
 */
@TableName("table_score")
public class TableScore extends Model<TableScore> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "score_id", type = IdType.AUTO)
    private Integer scoreId;
    private String score;
    @TableField("student_id")
    private Integer studentId;


    public Integer getScoreId() {
        return scoreId;
    }

    public void setScoreId(Integer scoreId) {
        this.scoreId = scoreId;
    }

    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score;
    }

    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    @Override
    protected Serializable pkVal() {
        return this.scoreId;
    }

    @Override
    public String toString() {
        return "TableScore{" +
        "scoreId=" + scoreId +
        ", score=" + score +
        ", studentId=" + studentId +
        "}";
    }
}
