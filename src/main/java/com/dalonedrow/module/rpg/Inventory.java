package com.dalonedrow.module.rpg;

import com.dalonedrow.rpg.flyweights.InventoryData;
import com.dalonedrow.rpg.flyweights.InventorySlot;

public class Inventory extends InventoryData<IO,
        InventorySlot<IO>> {

    @Override
    public void PutInFrontOfPlayer(IO itemIO,
            boolean doNotApplyPhysics) {
        // TODO Auto-generated method stub

    }

}
