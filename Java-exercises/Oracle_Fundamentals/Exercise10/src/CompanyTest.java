public class CompanyTest {
    
    public static void main(String[] args) {
        Printer myPrinter = new Printer();
        Company myCompany = new Company();
        Region myRegion = new Region();
        Country myCountry = new Country();
        
        myCompany.setCompanyName("Duke's Choice");
        myCompany.setTaxID(5544332);
        myCompany.setCEO("Eleanor Duke");
        myPrinter.printToScreen(myCompany);
        
        myRegion.setRegion("Americas");
        myRegion.addCountry("US");
        myRegion.addCountry("Mexico");
        myRegion.addCountry("Canada");
        myRegion.setRegManager("Eduardo Jimenez");
        myRegion.setAnnualSales(1_500_000);
        myPrinter.printToScreen(myRegion);
        
        myCountry.setCountry("US");
        myCountry.setCountryManager("Rodney Baker");
        myCountry.setLanguage("English");
        myCountry.setLanguage("Spanish");
        myPrinter.printToScreen(myCountry);
    }
}
