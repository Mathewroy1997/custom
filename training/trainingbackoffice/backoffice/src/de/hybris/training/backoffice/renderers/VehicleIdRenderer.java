package de.hybris.training.backoffice.renderers;

import com.hybris.cockpitng.core.config.impl.jaxb.listview.ListColumn;
import com.hybris.cockpitng.dataaccess.facades.type.DataType;
import com.hybris.cockpitng.engine.WidgetInstanceManager;
import com.hybris.cockpitng.widgets.common.AbstractWidgetComponentRenderer;
import de.hybris.training.core.model.VehicleModel;
import org.zkoss.zul.Div;
import org.zkoss.zul.Label;
import org.zkoss.zul.Listcell;

import java.util.logging.Logger;

public class VehicleIdRenderer extends AbstractWidgetComponentRenderer<Listcell, ListColumn, VehicleModel>  {


    static final private Logger LOG = Logger.getLogger(String.valueOf(VehicleIdRenderer.class));



    @Override
    public void render(Listcell listcell, ListColumn listColumn, VehicleModel vehicleModel, DataType dataType, WidgetInstanceManager widgetInstanceManager) {

        LOG.info("inside AbstractWidgetComponentRenderer..");
        final Div div = new Div();
        final Label label = new Label();
        String vehicle_id= vehicleModel.getVehicleId();
        int i=0;
        while(i<vehicle_id.length() && vehicle_id.charAt(i)=='0'){
            i++;
        }
        StringBuilder sb =new StringBuilder(vehicle_id);
        sb.replace(0,i,"");
        vehicle_id=sb.toString();
        label.setValue(vehicle_id);
        div.appendChild(label);
        listcell.appendChild(div);
        fireComponentRendered(listcell,listColumn,vehicleModel);


    }


}
