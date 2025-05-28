package com.anhtester;

public class LocatorsCRM {
    public static String url = "https://crm.anhtester.com/admin/authentication";

    //Locator for Login Page
    public static String headerLoginPage = "//h1[normalize-space()='Login']";
    public static String inputEmail = "//input[@id='email']";
    public static String inputPassword = "//input[@id='password']";
    public static String buttonLogin = "//button[normalize-space()='Login']";
    public static String checkboxRememberMe = "//input[@id='remember']";
    public static String labelRememberMe = "//label[normalize-space()='Remember me']";
    public static String linkForgotPassword = "//a[normalize-space()='Forgot Password?']";
    public static String alertErrorMessage = "//div[contains(@class,'alert-danger')]";
    public static String alertErrorEmailRequired = "//div[normalize-space()='The Email Address field is required.']";
    public static String alertErrorPasswordRequired = "//div[normalize-space()='The Password field is required.']";

    //    Locator for Customer
    public static String linkMenuCustomer = "//ul[@id='side-menu']//a[@href='https://crm.anhtester.com/admin/clients']";

    public static String buttonNewCustomer = "//a[normalize-space()='New Customer']";
    public static String buttonImportCustomer = "//a[normalize-space()='Import Customers']";
    public static String buttonContacts = "//a[normalize-space()='Contacts']";

    public static String buttonFilter = "//div[@id='vueApp']/descendant::button[contains(@class,'dropdown-toggle')]";

    public static String linkNewFilter = "//div[@id='vueApp']/descendant::a[text()='New Filter']";
    public static String titleAddNewFilter = "//h4[text()='Create Filter']";
    public static String buttonCloseCreateFilter = "//h4[normalize-space()='Create Filter']/preceding-sibling::button";
    public static String dropdownAddRule = "//button[@data-id='clientsRules']";
    public static String inputSearchRule = "//button[@data-id='clientsRules']/following-sibling::div//input";
    public static String switchSaveFilter = "//span[text()='Save Filter']/following-sibling::div//input[@id='clientsSaveFilter']";
    public static String buttonApply = "//button[text()='Apply']";
    public static String inputFilterName = "//input[@id='filter_name']";
    public static String checkboxShareFilter = "//input[@id='clientsShareFilter']";
    public static String labelShareFilter = "//label[normalize-space()='Share with other team members?']";
    public static String checkboxDefaultFilter = "//input[@id='clientsDefaultFilter']";
    public static String labelDefaultFilter = "//label[normalize-space()='Mark as default']";
    public static String buttonApplyAndSave = "//button[text()='Apply and Save']";

    public static String headerCustomerPage = "//span[normalize-space()='Customers Summary']";
    public static String numberTotalCustomers = "//span[normalize-space()='Total Customers']/preceding-sibling::span";
    public static String labelTotalCustomers = "//span[normalize-space()='Total Customers']";
    public static String numberActiveCustomers = "//span[normalize-space()='Active Customers']/preceding-sibling::span";
    public static String labelActiveCustomers = "//span[normalize-space()='Active Customers']";
    public static String numberInactiveCustomers = "//span[normalize-space()='Inactive Customers']/preceding-sibling::span";
    public static String labelInactiveCustomers = "//span[normalize-space()='Inactive Customers']";
    public static String numberActiveContacts = "//span[normalize-space()='Active Contacts']/preceding-sibling::span";
    public static String labelActiveContacts = "//span[normalize-space()='Active Contacts']";
    public static String numberInactiveContacts = "//span[normalize-space()='Inactive Contacts']/preceding-sibling::span";
    public static String labelInactiveContacts = "//span[normalize-space()='Inactive Contacts']";
    public static String numberContactsLoggedInToday = "//span[normalize-space()='Contacts Logged In Today']/preceding-sibling::span";
    public static String labelContactsLoggedInToday = "//span[normalize-space()='Contacts Logged In Today']";

    public static String dropdownNumberOfPage = "//div[@id='clients_length']/descendant::select[@name='clients_length']";
    public static String buttonExport = "//span[text()='Export']/parent::button";
    public static String buttonBulkActions = "//span[text()='Bulk Actions']/parent::button";
    public static String iconReload = "//div[@id='clients_length']/following-sibling::div//button[contains(@class,'btn-dt-reload')]";

    public static String iconSearch = "//div[@id='clients_filter']/descendant::span[@class='input-group-addon']";
    public static String inputSearch = "//div[@id='clients_filter']//input[@type='search']";
    public static String firstRowItemCustomer="//table[@id='clients']//tbody/tr[1]/td[3]/a";

    public static String checkboxAll = "//input[@id='mass_select_all' and @type='checkbox]";
    public static String columnNumberOfCompany = "//th[@id='th-number' and normalize-space()='#']";
    public static String columnCompany = "//th[@id='th-company' and normalize-space()='Company']";
    public static String columnPrimaryContact = "//th[@id='th-primary-contact' and normalize-space()='Primary Contact']";
    public static String columnPrimaryEmail = "//th[@id='th-primary-contact-email' and normalize-space()='Primary Email']";
    public static String columnPhone = "//th[@id='th-phone' and normalize-space()='Phone']";
    public static String columnActive = "//th[@id='th-active' and normalize-space()='Active']";
    public static String columnGroups = "//th[@id='th-groups' and normalize-space()='Groups']";
    public static String columnDateCreated = "//th[@id='th-date-created' and normalize-space()='Date Created']";

    public static String linkView = "";
    public static String linkDelete = "";

    //    Locator for Add New Customer
    //    1. Tab Customer Details
    public static String tabCustomerDetails = "//a[normalize-space()='Customer Details' and @role='tab']";
    public static String inputCompany = "//input[@id='company']";
    public static String inputVatNumber = "//input[@id='vat']";
    public static String inputPhone = "//input[@id='phonenumber']";
    public static String inputWebsite = "//input[@id='website']";

    public static String dropdownGroups = "//button[contains(@data-id,'groups_in')]";
    public static String inputSearchGroups = "//button[contains(@data-id,'groups_in')]/following-sibling::div//input[@type='search']";

    public static String dropdownCurrency = "//button[@data-id='default_currency']";
    public static String inputSearchCurrency = "//button[@data-id='default_currency']/following-sibling::div//input[@type='search']";

    public static String dropdownDefaultLanguage = "//button[@data-id='default_language']";
//    C1:
    public static String optionDefaultLanguage = "//span[normalize-space()='%s']";

//    C2:
    public static String selectXPathLanguage(String language) {
        String xpathDefaultLanguage = "//span[normalize-space()='" + language + "']";
        return xpathDefaultLanguage;
    }

    public static String inputAddress = "//textarea[@id='address']";
    public static String inputCity = "//input[@id='city']";
    public static String inputState = "//input[@id='state']";
    public static String inputZipCode = "//input[@id='zip']";
    public static String dropdownCountry = "//button[@data-id='country']";
    public static String inputSearchCountry = "//button[@data-id='country']/following-sibling::div//input[@type='search']";
    public static String buttonSaveAndCreateContact = "//button[normalize-space()='Save and create contact' and contains(@class,'save-and-add-contact')]";
    public static String buttonSave = "//button[normalize-space()='Save' and contains(@class,'only-save')]";
    public static String warningErrorRequireCompany = "//p[@id='company-error']";
    // Pop-up Add New Groups
    public static String buttonAddNewGroups = "//label[normalize-space()='Groups']/following-sibling::div/descendant::a";
    public static String labelAddNewCustomerGroup = "//span[normalize-space()='Add New Customer Group']";
    public static String iconCloseAddNewCustomerGroup = "//span[normalize-space()='Add New Customer Group']/preceding::span[text()='×']";
    public static String inputNameNewCustomerGroup = "//form[@id='customer-group-modal']/descendant::input[@id='name']";
    public static String buttonCloseNewCustomerGroup = "//button[text()='Close']";
    public static String buttonSaveNewCustomerGroup = "//button[text()='Save']";
    // 2. Tab Billing & Shipping
    public static String tabBillingShipping = "//a[normalize-space()='Billing & Shipping' and @role='tab']";
    public static String labelBillingAddress = "//a[normalize-space()='Same as Customer Info']/parent::h4";
    public static String labelSameAsCustomerInfo = "//a[normalize-space()='Same as Customer Info' and contains(@class,'billing-same-as-customer')]";
    public static String labelShippingAddress = "//span[normalize-space()='Shipping Address']";
    public static String labelCopyBillingAddress = "//a[normalize-space()='Copy Billing Address']";
    // Billing
    public static String inputBillingStreet = "//textarea[@id='billing_street']";
    public static String inputBillingCity = "//input[@id='billing_city']";
    public static String inputBillingState = "//input[@id='billing_state']";
    public static String inputBillingZipCode = "//input[@id='billing_zip']";
    public static String dropdownBillingCountry = "//button[@data-id='billing_country']";
    public static String dropdownBillingSearchCountry = "//button[@data-id='billing_country']/following-sibling::div//input[@type='search']";
    // Shipping
    public static String inputShippingStreet = "//textarea[@id='shipping_street']";
    public static String inputShippingCity = "//input[@id='shipping_city']";
    public static String inputShippingState = "//input[@id='shipping_state']";
    public static String inputShippingZipCode = "//input[@id='shipping_zip']";
    public static String dropdownShippingCountry = "//button[@data-id='shipping_country']";
    public static String dropdownShippingSearchCountry = "//button[@data-id='shipping_country']/following-sibling::div//input[@type='search']";

    //    Locator for Projects
    public static String linkMenuProjects = "//ul[@id='side-menu']//a[@href='https://crm.anhtester.com/admin/projects']";
    public static String buttonNewProject = "//a[normalize-space()='New Project' and @href='https://crm.anhtester.com/admin/projects/project']";
    //Project
    public static String inputProjectName = "//input[@id='name']";
    public static String dropdownCustomer = "//button[@data-id='clientid']";
    public static String inputSearchCustomer = "//button[@data-id='clientid']/following-sibling::div//input[@type='search']";
    public static String checkboxCalculateProgressThroughTasks = "//input[@id='progress_from_tasks']";
    public static String switchProgress = "//label[contains(normalize-space(),'Progress')]/following-sibling::div/span";
    public static String dropdownBillingType = "//button[@data-id='billing_type']";
    public static String dropdownStatus = "//button[@data-id='status']";
    public static String inputEstimatedHours = "//input[@id='estimated_hours']";
    public static String dropdownMembers = "//button[contains(@data-id,'project_members')]";
    public static String inputSearchMembers = "//button[contains(@data-id,'project_members')]/following-sibling::div//input[@type='search']";
    public static String inputStartDate = "//input[@id='start_date']";
    public static String calendarStartDate = "//input[@id='start_date']/following-sibling::div[@class='input-group-addon']";
    public static String inputDeadline = "//input[@id='deadline']";
    public static String calendarDeadline = "//input[@id='deadline']/following-sibling::div[@class='input-group-addon']";
    public static String inputTags = "//label[normalize-space()='Tags']/following-sibling::ul//input";

    public static String inputDescription = "//p[text()='Description']/following-sibling::div[@app-field-wrapper='description']";
    public static String buttonFile = "//span[text()='File']/parent::button";
    public static String buttonEdit = "//span[text()='Edit']/parent::button";
    public static String buttonView = "//span[text()='View']/parent::button";
    public static String buttonInsert = "//span[text()='Insert']/parent::button";
    public static String buttonFormat = "//span[text()='Format']/parent::button";
    public static String buttonTools = "//span[text()='Tools']/parent::button";
    public static String buttonTable = "//span[text()='Table']/parent::button";
    public static String dropdownSystemFont = "//p[text()='Description']/following-sibling::div//button[@title='Font System Font']";
    public static String dropdownFontSize = "//p[text()='Description']/following-sibling::div//button[starts-with(@title,'Font size')]";
    public static String dropdownColorText = "//p[text()='Description']/following::div[@aria-label='Text color Black']//span[contains(@class,'tox-split-button__chevron')]";
    public static String dropdownBackgroundColorText = "//p[text()='Description']/following::div[@aria-label='Background color Black']//span[contains(@class,'tox-split-button__chevron')]";
    public static String buttonBold = "//p[text()='Description']/following::button[@title='Bold']";
    public static String buttonItalic = "//p[text()='Description']/following::button[@title='Italic']";
    public static String buttonAlignLeft = "//p[text()='Description']/following::button[@title='Align left']";
    public static String buttonAlignCenter = "//p[text()='Description']/following::button[@title='Align center']";
    public static String buttonAlignRight = "//p[text()='Description']/following::button[@title='Align right']";
    public static String buttonAlignJustify = "//p[text()='Description']/following::button[@title='Justify']";
    public static String buttonRevealOrHideAdditional = "//p[text()='Description']/following::button[@title='Reveal or hide additional toolbar items']";

    public static String checkboxSendProjectCreatedEmail = "//input[@id='send_created_email']";
    public static String buttonSaveProjects = "//button[normalize-space()='Save']";
}
