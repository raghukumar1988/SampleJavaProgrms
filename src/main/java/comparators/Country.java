package comparators;

public class Country implements Comparable<Country> {
	int countryId;
	String countyrName;

	public int getCountryId() {
		return countryId;
	}

	public void setCountryId(int countryId) {
		this.countryId = countryId;
	}

	public String getCountyrName() {
		return countyrName;
	}

	public void setCountyrName(String countyrName) {
		this.countyrName = countyrName;
	}

	public Country(int id, String name) {
		this.countryId = id;
		this.countyrName = name;
	}

/*	@Override
	public int compareTo(Country o) {
		if (this.countryId < o.countryId)
			return -1;
		else if (this.countryId > o.countryId)
			return 1;
		else
			return 0;
	}*/

	@Override
	public int compareTo(Country o) {
		System.out.println("Inside new comparable");
		return this.getCountryId()-o.getCountryId();
	}
	
	//for String comparison use lang provided compareTo Implementation
/*	@Override
	public int compareTo(Country o) {
		return this.getCountyrName().compareTo(o.getCountyrName());

	}*/
	
	@Override
	public String toString() {
		return this.countryId+" "+this.countyrName;
	}

}
