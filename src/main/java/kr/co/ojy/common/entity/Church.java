package kr.co.ojy.common.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@NoArgsConstructor
public class Church extends BaseEntity{
    @Id
    @Column(name = "CHURCH_ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @Column(name = "NAME")
    String name;

    @Column(name = "MOTTO")
    String motto;

    @OneToMany(mappedBy = "church")
    List<Worship> worships = new ArrayList<>();
}

