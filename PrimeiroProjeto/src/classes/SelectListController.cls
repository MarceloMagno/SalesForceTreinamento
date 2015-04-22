public class SelectListController {

	String[] countries = new String[]{};
	public Account account;
	public List<Opportunity> opportunities;
	public List<Object> listOp;
    String s = 'blue';
 
 	public SelectListController() {
       account = [SELECT Id, Name, AccountNumber FROM Account 
                   WHERE Id = :ApexPages.currentPage().getParameters().get('id')];
   	}
 
    public String getString() {
        return s;
    }
 			
    public void setString(String s) {
        this.s = s;
    }
    
    public PageReference test() {
            return null;
    }
    
    public List<Opportunity> getOpportunities() {
        if(opportunities == null) {
    		  opportunities = [SELECT Id, Name, Amount FROM Opportunity WHERE Amount > 10000 
		     			AND Account.Id = :ApexPages.currentPage().getParameters().get('id')] ;
   		}
     return opportunities; 
    }
    
    public String[] getCountries() {
            return countries;
    }
        
    public void setCountries(String[] countries) {
        this.countries = countries;
    }
    
    public List<Object> getOpcao(){
    	
    	listOp = [SELECT a.Ownership FROM Account a
                   WHERE Id = :ApexPages.currentPage().getParameters().get('id')];
        
    	return listOp; 
    }
}