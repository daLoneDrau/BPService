/**
 *
 */
package com.dalonedrow.engine.systems;

import com.dalonedrow.rpg.flyweights.BaseInteractiveObject;
import com.dalonedrow.rpg.flyweights.RPGException;

/**
 * @author drau
 * @param <IO>
 */
@SuppressWarnings("rawtypes")
public abstract class ProjectConstants<IO extends BaseInteractiveObject> {
    /** the one and only instance of the <code>ProjectConstants</code> class. */
    private static ProjectConstants instance;
    /**
     * Gives access to the singleton instance of {@link ProjectConstants}.
     * @return {@link ProjectConstants}
     * @throws RPGException if an error occurs
     */
    public static ProjectConstants getInstance() throws RPGException {
        return ProjectConstants.instance;
    }
    /**
     * Creates a new instance of {@link ProjectConstants}.
     */
    protected ProjectConstants() {}
    /**
     * Gets the maximum number of equipment slots.
     * @return {@link int}
     */
    public abstract int getMaxEquipped();
    /**
     * Gets the maximum number of spells.
     * @return {@link int}
     */
    public abstract int getMaxSpells();
    public abstract int getNumberEquipmentElements();
    /**
     * Gets the reference id of the player.
     * @return {@link int}
     * @throws RPGException if an error occurs
     */
    public abstract int getPlayer() throws RPGException;
    /**
     * Sets the global instance.
     * @param value the instance
     */
    protected final void setInstance(final ProjectConstants<IO> value) {
        ProjectConstants.instance = value;
    }
    /** Updates the game. */
    public abstract void update();
}
