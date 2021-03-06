/*
 * Copyright 2008-2012 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.broadleafcommerce.openadmin.client.dto;

import org.broadleafcommerce.common.presentation.client.SupportedFieldType;
import org.broadleafcommerce.common.presentation.client.VisibilityEnum;
import org.broadleafcommerce.openadmin.client.dto.visitor.MetadataVisitor;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Jeff Fischer
 */
public class BasicFieldMetadata extends FieldMetadata {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    private SupportedFieldType fieldType;
    private SupportedFieldType secondaryType = SupportedFieldType.INTEGER;
    private Integer length;
    private Boolean required;
    private Boolean unique;
    private Integer scale;
    private Integer precision;
    private Boolean mutable;
    private String foreignKeyProperty;
    private String foreignKeyClass;
    private String foreignKeyDisplayValueProperty;
    private Boolean foreignKeyCollection;
    private MergedPropertyType mergedPropertyType;
    private String[][] enumerationValues;
    private String enumerationClass;

    //@AdminPresentation derived fields
    private String name;
    private VisibilityEnum visibility;
    private String group;
    private Integer groupOrder;
    private Boolean groupCollapsed;
    private SupportedFieldType explicitFieldType;
    private Boolean largeEntry;
    private Boolean prominent;
    private String columnWidth;
    private String broadleafEnumeration;
    private Boolean readOnly;
    private Map<String, Map<String, String>> validationConfigurations = new HashMap<String, Map<String, String>>(5);
    private Boolean requiredOverride;
    private String tooltip;
    private String helpText;
    private String hint;
    private String lookupDisplayProperty;
    private String lookupParentDataSourceName;
    private String targetDynamicFormDisplayId;
    private String optionListEntity;
    private String optionValueFieldName;
    private String optionDisplayFieldName;
    private Boolean optionCanEditValues;
    private String[][] optionFilterParams;
    private Boolean toOneLookupCreatedViaAnnotation;

    public SupportedFieldType getFieldType() {
        return fieldType;
    }

    public void setFieldType(SupportedFieldType fieldType) {
        this.fieldType = fieldType;
    }

    public SupportedFieldType getSecondaryType() {
        return secondaryType;
    }

    public void setSecondaryType(SupportedFieldType secondaryType) {
        this.secondaryType = secondaryType;
    }

    public Integer getLength() {
        return length;
    }

    public void setLength(Integer length) {
        this.length = length;
    }

    public Boolean getRequired() {
        return required;
    }

    public void setRequired(Boolean required) {
        this.required = required;
    }

    public Integer getScale() {
        return scale;
    }

    public void setScale(Integer scale) {
        this.scale = scale;
    }

    public Integer getPrecision() {
        return precision;
    }

    public void setPrecision(Integer precision) {
        this.precision = precision;
    }

    public Boolean getUnique() {
        return unique;
    }

    public void setUnique(Boolean unique) {
        this.unique = unique;
    }

    public Boolean getMutable() {
        return mutable;
    }

    public void setMutable(Boolean mutable) {
        this.mutable = mutable;
    }

    public String getForeignKeyProperty() {
        return foreignKeyProperty;
    }

    public void setForeignKeyProperty(String foreignKeyProperty) {
        this.foreignKeyProperty = foreignKeyProperty;
    }

    public String getForeignKeyClass() {
        return foreignKeyClass;
    }

    public void setForeignKeyClass(String foreignKeyClass) {
        this.foreignKeyClass = foreignKeyClass;
    }

    public Boolean getForeignKeyCollection() {
        return foreignKeyCollection;
    }

    public void setForeignKeyCollection(Boolean foreignKeyCollection) {
        this.foreignKeyCollection = foreignKeyCollection;
    }

    public MergedPropertyType getMergedPropertyType() {
        return mergedPropertyType;
    }

    public void setMergedPropertyType(MergedPropertyType mergedPropertyType) {
        this.mergedPropertyType = mergedPropertyType;
    }

    public String[][] getEnumerationValues() {
        return enumerationValues;
    }

    public void setEnumerationValues(String[][] enumerationValues) {
        this.enumerationValues = enumerationValues;
    }

    public String getForeignKeyDisplayValueProperty() {
        return foreignKeyDisplayValueProperty;
    }

    public void setForeignKeyDisplayValueProperty(String foreignKeyDisplayValueProperty) {
        this.foreignKeyDisplayValueProperty = foreignKeyDisplayValueProperty;
    }

    public String getEnumerationClass() {
        return enumerationClass;
    }

    public void setEnumerationClass(String enumerationClass) {
        this.enumerationClass = enumerationClass;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public SupportedFieldType getExplicitFieldType() {
        return explicitFieldType;
    }

    public void setExplicitFieldType(SupportedFieldType fieldType) {
        this.explicitFieldType = fieldType;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public Boolean isLargeEntry() {
        return largeEntry;
    }

    public void setLargeEntry(Boolean largeEntry) {
        this.largeEntry = largeEntry;
    }

    public Boolean isProminent() {
        return prominent;
    }

    public void setProminent(Boolean prominent) {
        this.prominent = prominent;
    }

    public String getColumnWidth() {
        return columnWidth;
    }

    public void setColumnWidth(String columnWidth) {
        this.columnWidth = columnWidth;
    }

    public String getBroadleafEnumeration() {
        return broadleafEnumeration;
    }

    public void setBroadleafEnumeration(String broadleafEnumeration) {
        this.broadleafEnumeration = broadleafEnumeration;
    }

    public Boolean getReadOnly() {
        return readOnly;
    }

    public void setReadOnly(Boolean readOnly) {
        this.readOnly = readOnly;
    }

    public Integer getGroupOrder() {
        return groupOrder;
    }

    public void setGroupOrder(Integer groupOrder) {
        this.groupOrder = groupOrder;
    }

    public Map<String, Map<String, String>> getValidationConfigurations() {
        return validationConfigurations;
    }

    public void setValidationConfigurations(Map<String, Map<String, String>> validationConfigurations) {
        this.validationConfigurations = validationConfigurations;
    }

    public Boolean getRequiredOverride() {
        return requiredOverride;
    }

    public void setRequiredOverride(Boolean requiredOverride) {
        this.requiredOverride = requiredOverride;
    }

    public Boolean getGroupCollapsed() {
        return groupCollapsed;
    }

    public void setGroupCollapsed(Boolean groupCollapsed) {
        this.groupCollapsed = groupCollapsed;
    }

    public String getTooltip() {
        return tooltip;
    }

    public void setTooltip(String tooltip) {
        this.tooltip = tooltip;
    }

    public String getHelpText() {
        return helpText;
    }

    public void setHelpText(String helpText) {
        this.helpText = helpText;
    }

    public String getHint() {
        return hint;
    }

    public void setHint(String hint) {
        this.hint = hint;
    }

    public VisibilityEnum getVisibility() {
        return visibility;
    }

    public void setVisibility(VisibilityEnum visibility) {
        this.visibility = visibility;
    }

    public String getLookupDisplayProperty() {
        return lookupDisplayProperty;
    }

    public void setLookupDisplayProperty(String lookupDisplayProperty) {
        this.lookupDisplayProperty = lookupDisplayProperty;
    }

    public String getLookupParentDataSourceName() {
        return lookupParentDataSourceName;
    }

    public void setLookupParentDataSourceName(String lookupParentDataSourceName) {
        this.lookupParentDataSourceName = lookupParentDataSourceName;
    }

    public String getTargetDynamicFormDisplayId() {
        return targetDynamicFormDisplayId;
    }

    public void setTargetDynamicFormDisplayId(String targetDynamicFormDisplayId) {
        this.targetDynamicFormDisplayId = targetDynamicFormDisplayId;
    }

    public Boolean getOptionCanEditValues() {
        return optionCanEditValues;
    }

    public void setOptionCanEditValues(Boolean optionCanEditValues) {
        this.optionCanEditValues = optionCanEditValues;
    }

    public String getOptionDisplayFieldName() {
        return optionDisplayFieldName;
    }

    public void setOptionDisplayFieldName(String optionDisplayFieldName) {
        this.optionDisplayFieldName = optionDisplayFieldName;
    }

    public String getOptionListEntity() {
        return optionListEntity;
    }

    public void setOptionListEntity(String optionListEntity) {
        this.optionListEntity = optionListEntity;
    }

    public String getOptionValueFieldName() {
        return optionValueFieldName;
    }

    public void setOptionValueFieldName(String optionValueFieldName) {
        this.optionValueFieldName = optionValueFieldName;
    }

    public String[][] getOptionFilterParams() {
        return optionFilterParams;
    }

    public void setOptionFilterParams(String[][] optionFilterParams) {
        this.optionFilterParams = optionFilterParams;
    }

    public Boolean getToOneLookupCreatedViaAnnotation() {
        return toOneLookupCreatedViaAnnotation;
    }

    public void setToOneLookupCreatedViaAnnotation(Boolean toOneLookupCreatedViaAnnotation) {
        this.toOneLookupCreatedViaAnnotation = toOneLookupCreatedViaAnnotation;
    }

    @Override
    public FieldMetadata cloneFieldMetadata() {
        BasicFieldMetadata metadata = new BasicFieldMetadata();
        metadata.fieldType = fieldType;
        metadata.secondaryType = secondaryType;
        metadata.length = length;
        metadata.required = required;
        metadata.unique = unique;
        metadata.scale = scale;
        metadata.precision = precision;
        metadata.mutable = mutable;
        metadata.foreignKeyProperty = foreignKeyProperty;
        metadata.foreignKeyClass = foreignKeyClass;
        metadata.foreignKeyDisplayValueProperty = foreignKeyDisplayValueProperty;
        metadata.foreignKeyCollection = foreignKeyCollection;
        metadata.mergedPropertyType = mergedPropertyType;
        metadata.enumerationClass = enumerationClass;
        if (enumerationValues != null) {
            metadata.enumerationValues = new String[enumerationValues.length][];
            for (int j=0;j<enumerationValues.length;j++) {
                metadata.enumerationValues[j] = new String[enumerationValues[j].length];
                System.arraycopy(enumerationValues[j], 0, metadata.enumerationValues[j], 0, enumerationValues[j].length);
            }
        }

        metadata.name = name;
        metadata.visibility = visibility;
        metadata.group = group;
        metadata.groupOrder = groupOrder;
        metadata.groupCollapsed = groupCollapsed;
        metadata.explicitFieldType = explicitFieldType;
        metadata.largeEntry = largeEntry;
        metadata.prominent = prominent;
        metadata.columnWidth = columnWidth;
        metadata.broadleafEnumeration = broadleafEnumeration;
        metadata.readOnly = readOnly;
        metadata.requiredOverride = requiredOverride;
        metadata.tooltip = tooltip;
        metadata.helpText = helpText;
        metadata.hint = hint;
        for (Map.Entry<String, Map<String, String>> entry : validationConfigurations.entrySet()) {
            Map<String, String> clone = new HashMap<String, String>(entry.getValue().size());
            for (Map.Entry<String, String> entry2 : entry.getValue().entrySet()) {
                clone.put(entry2.getKey(), entry2.getValue());
            }
            metadata.validationConfigurations.put(entry.getKey(), clone);
        }
        metadata.lookupDisplayProperty = lookupDisplayProperty;
        metadata.lookupParentDataSourceName = lookupParentDataSourceName;
        metadata.targetDynamicFormDisplayId = targetDynamicFormDisplayId;
        metadata.optionListEntity = optionListEntity;
        metadata.optionCanEditValues = optionCanEditValues;
        metadata.optionDisplayFieldName = optionDisplayFieldName;
        metadata.optionValueFieldName = optionValueFieldName;
        if (optionFilterParams != null) {
            metadata.optionFilterParams = new String[optionFilterParams.length][];
            for (int j=0;j<optionFilterParams.length;j++) {
                metadata.optionFilterParams[j] = new String[optionFilterParams[j].length];
                System.arraycopy(optionFilterParams[j], 0, metadata.optionFilterParams[j], 0, optionFilterParams[j].length);
            }
        }
        metadata.toOneLookupCreatedViaAnnotation = toOneLookupCreatedViaAnnotation;

        metadata = (BasicFieldMetadata) populate(metadata);

        return metadata;
    }

    @Override
    public void accept(MetadataVisitor visitor) {
        visitor.visit(this);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof BasicFieldMetadata)) {
            return false;
        }
        if (!super.equals(o)) {
            return false;
        }

        BasicFieldMetadata metadata = (BasicFieldMetadata) o;

        if (broadleafEnumeration != null ? !broadleafEnumeration.equals(metadata.broadleafEnumeration) : metadata.broadleafEnumeration != null) {
            return false;
        }
        if (columnWidth != null ? !columnWidth.equals(metadata.columnWidth) : metadata.columnWidth != null) {
            return false;
        }
        if (enumerationClass != null ? !enumerationClass.equals(metadata.enumerationClass) : metadata.enumerationClass != null) {
            return false;
        }
        if (explicitFieldType != metadata.explicitFieldType) {
            return false;
        }
        if (fieldType != metadata.fieldType) {
            return false;
        }
        if (foreignKeyClass != null ? !foreignKeyClass.equals(metadata.foreignKeyClass) : metadata.foreignKeyClass != null) {
            return false;
        }
        if (foreignKeyCollection != null ? !foreignKeyCollection.equals(metadata.foreignKeyCollection) : metadata.foreignKeyCollection != null) {
            return false;
        }
        if (foreignKeyDisplayValueProperty != null ? !foreignKeyDisplayValueProperty.equals(metadata.foreignKeyDisplayValueProperty) : metadata.foreignKeyDisplayValueProperty != null) {
            return false;
        }
        if (foreignKeyProperty != null ? !foreignKeyProperty.equals(metadata.foreignKeyProperty) : metadata.foreignKeyProperty != null) {
            return false;
        }
        if (group != null ? !group.equals(metadata.group) : metadata.group != null) {
            return false;
        }
        if (groupCollapsed != null ? !groupCollapsed.equals(metadata.groupCollapsed) : metadata.groupCollapsed != null) {
            return false;
        }
        if (groupOrder != null ? !groupOrder.equals(metadata.groupOrder) : metadata.groupOrder != null) {
            return false;
        }
        if (helpText != null ? !helpText.equals(metadata.helpText) : metadata.helpText != null) {
            return false;
        }
        if (hint != null ? !hint.equals(metadata.hint) : metadata.hint != null) {
            return false;
        }
        if (largeEntry != null ? !largeEntry.equals(metadata.largeEntry) : metadata.largeEntry != null) {
            return false;
        }
        if (length != null ? !length.equals(metadata.length) : metadata.length != null) {
            return false;
        }
        if (lookupDisplayProperty != null ? !lookupDisplayProperty.equals(metadata.lookupDisplayProperty) : metadata.lookupDisplayProperty != null) {
            return false;
        }
        if (lookupParentDataSourceName != null ? !lookupParentDataSourceName.equals(metadata.lookupParentDataSourceName) : metadata.lookupParentDataSourceName != null) {
            return false;
        }
        if (mergedPropertyType != metadata.mergedPropertyType) {
            return false;
        }
        if (mutable != null ? !mutable.equals(metadata.mutable) : metadata.mutable != null) {
            return false;
        }
        if (name != null ? !name.equals(metadata.name) : metadata.name != null) {
            return false;
        }
        if (optionCanEditValues != null ? !optionCanEditValues.equals(metadata.optionCanEditValues) : metadata.optionCanEditValues != null) {
            return false;
        }
        if (optionDisplayFieldName != null ? !optionDisplayFieldName.equals(metadata.optionDisplayFieldName) : metadata.optionDisplayFieldName != null) {
            return false;
        }
        if (optionListEntity != null ? !optionListEntity.equals(metadata.optionListEntity) : metadata.optionListEntity != null) {
            return false;
        }
        if (optionValueFieldName != null ? !optionValueFieldName.equals(metadata.optionValueFieldName) : metadata.optionValueFieldName != null) {
            return false;
        }
        if (precision != null ? !precision.equals(metadata.precision) : metadata.precision != null) {
            return false;
        }
        if (prominent != null ? !prominent.equals(metadata.prominent) : metadata.prominent != null) {
            return false;
        }
        if (readOnly != null ? !readOnly.equals(metadata.readOnly) : metadata.readOnly != null) {
            return false;
        }
        if (required != null ? !required.equals(metadata.required) : metadata.required != null) {
            return false;
        }
        if (requiredOverride != null ? !requiredOverride.equals(metadata.requiredOverride) : metadata.requiredOverride != null) {
            return false;
        }
        if (scale != null ? !scale.equals(metadata.scale) : metadata.scale != null) {
            return false;
        }
        if (secondaryType != metadata.secondaryType) {
            return false;
        }
        if (targetDynamicFormDisplayId != null ? !targetDynamicFormDisplayId.equals(metadata.targetDynamicFormDisplayId) : metadata.targetDynamicFormDisplayId != null) {
            return false;
        }
        if (tooltip != null ? !tooltip.equals(metadata.tooltip) : metadata.tooltip != null) {
            return false;
        }
        if (unique != null ? !unique.equals(metadata.unique) : metadata.unique != null) {
            return false;
        }
        if (validationConfigurations != null ? !validationConfigurations.equals(metadata.validationConfigurations) : metadata.validationConfigurations != null) {
            return false;
        }
        if (visibility != metadata.visibility) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (fieldType != null ? fieldType.hashCode() : 0);
        result = 31 * result + (secondaryType != null ? secondaryType.hashCode() : 0);
        result = 31 * result + (length != null ? length.hashCode() : 0);
        result = 31 * result + (required != null ? required.hashCode() : 0);
        result = 31 * result + (unique != null ? unique.hashCode() : 0);
        result = 31 * result + (scale != null ? scale.hashCode() : 0);
        result = 31 * result + (precision != null ? precision.hashCode() : 0);
        result = 31 * result + (mutable != null ? mutable.hashCode() : 0);
        result = 31 * result + (foreignKeyProperty != null ? foreignKeyProperty.hashCode() : 0);
        result = 31 * result + (foreignKeyClass != null ? foreignKeyClass.hashCode() : 0);
        result = 31 * result + (foreignKeyDisplayValueProperty != null ? foreignKeyDisplayValueProperty.hashCode() : 0);
        result = 31 * result + (foreignKeyCollection != null ? foreignKeyCollection.hashCode() : 0);
        result = 31 * result + (mergedPropertyType != null ? mergedPropertyType.hashCode() : 0);
        result = 31 * result + (enumerationClass != null ? enumerationClass.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (visibility != null ? visibility.hashCode() : 0);
        result = 31 * result + (group != null ? group.hashCode() : 0);
        result = 31 * result + (groupOrder != null ? groupOrder.hashCode() : 0);
        result = 31 * result + (groupCollapsed != null ? groupCollapsed.hashCode() : 0);
        result = 31 * result + (explicitFieldType != null ? explicitFieldType.hashCode() : 0);
        result = 31 * result + (largeEntry != null ? largeEntry.hashCode() : 0);
        result = 31 * result + (prominent != null ? prominent.hashCode() : 0);
        result = 31 * result + (columnWidth != null ? columnWidth.hashCode() : 0);
        result = 31 * result + (broadleafEnumeration != null ? broadleafEnumeration.hashCode() : 0);
        result = 31 * result + (readOnly != null ? readOnly.hashCode() : 0);
        result = 31 * result + (validationConfigurations != null ? validationConfigurations.hashCode() : 0);
        result = 31 * result + (requiredOverride != null ? requiredOverride.hashCode() : 0);
        result = 31 * result + (tooltip != null ? tooltip.hashCode() : 0);
        result = 31 * result + (helpText != null ? helpText.hashCode() : 0);
        result = 31 * result + (hint != null ? hint.hashCode() : 0);
        result = 31 * result + (lookupDisplayProperty != null ? lookupDisplayProperty.hashCode() : 0);
        result = 31 * result + (lookupParentDataSourceName != null ? lookupParentDataSourceName.hashCode() : 0);
        result = 31 * result + (targetDynamicFormDisplayId != null ? targetDynamicFormDisplayId.hashCode() : 0);
        result = 31 * result + (optionListEntity != null ? optionListEntity.hashCode() : 0);
        result = 31 * result + (optionValueFieldName != null ? optionValueFieldName.hashCode() : 0);
        result = 31 * result + (optionDisplayFieldName != null ? optionDisplayFieldName.hashCode() : 0);
        result = 31 * result + (optionCanEditValues != null ? optionCanEditValues.hashCode() : 0);
        return result;
    }


}
