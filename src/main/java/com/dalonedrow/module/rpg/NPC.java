package com.dalonedrow.module.rpg;

import com.dalonedrow.rpg.flyweights.IoNpcData;
import com.dalonedrow.rpg.flyweights.RPGException;

public class NPC extends IoNpcData<IO> {
    /** the list of attributes and their matching names and modifiers. */
    private static Object[][] attributeMap = new Object[][] {
            { "CS", "Combat Skill", ElementType.ELEMENT_COMBAT_SKILL },
            { "EN", "Endurance", ElementType.ELEMENT_ENDURANCE },
            { "WE", "Wealth", ElementType.ELEMENT_WEALTH },
            { "WO", "Wounds", ElementType.ELEMENT_WOUNDS },
            { "PW", "Poison Wounds", ElementType.ELEMENT_POISON_WOUNDS } };
    public NPC() throws RPGException {
        super();
        // TODO Auto-generated constructor stub
    }

    @Override
    protected void adjustLife(float dmg) {
        // TODO Auto-generated method stub

    }

    @Override
    protected void adjustMana(float dmg) {
        // TODO Auto-generated method stub

    }

    @Override
    public void ARX_NPC_ManagePoison() {
        // TODO Auto-generated method stub

    }

    @Override
    protected void defineAttributes() throws RPGException {
        // TODO Auto-generated method stub

    }

    @Override
    public float getBaseLife() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public float getBaseMana() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    protected boolean hasLifeRemaining() {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    protected void moveToInitialPosition() {
        // TODO Auto-generated method stub

    }

    @Override
    protected void restoreLifeToMax() {
        // TODO Auto-generated method stub

    }

    @Override
    protected void stopActiveAnimation() {
        // TODO Auto-generated method stub

    }

    @Override
    protected void stopIdleAnimation() {
        // TODO Auto-generated method stub

    }

}
