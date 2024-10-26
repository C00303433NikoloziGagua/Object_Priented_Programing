public class address {
    private String streat;
    private String city;
    private String county;

    public address(String streat, String city, String county) {
        this.streat = streat;
        this.city = city;
        this.county = county;
    }

    public String getstreat() {
        return streat;
    }

    public void setstreat(String streat) {
        this.streat = streat;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCounty() {
        return county;
    }

    public void setCounty(String county) {
        this.county = county;
    }

    @Override
    public String toString() {
        
        return "streat: " + streat + "\nCity: " + city + "\nCounty" + county;
    }
    

    
}
