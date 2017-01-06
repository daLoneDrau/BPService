package com.osrapi.models.bp;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.MapKeyColumn;
import javax.persistence.MapKeyJoinColumn;
import javax.persistence.MappedSuperclass;
import javax.persistence.OneToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author drau
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@Entity
@Table(name = "equipment_item_modifier", schema = "bp")
public final class BPEquipmentItemModifierEntity {
    /**
     * the primary key - an autogenerated id (unique for each user in the db).
     */
    @Id
    @Column(name = "equipment_item_modifier_id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE,
  generator = "equipment_item_modifier_seq")
    @SequenceGenerator(
        name = "equipment_item_modifier_seq",
        sequenceName = "bp.equipment_item_modifier_id_seq",
        allocationSize = 1
    )
    private Long                    id;
    /** Creates a new instance of {@link BPEquipmentItemModifierEntity}. */
    public BPEquipmentItemModifierEntity() {
        super();
    }
    /**
     * Gets the id.
     * @return {@link Long}
     */
    public Long getId() {
        return id;
    }
    /**
     * Sets the id.
     * @param val the new value
     */
    public void setId(final Long val) {
        id = val;
    }

    /** the value. */
    @Column(name = "value")
    @JsonProperty("value")
    @NotNull
    private float                    value;
    /**
     * Gets the value.
     * @return {@link float}
     */
    public float getValue() {
        return value;
    }
    /**
     * Sets the value.
     * @param val the new value
     */
    public void setValue(final float val) {
        value = val;
    }

    /** the special. */
    @Column(name = "special")
    @JsonProperty("special")
    
    private Long                    special;
    /**
     * Gets the special.
     * @return {@link Long}
     */
    public Long getSpecial() {
        return special;
    }
    /**
     * Sets the special.
     * @param val the new value
     */
    public void setSpecial(final Long val) {
        special = val;
    }

    /** the percent. */
    @Column(name = "percent")
    @JsonProperty("percent")
    @NotNull
    private Boolean                    percent;
    /**
     * Gets the percent.
     * @return {@link Boolean}
     */
    public Boolean getPercent() {
        return percent;
    }
    /**
     * Sets the percent.
     * @param val the new value
     */
    public void setPercent(final Boolean val) {
        percent = val;
    }

    /** the code. */
    @Column(name = "code")
    @JsonProperty("code")
    @NotNull
    private String                    code;
    /**
     * Gets the code.
     * @return {@link String}
     */
    public String getCode() {
        return code;
    }
    /**
     * Sets the code.
     * @param val the new value
     */
    public void setCode(final String val) {
        code = val;
    }

}
