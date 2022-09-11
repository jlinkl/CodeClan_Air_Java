package Persons;

public class Pilot extends CabinCrewMember{
    private String licence;

    public Pilot(String name, JobRank jobRank, String licence) {
        super(name, jobRank);
        this.licence = licence;
    }

    public String getLicence() {
        return licence;
    }
}
