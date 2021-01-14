package com.haust.springcloud.pojo;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * @Auther: csp1999
 * @Date: 2020/05/17/20:45
 * @Description: 部门实体类
 */
@Data
@NoArgsConstructor
@Accessors(chain = true)
public class Dept implements Serializable {

    private Long deptno;//主键
    private String dname;

    //表示：存在哪个数据库的字段,一个服务对应一个数据库,同一个信息可能存在不同的数据库
    private String db_source;

    public Dept(String dname) {
        this.dname = dname;
    }

}
