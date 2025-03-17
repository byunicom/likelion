package com.example.unierp5.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Table(name="b_item")
@Getter
@Setter
@NoArgsConstructor
public class Unierp5 {
    @Id
    @Column(name="item_cd")
    private String itemCd;

    @Column(name="item_nm")
    private String itemNm;

    @Column(name="spec")
    private String spec;

    @Column(name="item_acct")
    private String itemAcct;

    @Column(name="item_class")
    private String itemClass;

    @Column(name="hs_cd")
    private String hsCd;

    @Column(name="hs_unit")
    private String hsUnit;

    @Column(name="unit_weight")
    private Double unitWeight;

    @Column(name="unit_of_weight")
    private String unitOfWeight;

    @Column(name="basic_unit")
    private String basicUnit;

    @Column(name="phantom_flg")
    private String phantomFlg;

    @Column(name="draw_no")
    private String drawNo;

    @Column(name="item_image_flg")
    private String itemImageFlg;

    @Column(name="blanket_pur_flg")
    private String blanketPurFlg;

    @Column(name="base_item_cd")
    private String baseItemCd;

    @Column(name="item_group_cd")
    private String itemGroupCd;

    @Column(name="proportion_rate")
    private Double proportionRate;

    @Column(name="valid_flg")
    private String validFlg;

    @Column(name="valid_from_dt")
    private LocalDateTime validFromDt;

    @Column(name="valid_to_dt")
    private LocalDateTime validToDt;

    @Column(name="insrt_user_id")
    private String insrtUserId;

    @Column(name="insrt_dt")
    private LocalDateTime insrtDt;

    @Column(name="updt_user_id")
    private String updtUserId;

    @Column(name="updt_dt")
    private LocalDateTime updtDt;

    @Column(name="vat_type")
    private String vatType;

    @Column(name="vat_rate")
    private Double vatRate;

    @Column(name="tax_code")
    private String taxCode;

    @Column(name="class_flg")
    private String classFlg;

    @Column(name="class_cd")
    private String classCd;

    @Column(name="char_value_cd1")
    private String charValueCd1;

    @Column(name="char_value_cd2")
    private String charValueCd2;

    @Column(name="gross_weight")
    private Double grossWeight;

    @Column(name="gross_unit")
    private String grossUnit;

    @Column(name="cbm")
    private Double cbm;

    @Column(name="cbm_description")
    private String cbmDescription;

    @Column(name="ext1_cd")
    private String ext1Cd;

    @Column(name="ext1_qty")
    private Double ext1Qty;

    @Column(name="ext1_amt")
    private Double ext1Amt;

    @Column(name="ext1_rt")
    private Double ext1Rt;

    @Column(name="ext2_cd")
    private String ext2Cd;

    @Column(name="ext2_qty")
    private Double ext2Qty;

    @Column(name="ext2_amt")
    private Double ext2Amt;

    @Column(name="ext2_rt")
    private Double ext2Rt;

    @Column(name="ext3_cd")
    private String ext3Cd;

    @Column(name="ext3_qty")
    private Double ext3Qty;

    @Column(name="ext3_amt")
    private Double ext3Amt;

    @Column(name="ext3_rt")
    private Double ext3Rt;

    @Column(name="acct_class")
    private String acctClass;

    @Column(name="class1")
    private String class1;

    @Column(name="class2")
    private String class2;

    @Column(name="serial_cd")
    private String serialCd;

    @Column(name="rgst_co_cd")
    private String rgstCoCd;

    @Column(name="item_nm_eng")
    private String itemNmEng;

    @Column(name="sa_item_flag")
    private String saItemFlag;

    @Column(name="chrg_disb_flag")
    private String chrgDisbFlag;

    @Column(name="type")
    private String type;
}
