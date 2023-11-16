package swe_group_11.pethealthmanager.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Data
@Entity
@Table(name = "health_records")
public class HealthRecord {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "pet_id", nullable = false)
    private Long petId;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "record_date", nullable = false)
    private Date recordDate;

    @Column(nullable = false)
    private String diagnosis;


}
