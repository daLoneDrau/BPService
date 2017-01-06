package com.dalonedrow.module.rpg;

import com.dalonedrow.rpg.flyweights.BaseInteractiveObject;
import com.dalonedrow.rpg.flyweights.Scriptable;

/**
 * @author Donald
 */
public class IO
        extends BaseInteractiveObject<Item, Inventory, PC, NPC, Scriptable> {
    /**
     * Creates a new instance of {@link IO}.
     * @param id the reference id
     */
    public IO(final int id) {
        super(id);
    }
}
