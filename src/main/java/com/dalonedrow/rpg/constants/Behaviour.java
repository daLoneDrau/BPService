package com.dalonedrow.rpg.constants;

/**
 * @author drau
 */
public enum Behaviour {
    /** distant. */
    BEHAVIOUR_DISTANT(1 << 9),
    /** fight. */
    BEHAVIOUR_FIGHT(1 << 8),
    /** flee. */
    BEHAVIOUR_FLEE(1 << 4),
    /** friendly. */
    BEHAVIOUR_FRIENDLY(1 << 1),
    /** go home. */
    BEHAVIOUR_GO_HOME(1 << 12),
    /** guard. */
    BEHAVIOUR_GUARD(1 << 11),
    /** hide. */
    BEHAVIOUR_HIDE(1 << 5),
    /** look around. */
    BEHAVIOUR_LOOK_AROUND(1 << 13),
    /** look for. */
    BEHAVIOUR_LOOK_FOR(1 << 6),
    /** magic. */
    BEHAVIOUR_MAGIC(1 << 10),
    /** move to. */
    BEHAVIOUR_MOVE_TO(1 << 2),
    /** none. */
    BEHAVIOUR_NONE(1),
    /** sneak. */
    BEHAVIOUR_SNEAK(1 << 7),
    /** stare at. */
    BEHAVIOUR_STARE_AT(1 << 14),
    /** wander around. */
    BEHAVIOUR_WANDER_AROUND(1 << 3);
    /** the flag. */
    private final int flag;
    /**
     * Creates a new instance of {@link Behaviour}.
     * @param f the flag
     */
    Behaviour(final int f) {
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
