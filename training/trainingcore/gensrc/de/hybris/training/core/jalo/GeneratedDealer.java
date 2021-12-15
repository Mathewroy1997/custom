/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at 15-Dec-2021, 9:13:37 AM                     ---
 * ----------------------------------------------------------------
 *  
 * Copyright (c) 2021 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.training.core.jalo;

import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloInvalidParameterException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.c2l.C2LManager;
import de.hybris.platform.jalo.c2l.Language;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.jalo.type.TypeManager;
import de.hybris.platform.util.Utilities;
import de.hybris.training.core.constants.TrainingCoreConstants;
import de.hybris.training.core.jalo.Driver;
import de.hybris.training.core.jalo.Vehicle;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Generated class for type {@link de.hybris.training.core.jalo.Dealer Dealer}.
 */
@SuppressWarnings({"deprecation","unused","cast"})
public abstract class GeneratedDealer extends GenericItem
{
	/** Qualifier of the <code>Dealer.dealerAddress</code> attribute **/
	public static final String DEALERADDRESS = "dealerAddress";
	/** Qualifier of the <code>Dealer.dealerName</code> attribute **/
	public static final String DEALERNAME = "dealerName";
	/** Qualifier of the <code>Dealer.dealerId</code> attribute **/
	public static final String DEALERID = "dealerId";
	/** Qualifier of the <code>Dealer.driver</code> attribute **/
	public static final String DRIVER = "driver";
	/** Relation ordering override parameter constants for Driver2Dealer from ((trainingcore))*/
	protected static String DRIVER2DEALER_SRC_ORDERED = "relation.Driver2Dealer.source.ordered";
	protected static String DRIVER2DEALER_TGT_ORDERED = "relation.Driver2Dealer.target.ordered";
	/** Relation disable markmodifed parameter constants for Driver2Dealer from ((trainingcore))*/
	protected static String DRIVER2DEALER_MARKMODIFIED = "relation.Driver2Dealer.markmodified";
	/** Qualifier of the <code>Dealer.vehicle</code> attribute **/
	public static final String VEHICLE = "vehicle";
	/** Relation ordering override parameter constants for Vehicle2Dealer from ((trainingcore))*/
	protected static String VEHICLE2DEALER_SRC_ORDERED = "relation.Vehicle2Dealer.source.ordered";
	protected static String VEHICLE2DEALER_TGT_ORDERED = "relation.Vehicle2Dealer.target.ordered";
	/** Relation disable markmodifed parameter constants for Vehicle2Dealer from ((trainingcore))*/
	protected static String VEHICLE2DEALER_MARKMODIFIED = "relation.Vehicle2Dealer.markmodified";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(DEALERADDRESS, AttributeMode.INITIAL);
		tmp.put(DEALERNAME, AttributeMode.INITIAL);
		tmp.put(DEALERID, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Dealer.dealerAddress</code> attribute.
	 * @return the dealerAddress - dealer address
	 */
	public String getDealerAddress(final SessionContext ctx)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedDealer.getDealerAddress requires a session language", 0 );
		}
		return (String)getLocalizedProperty( ctx, DEALERADDRESS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Dealer.dealerAddress</code> attribute.
	 * @return the dealerAddress - dealer address
	 */
	public String getDealerAddress()
	{
		return getDealerAddress( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Dealer.dealerAddress</code> attribute. 
	 * @return the localized dealerAddress - dealer address
	 */
	public Map<Language,String> getAllDealerAddress(final SessionContext ctx)
	{
		return (Map<Language,String>)getAllLocalizedProperties(ctx,DEALERADDRESS,C2LManager.getInstance().getAllLanguages());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Dealer.dealerAddress</code> attribute. 
	 * @return the localized dealerAddress - dealer address
	 */
	public Map<Language,String> getAllDealerAddress()
	{
		return getAllDealerAddress( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Dealer.dealerAddress</code> attribute. 
	 * @param value the dealerAddress - dealer address
	 */
	public void setDealerAddress(final SessionContext ctx, final String value)
	{
		if ( ctx == null) 
		{
			throw new JaloInvalidParameterException( "ctx is null", 0 );
		}
		if( ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedDealer.setDealerAddress requires a session language", 0 );
		}
		setLocalizedProperty(ctx, DEALERADDRESS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Dealer.dealerAddress</code> attribute. 
	 * @param value the dealerAddress - dealer address
	 */
	public void setDealerAddress(final String value)
	{
		setDealerAddress( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Dealer.dealerAddress</code> attribute. 
	 * @param value the dealerAddress - dealer address
	 */
	public void setAllDealerAddress(final SessionContext ctx, final Map<Language,String> value)
	{
		setAllLocalizedProperties(ctx,DEALERADDRESS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Dealer.dealerAddress</code> attribute. 
	 * @param value the dealerAddress - dealer address
	 */
	public void setAllDealerAddress(final Map<Language,String> value)
	{
		setAllDealerAddress( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Dealer.dealerId</code> attribute.
	 * @return the dealerId - dealer of unique id
	 */
	public String getDealerId(final SessionContext ctx)
	{
		return (String)getProperty( ctx, DEALERID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Dealer.dealerId</code> attribute.
	 * @return the dealerId - dealer of unique id
	 */
	public String getDealerId()
	{
		return getDealerId( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Dealer.dealerId</code> attribute. 
	 * @param value the dealerId - dealer of unique id
	 */
	public void setDealerId(final SessionContext ctx, final String value)
	{
		setProperty(ctx, DEALERID,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Dealer.dealerId</code> attribute. 
	 * @param value the dealerId - dealer of unique id
	 */
	public void setDealerId(final String value)
	{
		setDealerId( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Dealer.dealerName</code> attribute.
	 * @return the dealerName - name of the dealer
	 */
	public String getDealerName(final SessionContext ctx)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedDealer.getDealerName requires a session language", 0 );
		}
		return (String)getLocalizedProperty( ctx, DEALERNAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Dealer.dealerName</code> attribute.
	 * @return the dealerName - name of the dealer
	 */
	public String getDealerName()
	{
		return getDealerName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Dealer.dealerName</code> attribute. 
	 * @return the localized dealerName - name of the dealer
	 */
	public Map<Language,String> getAllDealerName(final SessionContext ctx)
	{
		return (Map<Language,String>)getAllLocalizedProperties(ctx,DEALERNAME,C2LManager.getInstance().getAllLanguages());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Dealer.dealerName</code> attribute. 
	 * @return the localized dealerName - name of the dealer
	 */
	public Map<Language,String> getAllDealerName()
	{
		return getAllDealerName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Dealer.dealerName</code> attribute. 
	 * @param value the dealerName - name of the dealer
	 */
	public void setDealerName(final SessionContext ctx, final String value)
	{
		if ( ctx == null) 
		{
			throw new JaloInvalidParameterException( "ctx is null", 0 );
		}
		if( ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedDealer.setDealerName requires a session language", 0 );
		}
		setLocalizedProperty(ctx, DEALERNAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Dealer.dealerName</code> attribute. 
	 * @param value the dealerName - name of the dealer
	 */
	public void setDealerName(final String value)
	{
		setDealerName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Dealer.dealerName</code> attribute. 
	 * @param value the dealerName - name of the dealer
	 */
	public void setAllDealerName(final SessionContext ctx, final Map<Language,String> value)
	{
		setAllLocalizedProperties(ctx,DEALERNAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Dealer.dealerName</code> attribute. 
	 * @param value the dealerName - name of the dealer
	 */
	public void setAllDealerName(final Map<Language,String> value)
	{
		setAllDealerName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Dealer.driver</code> attribute.
	 * @return the driver - Driver
	 */
	public Set<Driver> getDriver(final SessionContext ctx)
	{
		final List<Driver> items = getLinkedItems( 
			ctx,
			false,
			TrainingCoreConstants.Relations.DRIVER2DEALER,
			"Driver",
			null,
			false,
			false
		);
		return new LinkedHashSet<Driver>(items);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Dealer.driver</code> attribute.
	 * @return the driver - Driver
	 */
	public Set<Driver> getDriver()
	{
		return getDriver( getSession().getSessionContext() );
	}
	
	public long getDriverCount(final SessionContext ctx)
	{
		return getLinkedItemsCount(
			ctx,
			false,
			TrainingCoreConstants.Relations.DRIVER2DEALER,
			"Driver",
			null
		);
	}
	
	public long getDriverCount()
	{
		return getDriverCount( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Dealer.driver</code> attribute. 
	 * @param value the driver - Driver
	 */
	public void setDriver(final SessionContext ctx, final Set<Driver> value)
	{
		setLinkedItems( 
			ctx,
			false,
			TrainingCoreConstants.Relations.DRIVER2DEALER,
			null,
			value,
			false,
			false,
			Utilities.getMarkModifiedOverride(DRIVER2DEALER_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Dealer.driver</code> attribute. 
	 * @param value the driver - Driver
	 */
	public void setDriver(final Set<Driver> value)
	{
		setDriver( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to driver. 
	 * @param value the item to add to driver - Driver
	 */
	public void addToDriver(final SessionContext ctx, final Driver value)
	{
		addLinkedItems( 
			ctx,
			false,
			TrainingCoreConstants.Relations.DRIVER2DEALER,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(DRIVER2DEALER_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to driver. 
	 * @param value the item to add to driver - Driver
	 */
	public void addToDriver(final Driver value)
	{
		addToDriver( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from driver. 
	 * @param value the item to remove from driver - Driver
	 */
	public void removeFromDriver(final SessionContext ctx, final Driver value)
	{
		removeLinkedItems( 
			ctx,
			false,
			TrainingCoreConstants.Relations.DRIVER2DEALER,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(DRIVER2DEALER_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from driver. 
	 * @param value the item to remove from driver - Driver
	 */
	public void removeFromDriver(final Driver value)
	{
		removeFromDriver( getSession().getSessionContext(), value );
	}
	
	/**
	 * @deprecated since 2011, use {@link Utilities#getMarkModifiedOverride(de.hybris.platform.jalo.type.RelationType)
	 */
	@Override
	@Deprecated(since = "2105", forRemoval = true)
	public boolean isMarkModifiedDisabled(final Item referencedItem)
	{
		ComposedType relationSecondEnd0 = TypeManager.getInstance().getComposedType("Driver");
		if(relationSecondEnd0.isAssignableFrom(referencedItem.getComposedType()))
		{
			return Utilities.getMarkModifiedOverride(DRIVER2DEALER_MARKMODIFIED);
		}
		ComposedType relationSecondEnd1 = TypeManager.getInstance().getComposedType("Vehicle");
		if(relationSecondEnd1.isAssignableFrom(referencedItem.getComposedType()))
		{
			return Utilities.getMarkModifiedOverride(VEHICLE2DEALER_MARKMODIFIED);
		}
		return true;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Dealer.vehicle</code> attribute.
	 * @return the vehicle - Vehicle
	 */
	public Set<Vehicle> getVehicle(final SessionContext ctx)
	{
		final List<Vehicle> items = getLinkedItems( 
			ctx,
			false,
			TrainingCoreConstants.Relations.VEHICLE2DEALER,
			"Vehicle",
			null,
			false,
			false
		);
		return new LinkedHashSet<Vehicle>(items);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Dealer.vehicle</code> attribute.
	 * @return the vehicle - Vehicle
	 */
	public Set<Vehicle> getVehicle()
	{
		return getVehicle( getSession().getSessionContext() );
	}
	
	public long getVehicleCount(final SessionContext ctx)
	{
		return getLinkedItemsCount(
			ctx,
			false,
			TrainingCoreConstants.Relations.VEHICLE2DEALER,
			"Vehicle",
			null
		);
	}
	
	public long getVehicleCount()
	{
		return getVehicleCount( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Dealer.vehicle</code> attribute. 
	 * @param value the vehicle - Vehicle
	 */
	public void setVehicle(final SessionContext ctx, final Set<Vehicle> value)
	{
		setLinkedItems( 
			ctx,
			false,
			TrainingCoreConstants.Relations.VEHICLE2DEALER,
			null,
			value,
			false,
			false,
			Utilities.getMarkModifiedOverride(VEHICLE2DEALER_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Dealer.vehicle</code> attribute. 
	 * @param value the vehicle - Vehicle
	 */
	public void setVehicle(final Set<Vehicle> value)
	{
		setVehicle( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to vehicle. 
	 * @param value the item to add to vehicle - Vehicle
	 */
	public void addToVehicle(final SessionContext ctx, final Vehicle value)
	{
		addLinkedItems( 
			ctx,
			false,
			TrainingCoreConstants.Relations.VEHICLE2DEALER,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(VEHICLE2DEALER_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to vehicle. 
	 * @param value the item to add to vehicle - Vehicle
	 */
	public void addToVehicle(final Vehicle value)
	{
		addToVehicle( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from vehicle. 
	 * @param value the item to remove from vehicle - Vehicle
	 */
	public void removeFromVehicle(final SessionContext ctx, final Vehicle value)
	{
		removeLinkedItems( 
			ctx,
			false,
			TrainingCoreConstants.Relations.VEHICLE2DEALER,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(VEHICLE2DEALER_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from vehicle. 
	 * @param value the item to remove from vehicle - Vehicle
	 */
	public void removeFromVehicle(final Vehicle value)
	{
		removeFromVehicle( getSession().getSessionContext(), value );
	}
	
}
