package com.dalonedrow.module.rpg;

import com.dalonedrow.rpg.flyweights.IOEquipItem;
import com.dalonedrow.rpg.flyweights.IoPcData;
import com.dalonedrow.rpg.flyweights.RPGException;

/**
 * @author Donald
 */
public class PC extends IoPcData<IO> {
    /** the list of attributes and their matching names and modifiers. */
    private static Object[][] attributeMap = new Object[][] {
            { "CS", "Combat Skill", ElementType.ELEMENT_COMBAT_SKILL },
            { "EN", "Endurance", ElementType.ELEMENT_ENDURANCE },
            { "WE", "Wealth", ElementType.ELEMENT_WEALTH },
            { "WO", "Wounds", ElementType.ELEMENT_WOUNDS },
            { "PW", "Poison Wounds", ElementType.ELEMENT_POISON_WOUNDS },
            { "WI", "Wit & Wiles", ElementType.ELEMENT_WIT_AND_WILES } };
    /**
     * Creates a new instance of {@link PC}.
     * @throws RPGException
     */
    public PC() throws RPGException {
        super();
    }
    @Override
    protected void adjustMana(final float dmg) {}
    @Override
    protected void applyRulesModifiers() throws RPGException {}
    @Override
    protected void applyRulesPercentModifiers() {}
    @Override
    public void ARX_EQUIPMENT_RecreatePlayerMesh() {
        // TODO Auto-generated method stub

    }
    @Override
    public boolean canIdentifyEquipment(IOEquipItem equipitem) {
        // TODO Auto-generated method stub
        return false;
    }
    @Override
    protected Object[][] getAttributeMap() {
        return PC.attributeMap;
    }
    @Override
    protected float getBaseLife() {
        return super.getFullAttributeScore("EN");
    }
    @Override
    protected float getBaseMana() {
        return super.getFullAttributeScore("EN");
    }
    @Override
    protected String getLifeAttribute() {
        return "EN";
    }
    @Override
    public boolean isInCombat() {
        // TODO Auto-generated method stub
        return false;
    }
    /** Creates a new hero. */
    public void newHero() {

    }
}
