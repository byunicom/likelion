package com.example.mssql;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name="b_item")
@Getter
@Setter
@NoArgsConstructor
@ToString
public class Mssql {
    @Id
    @Column(name="item_cd")
    private String itemCd;

    @Column(name="item_nm")
    private String itemNm;

    @Column(name="spec")
    private String spec;
}
