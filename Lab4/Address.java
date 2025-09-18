// Student Name 	: Joseph Lalor
// Student Id Number: 
// Date 			: 16/09/25
// Purpose 			:
public class Address 
{
    private String street;
    private String cityTown;
    private String county;

    public Address()
        {
            setStreet("Unknown");
            setCityTown("Unknown");
            setCounty("Unknown");
        }

    public Address(String street, String cityTown, String county)
        {
            setStreet(street);
            setCityTown(cityTown);
            setCounty(county);
        }

    public String getStreet()
        {
            return street;
        }
    public void setStreet(String street) 
        {
            this.street = street;
        }
    public String getCityTown() 
        {
            return cityTown;
        }
    public void setCityTown(String cityTown) 
        {
            this.cityTown = cityTown;
        }
    public String getCounty() 
        {
            return county;
        }
    public void setCounty(String county) 
        {
            this.county = county;
        }
    public String toString()
        {
            String desc;
            desc = getStreet() + ", " + getCityTown() + ", " + getCityTown();
            return desc;
        }
}
