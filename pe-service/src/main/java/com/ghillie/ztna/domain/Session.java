package com.ghillie.ztna.domain;

import lombok.Data;

/**
 * 会话
 * @author Ghillie
 * 2022/7/11 21:47
 */
@Data
public class Session {
    Group group;
    Subject subject;
    Target target;
    Action action;
}

