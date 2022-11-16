package cn.ustcsse.basic.domain;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.time.LocalDateTime;

@ApiModel(value="cn-ustcsse-basic-domain-Room")
public class Room implements Serializable {
    /**
    * 房间ID

    */
    @ApiModelProperty(value="房间ID,")
    private Long roomID;

    /**
    * 房间名称
    */
    @ApiModelProperty(value="房间名称")
    private String roomName;

    /**
    * 房间创建时间
    */
    @ApiModelProperty(value="房间创建时间")
    private LocalDateTime time;

    /**
    * 每个房间对应一个课程
    */
    @ApiModelProperty(value="每个房间对应一个课程")
    private Long courseID;

    /**
    * 每个房间对应一位教师
    */
    @ApiModelProperty(value="每个房间对应一位教师")
    private Long teacherID;

    private static final long serialVersionUID = 1L;

    public Long getRoomID() {
        return roomID;
    }

    public void setRoomID(Long roomID) {
        this.roomID = roomID;
    }

    public String getRoomName() {
        return roomName;
    }

    public void setRoomName(String roomName) {
        this.roomName = roomName == null ? null : roomName.trim();
    }

    public LocalDateTime getTime() {
        return time;
    }

    public void setTime(LocalDateTime time) {
        this.time = time;
    }

    public Long getCourseID() {
        return courseID;
    }

    public void setCourseID(Long courseID) {
        this.courseID = courseID;
    }

    public Long getTeacherID() {
        return teacherID;
    }

    public void setTeacherID(Long teacherID) {
        this.teacherID = teacherID;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", roomID=").append(roomID);
        sb.append(", roomName=").append(roomName);
        sb.append(", time=").append(time);
        sb.append(", courseID=").append(courseID);
        sb.append(", teacherID=").append(teacherID);
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
        Room other = (Room) that;
        return (this.getRoomID() == null ? other.getRoomID() == null : this.getRoomID().equals(other.getRoomID()))
            && (this.getRoomName() == null ? other.getRoomName() == null : this.getRoomName().equals(other.getRoomName()))
            && (this.getTime() == null ? other.getTime() == null : this.getTime().equals(other.getTime()))
            && (this.getCourseID() == null ? other.getCourseID() == null : this.getCourseID().equals(other.getCourseID()))
            && (this.getTeacherID() == null ? other.getTeacherID() == null : this.getTeacherID().equals(other.getTeacherID()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getRoomID() == null) ? 0 : getRoomID().hashCode());
        result = prime * result + ((getRoomName() == null) ? 0 : getRoomName().hashCode());
        result = prime * result + ((getTime() == null) ? 0 : getTime().hashCode());
        result = prime * result + ((getCourseID() == null) ? 0 : getCourseID().hashCode());
        result = prime * result + ((getTeacherID() == null) ? 0 : getTeacherID().hashCode());
        return result;
    }
}