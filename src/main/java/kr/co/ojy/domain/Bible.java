package kr.co.ojy.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Getter
@NoArgsConstructor
public class Bible {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "BIBLE_ID")
    private Long id;

    @Column(name = "CHAPTER")
    private Integer chapter;

    @Column(name = "VERSE")
    private Integer verse;

    @Column(name = "CONTENT")
    private String content;
}
