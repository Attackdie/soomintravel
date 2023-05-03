package soomin.travel.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


import java.time.LocalDateTime;

/*
 * 이수민 개인프로젝트
 * 여행 게시판 DTO
 * @Author 이수민
 * @Date 2023/05/03
 *
 */
@Getter
@Setter
@ToString
public class TravelBoardDTO {

    private Long board_no;
/*    private Member member;*/
    private String category;
    private String title;
    private String content;
    private String memberList;
    private String uploadImg;
    private LocalDateTime board_Date;
    private Integer hit;

}
