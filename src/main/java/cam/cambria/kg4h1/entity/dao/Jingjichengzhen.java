package cam.cambria.kg4h1.entity.dao;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

/**
 * @TableName jingjichengzhen
 */
@TableName(value = "jingjichengzhen")
@Data
public class Jingjichengzhen implements Serializable {
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

    /**
     *
     */
    @TableField(value = "C5")
    private Integer c5;

    /**
     *
     */
    @TableField(value = "C6")
    private Integer c6;

    /**
     *
     */
    @TableField(value = "C7")
    private Integer c7;

    /**
     *
     */
    @TableField(value = "C8")
    private Integer c8;

    /**
     *
     */
    @TableField(value = "C9")
    private Integer c9;

    /**
     *
     */
    @TableField(value = "C10")
    private Integer c10;

    /**
     *
     */
    @TableField(value = "C11")
    private Integer c11;

    /**
     *
     */
    @TableField(value = "C12")
    private Integer c12;

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
        Jingjichengzhen other = (Jingjichengzhen) that;
        return (this.getC1() == null ? other.getC1() == null : this.getC1().equals(other.getC1()))
                && (this.getC2() == null ? other.getC2() == null : this.getC2().equals(other.getC2()))
                && (this.getC3() == null ? other.getC3() == null : this.getC3().equals(other.getC3()))
                && (this.getC4() == null ? other.getC4() == null : this.getC4().equals(other.getC4()))
                && (this.getC5() == null ? other.getC5() == null : this.getC5().equals(other.getC5()))
                && (this.getC6() == null ? other.getC6() == null : this.getC6().equals(other.getC6()))
                && (this.getC7() == null ? other.getC7() == null : this.getC7().equals(other.getC7()))
                && (this.getC8() == null ? other.getC8() == null : this.getC8().equals(other.getC8()))
                && (this.getC9() == null ? other.getC9() == null : this.getC9().equals(other.getC9()))
                && (this.getC10() == null ? other.getC10() == null : this.getC10().equals(other.getC10()))
                && (this.getC11() == null ? other.getC11() == null : this.getC11().equals(other.getC11()))
                && (this.getC12() == null ? other.getC12() == null : this.getC12().equals(other.getC12()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getC1() == null) ? 0 : getC1().hashCode());
        result = prime * result + ((getC2() == null) ? 0 : getC2().hashCode());
        result = prime * result + ((getC3() == null) ? 0 : getC3().hashCode());
        result = prime * result + ((getC4() == null) ? 0 : getC4().hashCode());
        result = prime * result + ((getC5() == null) ? 0 : getC5().hashCode());
        result = prime * result + ((getC6() == null) ? 0 : getC6().hashCode());
        result = prime * result + ((getC7() == null) ? 0 : getC7().hashCode());
        result = prime * result + ((getC8() == null) ? 0 : getC8().hashCode());
        result = prime * result + ((getC9() == null) ? 0 : getC9().hashCode());
        result = prime * result + ((getC10() == null) ? 0 : getC10().hashCode());
        result = prime * result + ((getC11() == null) ? 0 : getC11().hashCode());
        result = prime * result + ((getC12() == null) ? 0 : getC12().hashCode());
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
        sb.append(", c5=").append(c5);
        sb.append(", c6=").append(c6);
        sb.append(", c7=").append(c7);
        sb.append(", c8=").append(c8);
        sb.append(", c9=").append(c9);
        sb.append(", c10=").append(c10);
        sb.append(", c11=").append(c11);
        sb.append(", c12=").append(c12);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}