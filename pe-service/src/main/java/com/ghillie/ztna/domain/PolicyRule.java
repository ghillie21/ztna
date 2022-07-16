package com.ghillie.ztna.domain;

/**
 * 策略规则
 * @author Ghillie
 * 2022/7/11 22:10
 */
public class PolicyRule {
    Subject subject;
    Target target;
    Action action;
    Policy historyPolicy;
    Event triggerEvent;
    /**
     * 决策策略
     */
    PolicyRule decisionStrategy;
}
