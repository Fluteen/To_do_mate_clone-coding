package com.example.todo_api.Member_Memberfriends;


import com.example.todo_api.member.Member;
import com.example.todo_api.member_friends.Member_Friends;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Member_member_friends {

    @Id
    private long member_member_friends_id;

    @JoinColumn(name = "member_id")
    @ManyToOne(fetch = FetchType.LAZY)
    private Member member;

    @JoinColumn(name="f_member_id")
    @ManyToOne(fetch = FetchType.LAZY)
    private Member_Friends member_friends;

    public Member_member_friends(Member member, Member_Friends member_friends) {
        this.member = member;
        this.member_friends = member_friends;
    }
}
