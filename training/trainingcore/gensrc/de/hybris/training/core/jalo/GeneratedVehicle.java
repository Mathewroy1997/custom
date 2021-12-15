/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at 15-Dec-2021, 9:13:37 AM                     ---
 * ----------------------------------------------------------------
 *  
 * Copyright (c) 2021 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.training.core.jalo;

import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.JaloInvalidParameterException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.c2l.C2LManager;
import de.hybris.platform.jalo.c2l.Language;
import de.hybris.platform.jalo.product.Product;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.jalo.type.TypeManager;
import de.hybris.platform.util.BidirectionalOneToManyHandler;
import de.hybris.platform.util.Utilities;
import de.hybris.training.core.constants.TrainingCoreConstants;
import de.hybris.training.core.jalo.Dealer;
import de.hybris.training.core.jalo.Driver;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Generated class for type {@link de.hybris.training.core.jalo.Vehicle Vehicle}.
 */
@SuppressWarnings({"deprecation","unused","cast"})
public abstract class GeneratedVehicle extends Product
{
	/** Qualifier of the <code>Vehicle.vehicleRegistrationNumber</code> attribute **/
	public static final String VEHICLEREGISTRATIONNUMBER = "vehicleRegistrationNumber";
	/** Qualifier of the <code>Vehicle.vehicleDescription</code> attribute **/
	public static final String VEHICLEDESCRIPTION = "vehicleDescription";
	/** Qualifier of the <code>Vehicle.vehicleId</code> attribute **/
	public static final String VEHICLEID = "vehicleId";
	/** Qualifier of the <code>Vehicle.vehicleReview</code> attribute **/
	public static final String VEHICLEREVIEW = "vehicleReview";
	/** Qualifier of the <code>Vehicle.dealer</code> attribute **/
	public static final String DEALER = "dealer";
	/** Relation ordering override parameter constants for Vehicle2Dealer from ((trainingcore))*/
	protected static String VEHICLE2DEALER_SRC_ORDERED = "relation.Vehicle2Dealer.source.ordered";
	protected static String VEHICLE2DEALER_TGT_ORDERED = "relation.Vehicle2Dealer.target.ordered";
	/** Relation disable markmodifed parameter constants for Vehicle2Dealer from ((trainingcore))*/
	protected static String VEHICLE2DEALER_MARKMODIFIED = "relation.Vehicle2Dealer.markmodified";
	/** Qualifier of the <code>Vehicle.driver</code> attribute **/
	public static final String DRIVER = "driver";
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n DRIVER's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedVehicle> DRIVERHANDLER = new BidirectionalOneToManyHandler<GeneratedVehicle>(
	TrainingCoreConstants.TC.VEHICLE,
	false,
	"driver",
	null,
	false,
	true,
	CollectionType.SET
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(Product.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(VEHICLEREGISTRATIONNUMBER, AttributeMode.INITIAL);
		tmp.put(VEHICLEDESCRIPTION, AttributeMode.INITIAL);
		tmp.put(VEHICLEID, AttributeMode.INITIAL);
		tmp.put(VEHICLEREVIEW, AttributeMode.INITIAL);
		tmp.put(DRIVER, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	@Override
	protected Item createItem(final SessionContext ctx, final ComposedType type, final ItemAttributeMap allAttributes) throws JaloBusinessException
	{
		DRIVERHANDLER.newInstance(ctx, allAttributes);
		return super.createItem( ctx, type, allAttributes );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Vehicle.dealer</code> attribute.
	 * @return the dealer - Dealer
	 */
	public Set<Dealer> getDealer(final SessionContext ctx)
	{
		final List<Dealer> items = getLinkedItems( 
			ctx,
			true,
			TrainingCoreConstants.Relations.VEHICLE2DEALER,
			"Dealer",
			null,
			false,
			false
		);
		return new LinkedHashSet<Dealer>(items);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Vehicle.dealer</code> attribute.
	 * @return the dealer - Dealer
	 */
	public Set<Dealer> getDealer()
	{
		return getDealer( getSession().getSessionContext() );
	}
	
	public long getDealerCount(final SessionContext ctx)
	{
		return getLinkedItemsCount(
			ctx,
			true,
			TrainingCoreConstants.Relations.VEHICLE2DEALER,
			"Dealer",
			null
		);
	}
	
	public long getDealerCount()
	{
		return getDealerCount( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Vehicle.dealer</code> attribute. 
	 * @param value the dealer - Dealer
	 */
	public void setDealer(final SessionContext ctx, final Set<Dealer> value)
	{
		setLinkedItems( 
			ctx,
			true,
			TrainingCoreConstants.Relations.VEHICLE2DEALER,
			null,
			value,
			false,
			false,
			Utilities.getMarkModifiedOverride(VEHICLE2DEALER_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Vehicle.dealer</code> attribute. 
	 * @param value the dealer - Dealer
	 */
	public void setDealer(final Set<Dealer> value)
	{
		setDealer( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to dealer. 
	 * @param value the item to add to dealer - Dealer
	 */
	public void addToDealer(final SessionContext ctx, final Dealer value)
	{
		addLinkedItems( 
			ctx,
			true,
			TrainingCoreConstants.Relations.VEHICLE2DEALER,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(VEHICLE2DEALER_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to dealer. 
	 * @param value the item to add to dealer - Dealer
	 */
	public void addToDealer(final Dealer value)
	{
		addToDealer( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from dealer. 
	 * @param value the item to remove from dealer - Dealer
	 */
	public void removeFromDealer(final SessionContext ctx, final Dealer value)
	{
		removeLinkedItems( 
			ctx,
			true,
			TrainingCoreConstants.Relations.VEHICLE2DEALER,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(VEHICLE2DEALER_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from dealer. 
	 * @param value the item to remove from dealer - Dealer
	 */
	public void removeFromDealer(final Dealer value)
	{
		removeFromDealer( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Vehicle.driver</code> attribute.
	 * @return the driver - Driver
	 */
	public Driver getDriver(final SessionContext ctx)
	{
		return (Driver)getProperty( ctx, DRIVER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Vehicle.driver</code> attribute.
	 * @return the driver - Driver
	 */
	public Driver getDriver()
	{
		return getDriver( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Vehicle.driver</code> attribute. 
	 * @param value the driver - Driver
	 */
	public void setDriver(final SessionContext ctx, final Driver value)
	{
		DRIVERHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Vehicle.driver</code> attribute. 
	 * @param value the driver - Driver
	 */
	public void setDriver(final Driver value)
	{
		setDriver( getSession().getSessionContext(), value );
	}
	
	/**
	 * @deprecated since 2011, use {@link Utilities#getMarkModifiedOverride(de.hybris.platform.jalo.type.RelationType)
	 */
	@Override
	@Deprecated(since = "2105", forRemoval = true)
	public boolean isMarkModifiedDisabled(final Item referencedItem)
	{
		ComposedType relationSecondEnd0 = TypeManager.getInstance().getComposedType("Dealer");
		if(relationSecondEnd0.isAssignableFrom(referencedItem.getComposedType()))
		{
			return Utilities.getMarkModifiedOverride(VEHICLE2DEALER_MARKMODIFIED);
		}
		return true;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Vehicle.vehicleDescription</code> attribute.
	 * @return the vehicleDescription - vehicle description
	 */
	public String getVehicleDescription(final SessionContext ctx)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedVehicle.getVehicleDescription requires a session language", 0 );
		}
		return (String)getLocalizedProperty( ctx, VEHICLEDESCRIPTION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Vehicle.vehicleDescription</code> attribute.
	 * @return the vehicleDescription - vehicle description
	 */
	public String getVehicleDescription()
	{
		return getVehicleDescription( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Vehicle.vehicleDescription</code> attribute. 
	 * @return the localized vehicleDescription - vehicle description
	 */
	public Map<Language,String> getAllVehicleDescription(final SessionContext ctx)
	{
		return (Map<Language,String>)getAllLocalizedProperties(ctx,VEHICLEDESCRIPTION,C2LManager.getInstance().getAllLanguages());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Vehicle.vehicleDescription</code> attribute. 
	 * @return the localized vehicleDescription - vehicle description
	 */
	public Map<Language,String> getAllVehicleDescription()
	{
		return getAllVehicleDescription( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Vehicle.vehicleDescription</code> attribute. 
	 * @param value the vehicleDescription - vehicle description
	 */
	public void setVehicleDescription(final SessionContext ctx, final String value)
	{
		if ( ctx == null) 
		{
			throw new JaloInvalidParameterException( "ctx is null", 0 );
		}
		if( ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedVehicle.setVehicleDescription requires a session language", 0 );
		}
		setLocalizedProperty(ctx, VEHICLEDESCRIPTION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Vehicle.vehicleDescription</code> attribute. 
	 * @param value the vehicleDescription - vehicle description
	 */
	public void setVehicleDescription(final String value)
	{
		setVehicleDescription( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Vehicle.vehicleDescription</code> attribute. 
	 * @param value the vehicleDescription - vehicle description
	 */
	public void setAllVehicleDescription(final SessionContext ctx, final Map<Language,String> value)
	{
		setAllLocalizedProperties(ctx,VEHICLEDESCRIPTION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Vehicle.vehicleDescription</code> attribute. 
	 * @param value the vehicleDescription - vehicle description
	 */
	public void setAllVehicleDescription(final Map<Language,String> value)
	{
		setAllVehicleDescription( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Vehicle.vehicleId</code> attribute.
	 * @return the vehicleId - vehicle ID
	 */
	public String getVehicleId(final SessionContext ctx)
	{
		return (String)getProperty( ctx, VEHICLEID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Vehicle.vehicleId</code> attribute.
	 * @return the vehicleId - vehicle ID
	 */
	public String getVehicleId()
	{
		return getVehicleId( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Vehicle.vehicleId</code> attribute. 
	 * @param value the vehicleId - vehicle ID
	 */
	public void setVehicleId(final SessionContext ctx, final String value)
	{
		setProperty(ctx, VEHICLEID,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Vehicle.vehicleId</code> attribute. 
	 * @param value the vehicleId - vehicle ID
	 */
	public void setVehicleId(final String value)
	{
		setVehicleId( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Vehicle.vehicleRegistrationNumber</code> attribute.
	 * @return the vehicleRegistrationNumber - vehicle number
	 */
	public String getVehicleRegistrationNumber(final SessionContext ctx)
	{
		return (String)getProperty( ctx, VEHICLEREGISTRATIONNUMBER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Vehicle.vehicleRegistrationNumber</code> attribute.
	 * @return the vehicleRegistrationNumber - vehicle number
	 */
	public String getVehicleRegistrationNumber()
	{
		return getVehicleRegistrationNumber( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Vehicle.vehicleRegistrationNumber</code> attribute. 
	 * @param value the vehicleRegistrationNumber - vehicle number
	 */
	public void setVehicleRegistrationNumber(final SessionContext ctx, final String value)
	{
		setProperty(ctx, VEHICLEREGISTRATIONNUMBER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Vehicle.vehicleRegistrationNumber</code> attribute. 
	 * @param value the vehicleRegistrationNumber - vehicle number
	 */
	public void setVehicleRegistrationNumber(final String value)
	{
		setVehicleRegistrationNumber( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Vehicle.vehicleReview</code> attribute.
	 * @return the vehicleReview - vehicle review
	 */
	public String getVehicleReview(final SessionContext ctx)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedVehicle.getVehicleReview requires a session language", 0 );
		}
		return (String)getLocalizedProperty( ctx, VEHICLEREVIEW);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Vehicle.vehicleReview</code> attribute.
	 * @return the vehicleReview - vehicle review
	 */
	public String getVehicleReview()
	{
		return getVehicleReview( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Vehicle.vehicleReview</code> attribute. 
	 * @return the localized vehicleReview - vehicle review
	 */
	public Map<Language,String> getAllVehicleReview(final SessionContext ctx)
	{
		return (Map<Language,String>)getAllLocalizedProperties(ctx,VEHICLEREVIEW,C2LManager.getInstance().getAllLanguages());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Vehicle.vehicleReview</code> attribute. 
	 * @return the localized vehicleReview - vehicle review
	 */
	public Map<Language,String> getAllVehicleReview()
	{
		return getAllVehicleReview( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Vehicle.vehicleReview</code> attribute. 
	 * @param value the vehicleReview - vehicle review
	 */
	public void setVehicleReview(final SessionContext ctx, final String value)
	{
		if ( ctx == null) 
		{
			throw new JaloInvalidParameterException( "ctx is null", 0 );
		}
		if( ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedVehicle.setVehicleReview requires a session language", 0 );
		}
		setLocalizedProperty(ctx, VEHICLEREVIEW,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Vehicle.vehicleReview</code> attribute. 
	 * @param value the vehicleReview - vehicle review
	 */
	public void setVehicleReview(final String value)
	{
		setVehicleReview( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Vehicle.vehicleReview</code> attribute. 
	 * @param value the vehicleReview - vehicle review
	 */
	public void setAllVehicleReview(final SessionContext ctx, final Map<Language,String> value)
	{
		setAllLocalizedProperties(ctx,VEHICLEREVIEW,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Vehicle.vehicleReview</code> attribute. 
	 * @param value the vehicleReview - vehicle review
	 */
	public void setAllVehicleReview(final Map<Language,String> value)
	{
		setAllVehicleReview( getSession().getSessionContext(), value );
	}
	
}
