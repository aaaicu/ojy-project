package kr.co.ojy.common.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@NoArgsConstructor
public class Worship extends BaseEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "WORSHIP_ID")
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "CHURCH_ID")
    private Church church;

    @OneToMany(mappedBy = "worship", fetch = FetchType.LAZY)
    private List<Bulletin> bulletin = new ArrayList<>();

}


