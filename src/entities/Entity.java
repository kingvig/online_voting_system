package entities;

import java.util.UUID;

public abstract class Entity {
    protected UUID user_id;
    protected UUID election_id;
    public UUID getUserId() {
        return user_id;
    }
    public UUID getElectionId() {
        return election_id;
    }
}
