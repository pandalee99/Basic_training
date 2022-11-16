package cn.ustcsse.basic.domain;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.time.LocalDateTime;

@ApiModel(value="cn-ustcsse-basic-domain-ScoreCount")
public class ScoreCount implements Serializable {
    /**
    * 唯一ID
    */
    @ApiModelProperty(value="唯一ID")
    private Long id;

    /**
    * 不唯一，一个房间可使用多次统计
    */
    @ApiModelProperty(value="不唯一，一个房间可使用多次统计")
    private Long roomID;

    /**
    * 开始统计的时间
    */
    @ApiModelProperty(value="开始统计的时间")
    private LocalDateTime startTime;

    /**
    * 结束统计的时间
    */
    @ApiModelProperty(value="结束统计的时间")
    private LocalDateTime endTime;

    /**
    * 学生总数
    */
    @ApiModelProperty(value="学生总数")
    private Integer studentCount;

    /**
    * 分数1
    */
    @ApiModelProperty(value="分数1")
    private Integer score1;

    /**
    * 分数2
    */
    @ApiModelProperty(value="分数2")
    private Integer score2;

    /**
    * 分数3
    */
    @ApiModelProperty(value="分数3")
    private Integer score3;

    /**
    * 分数4
    */
    @ApiModelProperty(value="分数4")
    private Integer score4;

    /**
    * 分数5
    */
    @ApiModelProperty(value="分数5")
    private Integer score5;

    /**
    * 分数6
    */
    @ApiModelProperty(value="分数6")
    private Integer score6;

    /**
    * 平均分
    */
    @ApiModelProperty(value="平均分")
    private Double averageScore;

    /**
    * 分数方差
    */
    @ApiModelProperty(value="分数方差")
    private Double variance;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getRoomID() {
        return roomID;
    }

    public void setRoomID(Long roomID) {
        this.roomID = roomID;
    }

    public LocalDateTime getStartTime() {
        return startTime;
    }

    public void setStartTime(LocalDateTime startTime) {
        this.startTime = startTime;
    }

    public LocalDateTime getEndTime() {
        return endTime;
    }

    public void setEndTime(LocalDateTime endTime) {
        this.endTime = endTime;
    }

    public Integer getStudentCount() {
        return studentCount;
    }

    public void setStudentCount(Integer studentCount) {
        this.studentCount = studentCount;
    }

    public Integer getScore1() {
        return score1;
    }

    public void setScore1(Integer score1) {
        this.score1 = score1;
    }

    public Integer getScore2() {
        return score2;
    }

    public void setScore2(Integer score2) {
        this.score2 = score2;
    }

    public Integer getScore3() {
        return score3;
    }

    public void setScore3(Integer score3) {
        this.score3 = score3;
    }

    public Integer getScore4() {
        return score4;
    }

    public void setScore4(Integer score4) {
        this.score4 = score4;
    }

    public Integer getScore5() {
        return score5;
    }

    public void setScore5(Integer score5) {
        this.score5 = score5;
    }

    public Integer getScore6() {
        return score6;
    }

    public void setScore6(Integer score6) {
        this.score6 = score6;
    }

    public Double getAverageScore() {
        return averageScore;
    }

    public void setAverageScore(Double averageScore) {
        this.averageScore = averageScore;
    }

    public Double getVariance() {
        return variance;
    }

    public void setVariance(Double variance) {
        this.variance = variance;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", roomID=").append(roomID);
        sb.append(", startTime=").append(startTime);
        sb.append(", endTime=").append(endTime);
        sb.append(", studentCount=").append(studentCount);
        sb.append(", score1=").append(score1);
        sb.append(", score2=").append(score2);
        sb.append(", score3=").append(score3);
        sb.append(", score4=").append(score4);
        sb.append(", score5=").append(score5);
        sb.append(", score6=").append(score6);
        sb.append(", averageScore=").append(averageScore);
        sb.append(", variance=").append(variance);
        sb.append("]");
        return sb.toString();
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        ScoreCount other = (ScoreCount) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getRoomID() == null ? other.getRoomID() == null : this.getRoomID().equals(other.getRoomID()))
            && (this.getStartTime() == null ? other.getStartTime() == null : this.getStartTime().equals(other.getStartTime()))
            && (this.getEndTime() == null ? other.getEndTime() == null : this.getEndTime().equals(other.getEndTime()))
            && (this.getStudentCount() == null ? other.getStudentCount() == null : this.getStudentCount().equals(other.getStudentCount()))
            && (this.getScore1() == null ? other.getScore1() == null : this.getScore1().equals(other.getScore1()))
            && (this.getScore2() == null ? other.getScore2() == null : this.getScore2().equals(other.getScore2()))
            && (this.getScore3() == null ? other.getScore3() == null : this.getScore3().equals(other.getScore3()))
            && (this.getScore4() == null ? other.getScore4() == null : this.getScore4().equals(other.getScore4()))
            && (this.getScore5() == null ? other.getScore5() == null : this.getScore5().equals(other.getScore5()))
            && (this.getScore6() == null ? other.getScore6() == null : this.getScore6().equals(other.getScore6()))
            && (this.getAverageScore() == null ? other.getAverageScore() == null : this.getAverageScore().equals(other.getAverageScore()))
            && (this.getVariance() == null ? other.getVariance() == null : this.getVariance().equals(other.getVariance()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getRoomID() == null) ? 0 : getRoomID().hashCode());
        result = prime * result + ((getStartTime() == null) ? 0 : getStartTime().hashCode());
        result = prime * result + ((getEndTime() == null) ? 0 : getEndTime().hashCode());
        result = prime * result + ((getStudentCount() == null) ? 0 : getStudentCount().hashCode());
        result = prime * result + ((getScore1() == null) ? 0 : getScore1().hashCode());
        result = prime * result + ((getScore2() == null) ? 0 : getScore2().hashCode());
        result = prime * result + ((getScore3() == null) ? 0 : getScore3().hashCode());
        result = prime * result + ((getScore4() == null) ? 0 : getScore4().hashCode());
        result = prime * result + ((getScore5() == null) ? 0 : getScore5().hashCode());
        result = prime * result + ((getScore6() == null) ? 0 : getScore6().hashCode());
        result = prime * result + ((getAverageScore() == null) ? 0 : getAverageScore().hashCode());
        result = prime * result + ((getVariance() == null) ? 0 : getVariance().hashCode());
        return result;
    }
}