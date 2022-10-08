package kr.co.ojy.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Getter
@NoArgsConstructor
public class Bible extends BaseEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "BIBLE_ID")
    private Long id;

    @Column(name = "NAME")
    private String name;

    @Column(name = "SHORT_NAME")
    private String shortName;

    @Column(name = "CHAPTER")
    private Integer chapter;

    @Column(name = "VERSE")
    private Integer verse;

    @Column(name = "CONTENT")
    private String content;

    @Column(name = "BIBLE_VERSION")
    @Enumerated(value = EnumType.STRING)
    private BibleVersion bibleVersion;

}
