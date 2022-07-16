package com.ghillie.ztna.domain;

import lombok.Data;

import java.util.List;

/**
 * 属性
 * @author Ghillie
 * 2022/7/11 21:47
 */
@Data
public class Attribute {
    List<AttributeVariable> attributeVariables;
}
