package com.ghillie.ztna.domain;

import java.util.List;

/**
 * 策略
 * @author Ghillie
 * 2022/7/11 22:10
 */
public class Policy {
    List<PolicyRule> rules;
    /**
     * 决策效果
     * true-肯定 false-否定
     */
    boolean decisionEffect;
}
