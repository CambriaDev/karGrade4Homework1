package cam.cambria.kg4h1.entity.dao;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

/**
 * @TableName laodongli
 */
@TableName(value = "laodongli")
@Data
public class Laodongli implements Serializable {
    /**
     *
     */
    @TableField(value = "year")
    private String year;

    /**
     *
     */
    @TableField(value = "population10k")
    private Integer population10K;

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
        Laodongli other = (Laodongli) that;
        return (this.getYear() == null ? other.getYear() == null : this.getYear().equals(other.getYear()))
                && (this.getPopulation10K() == null ? other.getPopulation10K() == null : this.getPopulation10K().equals(other.getPopulation10K()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getYear() == null) ? 0 : getYear().hashCode());
        result = prime * result + ((getPopulation10K() == null) ? 0 : getPopulation10K().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", year=").append(year);
        sb.append(", population_10k=").append(population10K);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}