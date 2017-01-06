package com.dalonedrow.rpg.constants;

/**
 * @author drau
 */
public enum DamageType {
    /** acid. */
    DAMAGE_TYPE_ACID(1),
    /** cold. */
    DAMAGE_TYPE_COLD(1 << 1),
    /** drain life. */
    DAMAGE_TYPE_DRAIN_LIFE(1 << 2),
    /** drain mana. */
    DAMAGE_TYPE_DRAIN_MANA(1 << 3),
    /** fake fire. */
    DAMAGE_TYPE_FAKEFIRE(1 << 4),
    /** field? */
    DAMAGE_TYPE_FIELD(1 << 5),
    /** fire. */
    DAMAGE_TYPE_FIRE(1 << 6),
    /** gas. */
    DAMAGE_TYPE_GAS(1 << 7),
    /** generic. */
    DAMAGE_TYPE_GENERIC(0),
    /** lightning. */
    DAMAGE_TYPE_LIGHTNING(1 << 9),
    /** magical. */
    DAMAGE_TYPE_MAGICAL(1 << 10),
    /** metal. */
    DAMAGE_TYPE_METAL(1 << 11),
    /** no fix? */
    DAMAGE_TYPE_NO_FIX(1 << 12),
    /** organic. */
    DAMAGE_TYPE_ORGANIC(1 << 13),
    /** per second. */
    DAMAGE_TYPE_PER_SECOND(1 << 14),
    /** poison. */
    DAMAGE_TYPE_POISON(1 << 15),
    /** push. */
    DAMAGE_TYPE_PUSH(1 << 16),
    /** stone. */
    DAMAGE_TYPE_STONE(1 << 17),
    /** wood. */
    DAMAGE_TYPE_WOOD(1 << 18);
    /** the flag. */
    private final int flag;
    /**
     * Creates a new instance of {@link DamageType}.
     * @param f the flag
     */
    DamageType(final int f) {
        flag = f;
    }
    /**
     * Gets the flag.
     * @return {@link long}
     */
    public int getFlag() {
        return flag;
    }
}
