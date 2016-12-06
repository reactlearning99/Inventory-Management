package dwss.nv.gov;

import com.vaadin.annotations.AutoGenerated;
import com.vaadin.annotations.DesignRoot;
import com.vaadin.ui.Button;
import com.vaadin.ui.CheckBox;
import com.vaadin.ui.ComboBox;
import com.vaadin.ui.CssLayout;
import com.vaadin.ui.DateField;
import com.vaadin.ui.TextArea;
import com.vaadin.ui.TextField;
//import com.vaadin.ui.Numberfield;
import com.vaadin.ui.declarative.Design;

/** 
 * !! DO NOT EDIT THIS FILE !!
 * 
 * This class is generated by Vaadin Designer and will be overwritten.
 * 
 * Please make a subclass with logic and additional interfaces as needed,
 * e.g class LoginView extends LoginDesign implements View { … }
 */
@DesignRoot
@AutoGenerated
@SuppressWarnings("serial")
public class AssetFormDesign extends CssLayout {
    //protected TextField productName;
    protected TextField barCode;
    protected TextField propertyTag;
    protected TextField serialCode;
    protected ComboBox manufacturer;
//    protected TextField manufacturer;
    protected TextField assetModel;
    protected TextField description;
    protected ComboBox  assetType;
    protected TextField assetLocation;
    protected TextField office;
    protected CheckBox  computerRelated;
    protected TextField unit;
    protected CheckBox  isEquipment;
    protected TextField heatTicket;
    protected DateField verifiedDate;
    protected CheckBox  excessed;
    protected DateField dateEntered;
    protected DateField dateReceived;
    protected CheckBox 	itemReplaced;
//    protected TextField fourYearReplacement;
    protected TextField budgetCode;
    protected TextField purchaseOrder;
    protected TextField cost;
    protected ComboBox  vendor;
    protected DateField repApproved;
    protected DateField inventoryDate;
    protected TextArea  notes;
    protected TextArea  comments;
    protected TextArea  historyLog;
//    protected dwss.nv.gov.NumberField stockCount;
    
    
    //protected CategoryField category;
    //protected OfficeField officeCode;
    protected Button save;
    protected Button cancel;
    protected Button delete;

    public AssetFormDesign() {
        Design.read(this);
    }
}