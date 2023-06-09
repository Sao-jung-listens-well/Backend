package com.Saojung.whatisthis.domain;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.*;

@Entity
@Getter
@Builder
public class Amends {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idx;
    private String amends;
    @NotNull
    private Integer goal;
    @NotNull
    private Integer remain;

    public Amends() {
        this.amends = null;
        this.goal = 0;
        this.remain = 0;
    }

    public Amends(Long idx, String amends, @NonNull Integer goal, @NonNull Integer remain) {
        this.idx = idx;
        this.amends = amends;
        this.goal = goal;
        this.remain = remain;
    }
}
