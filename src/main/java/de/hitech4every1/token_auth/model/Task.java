package de.hitech4every1.token_auth.model;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "task")
@Data
@NoArgsConstructor
@RequiredArgsConstructor
@AllArgsConstructor
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @Column(name = "name")
    @NonNull
    private String name;

    @Column(name = "description")
    @NonNull
    private String description;

}
