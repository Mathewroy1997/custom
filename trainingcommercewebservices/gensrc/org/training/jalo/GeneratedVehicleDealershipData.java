/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at 16-Dec-2021, 10:51:09 AM                    ---
 * ----------------------------------------------------------------
 */
package org.training.jalo;

import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.training.constants.YcommercewebservicesConstants;

/**
 * Generated class for type {@link de.hybris.platform.jalo.GenericItem VehicleDealershipData}.
 */
@SuppressWarnings({"deprecation","unused","cast"})
public abstract class GeneratedVehicleDealershipData extends GenericItem
{
	/** Qualifier of the <code>VehicleDealershipData.dealerName</code> attribute **/
	public static final String DEALERNAME = "dealerName";
	/** Qualifier of the <code>VehicleDealershipData.driverName</code> attribute **/
	public static final String DRIVERNAME = "driverName";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(DEALERNAME, AttributeMode.INITIAL);
		tmp.put(DRIVERNAME, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>VehicleDealershipData.dealerName</code> attribute.
	 * @return the dealerName - Available drivers
	 */
	public String getDealerName(final SessionContext ctx)
	{
		return (String)getProperty( ctx, DEALERNAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>VehicleDealershipData.dealerName</code> attribute.
	 * @return the dealerName - Available drivers
	 */
	public String getDealerName()
	{
		return getDealerName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>VehicleDealershipData.dealerName</code> attribute. 
	 * @param value the dealerName - Available drivers
	 */
	public void setDealerName(final SessionContext ctx, final String value)
	{
		setProperty(ctx, DEALERNAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>VehicleDealershipData.dealerName</code> attribute. 
	 * @param value the dealerName - Available drivers
	 */
	public void setDealerName(final String value)
	{
		setDealerName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>VehicleDealershipData.driverName</code> attribute.
	 * @return the driverName - Available dealers
	 */
	public String getDriverName(final SessionContext ctx)
	{
		return (String)getProperty( ctx, DRIVERNAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>VehicleDealershipData.driverName</code> attribute.
	 * @return the driverName - Available dealers
	 */
	public String getDriverName()
	{
		return getDriverName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>VehicleDealershipData.driverName</code> attribute. 
	 * @param value the driverName - Available dealers
	 */
	public void setDriverName(final SessionContext ctx, final String value)
	{
		setProperty(ctx, DRIVERNAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>VehicleDealershipData.driverName</code> attribute. 
	 * @param value the driverName - Available dealers
	 */
	public void setDriverName(final String value)
	{
		setDriverName( getSession().getSessionContext(), value );
	}
	
}
