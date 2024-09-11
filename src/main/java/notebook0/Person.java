package notebook0;

public class Person {
    private String nname;
    private String vname;
    private String number;

    public Person(String nname, String vname, String number) {
        this.nname = nname;
        this.vname = vname;
        this.number = number;
    }

    public String getNname() {
        return nname;
    }

    public void setNname(String nname) {
        this.nname = nname;
    }

    public String getVname() {
        return vname;
    }

    public void setVname(String vname) {
        this.vname = vname;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}
