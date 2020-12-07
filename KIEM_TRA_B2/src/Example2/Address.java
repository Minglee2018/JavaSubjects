package Example2;

import Example2.Address;

public class Address {
	//Constants -1 
	public static final String CITYNAME="No CityName";
	public static final String DISTRICTNAME="No DistrictName";
	public static final String STREETNAME="No StreetName";
	//Object's Properties
	private String cityName;
	private String districtName;
	private String streetName;
	
	//Constructor Methos -2
	public Address() {
		this(Address.CITYNAME,Address.DISTRICTNAME,Address.STREETNAME);
	}
	public Address(String cityName, String districtName, String streetName) {
		this.cityName=cityName;
		this.districtName=districtName;
		this.streetName=streetName;
	}
	//contructor dac biet loai 3
	public Address(Address addr) {
		this(addr.getCityName(),addr.getDistrictName(),addr.getStreetname());
	}
	//Getter Methods -3
	public String getCityName() {
		return this.cityName;
	}
	public String getDistrictName() {
		return this.districtName;
	}
	public String getStreetname() {
		return this.streetName;
	}
	
	//Setter methods -4
	public Address setCityName(String cityName) {
		this.cityName=cityName;
		return this;
	}
	public Address setDistrictName(String districtName) {
		this.districtName=districtName;
		return this;
	}
	public Address setStreetName(String streetName) {
		this.streetName=streetName;
		return this;
	}
	//Other methods -5
	public String toString() {
		return this.cityName+ " "+this.districtName+" "+this.streetName;
	}
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if(obj instanceof Address) {
			return this.cityName.equals(((Address) obj).getCityName()) 
					&& this.districtName.equals(((Address) obj).getDistrictName())
					&& this.streetName.equals(((Address) obj).getStreetname());
		}
		else return false;
	}
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}
	
}