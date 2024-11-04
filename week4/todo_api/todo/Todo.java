package com.example.todo_api.todo;

import com.example.todo_api.member.Member;
import com.example.todo_api.member_friends.Member_Friends;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor(access= AccessLevel.PROTECTED)    //빈 객체를 만들고 접근하지 않게끔 접근 제한자 만들어줘야함
@Getter //공개적인 서비스를 위해
public class Todo {

    @Id//이게 PK다라는 걸 명시
    @GeneratedValue(strategy = GenerationType.IDENTITY) //아이디값이 자동으로 1이 올라가도록 도와주는 어노테이션 너가 알아서 정해 값은
    @Column(name="todo_id")
    private Long id;
//    mysql bigint=java long

    @Column(name="todo_content",columnDefinition = "varchar(200)")
    private String content;

    @Column(name="todo_is_checked",columnDefinition = "tinyint(1)")
    private boolean is_checked;

    @JoinColumn(name = "member_id")
    @ManyToOne(fetch = FetchType.LAZY)
    private Member member;

    @JoinColumn(name = "f_member_id")
    @ManyToOne(fetch = FetchType.LAZY)
    private Member_Friends member_friends;

    public Todo(String content, boolean is_checked, Member member) {
        this.content = content;
        this.is_checked = is_checked;
        this.member = member;
    }


    //id를 제외한 이유: @generatedvalue로 알아서 맡기는거임(생성자로 직접 지정해줄 필요가 없기 때문)
}
