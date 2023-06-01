package com.itheima.domain;


import com.baomidou.mybatisplus.annotation.*;
import lombok.*;

//@Setter
//@Getter
//@ToString
//@NoArgsConstructor
//@AllArgsConstructor
@Data
//@TableName("tbl_book") --> application.yml
public class Book {
//    @TableId(type = IdType.ASSIGN_ID) --> application.yml
    private Long id;
    private String type;
    private String name;
    @TableField("`desc`")
    private String description;

//    @TableLogic(value = "0", delval = "1")--> application.yml
    private Integer deleted;

    @Version
    private Integer version;
}
