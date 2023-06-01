package com.exam.domain;

import com.baomidou.mybatisplus.annotation.*;

import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 
 * </p>
 *
 * @author jiangzg
 * @since 2023-05-27
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("tbl_book")
public class Book implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    private String type;

    private String name;

    @TableField("`desc`")
    private String desc;

    @TableLogic
    private Boolean deleted;

    @Version
    private Integer version;


}
