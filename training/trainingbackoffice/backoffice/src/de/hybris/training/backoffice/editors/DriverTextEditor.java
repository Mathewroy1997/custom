package de.hybris.training.backoffice.editors;

import com.hybris.cockpitng.editor.commonreferenceeditor.NestedObjectCreator;
import com.hybris.cockpitng.editor.defaultreferenceeditor.DefaultReferenceEditor;
import de.hybris.training.core.model.DriverModel;
import org.apache.commons.lang.StringUtils;

import java.util.concurrent.atomic.AtomicReference;

public  class DriverTextEditor<T> extends DefaultReferenceEditor<T> {





    @Override
    public String getStringRepresentationOfObject(T obj) {


        if (obj instanceof NestedObjectCreator){
            NestedObjectCreator nestedObjectCreator = (NestedObjectCreator)obj;
            String typeName = this.getLabelService().getObjectLabel(StringUtils.isNotBlank(nestedObjectCreator.getUserChosenType()) ? nestedObjectCreator.getUserChosenType() : this.getTypeCode());
            return ((NestedObjectCreator)obj).getLabel(typeName);
        }
        else {
            AtomicReference<String> label = new AtomicReference();
            DriverModel driverModel=(DriverModel)obj;
            this.getLabelProvider().ifPresentOrElse((provider) -> {
                label.set(provider.getLabel(obj));
            }, () -> {
                label.set(this.getLabelService().getObjectLabel(driverModel.getDriverName()));
            });
            return (String)label.get();
        }


    }
}




