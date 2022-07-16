package com.ghillie.ztna.domain;

import lombok.Data;

/**
 * 执行条件
 * @author Ghillie
 * 2022/7/11 21:47
 */
@Data
public class ExecuteCondition {
    SAttribute sAttribute;
    TAttribute tAttribute;
    SEAttribute seAttribute;
}
