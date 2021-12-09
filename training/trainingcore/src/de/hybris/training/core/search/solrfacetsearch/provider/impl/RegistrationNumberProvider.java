package de.hybris.training.core.search.solrfacetsearch.provider.impl;

import de.hybris.platform.solrfacetsearch.config.IndexConfig;
import de.hybris.platform.solrfacetsearch.config.IndexedProperty;
import de.hybris.platform.solrfacetsearch.config.exceptions.FieldValueProviderException;
import de.hybris.platform.solrfacetsearch.provider.FieldNameProvider;
import de.hybris.platform.solrfacetsearch.provider.FieldValue;
import de.hybris.platform.solrfacetsearch.provider.FieldValueProvider;
import de.hybris.platform.solrfacetsearch.provider.impl.AbstractPropertyFieldValueProvider;
import de.hybris.training.core.jalo.Vehicle;
import de.hybris.training.core.model.VehicleModel;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class RegistrationNumberProvider extends AbstractPropertyFieldValueProvider implements FieldValueProvider {
    FieldNameProvider fieldNameProvider;

    public FieldNameProvider getFieldNameProvider() {
        return fieldNameProvider;
    }

    public void setFieldNameProvider(FieldNameProvider fieldNameProvider) {
        this.fieldNameProvider = fieldNameProvider;
    }

    @Override
    public Collection<FieldValue> getFieldValues(IndexConfig indexConfig, IndexedProperty indexedProperty, Object model) throws FieldValueProviderException {

        if (model instanceof VehicleModel) {
            final VehicleModel vehicle = (VehicleModel) model;
            final Collection<FieldValue> fieldValues = new ArrayList<>();
            fieldValues.addAll(createFieldValue(vehicle, indexedProperty));
            return fieldValues;
        }
        throw new FieldValueProviderException("Item is not of Vehicle Instance");
    }

    private Collection<? extends FieldValue> createFieldValue(VehicleModel vehicleList, IndexedProperty indexedProperty) {
        final List<FieldValue> fieldValues = new ArrayList<>();
        final String registrationNumber = vehicleList.getVehicleRegistrationNumber();
        if (registrationNumber != null) {
            addFieldValues(fieldValues, indexedProperty, registrationNumber);
        }
        return fieldValues;
    }

    protected void addFieldValues(final List<FieldValue> fieldValues, final IndexedProperty indexedProperty, final Object value) {
        final Collection<String> fieldNames = getFieldNameProvider().getFieldNames(indexedProperty, null);
        for (final String fieldName : fieldNames) {
            fieldValues.add(new FieldValue(fieldName, value));
        }
    }
}
