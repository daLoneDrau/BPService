package com.dalonedrow.rpg.constants;

/**
 * @author drau
 */
public enum EquipmentSlot {
    /** weapon slot. */
    EQUIP_SLOT_WEAPON(1);
    /** the value. */
    private final int value;
    /**
     * Creates a new instance of {@link EquipmentSlot}.
     * @param val the flag
     */
    EquipmentSlot(final int val) {
        value = val;
    }
    /**
     * Gets the value.
     * @return {@link long}
     */
    public int getValue() {
        return value;
    }
}
