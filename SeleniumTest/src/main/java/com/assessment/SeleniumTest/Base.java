package com.assessment.SeleniumTest;

import java.util.Random;

public class Base {

	private String propFileLocation = "D:\\\\workspace\\\\Selenium\\\\SeleniumTest\\\\src\\\\main\\\\java\\\\com\\\\assessment\\\\SeleniumTest\\\\prop.properties";
	private String chromeDriverLocation ="C:\\Users\\manish\\Desktop\\New folder (3)\\chromedriver.exe";
	private String ghekoDriverLocation ="C:\\Users\\manish\\Desktop\\New folder (3)\\geckodriver.exe";		
	
	
	private String selectItem1="//div[@class='demo-frame']/ol[@id='selectable']/li[1]";
	private String nameItem1="//div[@class='demo-frame']/ol[@id='selectable']/li[1]/text()";
	
	private String selectItem2="//div[@class='demo-frame']/ol[@id='selectable']/li[2]";
	private String nameItem2="//div[@class='demo-frame']/ol[@id='selectable']/li[2]/text()";

	private String selectItem3="//div[@class='demo-frame']/ol[@id='selectable']/li[3]";
	private String nameItem3="//div[@class='demo-frame']/ol[@id='selectable']/li[3]/text()";
	
	private String selectItem4="//div[@class='demo-frame']/ol[@id='selectable']/li[4]";
	private String nameItem4="//div[@class='demo-frame']/ol[@id='selectable']/li[4]/text()";
	
	private String selectItem5="//div[@class='demo-frame']/ol[@id='selectable']/li[5]";
	private String nameItem5="//div[@class='demo-frame']/ol[@id='selectable']/li[5]/text()";
	
	private String selectItem6="//div[@class='demo-frame']/ol[@id='selectable']/li[6]";
	private String nameItem6="//div[@class='demo-frame']/ol[@id='selectable']/li[6]/text()";
	
	private String selectItem7="//div[@class='demo-frame']/ol[@id='selectable']/li[7]";
	private String nameItem7="//div[@class='demo-frame']/ol[@id='selectable']/li[7]/text()";
	
	private String firstName = "//div[@id='content']/div[@class='demo-frame']/div/form/input[@class='firstname']";
	private String lastName  = "//div[@id='content']/div[@class='demo-frame']/div/form/input[@id='lname']";
	private String country   = "//div[@id='content']/div[@class='demo-frame']/div/form/input[@name='country']";
	private String subject   = "//div[@id='content']/div[@class='demo-frame']/div/form/textarea[@id='subject']";
	private String submit    = "//div[@id='content']/div[@class='demo-frame']/div/form/input[@type='submit']";
	
	private String datePicker = "//input[@id='datepicker']";
	private String dobYear    = "//div[@id='ui-datepicker-div']/div/div/span[@class='ui-datepicker-year']";
	private String dobMonth   = "//div[@id='ui-datepicker-div']/div/div/span[@class='ui-datepicker-month']";
	private String prev       = "//div[@id='ui-datepicker-div']/div/a[@title='Prev']";
	private String datePickerTD="//div[@id='ui-datepicker-div']//td";
	
	private String speedButton = "//span[@id='speed-button']";
	private String fileButton = "//span[@id='files-button']";
	private String numberButton = "//span[@id='number-button']";
	private String salutationButton = "//span[@id='salutation-button']";
	private String speedType = "//div[@id='ui-id-5']";
	private String fileType = "//div[@id='ui-id-8']";
	private String number = "//div[@id='ui-id-15']";
	private String salutation = "//div[@id='ui-id-30']";
	
	private String carType = "//span[@id='car-type-button']";
	private String compact = "//div[@id='ui-id-1']";
	private String midSize = "//div[@id='ui-id-2']";
	private String fullSize = "//div[@id='ui-id-3']";
	private String SUV = "//div[@id='ui-id-4']";
	private String luxury = "//div[@id='ui-id-5']";
	private String truck = "//div[@id='ui-id-6']";
	private String van = "//div[@id='ui-id-7']";
	
    private String automatic = "//div[@id='content']/div[2]/div/fieldset[1]/div/label[2]";
    private String standard = "//div[@id='content']/div[2]/div/fieldset[1]/div/label[1]";
    private String insurance = "//div[@id='content']/div[2]/div/fieldset[1]/div/label[3]";
    private String carsRequired = "//div[@id='content']/div[2]/div/fieldset[1]/div/span[2]/a[1]";
    private String bookNow = "//div[@id='content']/div[2]/div/fieldset[1]/div/button";
	
    private String olayUkRegisterLink = "//div[@id='phdesktopheader_0_phdesktopheadertop_2_pnlCRMHeaderLink']/div/a[2]";
    private String olayUkSignIn = "//div[@id='phdesktopheader_0_phdesktopheadertop_2_pnlCRMHeaderLink']/div/a[1]";  
    private String olayUkEnterEmail = "//input[@id='phdesktopbody_0_grs_account[emails][0][address]']";
    private String olayUkEnterPassword = "//input[@id='phdesktopbody_0_grs_account[password][password]']";
    private String olayUkconfirmPassword = "//input[@id='phdesktopbody_0_grs_account[password][confirm]']";
//    private String UkDay = "//select[@id='phdesktopbody_0_grs_consumer[birthdate][day]']";
    private String UkDay = "#phdesktopbody_0_grs_consumer\\[birthdate\\]\\[day\\] > option:nth-child(";
    private String general = ")";
    private String UkMonth = "#phdesktopbody_0_grs_consumer\\[birthdate\\]\\[month\\] > option:nth-child(";
    private String UkYear = "#phdesktopbody_0_grs_consumer\\[birthdate\\]\\[year\\] > option:nth-child(";
    private String UkRegisterButton = "//input[@id='phdesktopbody_0_submit']";
    private String skipUk ="//a[@id='phdesktopbody_1_SiteLink']";
    private String olayUkSignOut="//a[@id='phdesktopheader_0_phdesktopheadertop_2_LogOffLink']";
    private String LogOutButton="//a[@id='phdesktopheader_0_phdesktopheadertop_2_anchrContinue']";
    private String username="//input[@id='phdesktopbody_0_username']";
    private String password1="//input[@id='phdesktopbody_0_password']";	
    private String UserSignInBtn="//input[@id='phdesktopbody_0_SIGN IN']";
    
	private String randomEmail=getAlphaNumericString()+"@xyz.com";
    private String password="q1234567";
    
    
    private String oneWay="//div[@id='root']/div/div[2]/div/div/div[1]/ul/li[1]";
    private String roundTrip="//div[@id='root']/div/div[2]/div/div/div[1]/ul/li[2]";
    private String fromCity="//input[@id='fromCity']";
    private String enterCity1="//div[@id='root']/div/div[2]/div/div/div[2]/div[1]/div[1]/div[1]/div/div/div/input";
    private String enterCity2="//div[@id='root']/div/div[2]/div/div/div[2]/div[1]/div[2]/div[1]/div/div/div/input";
    
	private String toCity="//input[@id='toCity']";
    private String selectCity="//li[@id='react-autowhatever-1-section-0-item-0']";
    private String departureDate="//div[@id='root']/div/div[2]/div/div/div[2]/div[1]/div[3]/label";
    private String depMonYear="//div[@id='root']/div/div[2]/div/div/div[2]/div[1]/div[3]/div[1]/div/div/div/div[2]/div/div[2]/div[1]/div[1]/div";
    private String next="//div[@id='root']/div/div[2]/div/div/div[2]/div[1]/div[3]/div[1]/div/div/div/div[2]/div/div[1]/span[2]";
    private String mmtdatePickerTD="//div[@id='root']/div/div[2]/div/div/div[2]/div[1]/div[3]/div[1]/div/div/div/div[2]/div/div[2]/div[1]/div[3]/div/div";
    private String mmtdatePickerTR="/div/p";
   
	private String mmtSearch="//div[@id='root']/div/div[2]/div/div/div[2]/p/a";
    private String directcheapestFlight="//button[@class='fli_primary_btn  text-uppercase ']";
    private String viewFares="//button[@class='ViewFareBtn  text-uppercase ']";
    private String roundBook ="//button[@class='fli_primary_btn text-uppercase ']";
	private String cheapestFlight="//div[@class='fli-list one-way']/div[3]/div[1]/div[2]/div[2]/button";
    private String nonStopFlight="#stop_group > span:nth-child(2) > label > span.box";
    private String nonStopFlight1="#section--wrapper > div.fli-intl-rhs.pull-left.end > div:nth-child(2) > div > span:nth-child(1) > label > span";
	private String verifySource="//div[@id='root']//div[@class='fli-time-section pull-left']/p[2]/span";
    private String verifyDestination="//div[@id='root']//div[@class='fli-time-section pull-left']/p[3]/span";
    private String verifyDate="//div[@id='root']//div[@class='pull-left']/div[1]/p[1]";
    private String cntinue="//div[@id='left-side--wrapper']/div/div/div[5]/div[3]/button";
    
    
    
    public String getCntinue() {
		return cntinue;
	}
	public String getRoundBook() {
		return roundBook;
	}
    public void setNonStopFlight1(String nonStopFlight1) {
		this.nonStopFlight1 = nonStopFlight1;
	}
    public String getNonStopFlight1() {
		return nonStopFlight1;
	}
    public String getVerifyDate() {
		return verifyDate;
	}
	public void setVerifyDate(String verifyDate) {
		this.verifyDate = verifyDate;
	}
	public String getVerifyDestination() {
		return verifyDestination;
	}
	public void setVerifyDestination(String verifyDestination) {
		this.verifyDestination = verifyDestination;
	}
	public String getVerifySource() {
		return verifySource;
	}
	public void setVerifySource(String verifySource) {
		this.verifySource = verifySource;
	}
	public String getNonStopFlight() {
		return nonStopFlight;
	}
	public void setNonStopFlight(String nonStopFlight) {
		this.nonStopFlight = nonStopFlight;
	}
	public String getDirectcheapestFlight() {
		return directcheapestFlight;
	}
	public void setDirectcheapestFlight(String directcheapestFlight) {
		this.directcheapestFlight = directcheapestFlight;
	}
	public String getViewFares() {
		return viewFares;
	}
	public void setViewFares(String viewFares) {
		this.viewFares = viewFares;
	}
	public String getMmtdatePickerTR() {
		return mmtdatePickerTR;
	}
	public void setMmtdatePickerTR(String mmtdatePickerTR) {
		this.mmtdatePickerTR = mmtdatePickerTR;
	}
    public String getCheapestFlight() {
		return cheapestFlight;
	}
	public void setCheapestFlight(String cheapestFlight) {
		this.cheapestFlight = cheapestFlight;
	}
	public String getMmtSearch() {
		return mmtSearch;
	}
	public void setMmtSearch(String mmtSearch) {
		this.mmtSearch = mmtSearch;
	}
	public String getMmtdatePickerTD() {
		return mmtdatePickerTD;
	}
	public void setMmtdatePickerTD(String mmtdatePickerTD) {
		this.mmtdatePickerTD = mmtdatePickerTD;
	}
	public String getNext() {
		return next;
	}
	public void setNext(String next) {
		this.next = next;
	}
	public String getDepMonYear() {
		return depMonYear;
	}
	public void setDepMonYear(String depMonYear) {
		this.depMonYear = depMonYear;
	}
	public String getEnterCity2() {
		return enterCity2;
	}
	public void setEnterCity2(String enterCity2) {
		this.enterCity2 = enterCity2;
	}
	public String getEnterCity1() {
		return enterCity1;
	}
	public String getDatePickerTD() {
		return datePickerTD;
	}
	public void setDatePickerTD(String datePickerTD) {
		this.datePickerTD = datePickerTD;
	}
	public void setEnterCity1(String enterCity1) {
		this.enterCity1 = enterCity1;
	}
    public String getOneWay() {
		return oneWay;
	}
	public void setOneWay(String oneWay) {
		this.oneWay = oneWay;
	}
	public String getRoundTrip() {
		return roundTrip;
	}
	public void setRoundTrip(String roundTrip) {
		this.roundTrip = roundTrip;
	}
	public String getFromCity() {
		return fromCity;
	}
	public void setFromCity(String fromCity) {
		this.fromCity = fromCity;
	}
	public String getToCity() {
		return toCity;
	}
	public void setToCity(String toCity) {
		this.toCity = toCity;
	}
	public String getSelectCity() {
		return selectCity;
	}
	public void setSelectCity(String selectCity) {
		this.selectCity = selectCity;
	}
	public String getDepartureDate() {
		return departureDate;
	}
	public void setDepartureDate(String departureDate) {
		this.departureDate = departureDate;
	}
	public String getOlayUkSignOut() {
		return olayUkSignOut;
	}
	public void setOlayUkSignOut(String olayUkSignOut) {
		this.olayUkSignOut = olayUkSignOut;
	}
	public String getLogOutButton() {
		return LogOutButton;
	}
	public void setLogOutButton(String logOutButton) {
		LogOutButton = logOutButton;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword1() {
		return password1;
	}
	public void setPassword1(String password1) {
		this.password1 = password1;
	}
	public String getUserSignInBtn() {
		return UserSignInBtn;
	}
	public void setUserSignInBtn(String userSignInBtn) {
		UserSignInBtn = userSignInBtn;
	}
	public String getSkipUk() {
		return skipUk;
	}
	public void setSkipUk(String skipUk) {
		this.skipUk = skipUk;
	}
    public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getRandomEmail() {
		return randomEmail;
	}
	public void setRandomEmail(String randomEmail) {
		this.randomEmail = randomEmail;
	}
	public String getAlphaNumericString() 
    { 
        String AlphaNumericString =  "0123456789"
                                    + "abcdefghijklmnopqrstuvxyz"; 
        StringBuilder sb = new StringBuilder(6); 
        for (int i = 0; i < 6; i++) { 
            // generate a random number between 
            // 0 to AlphaNumericString variable length 
            int index 
                = (int)(AlphaNumericString.length()* Math.random()); 
            sb.append(AlphaNumericString.charAt(index)); 
        } 
        return sb.toString(); 
    } 
	
	
	public  int generateRandomNum(){
    	
    	Random rand = new Random();
    	int rand_int1 = rand.nextInt(1000);
    	return rand_int1;
    }
    
	
	public String getUkRegisterButton() {
		return UkRegisterButton;
	}
	public void setUkRegisterButton(String ukRegisterButton) {
		UkRegisterButton = ukRegisterButton;
	}
	public String getOlayUkRegisterLink() {
		return olayUkRegisterLink;
	}
	public void setOlayUkRegisterLink(String olayUkRegisterLink) {
		this.olayUkRegisterLink = olayUkRegisterLink;
	}
	public String getOlayUkSignIn() {
		return olayUkSignIn;
	}
	public void setOlayUkSignIn(String olayUkSignIn) {
		this.olayUkSignIn = olayUkSignIn;
	}
	public String getOlayUkEnterEmail() {
		return olayUkEnterEmail;
	}
	public void setOlayUkEnterEmail(String olayUkEnterEmail) {
		this.olayUkEnterEmail = olayUkEnterEmail;
	}
	public String getOlayUkEnterPassword() {
		return olayUkEnterPassword;
	}
	public void setOlayUkEnterPassword(String olayUkEnterPassword) {
		this.olayUkEnterPassword = olayUkEnterPassword;
	}
	public String getOlayUkconfirmPassword() {
		return olayUkconfirmPassword;
	}
	public void setOlayUkconfirmPassword(String olayUkconfirmPassword) {
		this.olayUkconfirmPassword = olayUkconfirmPassword;
	}
	public String getUkDay(int ukDay) {
		String str=UkDay+(ukDay+1)+general;
		return str;
	}
	public String getUkMonth(int ukMonth) {
		String str=UkMonth+(ukMonth+1)+general;
		return str;
	}
	public String getUkYear(int ukYear) {
		String str=UkYear+((2006-ukYear)+2)+general;
		return str;
	}
	public String getCarType() {
		return carType;
	}
	public void setCarType(String carType) {
		this.carType = carType;
	}
	public String getCompact() {
		return compact;
	}
	public void setCompact(String compact) {
		this.compact = compact;
	}
	public String getMidSize() {
		return midSize;
	}
	public void setMidSize(String midSize) {
		this.midSize = midSize;
	}
	public String getFullSize() {
		return fullSize;
	}
	public void setFullSize(String fullSize) {
		this.fullSize = fullSize;
	}
	public String getSUV() {
		return SUV;
	}
	public void setSUV(String sUV) {
		SUV = sUV;
	}
	public String getLuxury() {
		return luxury;
	}
	public void setLuxury(String luxury) {
		this.luxury = luxury;
	}
	public String getTruck() {
		return truck;
	}
	public void setTruck(String truck) {
		this.truck = truck;
	}
	public String getVan() {
		return van;
	}
	public void setVan(String van) {
		this.van = van;
	}
	public String getAutomatic() {
		return automatic;
	}
	public void setAutomatic(String automatic) {
		this.automatic = automatic;
	}
	public String getStandard() {
		return standard;
	}
	public void setStandard(String standard) {
		this.standard = standard;
	}
	public String getInsurance() {
		return insurance;
	}
	public void setInsurance(String insurance) {
		this.insurance = insurance;
	}
	public String getCarsRequired() {
		return carsRequired;
	}
	public void setCarsRequired(String carsRequired) {
		this.carsRequired = carsRequired;
	}
	public String getBookNow() {
		return bookNow;
	}
	public void setBookNow(String bookNow) {
		this.bookNow = bookNow;
	}
	public String getSpeedButton() {
		return speedButton;
	}
	public void setSpeedButton(String speedButton) {
		this.speedButton = speedButton;
	}
	public String getFileButton() {
		return fileButton;
	}
	public void setFileButton(String fileButton) {
		this.fileButton = fileButton;
	}
	public String getNumberButton() {
		return numberButton;
	}
	public void setNumberButton(String numberButton) {
		this.numberButton = numberButton;
	}
	public String getSalutationButton() {
		return salutationButton;
	}
	public void setSalutationButton(String salutationButton) {
		this.salutationButton = salutationButton;
	}
	public String getSpeedType() {
		return speedType;
	}
	public void setSpeedType(String speedType) {
		this.speedType = speedType;
	}
	public String getFileType() {
		return fileType;
	}
	public void setFileType(String fileType) {
		this.fileType = fileType;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getSalutation() {
		return salutation;
	}
	public void setSalutation(String salutation) {
		this.salutation = salutation;
	}
	public String getChromeDriverLocation() {
		return chromeDriverLocation;
	}
	public void setChromeDriverLocation(String chromeDriverLocation) {
		this.chromeDriverLocation = chromeDriverLocation;
	}
	public String getGhekoDriverLocation() {
		return ghekoDriverLocation;
	}
	public void setGhekoDriverLocation(String ghekoDriverLocation) {
		this.ghekoDriverLocation = ghekoDriverLocation;
	}
	
	public String getPropFileLocation() {
		return propFileLocation;
	}
	public void setPropFileLocation(String propFileLocation) {
		this.propFileLocation = propFileLocation;
	}
	
	public String getPrev() {
		return prev;
	}
	public void setPrev(String prev) {
		this.prev = prev;
	}
	public String getDobYear() {
		return dobYear;
	}
	public void setDobYear(String dobYear) {
		this.dobYear = dobYear;
	}
	public String getDobMonth() {
		return dobMonth;
	}
	public void setDobMonth(String dobMonth) {
		this.dobMonth = dobMonth;
	}
	public String getDatePicker() {
		return datePicker;
	}
	public void setDatePicker(String datePicker) {
		this.datePicker = datePicker;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getSubmit() {
		return submit;
	}
	public void setSubmit(String submit) {
		this.submit = submit;
	}
	public String getSelectItem1() {
		return selectItem1;
	}
	public void setSelectItem1(String selectItem1) {
		this.selectItem1 = selectItem1;
	}
	public String getNameItem1() {
		return nameItem1;
	}
	public void setNameItem1(String nameItem1) {
		this.nameItem1 = nameItem1;
	}
	public String getSelectItem2() {
		return selectItem2;
	}
	public void setSelectItem2(String selectItem2) {
		this.selectItem2 = selectItem2;
	}
	public String getNameItem2() {
		return nameItem2;
	}
	public void setNameItem2(String nameItem2) {
		this.nameItem2 = nameItem2;
	}
	public String getSelectItem3() {
		return selectItem3;
	}
	public void setSelectItem3(String selectItem3) {
		this.selectItem3 = selectItem3;
	}
	public String getNameItem3() {
		return nameItem3;
	}
	public void setNameItem3(String nameItem3) {
		this.nameItem3 = nameItem3;
	}
	public String getSelectItem4() {
		return selectItem4;
	}
	public void setSelectItem4(String selectItem4) {
		this.selectItem4 = selectItem4;
	}
	public String getNameItem4() {
		return nameItem4;
	}
	public void setNameItem4(String nameItem4) {
		this.nameItem4 = nameItem4;
	}
	public String getSelectItem5() {
		return selectItem5;
	}
	public void setSelectItem5(String selectItem5) {
		this.selectItem5 = selectItem5;
	}
	public String getNameItem5() {
		return nameItem5;
	}
	public void setNameItem5(String nameItem5) {
		this.nameItem5 = nameItem5;
	}
	public String getSelectItem6() {
		return selectItem6;
	}
	public void setSelectItem6(String selectItem6) {
		this.selectItem6 = selectItem6;
	}
	public String getNameItem6() {
		return nameItem6;
	}
	public void setNameItem6(String nameItem6) {
		this.nameItem6 = nameItem6;
	}
	public String getSelectItem7() {
		return selectItem7;
	}
	public void setSelectItem7(String selectItem7) {
		this.selectItem7 = selectItem7;
	}
	public String getNameItem7() {
		return nameItem7;
	}
	public void setNameItem7(String nameItem7) {
		this.nameItem7 = nameItem7;
	}
	
	
}
