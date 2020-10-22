package equalsAndOveride;

public class Tiger {
	private String color;
	private String stripePattern;
	private int height;
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getStripePattern() {
		return stripePattern;
	}
	public void setStripePattern(String stripePattern) {
		this.stripePattern = stripePattern;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}

	@Override
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
			if (other.stripePattern != null)
				return false;
		} else if (!stripePattern.equals(other.stripePattern))
			return false;
		return true;
	}
	
	
}
