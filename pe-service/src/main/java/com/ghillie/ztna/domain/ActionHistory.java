package com.ghillie.ztna.domain;

import lombok.Data;

/**
 * 操作历史
 * @author Ghillie
 * 2022/7/11 21:47
 */
@Data
public class ActionHistory {
    String executeTime;
    Action action;
    Subject subject;
    Target target;
}
