package com.untacstore.modules.review;

import com.untacstore.modules.account.Account;
import com.untacstore.modules.store.Store;
import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Getter @Setter @EqualsAndHashCode(of = "id")
@NoArgsConstructor @AllArgsConstructor
public class Reply {
    @Id @GeneratedValue
    private Long id;

    private String content;

    @ManyToOne
    private Review review; //원글

    @OneToOne
    private Account account;

    @OneToOne
    private Store store;

    private LocalDateTime replyAt;

    private Integer likeReply = 0;
}
