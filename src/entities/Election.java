package entities;

import java.time.LocalDate;
import java.util.UUID;

public class Election extends Entity {
    private String election_code;
    private Candidate candidate;
    private LocalDate startDate;
    private LocalDate endDate;
    private Voter voter;

    public Election(UUID election_id, String election_code, Candidate candidate, LocalDate startDate, LocalDate endDate, Voter voter) {
        this.election_code = election_code;
        this.candidate = candidate;
        this.startDate = startDate;
        this.endDate = endDate;
        this.voter = voter;

    }
    public void setElectionCode(String election_code){this.election_code=election_code;}
    public String getElectionCode() {
        return election_code;
    }
}