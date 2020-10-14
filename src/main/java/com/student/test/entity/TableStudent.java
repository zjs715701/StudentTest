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
@TableName("table_student")
public class TableStudent extends Model<TableStudent> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "student_id", type = IdType.AUTO)
    private Integer studentId;
    @TableField("student_name")
    private String studentName;
    @TableField("student_sex")
    private String studentSex;
    @TableField("student_age")
    private Integer studentAge;

    private TableScore tableScore;

    @Override
    public String toString() {
        return "TableStudent{" +
                "studentId=" + studentId +
                ", studentName='" + studentName + '\'' +
                ", studentSex='" + studentSex + '\'' +
                ", studentAge=" + studentAge +
                ", tableScore=" + tableScore +
                '}';
    }

    public TableScore getTableScore() {
        return tableScore;
    }

    public void setTableScore(TableScore tableScore) {
        this.tableScore = tableScore;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentSex() {
        return studentSex;
    }

    public void setStudentSex(String studentSex) {
        this.studentSex = studentSex;
    }

    public Integer getStudentAge() {
        return studentAge;
    }

    public void setStudentAge(Integer studentAge) {
        this.studentAge = studentAge;
    }

    @Override
    protected Serializable pkVal() {
        return this.studentId;
    }


}
