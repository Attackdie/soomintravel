package soomin.travel.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.DynamicInsert;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Getter
//@Table(name = "")
//@NoArgsConstructor(access = AccessLevel.PROTECTED)
//@SequenceGenerator(
//
//)
@Setter
//@DynamicInsert
public class TravelBoard {

    @Id
//    @GeneratedValue
    @Column
    private Long board_no;
    /*    private Member member;*/
    private String category;
    private String title;
    private String content;
    @Column
    private String memberList;
    @Column
    private String uploadImg;
    @Column
    private LocalDateTime board_Date;
    private Integer hit;
}
