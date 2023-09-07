package cam.cambria.kg4h1.entity.dao;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

/**
 * @TableName jingjixiangcun
 */
@TableName(value = "jingjixiangcun")
@Data
public class Jingjixiangcun implements Serializable {
    /**
     *
     */
    @TableField(value = "C1")
    private String c1;

    /**
     *
     */
    @TableField(value = "C2")
    private Integer c2;

    /**
     *
     */
    @TableField(value = "C3")
    private Integer c3;

    /**
     *
     */
    @TableField(value = "C4")
    private Integer c4;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;

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
        Jingjixiangcun other = (Jingjixiangcun) that;
        return (this.getC1() == null ? other.getC1() == null : this.getC1().equals(other.getC1()))
                && (this.getC2() == null ? other.getC2() == null : this.getC2().equals(other.getC2()))
                && (this.getC3() == null ? other.getC3() == null : this.getC3().equals(other.getC3()))
                && (this.getC4() == null ? other.getC4() == null : this.getC4().equals(other.getC4()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getC1() == null) ? 0 : getC1().hashCode());
        result = prime * result + ((getC2() == null) ? 0 : getC2().hashCode());
        result = prime * result + ((getC3() == null) ? 0 : getC3().hashCode());
        result = prime * result + ((getC4() == null) ? 0 : getC4().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", c1=").append(c1);
        sb.append(", c2=").append(c2);
        sb.append(", c3=").append(c3);
        sb.append(", c4=").append(c4);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}