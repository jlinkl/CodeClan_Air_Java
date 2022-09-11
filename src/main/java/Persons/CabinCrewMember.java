package Persons;

public class CabinCrewMember extends Person {

    protected JobRank jobRank;

    public CabinCrewMember(String name, JobRank jobRank) {
        super(name);
        this.jobRank = jobRank;
    }

    public JobRank getJobRank() {
        return jobRank;
    }

    public String relayMessage(String message) {
        return this.jobRank + "speaking, " + message;
    }
}
