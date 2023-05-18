package coreconcepts.equalsAndOveride;

import lombok.Getter;
import lombok.Setter;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

@Getter
@Setter
public class Tiger {
    private String color;
    private String stripePattern;
    private int height; // this field was not considered for equals and hashcode


    // impl by apache lang 3
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tiger tiger = (Tiger) o;
        return new EqualsBuilder().append(color, tiger.color).append(stripePattern, tiger.stripePattern).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(color).append(stripePattern).toHashCode();
    }


    // impl by jdk 1.7
    /*@Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tiger tiger = (Tiger) o;
        return color.equals(tiger.color) && stripePattern.equals(tiger.stripePattern);
    }

    @Override
    public int hashCode() {
        return Objects.hash(color, stripePattern);
    }*/

    // Impl by custom
/*@Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((color == null) ? 0 : color.hashCode());
        result = prime * result + height;
        result = prime * result + ((stripePattern == null) ? 0 : stripePattern.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Tiger other = (Tiger) obj;
        if (color == null) {
            if (other.color != null)
                return false;
        } else if (!color.equals(other.color))
            return false;
        if (height != other.height)
            return false;
        if (stripePattern == null) {
			return other.stripePattern == null;
        } else {
			return stripePattern.equals(other.stripePattern);
		}
	}*/


}
