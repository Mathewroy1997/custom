package de.hybris.training.core.search.solrfacetsearch.provider.impl;

import de.hybris.platform.solrfacetsearch.config.IndexConfig;
import de.hybris.platform.solrfacetsearch.config.IndexedProperty;
import de.hybris.platform.solrfacetsearch.config.exceptions.FieldValueProviderException;
import de.hybris.platform.solrfacetsearch.provider.FieldNameProvider;
import de.hybris.platform.solrfacetsearch.provider.FieldValue;
import de.hybris.platform.solrfacetsearch.provider.FieldValueProvider;
import de.hybris.platform.solrfacetsearch.provider.impl.AbstractPropertyFieldValueProvider;
import de.hybris.training.core.model.*;

import java.util.*;

public class DealerValueProvider extends AbstractPropertyFieldValueProvider implements
        FieldValueProvider {

    private FieldNameProvider fieldNameProvider;

    public FieldNameProvider getFieldNameProvider() {
        return fieldNameProvider;
    }

    public void setFieldNameProvider(FieldNameProvider fieldNameProvider) {
        this.fieldNameProvider = fieldNameProvider;
    }

    @Override
    public Collection<FieldValue> getFieldValues(IndexConfig indexConfig, IndexedProperty indexedProperty, Object model) throws FieldValueProviderException {
        if (model instanceof VehicleModel) {


            final VehicleModel vehicleModel = (VehicleModel) model;
            final Collection<FieldValue> fieldValues = new ArrayList<>();
            fieldValues.addAll(createFieldValue(vehicleModel, indexedProperty));
            return fieldValues;
        }
        throw new FieldValueProviderException("item is not of vehicle instance");
    }


    private Collection<? extends FieldValue> createFieldValue(VehicleModel vehicleBaseModel, IndexedProperty indexedProperty) {


        final List<FieldValue> fieldValues = new ArrayList<>();

        final Set<DealerModel> dealerBaseModels = vehicleBaseModel.getDealer();


        for (DealerModel dealers : dealerBaseModels
        ) {
            String dealer = dealers.getDealerName();

            if (dealer != null) {

                addFieldValues(fieldValues, indexedProperty, dealer);

            }

        }

        return fieldValues;

    }

    private void addFieldValues(List<FieldValue> fieldValues, IndexedProperty indexedProperty, final Object value) {

        final Collection<String> fieldNames = getFieldNameProvider().getFieldNames(indexedProperty, null);
        for (final String fieldName : fieldNames) {
            fieldValues.add(new FieldValue(fieldName, value));
        }


    }

}


