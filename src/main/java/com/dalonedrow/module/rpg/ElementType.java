package com.dalonedrow.module.rpg;

public enum ElementType {
    ELEMENT_COMBAT_SKILL(0),
    ELEMENT_ENDURANCE(1),
    ELEMENT_POISON_WOUNDS(4),
    ELEMENT_WEALTH(2),
    ELEMENT_WIT_AND_WILES(5),
    ELEMENT_WOUNDS(3);
    private int value;
    ElementType(final int val) {
        value = val;
    }
}
