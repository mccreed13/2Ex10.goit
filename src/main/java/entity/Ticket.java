package entity;

import jakarta.persistence.*;

import java.sql.Timestamp;

public class Ticket {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "created_at")
    private Timestamp created_at;
    @Column(name = "client_id")
    private Long client_id;
    @Column(name = "from_planet_id")
    private Long from_planet_id;
    @Column(name = "to_planet_id")
    private Long to_planet_id;

    public Ticket(Long id, Timestamp created_at, Long client_id, Long from_planet_id, Long to_planet_id) {
        this.id = id;
        this.created_at = created_at;
        this.client_id = client_id;
        this.from_planet_id = from_planet_id;
        this.to_planet_id = to_planet_id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Timestamp getCreated_at() {
        return created_at;
    }

    public void setCreated_at(Timestamp created_at) {
        this.created_at = created_at;
    }

    public Long getClient_id() {
        return client_id;
    }

    public void setClient_id(Long client_id) {
        this.client_id = client_id;
    }

    public Long getFrom_planet_id() {
        return from_planet_id;
    }

    public void setFrom_planet_id(Long from_planet_id) {
        this.from_planet_id = from_planet_id;
    }

    public Long getTo_planet_id() {
        return to_planet_id;
    }

    public void setTo_planet_id(Long to_planet_id) {
        this.to_planet_id = to_planet_id;
    }

    @Override
    public String toString() {
        return "entity.Ticket{" +
                "id=" + id +
                ", created_at=" + created_at +
                ", client_id=" + client_id +
                ", from_planet_id=" + from_planet_id +
                ", to_planet_id=" + to_planet_id +
                '}';
    }
}
