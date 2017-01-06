package com.osrapi.controllers.bp;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.springframework.hateoas.Resource;
import org.springframework.hateoas.mvc.ControllerLinkBuilder;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.dalonedrow.module.rpg.Dice;
import com.osrapi.models.bp.BPAttributeEntity;
import com.osrapi.models.bp.BPIoItemDataEntity;
import com.osrapi.models.bp.BPIoPcDataEntity;

/**
 * @author drau
 */
@CrossOrigin
@RestController
@RequestMapping(path = "/bp/hero")
@SuppressWarnings({ "unchecked", "rawtypes" })
public class BPIOHeroController {
    /** the static instance of {@link BPIOHeroController}. */
    private static BPIOHeroController instance;
    /**
     * Gets the static instance.
     * @return {@link BPIOHeroController}
     */
    public static BPIOHeroController getInstance() {
        if (instance == null) {
            new BPIOHeroController();
        }
        return instance;
    }
    /** Creates a new instance of {@link BPIOHeroController}. */
    public BPIOHeroController() {
        instance = this;
    }
    /**
     * Gets a {@link Resource} instance with links for the
     * {@link BPAttributeEntity}.
     * @param entity the {@link BPAttributeEntity}
     * @return {@link Resource}<{@link BPAttributeEntity}>
     */
    private Resource<BPIoPcDataEntity> getHeroResource(
            final BPIoPcDataEntity entity) {
        Resource<BPIoPcDataEntity> resource =
                new Resource<BPIoPcDataEntity>(
                        entity);
        // link to entity
        resource.add(ControllerLinkBuilder.linkTo(
                ControllerLinkBuilder.methodOn(
                        BPIoPcDataController.class).getById(
                                entity.getId())).withSelfRel());
        return resource;
    }
    /**
     * Gets a new {@link BPIoPcDataEntity}.
     * @return {@link List}<{@link Resource}<{@link BPAttributeEntity}>>
     */
    @RequestMapping(path = "new",
            method = RequestMethod.GET)
    public List<Resource<BPIoPcDataEntity>> newHero() {
        BPIoPcDataEntity hero = new BPIoPcDataEntity();
        hero.setName("Cal Arath");
        hero.setGender(
                BPGenderController.getInstance().getByName("Male")
                .get(0).getContent());
        Map<String, Integer> map = new HashMap<String, Integer>();
        map.put("CS", 0);
        map.put("EN", 9);
        map.put("WE", 2);
        map.put("WO", 0);
        map.put("PW", 0);
        map.put("WI", Math.max(2, Dice.ONE_D6.roll()));
        hero.setAttributes(map);
        map = new HashMap<String, Integer>();
        BPIoItemDataEntity item =
                BPIoItemDataController.getInstance().getByName(
                        "Bonebiter").get(0).getContent();
        map.put("EQUIP_SLOT_WEAPON", item.getId().intValue());
        hero.setEquippedItems(map);
        map = null;
        item = null;
        hero = BPIoPcDataController.getInstance().save(
                hero).get(0).getContent();
        return BPIoPcDataController.getInstance().getById(hero.getId());
    }
}
