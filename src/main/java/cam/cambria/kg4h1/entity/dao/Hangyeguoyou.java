package cam.cambria.kg4h1.entity.dao;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

/**
 * @TableName hangyeguoyou
 */
@TableName(value = "hangyeguoyou")
@Data
public class Hangyeguoyou implements Serializable {
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

    /**
     *
     */
    @TableField(value = "C13")
    private Integer c13;

    /**
     *
     */
    @TableField(value = "C14")
    private Integer c14;

    /**
     *
     */
    @TableField(value = "C15")
    private Integer c15;

    /**
     *
     */
    @TableField(value = "C16")
    private Integer c16;

    /**
     *
     */
    @TableField(value = "C17")
    private Integer c17;

    /**
     *
     */
    @TableField(value = "C18")
    private Integer c18;

    /**
     *
     */
    @TableField(value = "C19")
    private Integer c19;

    /**
     *
     */
    @TableField(value = "C20")
    private Integer c20;

    /**
     *
     */
    @TableField(value = "C21")
    private Integer c21;

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
        Hangyeguoyou other = (Hangyeguoyou) that;
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
                && (this.getC12() == null ? other.getC12() == null : this.getC12().equals(other.getC12()))
                && (this.getC13() == null ? other.getC13() == null : this.getC13().equals(other.getC13()))
                && (this.getC14() == null ? other.getC14() == null : this.getC14().equals(other.getC14()))
                && (this.getC15() == null ? other.getC15() == null : this.getC15().equals(other.getC15()))
                && (this.getC16() == null ? other.getC16() == null : this.getC16().equals(other.getC16()))
                && (this.getC17() == null ? other.getC17() == null : this.getC17().equals(other.getC17()))
                && (this.getC18() == null ? other.getC18() == null : this.getC18().equals(other.getC18()))
                && (this.getC19() == null ? other.getC19() == null : this.getC19().equals(other.getC19()))
                && (this.getC20() == null ? other.getC20() == null : this.getC20().equals(other.getC20()))
                && (this.getC21() == null ? other.getC21() == null : this.getC21().equals(other.getC21()));
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
        result = prime * result + ((getC13() == null) ? 0 : getC13().hashCode());
        result = prime * result + ((getC14() == null) ? 0 : getC14().hashCode());
        result = prime * result + ((getC15() == null) ? 0 : getC15().hashCode());
        result = prime * result + ((getC16() == null) ? 0 : getC16().hashCode());
        result = prime * result + ((getC17() == null) ? 0 : getC17().hashCode());
        result = prime * result + ((getC18() == null) ? 0 : getC18().hashCode());
        result = prime * result + ((getC19() == null) ? 0 : getC19().hashCode());
        result = prime * result + ((getC20() == null) ? 0 : getC20().hashCode());
        result = prime * result + ((getC21() == null) ? 0 : getC21().hashCode());
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
        sb.append(", c13=").append(c13);
        sb.append(", c14=").append(c14);
        sb.append(", c15=").append(c15);
        sb.append(", c16=").append(c16);
        sb.append(", c17=").append(c17);
        sb.append(", c18=").append(c18);
        sb.append(", c19=").append(c19);
        sb.append(", c20=").append(c20);
        sb.append(", c21=").append(c21);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}