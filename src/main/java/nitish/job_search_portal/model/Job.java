package nitish.job_search_portal.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name="jobPortal")
public class Job {
    @Id
    private Long id;

    private String title;
    private String description;
    private String location;

    @Min(20000)
    private Double salary;

    @Email
    private String companyEmail;

    private String companyName;
    private String employerName;

    @Enumerated(EnumType.STRING)
    private Type jobType;
}
